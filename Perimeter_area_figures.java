public class Perimeter_area_figures {
    interface Calculator {
        double calculatePerimeterCircle(double radius);
        double calculatePerimeterRectangle(double a, double b);
        double calculatePerimeterTriangle(double aTriangle, double bTriangle, double cTriangle);
        double calculateSquareCircle(double radius);
        double calculateSquareRectangle(double a, double b);
        double calculateSquareTriangle(double aTriangle, double bTriangle, double cTriangle);
        String setColorFill(String fillColor);
        String setColorBorder(String borderColor);
    }
    public static class Figure implements Calculator {
        public String fillColor;
        public String borderColor;
        public double calculatePerimeterCircle(double radius) {
            return 2 * Math.PI * radius;
        }
        public double calculatePerimeterRectangle(double a, double b) {
            return (a + b) * 2;
        }
        public double calculatePerimeterTriangle(double aTriangle, double bTriangle, double cTriangle) {
            return aTriangle + bTriangle + cTriangle;
        }
        public double calculateSquareCircle(double radius) {
            return Math.PI * Math.pow(radius, 2);
        }
        public double calculateSquareRectangle(double a, double b) {
            return a * b;
        }
        public double calculateSquareTriangle(double aTriangle, double bTriangle, double cTriangle) {
            double s = (aTriangle + bTriangle + cTriangle) / 2;
            return Math.sqrt(s * (s - aTriangle) * (s - bTriangle) * (s - cTriangle));
        }
        public String setColorFill(String fillColor) {
            this.fillColor = fillColor;
            return fillColor;
        }
        public String setColorBorder(String borderColor) {
            this.borderColor = borderColor;
            return borderColor;
        }
    }
    public static void main(String[] args) {
        Calculator circle = new Figure();
        System.out.println("Периметр круга: " + circle.calculatePerimeterCircle(4.0));
        System.out.println("Площадь круга: " + circle.calculateSquareCircle(6.0));
        System.out.println("Цвет заливки: " + circle.setColorFill("Черный"));
        System.out.println("Цвет границы: " + circle.setColorBorder("Красный"));
        Calculator rectangle = new Figure();
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeterRectangle(5, 6));
        System.out.println("Площадь прямоугольника: " + rectangle.calculateSquareRectangle(5, 3));
        System.out.println("Цвет заливки: " + rectangle.setColorFill("Красный"));
        System.out.println("Цвет границы: " + rectangle.setColorBorder("Синий"));
        Calculator triangle = new Figure();
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeterTriangle(10, 5.5, 6));
        System.out.println("Площадь треугольника: " + triangle.calculateSquareTriangle(6, 8, 3));
        System.out.println("Цвет заливки: " + triangle.setColorFill("Серый"));
        System.out.println("Цвет границы: " + triangle.setColorBorder("Зеленый"));
    }
}
