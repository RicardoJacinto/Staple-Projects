import static java.lang.System.out;
public class CircTest
{
    public static void main(String[] args)
    {
        char l = '\n';
        
        // Defining variables
        Point ponto1 = new Point(2,2);
        Point ponto2 = new Point();
        
        Circ circ1 = new Circ();
        Circ circ2 = new Circ(2, 2, 2);
        Circ circ3 = new Circ(ponto1, 2);
        Circ circ4 = new Circ(circ2); 
        
        // Printing Variables
        String p1 = ponto1.ourToString();
        out.printf ("First Point : " + p1 + "\n");
        
        String p2 = ponto2.ourToString();
        out.printf ("Second Point : " + p2 + "\n");
        
        String c1 = circ1.ourToString();
        out.printf(c1);
        
        String c2 = circ2.ourToString();
        out.printf(c2);
        
        String c3 = circ3.ourToString();
        out.printf(c3);
        
        String c4 = circ4.ourToString();
        out.printf(c4);
        
        // Verify area and perimeter
        double area = circ3.area();
        double perim = circ3.perim();
        
        out.printf("Third Circle area: "+area +"\n");
        out.printf("Third Circle perimeter: "+perim + "\n");
       
        circ1.setCenter(ponto1);
        out.printf("Change center point of the first circle: \n" + circ1.ourToString());
        
        circ1.setVars(circ3);
        out.printf("Change center and radius of first circle: \n " + circ1.ourToString());
        
        boolean test = circ1.getCenter().equalsObj(circ3.getCenter());
        out.printf("Test if first and third circles centers share the same address: \n " + test);
        
        
        }
}