import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());

        double area = add(a, b);
        System.out.printf("%.0f",area);
    }

    private static double add(double width, double height){
        return width * height;
    }
}
