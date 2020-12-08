package login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.MainController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController implements Initializable
{
    @FXML
    private TextField tf_user;
    @FXML
    private PasswordField tf_pass;


    private LoginModel loginModel = new LoginModel();

    private Stage stage;

    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }

    public static void show(Stage stage)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("login.fxml"));
            Parent root = fxmlLoader.load();

            //get controller which is connected to this fxml file
            LoginController ctrl = fxmlLoader.getController();
            ctrl.setStage(stage);

            stage.setTitle("Login");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ex)
        {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Something wrong with welcome.fxml!");
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }

        @FXML
        private void next()
        {
            MainController.show(new Stage());

            stage.close();
        }

        public void login()
        {
          boolean login = loginModel.iscorrect(tf_user.getText(), tf_pass.getText());
          if(login)
          {

              System.out.printf("Hello Sir/Madam%n");
              next();
          }
          else{
              System.out.printf("Error while login in%n");
          }
        }
}
