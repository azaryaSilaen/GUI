module com.example.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.gui to javafx.fxml;
    exports com.example.gui;

    opens showhide to javafx.fxml;
    exports showhide;

    opens rectangle to javafx.fxml;
    exports rectangle;

    opens circle to javafx.fxml;
    exports circle;

    opens testing to javafx.fxml;
    exports testing;

    opens writingpad to javafx.fxml;
    exports writingpad;

    opens piggybank to javafx.fxml;
    exports piggybank;

    opens circleanimation to javafx.fxml;
    exports circleanimation;

    opens checkers to javafx.fxml;
    exports checkers;
}