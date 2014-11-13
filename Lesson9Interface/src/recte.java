
import TurtleGraphics.Pen;


public class recte implements Shape{
    
    private double xPos, yPos;
    private double width, height;
    
       public recte(){
            xPos = 0;
            yPos = 0;
            width = 1;
            height = 1;
            
        }
       public recte (double xLoc, double yLoc, double h, double w){
           xPos = xLoc;
           yPos = yLoc;
           width = w;
           height = h;
       }
        public double area(){
            return height * width;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);      p.move(height);
        p.turn(-90);      p.move(width);
        p.turn(-90);      p.move(height);
    }

    @Override
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYPos() {
        return yPos;
    }

    @Override
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    @Override
    public void stretchBy(double factor) {
        height *= factor; width*=factor;
    }
    
    public String toString(){
        String str = "Rectangle\n"
                +"Width: " +width+ "\n"+"Height: " +height+"\n"
                +"(X,Y) Position: (" +xPos+ ","+yPos+")\n"
                +"Area: " +area();
        return str;
    }
}
