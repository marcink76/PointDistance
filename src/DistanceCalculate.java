public class DistanceCalculate {

    public static void distanceCalculate(Point points[]) {

        double[] distance = new double[points.length];

        double distanceSum = 0;
        double distance1 = 0;
        int count = 0;

        while (count < points.length) {

            System.out.println(count);
            distance1 = Math.sqrt(Math.pow(Math.abs(points[count].getCoordinateX() - points[count + 1]
                    .getCoordinateX()), 2) + Math.pow(Math.abs(points[count].getCoordinateY() - points[count + 1]
                    .getCoordinateY()), 2)); // tu tkwi błąd - wychodzi poza tablicę
            distanceSum += distance1;
            count++;
        }
        System.out.println(distance[0]);
        System.out.println(distance[1]);
        System.out.println(distance[2]);
        System.out.println(distanceSum);
    }
}
