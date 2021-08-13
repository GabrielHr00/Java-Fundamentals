import java.util.*;
import java.util.stream.Collectors;

public class ExtractFile_03_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\\\");
        String file = array[array.length - 1];

        String name = file.split("\\.")[0];
        String ext = file.split("\\.")[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + ext);
    }
}
