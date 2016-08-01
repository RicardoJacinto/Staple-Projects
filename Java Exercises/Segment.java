import static java.lang.Math.sqrt;

public class Segment
{
    // Constructors *
    public Segment(){p1 = new Point(); p2 = new Point();}
    public Segment(Point p1, Point p2) { this.p1 = p1.clone(); this.p2 = p2.clone(); }
    public Segment(Segment s) {p1 = s.getInitialp(); p2 = s.getFinalp();}
    
    // Instance variables *
    private Point p1;
    private Point p2; 
   
    // Gets *
    public Point getInitialp(){ return p1.clone(); }
    public Point getFinalp() { return p2.clone(); }
    
    // clone
    public Segment clone() { return new Segment (this); }
    
    // Slope 
    public double slope() 
    {
       double dy = p2.getY() - p1.getY();
       double dx = p2.getX() - p1.getX();
       double m = dy/dx; 
       return m ; 
    }
    
    // Segment length 
    public double segLength() 
    {
       double dy = p2.getY() - p1.getY();
       double dx = p2.getX() - p1.getX();
       return sqrt( (Math.pow(dx,2))+(Math.pow(dy,2)) );
    }
    
    // Equals
    public boolean equals(Object o) 
    {
        if ( this == o ) return true;
        if (this == null && this.getClass() != o.getClass() ) return false; 
        
        Segment c = (Segment) o ; 
        return ( p1.equals(c.getInitialp()) && p2.equals(c.getFinalp()) ) ;
        
    }
    
    // toString 
    public String ourToString() 
    {
        StringBuilder s = new StringBuilder ();
        s.append( "Line segment:\n") ;
        s.append ("Initial Point : " + p1.ourToString());
        s.append ("Final Point : " + p2.ourToString() + "\n"); 
        return s.toString();        
    }
    // Sets * 
    public void changeInitialp(Point p) { p1 = p.clone(); }
    public void changeFinalp(Point p) {p2 = p.clone();}
    
    
    
} 