import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class MainApp extends Application{

    private Stage primaryStage;
    private BorderPane rootLayout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("StudentSys");



        //加载FXML资源文件
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentPage.fxml"));
        Pane tempPane =  loader.load();
//        ChangeStudentController asc = loader.getController();
//        asc.setMainapp(this);

        //构造对应的场景
        Scene tempScene = new Scene(tempPane);

        //添加场景到舞台中
        primaryStage.setScene(tempScene);

        //显示舞台
        primaryStage.show();

    }

    public boolean showStudentEditDialog() {
        try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentPage.fxml"));
            Pane page = loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("New Student");
//            dialogStage.initModality(Modality.WINDOW_MODAL);
//            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);


            // Show the dialog and wait until the user closes it
            dialogStage.show();

//            return controller.isOkClicked();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}

