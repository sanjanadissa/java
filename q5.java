class Circle {
    private double r0;
    private double r1;

    public Circle(double r0, double r1) {
        this.r0 = r0;
        this.r1 = r1;
    }

    public void computeArea() {
        double area = Math.PI * (r0 * r0 - r1 * r1);
        System.out.println("Area of ring is " + area);
    }

    public void computeCircumference() {
        double circumference = 2 * Math.PI * (r0 + r1);
        System.out.println("Circumference of ring is " + circumference);
    }
}

public class q5 {
    public static void main(String[] args) {
        int r0 = 5;
        int r1 = 3;
        Circle obj = new Circle(r0, r1);
        obj.computeArea();
        obj.computeCircumference();
    }
}