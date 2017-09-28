import java.util.Scanner;

public class InputData {

    public static Point[] inputData(){
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        Point[] points = new Point[3];

        do {

            points[count] = new Point();

            System.out.println("Podaj współrzędne "+ count +" punktu: ");
            points[count].setCoordinateX(scanner.nextInt());
            points[count].setCoordinateY(scanner.nextInt());
            count++;

        }while (count < points.length);
        return points;
    }
}
