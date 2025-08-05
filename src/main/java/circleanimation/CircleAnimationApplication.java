package circleanimation;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

/*
Author: Azarya Silaen
 */public class CircleAnimationApplication extends Application {

    public Slider slider;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CircleAnimationApplication.class.getResource("circleanimation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),600 , 400);
        primaryStage.setTitle("Circle Animation");
        primaryStage.setScene(scene);
        CircleAnimationController controller = fxmlLoader.getController();
        primaryStage.show();


    }
}
