public class CircleCreator extends ShapeFactory {
    @Override
    public Shape createShape(String type, int... dimensions) {
        if (type.equalsIgnoreCase("circle") && dimensions.length == 1) {
            return new Circle(dimensions[0]);
        }
        throw new IllegalArgumentException("Invalid shape type or dimensions for Circle");
    }
}