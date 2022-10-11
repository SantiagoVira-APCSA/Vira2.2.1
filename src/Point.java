public class Point {
    private int x, y;

    // Individual x and y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Set x and y to same thing
    public Point(int value) {
        x = value;
        y = value;
    }

    // Set x and y to 0 (origin)
    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + "," + y + ")";
    }

    public String quadrant() {
        if (x == 0 && y == 0) {
            return "On the origin";
        }
        if (x == 0 || y == 0) {
            return "On an axis";
        }
        if (y > 0) {
            return x > 0 ? "I" : "II";
        } else {
            return x < 0 ? "III" : "IV";
        }
    }
}
