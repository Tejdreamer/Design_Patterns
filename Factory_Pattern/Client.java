import java.util.*;

class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="";
        System.out.println("Enter the shape you want to create ");
        s=sc.nextLine();
        switch(s){
            case "circle":
                System.out.println("Enter the radius of circle");
                int r=sc.nextInt();
                ShapeFactory circleFactory = new CircleCreator();
                Shape circle1 = circleFactory.createShape("circle", r);
                circle1.draw();
                System.out.println("Area of Circle: " + circle1.area());
                break;
            case "rectangle":
                System.out.println("Enter the length and breadth of rectangle");
                int l=sc.nextInt();
                int b=sc.nextInt();
                ShapeFactory rectangleFactory = new RectangleCreator();
                Shape rectangle1 = rectangleFactory.createShape("rectangle", l, b);
                rectangle1.draw();
                System.out.println("Area of Rectangle: " + rectangle1.area());
                break;
            default:
                System.out.println("Invalid shape type");
                return;
        }
    }
}

// here when ever you want a shape you can create it based on a condition and if any new shape has to be added a new class can be extended from ShapeFactory and implement the createShape method

// so it obeys open closed principle