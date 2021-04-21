import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Polyline implements PolylineProcess{
    private List<Point> points;

    public Polyline(){
        points = new ArrayList<>();
    }

    public List<Point> getPoints(){
        return new ArrayList<>(points);
    }

    @Override
    public int getNoPoints() {
        return points.size();
    }

    @Override
    public double calculateLength() {
        double distance = 0;
        for(int i = 0; i < points.size()-1; i++){
            distance += points.get(i).distance(points.get(i+1));
        }
        return distance;
    }

    @Override
    public boolean contains(Point point) {
        return points.contains(point);
    }

    @Override
    public boolean addPoint(Point point) {
        points.add(point);
        Collections.sort(points);
        return true;
    }

    @Override
    public boolean removePoint(Point point) {
        points.remove(point);
        Collections.sort(points);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polyline polyline = (Polyline) o;
        return Objects.equals(points, polyline.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
