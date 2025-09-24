import java.util.Scanner;

public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DebugPen pen = new DebugPen();

        System.out.println("Default Pen:");
        System.out.println("Color: " + pen.getColor());
        System.out.println("Point: " + pen.getPoint());

        System.out.println("\nEnter new color for the pen:");
        String newColor = scanner.nextLine();
        pen.setColor(newColor);

        System.out.println("Enter new point type (e.g., fine, medium, broad):");
        String newPoint = scanner.nextLine();
        pen.setPoint(newPoint);

        System.out.println("\nUpdated Pen:");
        System.out.println("Color: " + pen.getColor());
        System.out.println("Point: " + pen.getPoint());

        scanner.close();
    }
}
