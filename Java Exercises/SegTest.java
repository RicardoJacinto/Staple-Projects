import static java.lang.System.out;
public class SegTest
{
    public static void main(String[] args)
    {
        Point p1 = new Point(5,10);
        Point p2 = new Point(4,8);
        Segment s1 = new Segment(p1, p2);
        
        out.printf(s1.ourToString());
        
        double slope = s1.slope();
        out.printf("Slope: " + slope + "\n");
       
        double leng = s1.segLength();
        out.printf("Line length: " + leng + "\n");
        
        
    }
}