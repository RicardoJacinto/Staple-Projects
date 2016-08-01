import static java.lang.Math.PI;

public class Circ
{
 // Constructors *
 public Circ(){ center = new Point(); ray = 0; } 
 public Circ(Point p, double ray) { center = new Point(p); this.ray = ray; }
 public Circ(double x, double y, double ray) { center = new Point(x, y); this.ray = ray; }
 public Circ (Circ c) { center = c.getCenter(); ray = c.getRay(); }
 
 // Instance Variables*
 private Point center;
 private double ray;
 
 // Public methods - API*
 
//Get*
public double getRay(){return ray;}
public Point getCenter() { return center.clone();}

//Clone
public Circ clone(){ return new Circ(this);}

// Perimeter & Area
public double perim(){return PI*2*ray;}
public double area() { return PI*(Math.pow(ray, 2));}

// compare if objects have the same value 
 public boolean equals(Object o) 
    {
        if ( this == o ) return true; 
        if ( this.getClass() != o.getClass() || o == null ) return false;
        
        Circ c = (Circ) o;
        return ( center.equals(c.getCenter()) && ray == c.getRay() );
    }
 
// compare of objects share the same address 
public boolean equalsObj(Object o)
    {
        if ( this.getClass() != o.getClass() || o == null ) return false;
        if (this != o) return false;
        else return true; 
    }
    
// String methods 
public String ourToString() 
{
    StringBuilder s = new StringBuilder();
    
    s.append("----------------- \n ");
    s.append("Circle: Centre = "+ center.ourToString() + "\n");
    s.append("         Radius = " + ray + "\n");
    s.append("----------------- \n ");
    s.append("\n");
    return s.toString();
}

//Sets*
public void setCenter(Point p) { center = p.clone(); }
public void setRay(double ray) { this.ray = ray; }
public void setVars(Circ c) {center = c.getCenter(); ray = c.getRay();}

}