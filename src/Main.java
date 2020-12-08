import javafx.application.Application;
import javafx.stage.Stage;
import login.LoginController;
/**
 * @author Mathias Gnadlinger
 * @version 9, 08.12.2020
 */
public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        LoginController.show(primaryStage);
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

