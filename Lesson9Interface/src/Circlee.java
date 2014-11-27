
import TurtleGraphics.Pen;


public class Circlee extends AbstractShape{
    protected double radius;
    
    public Circlee(){
        super();
        radius = 1;
    }
    public Circlee(double x, double y, double r){
        super(x,y);
        radius = r;
    }
    public double area(){
        return Math.PI *radius*radius;
    }
    public void stretchBy(double factor){
        radius*=factor;
    }
    
    public void draw(Pen p) {
        double side = 2.0*Math.PI *radius/120.0;
        p.up();
        p.move(xPos+radius, yPos-side/2.0);
        p.setDirection(90);
        p.down();
        
        for (int i = 0; i<120; i++){
            p.move(side);
            p.turn(3);
        }
    }
    public String toString(){
        String str = "This is a Circlee\n";
        str+="Radius = " +radius;
        str+="\n" +super.toString();
        return str;
    }
    public double per(){
        double per;
       per= 2.0* Math.PI* radius;
       return per;
    }
}
