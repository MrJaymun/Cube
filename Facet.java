import java.awt.*;

public class Facet extends R3Vector{
    private R3Vector[] vertex;
    //Color color;
    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4){
        R3Vector[] vertex = {v1, v2, v3, v4};
        vertex[0] = v1;
        vertex[1] = v2;
        vertex[2] = v3;
        vertex[3] = v4;
        System.out.println(v1 + " - "+ v2);
        System.out.println(v2 + " - "+ v3);
        System.out.println(v3 + " - "+ v4);
        System.out.println(v4 + " - "+ v1);
    }
    public void print(){
    //закручиваем рассчет против часовой стрелки

    }
}
