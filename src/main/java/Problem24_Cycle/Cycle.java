package Problem24_Cycle;

/**
 * Create Circle class having
 * field radius
 * methods calculate radius and perimeter......
 */
public class Cycle {
    public double radius;

    public Cycle(final double radius) {
        this.radius = radius;
    }

    private static double areaCycle(Cycle c1) {
        return 3.14 * (c1.radius) * (c1.radius);
    }

    private static double perimeterCycle(Cycle c1) {
        return 2 * 3.14 * (c1.radius);
    }

    public static void main(String[] args) {
        Cycle c1 = new Cycle(20);
        System.out.println("The area of cycle is : " + areaCycle(c1));
        System.out.println("The perimeter of cycle is : " + perimeterCycle(c1));
    }
}