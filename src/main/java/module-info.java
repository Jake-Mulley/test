module example.a03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens example.a03 to javafx.fxml;
    exports example.a03;
}