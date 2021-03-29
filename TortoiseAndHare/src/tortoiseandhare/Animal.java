/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortoiseandhare;

import java.util.Random;
import java.util.logging.Logger;
import javafx.scene.control.TextArea;

/**
 *
 * @author Erin O'Toole
 */
public class Animal extends Thread{
    //animal's name
    private String animalName;
    //percentage of time that the animal will rest
    private int rest;
    //how many meters the animal travels in each move
    private int speed;
    //progress the animal has made 
    private int progress;
    //text area for output
    public TextArea txtArea;

    public Animal(){
        //default constructor
    }
    
    //constructor that needs the animal's name, percentage of rest time, speed and which Text Area to print to
    public Animal (String animalName, int rest, int speed, TextArea txtArea)
    {       
            this.animalName = animalName;
            this.rest = rest;
            this.speed = speed;
            this.txtArea = txtArea;      
        
    }
    
    //getters and setters
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
    
    //override the run method of Thread
    @Override
    public synchronized void run(){    
        //while the animal has not yet reached 1000 meters
        while(progress < 1000){
            int randNum = GetRandomNum();
            //if the random number generated is greater than the liklihood that the animal rests, then the animal will move.
            if(randNum > rest){        
                progress += speed;
                //send the animal's overriden name and progress to the text area
                txtArea.appendText(this.getAnimalName() + ": " + progress + "\r\n"); 
            }
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ie){
                Logger.getLogger("THREAD INTERRUPTED");                
            }
            
        } 
        //When the loop exits, print that the animal has finished the race
        txtArea.appendText("\n" + this.getAnimalName() + ": I finished!");
    }
    
    //method to generate random number between 1 and 1000
    private int GetRandomNum(){
        Random r = new Random();
        int randNum = r.nextInt(100);
        return randNum;
    }

}
    
    
    
