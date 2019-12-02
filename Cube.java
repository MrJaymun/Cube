import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        double z = 0;
        coord(x,y,z);
        R3Vector v1 = new R3Vector();
        coord(x,y,z);
        R3Vector v2 = new R3Vector();
        coord(x,y,z);
        R3Vector v3 = new R3Vector();
        coord(x,y,z);
        R3Vector v4 = new R3Vector();
        Facet a = new Facet(v1, v2, v3, v4);
    }
    public static void coord(double x, double y, double z){
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
    }
}
