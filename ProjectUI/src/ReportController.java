import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ReportController {

    @FXML
    DatePicker startDatePicker;

    @FXML
    DatePicker endDatePicker;

    @FXML
    ChoiceBox<String> chooseProgram;

    @FXML
    ChoiceBox<String> chooseGender;

    @FXML
    ChoiceBox<String> chooseReason;

    @FXML
    TableView recordTable;

    @FXML
    TableColumn studentIDCol;

    @FXML
    TableColumn firstNameCol;

    @FXML
    TableColumn lastNameCol;

    @FXML
    TableColumn genderCol;

    @FXML
    TableColumn programCol;

    @FXML
    TableColumn dOBCol;

    @FXML
    TableColumn reasonCol;

    @FXML
    TableColumn timeCol;

    @FXML
    Label countStudent;

    @FXML
    Label countTime;

    LocalDate startDate;



}
