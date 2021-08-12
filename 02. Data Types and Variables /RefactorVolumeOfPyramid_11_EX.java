import java.util.Scanner;

public class RefactorVolumeOfPyramid_11_EX {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        Double lenght = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        Double width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        Double height = Double.parseDouble(scanner.nextLine());

        Double volume = (lenght * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
