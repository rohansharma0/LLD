package Pattern.NullObjectPattern;

public class VehicleFactory {

    public Vehicle getObject(String object){
        if(object.equalsIgnoreCase("car")){
            return new Car();
        }
        return new NullObject();
    }
}
