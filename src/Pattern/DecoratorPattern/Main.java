package Pattern.DecoratorPattern;

public class Main {
    public static void main(String[] args) {

        BasePizza pizza = new Mushoom(new ExtraCheese(new Margherita()));
        System.out.println( pizza.cost());
    }
}
