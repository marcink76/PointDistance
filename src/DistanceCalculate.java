public class DistanceCalculate {
    public static void distanceCalculate(Point point, Point point1) {
        double distance = 0;
        int distanceX = 0;
        int distanceY = 0;

        System.out.println(point.getCoordinateX());
        System.out.println(point.getCoordinateY());

        System.out.println(point1.getCoordinateX());
        System.out.println(point1.getCoordinateY());

        distanceX = Math.abs(point.getCoordinateX() - point1.getCoordinateX());
        distanceY = Math.abs(point.getCoordinateX() - point1.getCoordinateY());
        distance = (double) Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
        System.out.println(distance);


    }
}
