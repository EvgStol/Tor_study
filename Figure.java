package home_work;

public class Figure {
    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse(1,1);
        Circle circle = new Circle(2,2);
        Rectangle rectangle = new Rectangle(3,3);


        System.out.println("P:" + rectangle.perimeter(10,15));
        System.out.print("Ellipse ");ellipse.cord();
        System.out.print("Circle ");circle.cord();
        System.out.print("Rectangle ");rectangle.cord();
        System.out.println();
        System.out.print("Ellipse ");ellipse.move();
        System.out.print("Circle ");circle.move();
        System.out.print("Rectangle ");rectangle.move();

    }
     int cordX;
     int cordY;
    public Figure(int cordX, int cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }
    public void cord(){
        System.out.println("Начальные кординаты: " + "X:" + cordX + " Y:" + cordY);
    }
    public void move(){
        System.out.println("move: " + "X:" + ++cordX + " Y:" + ++cordY);
    }


}
class Ellipse extends Figure{

    public Ellipse(int cordX, int cordY) {
        super(cordX, cordY);
    }
}
class Circle extends Figure {

    public Circle(int cordX, int cordY) {
        super(cordX, cordY);
    }
}
class Rectangle extends Figure {

    public Rectangle(int cordX, int cordY) {
        super(cordX, cordY);
    }

    public int perimeter(int a, int b){
        return 2*(a+b);
    }
}

