public class Punto2D{
    private final double x;
    private final double y;

    public Punto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    //returns the distance between this point and another
    public double distance(Punto2D p){
        System.out.println("Punto2D: metodo con Punto2D");
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
}
