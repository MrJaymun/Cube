import java.util.Scanner;

//В моем коде косяк, поэтому я наглым образом взял код у Кирилла
//Взял до занятие, на занятии все делал сам
//Очень стыдно, уже извинился перед ним
public class Cube {
    public static void main(String[] args) {
        int x,y,z;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        R3Vector v_1 = new R3Vector(x,y,z);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        R3Vector v_2 = new R3Vector(x,y,z);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        R3Vector v_3 = new R3Vector(x,y,z);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        R3Vector v_4 = new R3Vector(x,y,z);
        Facet m = new Facet(v_1,v_2,v_3,v_4);
        Facet.print(m);
        Facet.rotate(m);
        Facet.print(m);

    }
}