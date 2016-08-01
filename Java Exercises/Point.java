import static java.lang.Math.abs; 
import java.util.Scanner;

public class Point
{
    
    //Constructors 
    public Point() { x = 0; y = 0;}
    public Point(double x, double y) { this.x = x; this.y = y;}
    public Point(Point p){x = p.getX(); y = p.getY();}
   
    
    // Instance Variables
    private double x; 
    private double y;
    
    // Instance methods 
    
    // get x value 
    public double getX() {return x;}
    //get y value
    public double getY() {return y;}
   
    // clone method
    public Point clone() {return new Point (this);}
    
    // Equals method 
    public boolean equals(Object o) 
    {
        if ( this == o ) return true; 
        if ( this.getClass() != o.getClass() || o == null ) return false;
        
        Point p = (Point) o;
        return (x == p.getX() && y == p.getY());
    }
    
    // Find the biggest X coord
    public Point largestX(Point... objs)
    {
        Point max = new Point (-9999, -9999);
        for (Point p : objs) 
        {
            if ( p.getX() > max.getX() ) max = p.clone();
        }
        return max.clone();
    }
    
    // Verify if object has the same adress 
    public boolean equalsObj(Object o)
    {
        if ( this.getClass() != o.getClass() || o == null ) return false;
        if (this != o) return false;
        else return true; 
    }
    
    //Return X/Y cordinates via string output
    public String ourToString(){ return new String("("+ x + "," + y + ")\n" ); }
    
    
     public void changeCoord(double x, double y)
     {
       this.x = x;
       this.y = y;
     }
    
    // Increase coordinates 
    public void incCoord (double deltaX, double deltaY) { x += deltaX; y+= deltaY; }
    
    // Decrease coordinates
    public void deCoord (double deltaX, double deltaY) { x -= deltaX; y-= deltaY; }
     
    // Both coordinates positive
    public boolean coordPos(){ return x > 0 && y > 0; }
    
    //Verify if coordinates are simetric
    public boolean simetric() { return x + y == 0;}
    
    
    
}