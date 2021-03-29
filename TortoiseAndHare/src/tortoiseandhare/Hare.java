/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortoiseandhare;

import javafx.scene.control.TextArea;

/**
 *
 * @author Erin O'Toole
 */
public class Hare extends Animal {
    
     public Hare(String animalName, int rest, int speed, TextArea txtArea){
        super(animalName, rest, speed, txtArea);      
    }
    
    //overrides the getAnimalName() method in the Animal class
    @Override
    public String getAnimalName(){
        return super.getAnimalName() + " the Hare";
    }
    
}
