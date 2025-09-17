import java.util.Scanner;

public class DemoGrossPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        calculateGross(hoursWorked);

        input.close();
    }

    public static void calculateGross(double hours) {
        double hourlyRate = 22.75;
        double grossPay = hours * hourlyRate;
        System.out.println(hours + " hours at $" + hourlyRate + " per hour is $" + grossPay);
    }
}
