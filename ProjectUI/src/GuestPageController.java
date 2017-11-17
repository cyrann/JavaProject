import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.MalformedURLException;
import java.time.LocalDate;

public class GuestPageController {

    @FXML
    ImageView photo;

    @FXML
    TextField guestID;

    @FXML
    TextField first;

    @FXML
    TextField last;

    @FXML
    TextField gender;

    @FXML
    ChoiceBox<String> reason;

    @FXML
    Button clear;

    @FXML
    Button save;

    @FXML
    public void clearText(){
        guestID.setText("");
        last.setText("");
        first.setText("");
        gender.setText("");
        reason.setValue("no specific reason");
    }

    @FXML
    public void saveText(){
        String id = guestID.getText();
        String first = this.first.getText();
        String last = this.last.getText();
        String gender = this.gender.getText();
        String reason = this.reason.getValue();
        Guest guest = new Guest(id, first, last,  gender, reason);
        System.out.println(guest);
    }

    @FXML
    public void initialize(){
        reason.setItems(FXCollections.observableArrayList(
                "no specific reason", "stapler", "tuition fees", "complaints", "collect assignments", "meet prople", "others"));
        reason.setValue("no specific reason");
        File file = new File("DD headshot.jpg");
        String localUrl = null;
        try {
            localUrl = file.toURI().toURL().toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        photo.setImage(new Image(localUrl));
    }
}
