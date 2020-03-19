import java.util.Scanner;

public class AreaHcn {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float are = width * height;
        System.out.println("is Are = " + are);
    }
}
