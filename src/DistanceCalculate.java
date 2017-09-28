public class DistanceCalculate {

    static double distanceCalculate(Point points[]) {

        double distanceSum = 0;
        double distance = 0;
        int count = 0;

        while (count < points.length - 1) {
            distance = Math.sqrt(Math.pow(Math.abs(points[count].getCoordinateX() - points[count + 1]
                    .getCoordinateX()), 2) + Math.pow(Math.abs(points[count].getCoordinateY() - points[count + 1]
                    .getCoordinateY()), 2));
            distanceSum += distance;
            count++;
        }
        return distanceSum;
    }
}
