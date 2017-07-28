package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        // Display "Hello World!"
        hello("world");
        hello("user");
        hello("Vladimir");


        Point p1 = new Point(3, 4);
        Point p2 = new Point(0, 0);
        System.out.println("Расстояние на координатной оси между точками c координатами " + "(" + p1.x + ", "+ p1.y + ")" + " и " + "(" + p2.x + ", " + p2.y + ")" + " = " + p2.distance(p1));


        Square s = new Square(5);
        System.out.println("Плoщадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }



}