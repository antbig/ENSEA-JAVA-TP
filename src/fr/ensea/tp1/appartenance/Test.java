package fr.ensea.tp1.appartenance;


public class Test {

    public static void main(String[] args) {
        Point point1 = new Point(10, 5);
        Point point2 = new Point(5, 10);
        System.out.println("Point 1 = " + point1.toString());
        System.out.println("Point 2 = " + point2.toString());

        Rectangle rectangle1 = new Rectangle(point1);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(10, 3);
        System.out.println(rectangle2.affiche());
    }

}
