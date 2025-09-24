import java.util.Scanner;

public class DebugBox {
    private int width;
    private int length;
    private int height;

    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    public double getVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DebugBox box = new DebugBox();

        System.out.println("Enter width: ");
        int w = scanner.nextInt();
        box.setWidth(w);

        System.out.println("Enter length: ");
        int l = scanner.nextInt();
        box.setLength(l);

        System.out.println("Enter height: ");
        int h = scanner.nextInt();
        box.setHeight(h);

        System.out.println("\nBox Dimensions:");
        box.showData();
        System.out.println("Box Volume: " + box.getVolume());

        scanner.close();
    }
}
