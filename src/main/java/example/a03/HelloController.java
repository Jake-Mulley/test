package example.a03;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Button myButton;

    String age;

    private void submit(ActionEvent event) {
        age = myTextField.getText();
    }
    private Label email = new Label("E-Mail: ");
    TextField textField = new TextField ();
    HBox hb = new HBox();

//    hb.getChildren().addAll(email, textField);
//    hb.setSpacing(10);

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onSubmitButtonClick(ActionEvent event) {
        welcomeText.setText(myTextField.getText());
    }
}