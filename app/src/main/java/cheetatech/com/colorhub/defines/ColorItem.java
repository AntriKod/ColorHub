package cheetatech.com.colorhub.defines;


public class ColorItem {

    private int red,green,blue,opacity;
    private int colour = 0;
    public ColorItem(){

    }

    public ColorItem(int colour)
    {
        this.colour = colour;
    }

    public ColorItem(int red,int green,int blue, int opacity)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.opacity = opacity;
    }
    public void setRed(int red){this.red = red;}
    public void setGreen(int green){this.green = green;}
    public void setBlue(int blue){this.blue = blue;}
    public void setOpacity(int opacity){this.opacity = opacity;}
    public void setColor(int colour){this.colour = colour;}

    public int getRed(){return  this.red;}
    public int getGreen(){return this.green;}
    public int getBlue(){return this.blue;}
    public int getOpacity(){return this.opacity;}
    public int getColor(){return this.colour;}
    public String toString()
    {
        return String.format("#%02x%02x%02x%02x", opacity, red, green, blue);
    }
    public String toString2()
    {
        String str = "#" + Integer.toHexString(this.colour);
        return str;
    }


}
