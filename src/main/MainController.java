package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import login.LoginController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainController implements Initializable
{
    @FXML
    private TextField tf_question;
    @FXML
    private Text tf_answer;
    @FXML
    private Button b_ask;

    private Stage stage;

    private MainModel model;

    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        model = new MainModel();
    }

    public static void show(Stage stage)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            //get controller which is connected to this fxml file
            MainController ctrl = fxmlLoader.getController();
            ctrl.setStage(stage);

            stage.setTitle("Magic 8 Ball");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Something wrong with welcome.fxml!");
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }
    public void text()
    {
        tf_answer.setText(model.getAnswer(tf_question.getText()));
    }

}
