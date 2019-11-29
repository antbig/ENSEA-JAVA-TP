package fr.ensea.tp1.heritage;


public class Test {

    public static void main(String[] args) {
        Point point1 = new Point(10, 5);
        Point point2 = new Point(5, 10);
        System.out.println("Point 1 = " + point1.toString());
        System.out.println("Point 2 = " + point2.toString());

        Rectangle rectangle1 = new Rectangle(point1);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(10, 3);
        System.out.println(rectangle2.toString());


        Rectangle r1 = new Carre(8);
        Carre r2 = (Carre) r1;

        Figure[] tf = new Figure[4];
        tf[0] = new Ellipse(2,3);
        tf[1] = new Rectangle(8, 3);
        tf[2] = new Carre(4);
        tf[3] = new Cercle(4);


    }

}
