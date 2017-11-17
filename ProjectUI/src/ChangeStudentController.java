import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class ChangeStudentController {
private MainApp mainapp;

    public MainApp getMainapp() {
        return mainapp;
    }

    public void setMainapp(MainApp mainapp) {
        this.mainapp = mainapp;
    }

    @FXML
    TextField studentID;

    @FXML
    Button clear;

    @FXML
    Button save;

    @FXML
    public void clearText(){
        studentID.setText("");
    }

    @FXML
    public void saveText(){
        //Close the current pop-up window
        //Get back to the previous page and refresh with the new ID
        // Load the fxml file and create a new stage for the popup dialog.

    }
}
