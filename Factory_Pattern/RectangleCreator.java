public class RectangleCreator extends ShapeFactory{
    @Override
    public Shape createShape(String type,int ... dimensions){
        if(type.equalsIgnoreCase("rectangle") && dimensions.length==2){
            return new Rectangle(dimensions[0],dimensions[1]);
        }
        throw new IllegalArgumentException("Invalid shape type or dimensions for Rectangle");

    }
}