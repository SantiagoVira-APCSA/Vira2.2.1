public class RectangleRunner {
    public static void main(String[] args) {
        // Instantiate rectangles
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        // Calculate total area
        int totalArea = plot1.calculateArea() + plot2.calculateArea() + plot3.calculateArea();
        System.out.println("These three plots require " + totalArea + " square feet of seed");

        // Update all plot widths to 75
        plot1.setWidth(75);
        plot2.setWidth(75);
        plot2.setLength(75);
        plot3.setWidth(75);

        // Calculate total area
        totalArea = plot1.calculateArea() + plot2.calculateArea() + plot3.calculateArea();
        System.out.println("These three plots require " + totalArea + " square feet of seed");

//        int len = 65;
//        int wid = len + 10;
//        Rectangle rect1 = new Rectangle(len, wid);
//        Rectangle rect2 = new Rectangle(10.0, 30.0);
//        Rectangle rect3 = new Rectangle(0);

    }
}
