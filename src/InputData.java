import java.util.Scanner;

public class InputData {

    public static void inputData(){

        Scanner scanner = new Scanner(System.in);

        Point point = new Point();
        Point point1 = new Point();

        System.out.println("Podaj współrzędne pierwszego punktu: ");
        point.setCoordinateX(scanner.nextInt());
        point.setCoordinateY(scanner.nextInt());

        System.out.println("Podaj współrzędne drugiego punktu");
        point1.setCoordinateX(scanner.nextInt());
        point1.setCoordinateY(scanner.nextInt());

        DistanceCalculate.distanceCalculate(point, point1);
    }
}
