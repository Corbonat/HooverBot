import java.util.HashSet;
import java.util.Set;

public record WashedRectangle(double x, double y, double width, double height) {
    public boolean hasPoint(double x, double y) {
        return x >= this.x && y >= this.y && x <= this.x + width && y <= this.y + height;
    }

    public static WashedRectangle get(double oldX, double oldY, double newX, double newY, double robotRadius) {
        Set<Point> points = new HashSet<>();
        points.add(new Point(oldX - robotRadius, oldY - robotRadius));
        points.add(new Point(oldX + robotRadius, oldY - robotRadius));
        points.add(new Point(oldX - robotRadius, oldY + robotRadius));
        points.add(new Point(oldX + robotRadius, oldY + robotRadius));

        points.add(new Point(newX - robotRadius, newY - robotRadius));
        points.add(new Point(newX + robotRadius, newY - robotRadius));
        points.add(new Point(newX - robotRadius, newY + robotRadius));
        points.add(new Point(newX + robotRadius, newY + robotRadius));

        Point upLeft = new Point(oldX, oldY);
        Point downRight = new Point(oldX, oldY);
        for (Point point : points) {
            if (point.x < upLeft.x) upLeft = point;
            else if (point.x == upLeft.x)
                if (point.y < upLeft.y) upLeft = point;

            if (point.x > downRight.x) downRight = point;
            else if (point.x == downRight.x)
                if (point.y > downRight.y) downRight = point;
        }
        return new WashedRectangle(upLeft.x, upLeft.y, downRight.x - upLeft.x, downRight.y - upLeft.y);
    }

    @Override
    public String toString() {
        return String.format("x: %f, y: %f, width: %f, height: %f", x, y, width, height);
    }
}
