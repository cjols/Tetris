import java.awt.*;

/**
 * Block object
 */
public class Block {

    private String style;
    private Color color;
    private int state;

    public Block(String blockStyle, Color blockColor) {
        style = blockStyle;
        color = blockColor;
        state = initState(blockStyle);
    }

    public String getType() {
        return style;
    }

    public void setType(String type) {
        this.style = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private int initState(String bStyle) {
        if (bStyle.equals(""))


    }
}
