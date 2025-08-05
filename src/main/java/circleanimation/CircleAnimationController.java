package circleanimation;/*
Author: Azarya Silaen
 */

import javafx.scene.Group;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;

public class CircleAnimationController {
    public ProgressBar progress;
    public Slider slider;
    public Group fullWheelAnimation;
    public Group everything;
    public AnchorPane AnchorPaneScene;


    public void resizing () {

        circleanimation.AutomaticResizing all = new AutomaticResizing(600,400);
        showhide.AutomaticResizing.anchorW = AnchorPaneScene.getWidth();
        showhide.AutomaticResizing.anchorH = AnchorPaneScene.getHeight();

        everything.setScaleX(all.getScaleX());
        everything.setScaleY(all.getScaleY());


    }
    public void slidingSlider() {
        fullWheelAnimation.setLayoutX(60+(4.80*slider.getValue()));
        progress.setProgress(slider.getValue()/100);
        fullWheelAnimation.setRotate(3.6*slider.getValue());
    }
}
