public class Robot {
    public final double radius, wheelRadius, minSpeed, maxSpeed;
    private Point position;
    private Direction currentDirection;
    private Room currentRoom;

    public Robot(double radius, double wheelRadius, double minSpeed, double maxSpeed) {
        this.radius = radius;
        this.wheelRadius = wheelRadius;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    public void startMoving(Room room) {
        position = new Point(radius, radius);
    }

    public void move(Point point) {
        double oldX = position.x;
        double oldY = position.y;
        //Проверить направление, изменить его
        //Учесть ускорение и радиус колёс

        assert oldX == position.x || oldY == position.y;
    }

    public void turnRight() {
        //Угловая скорость и ускорение
    }

    public void turnLeft() {
        //Угловая скорость и ускорение
    }
}
