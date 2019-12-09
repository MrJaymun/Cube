import java.util.Scanner;

public class CubeFigure {
    private Facet[] facets = new Facet[6];

    // public CubeFigure(Facet f1, Facet f2, Facet f3, Facet f4, Facet f5, Facet f6){
    public CubeFigure(){
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0), new R3Vector(1,1,0), new R3Vector(0,1,0));
        facets[1] = new Facet(new R3Vector(0,0,1), new R3Vector(1,0,1), new R3Vector(1,1,1), new R3Vector(0,1,1));
        facets[2] = new Facet(new R3Vector(0,0,0), new R3Vector(0,1,0), new R3Vector(0,1,1), new R3Vector(0,0,1));
        facets[3] = new Facet(new R3Vector(1,0,0), new R3Vector(1,1,0), new R3Vector(1,1,1), new R3Vector(1,0,1));
        facets[4] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0), new R3Vector(1,0,1), new R3Vector(0,0,1));
        facets[5] = new Facet(new R3Vector(0,1,0), new R3Vector(1,1,0), new R3Vector(1,1,1), new R3Vector(0,1,1));
    }
    public static void rotate(CubeFigure x){
        for(int i=0;i<x.facets.length;i++){
            Facet.rotate(x.facets[i]);
        }
    }
    public static void maschtab(CubeFigure x, int k){
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        for(int i=0;i<x.facets.length;i++){
            Facet.maschtab(x.facets[i], k);
        }
    }
}
