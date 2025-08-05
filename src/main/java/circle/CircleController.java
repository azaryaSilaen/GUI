package circle;/*
Author: Azarya Silaen
 */

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class CircleController {

    public Circle circumferenceVisual;
    public Circle areaVisual;
    public Line radiusVisual;
    public Label lbAnswer;
    public Label lbRadius;
    public Label lbCircumference;
    public Label lbArea;
    private double radius;
    public TextField radiusText;

    public void onMouseOutsideVisual() {

        radiusVisual.setStroke(Color.BLACK);
        lbRadius.setVisible(false);

        areaVisual.setFill(Color.WHITE);
        lbArea.setVisible(false);

        circumferenceVisual.setStroke(Color.BLACK);
        lbCircumference.setVisible(false);
    }

    public void onMouseEnteredRadius() {
        radiusVisual.setStroke(Color.BLUE);
        lbRadius.setVisible(true);

        areaVisual.setFill(Color.WHITE);
        lbArea.setVisible(false);

        circumferenceVisual.setStroke(Color.BLACK);
        lbCircumference.setVisible(false);
    }
    public void onMouseEnteredCircumference() {
        circumferenceVisual.setStroke(Color.BLUE);
        lbCircumference.setVisible(true);

        radiusVisual.setStroke(Color.BLACK);
        lbRadius.setVisible(false);

        areaVisual.setFill(Color.WHITE);
        lbArea.setVisible(false);
    }

    public void onMouseEnteredArea() {
        areaVisual.setFill(Color.BLUE);
        lbArea.setVisible(true);

        radiusVisual.setStroke(Color.BLACK);
        lbRadius.setVisible(false);

        circumferenceVisual.setStroke(Color.BLACK);
        lbCircumference.setVisible(false);
    }

    public void onAreaButtonClick() {
        radius = Double.parseDouble(radiusText.getText());
        lbAnswer.setText(String.valueOf(Math.pow(radius, 2)*Math.PI));
    }

    public void onCircumferenceButtonClick() {
        radius = Double.parseDouble(radiusText.getText());
        lbAnswer.setText(String.valueOf(radius*2*Math.PI));
    }


    public void onRadiusClick() {
        lbAnswer.setText(radiusText.getText());
    }
}
