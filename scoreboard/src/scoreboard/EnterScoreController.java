/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
// import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author brandon
 */
public class EnterScoreController implements Initializable {
    @FXML
    // These elements don't require interaction.
//  private HBox actionParent;
//  private HBox okParent;
    protected Button bt_enter;
    protected TextField initials_entry;
    protected TextField score_entry;
//--------------------------------------------------------------
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Enter Score Controller created.");
    }
    
    public String get_initials() {
        String initials = "AAA";
        
        return initials;
    }
    
    public String get_score() {
        String score = "0";
        
        return score;
    }
    
    void bt_enter(EventHandler<ActionEvent> eventHandler) {
        
    }
}