/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortoiseandhare;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 *
 * @author Erin O'Toole
 */
public class FXMLDocumentController implements Initializable {
    
    //Text Area for tortoise results
    @FXML
    private TextArea txtTortoise;
    
    //Text Area for Hare results
    @FXML
    private TextArea txtHare;
           
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            //create the two animal objects represetending tortoise and hare
            Animal tortoise = new Tortoise("Franklin", 0, 10, txtTortoise); //Franklin the Tortoise, never rests, moves 10 meters, and his output is txtTortoise
            Animal hare = new Hare("Bugs", 90, 100, txtHare); //Bugs the Hare, rests 90% of the time, moves 100 meters and his output is txtHare
            
            //start their threads           
            tortoise.start();
            hare.start();
        
    }   
    

    
}
