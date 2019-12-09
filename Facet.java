import java.util.Scanner;

public class Facet {
    private  R3Vector[] vertex = new R3Vector[4];
    public Facet(R3Vector v1,R3Vector v2,R3Vector v3,R3Vector v4){
        this.vertex[0] = v1;
        this.vertex[1] = v2;
        this.vertex[2] = v3;
        this.vertex[3] = v4;
    }

    public static void print(Facet x){
        for(int i=0;i<x.vertex.length;i++){
            R3Vector.return_vector(x.vertex[i]);
        }
    }
    public static void rotate(Facet x){
        for(int i=0;i<x.vertex.length;i++){
            R3Vector.rotate(x.vertex[i]);
        }
    }
    public static void maschtab(Facet x, int k){
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        for(int i=0;i<x.vertex.length;i++){
            R3Vector.maschtab(x.vertex[i], k);
        }
    }
}

