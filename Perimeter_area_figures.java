public class Perimeter_area_figures {
    interface PerimeterCalculator {
        double calculatePerimeter(double radius);
    }
    public static class Circle implements PerimeterCalculator {

        public double calculatePerimeter(double radius) {
            return 2 * Math.PI * radius;
        }
    }
    interface PerimeterCalculatorS {
        double calculatePerimeterS(double a, double b);
    }
    public static class rectangle implements PerimeterCalculatorS {

        public double calculatePerimeterS(double a, double b) {
            return (a+b)*2;
        }
    }
    interface PerimeterCalculatorTriangle {
        double calculatePerimeterTriangle(double aTriangle, double bTriangle, double cTriangle);
    }
    public static class triangle implements PerimeterCalculatorTriangle {

        public double calculatePerimeterTriangle(double aTriangle, double bTriangle, double cTriangle) {
            return aTriangle+bTriangle+cTriangle;
        }
    }
    public static void main(String[] args) {
            PerimeterCalculator circle = new Circle();
            double radius = 4.0;
            String fill = "Черный";
            String border = "Красный";
            double perimeter = circle.calculatePerimeter(radius);
            System.out.println("Периметр круга: " + perimeter+" "+"Цвет заливки"+" "+fill+" "+ "цвет границы" +" "+border);
            PerimeterCalculatorS rectangle = new rectangle();
            double a = 5.5;
            double b= 5.5;
            String fillRestangle = "Красный";
            String borderRestangle = "Синий";
            System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeterS(a,  b)+" "+"Цвет заливки"+" "+fillRestangle+" "+"цвет границы"+" "+borderRestangle);
            PerimeterCalculatorTriangle triangle = new triangle();
            double aTriangle  = 10.0;
            double bTriangle= 5.5;
            double cTriangle = 6;
            String fillTriangle = "Серый";
            String borderTriangle = "зелный";
            System.out.println("Периметр треугольника " + triangle.calculatePerimeterTriangle(aTriangle,  bTriangle, cTriangle)+" "+ "Цвет заливки"+" " +fillTriangle+" "+ "цвет границы"+" "+borderTriangle);
    }
}

