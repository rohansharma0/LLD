package Pattern.FactoryPattern;

public class ShapeFactory {

    public Shape getShape(String enteredShape){
        return switch (enteredShape) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
