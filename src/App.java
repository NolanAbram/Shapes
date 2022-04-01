public class App {
    public static void main(String[] args) throws Exception {
        Circle x = new Circle();
        Cylinder y = new Cylinder();
        SemiCircle i = new SemiCircle();

        System.out.println("This is for a circle: ");
        System.out.println(x.typeOfCircle());
        System.out.println(x.typeofCircle("Overload example: not round lol"));
        System.out.print("Override example: ");
        System.out.println(x.area(2));

        System.out.println("This is for cylinder: ");
        System.out.println(y.totalFaces(2));
        System.out.println(y.totalVolume(4.0));

        System.out.println("This is for Semicircle: ");
        System.out.println(i.totalArea(5.0));
    }
}
