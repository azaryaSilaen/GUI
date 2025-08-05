package showhide;

public class AutomaticResizing {

    private double originalAnchorW;
    private double originalAnchorH;
    public static double anchorW = 400;
    public static double anchorH = 400;
    private double originalLayoutX;
    private double originalLayoutY;
    private double originalWidth;
    private double originalHeight;
    private double originalScaleX;
    private double originalScaleY;
    private double originalFont;


    public AutomaticResizing (double originalAnchorW, double originalAnchorH,
                             double originalLayoutX, double originalLayoutY, double originalWidth, double originalHeight
                             ) {
        this.originalAnchorH = originalAnchorH;
        this.originalAnchorW = originalAnchorW;
        this.originalLayoutX = originalLayoutX;
        this.originalLayoutY = originalLayoutY;
        this.originalWidth = originalWidth;
        this.originalHeight = originalHeight;

    }

    public AutomaticResizing (double originalAnchorW, double originalAnchorH,
                              double originalLayoutX, double originalLayoutY, double originalWidth, double originalHeight,
                              double originalFont
    ) {
        this.originalAnchorH = originalAnchorH;
        this.originalAnchorW = originalAnchorW;
        this.originalLayoutX = originalLayoutX;
        this.originalLayoutY = originalLayoutY;
        this.originalWidth = originalWidth;
        this.originalHeight = originalHeight;
        this.originalFont = originalFont;

    }

    public AutomaticResizing (double originalAnchorW, double originalAnchorH,
                              double originalLayoutX, double originalLayoutY, double originalWidth, double originalHeight,
                              double originalScaleX, double originalScaleY) {

        this.originalAnchorH = originalAnchorH;
        this.originalAnchorW = originalAnchorW;
        this.originalLayoutX = originalLayoutX;
        this.originalLayoutY = originalLayoutY;
        this.originalWidth = originalWidth;
        this.originalHeight = originalHeight;
        this.originalScaleX = originalScaleX;
        this.originalScaleY = originalScaleY;
    }


    public double getWidth () {
        double ratioWidth = originalWidth/originalAnchorW;
        return ratioWidth*anchorW;
    }

    public double getHeight () {
        double ratioHeight = originalHeight/originalAnchorH;
        return ratioHeight*anchorH;
    }
    public double getLayoutX () {
        double ratioLayoutX = originalLayoutX/originalAnchorW ;
        return ratioLayoutX * anchorW;
    }
    public double getLayoutY () {
        double ratioLayoutY = originalLayoutY/originalAnchorH;
        return  ratioLayoutY * anchorH;
    }

    public double getFont() {
        double ratioFontH = anchorH/originalAnchorH;
        double ratioFontW = anchorW/originalAnchorW;
        double average = (ratioFontH+ratioFontW)/2;
        return (originalFont*average);
    }

    public double getScaleX() {
        double ratioWidth = originalAnchorW/anchorW;
        return ratioWidth;
    }

    public double getScaleY() {
        double ratioHeight = originalAnchorH/anchorH;
        return ratioHeight;
    }

}
