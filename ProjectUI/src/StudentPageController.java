import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.util.Date;


public class StudentPageController {

    @FXML
    ImageView photo;

    @FXML
    TextField studentID;

    @FXML
    TextField first;

    @FXML
    TextField last;

    @FXML
    DatePicker dob;

    @FXML
    TextField gender;

    @FXML
    TextField program;

    @FXML
    ChoiceBox<String> reason;

    @FXML
    Button clear;

    @FXML
    Button save;

    @FXML
    public void clearText(){
        studentID.setText("");
        last.setText("");
        first.setText("");
        dob.getEditor().clear();
        gender.setText("");
        program.setText("");
        reason.setValue("no specific reason");
    }

    @FXML
    public void saveText(){
        String id = studentID.getText();
        String first = this.first.getText();
        String last = this.last.getText();
        LocalDate dob = this.dob.getValue();
        String gender = this.gender.getText();
        String program = this.gender.getText();
        String reason = this.reason.getValue();
        Student student = new Student(id, first, last, dob, gender, program, reason);
        System.out.println(student);


    }

    @FXML
    public void initialize(){
         try {
             reason.setItems(FXCollections.observableArrayList(
                     "no specific reason", "stapler", "tuition fees", "complaints", "collect assignments", "meet prople", "others"));
             reason.setValue("no specific reason");
             File file = new File("DD headshot.jpg");
             String localUrl = file.toURI().toURL().toString();
             photo.setImage(new Image(localUrl));
             studentID.setOnAction((event) ->

                     System.out.println("123"));
//             studentID.getSelectionModel()
//                     .selectedItemProperty()
//                     .addListener( (ObservableValue<? extends String> observable, String oldValue, String newValue) -> System.out.println(newValue) );
             studentID.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> System.out.println(newValue));
         }catch (MalformedURLException e) {
             e.printStackTrace();
         }
    }
}
