public class Punto3D extends Punto2D{
    private double z;

    public Punto3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }

    @Override
    public double distance(Punto2D p){
        System.out.println("Punto3D: metodo con Punto2D");
        return 0;
    }

    //overload of distance method
    public double distance(Punto3D p){
        System.out.println("Punto3D: metodo con Punto3D");
        return 0;
    }
}
