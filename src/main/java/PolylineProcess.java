public interface PolylineProcess {
    int getNoPoints();
    double calculateLength();
    boolean contains(Point point);
    boolean addPoint(Point point);
    boolean removePoint(Point point);
}
