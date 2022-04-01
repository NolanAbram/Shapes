public class Cylinder extends Circle{
        public Cylinder(){
            super();
            double volume = 0.0;
            double faces = 2.0;
            double height = 5.0;
        }

        public double totalFaces(double x){
            return x;
        }

        public double totalVolume(double v){
            return (Math.PI*Math.pow(v, 2)*5.0);
        }
    }
