package DecoratorPattern;

public class Mushoom extends ToppingDecorator{

    BasePizza basePizza;

    public Mushoom(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
