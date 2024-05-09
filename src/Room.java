public record Room(double width, double height, Room.Obstruction[] obstructions) {

    public static class Obstruction {
        public final double x, y, width, height;

        public Obstruction(double x, double y, double width, double height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    }
}
