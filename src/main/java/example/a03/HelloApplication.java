package example.a03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import javax.security.auth.callback.LanguageCallback;
import java.io.IOException;

public class HelloApplication extends Application {
    private Label email = new Label("E-Mail: ");
    Label password = new Label("Password: ");
    TextField emailTf = new TextField ();
    TextField passwordTf = new TextField ();
    Button submitButton = new Button("Submit");
    GridPane root = new GridPane();

//    root.addRow(0, email, emailTf);
//    root.addRow(1, password, passwordTf);
//    root.addRow(2, submitButton);


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("User Information Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}