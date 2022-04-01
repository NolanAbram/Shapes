public class Circle extends Shapes {
    double radius;
    double diameter;
    
    public Circle(){
        super();
        radius = 0;
        diameter = 0;
        name = "Circle";
    }

    public Circle(String name, double radius, double diameter){
        this.name = "NotACircle";
        this.radius = 2;
        this.radius = 4;
    }

    public String typeOfCircle(){
        return "Round";
    }

    public String typeofCircle(String x){
        return x;
    }

    @Override
    public double area(double area){
        area = 4;
        return area;
    }

    
    
        
    
}

