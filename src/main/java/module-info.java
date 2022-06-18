module ru.gb.vagranovich.javafxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.vagranovich.javafxapp to javafx.fxml;
    exports ru.gb.vagranovich.javafxapp;
}