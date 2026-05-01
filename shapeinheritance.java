class Shape{
   int l = 0, b = 0, r = 0;
}
class Square extends Shape{
    Square(int side){
        l = side;
    }
    void area(){
        System.out.println("Area of square: " + l*l);
    }

}
class Rectangle extends Shape{
    Rectangle(int length, int breadth){
        l = length;
        b = breadth;
    }
    void area(){
        System.out.println("Area of rectangle: " + l*b);
    }

}
class Circle extends Shape{
    Circle(int radius){
        r=radius;
    }
    void area(){
        System.out.println("Area of Circle: " + r*r*3.14);
    }

}
class ShapeDemo{
    public static void main(String[] args){
        Square s = new Square(4);
        s.area();
        Rectangle r = new Rectangle(4,5);
        r.area();
        Circle c = new Circle(3);
        c.area();
    }
}
