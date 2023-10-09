module dev.lpa.jokesapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    requires org.apache.commons.io;


    opens dev.lpa.jokesapp to javafx.fxml;
    exports dev.lpa.jokesapp;
}