import java.util.Scanner;

class InputData {

    static Point[] inputData(){
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość punktów");
        int numberOfPoint = scanner.nextInt();
        Point[] points = new Point[numberOfPoint];

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
