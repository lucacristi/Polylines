import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Polyline polyline = new Polyline();
        addPoints(polyline);

        Point p1 = new Point(3, 0);
        Point p2 = new Point(6, 0);

        polyline.addPoint(p2);
        polyline.addPoint(p1);

        System.out.println("\nNr of points: " + polyline.getNoPoints());
        System.out.println("\n---------POINTS------------\n" + polyline.getPoints());

        System.out.println("\nDistance between " + p1 + " and " + p2 + " is: \n" +p1.distance(p2));


        System.out.println("\nPolyline length is: " + polyline.calculateLength());

        System.out.println("\nContains point " + p2 + " :" + polyline.contains(p2));
        polyline.removePoint(p2);
        System.out.println("\nContains point " + p2 + " :" + polyline.contains(p2));

        System.out.println("\nThe new number of points: " + polyline.getNoPoints());
        System.out.println("\nNew polyline length: " + polyline.calculateLength());

    }

    private static void addPoints(Polyline polyline) {
        int numbers = (int) (Math.random() * 10);

        for(int i = 0; i < numbers; i++){
            double x = Math.floor((Math.random()*100)*100)/100;
            double y = Math.floor((Math.random()*100)*100)/100;
            System.out.println("\nPoint " + (i+1) + ":\nx= " + x + "\ny= "+y);
            polyline.addPoint(new Point(x,y));

        }
    }
}
