public class SemiCircle extends Circle {
        public SemiCircle(){
            super();
            double half = 1;
            double diameter = 2.0;
            double radius = 1.0;
        }

        public double totalArea(double x){
            return (Math.pow(x, 2)*Math.PI);
        }
        
    }

