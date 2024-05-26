package Pattern.NullObjectPattern;

public class Car implements Vehicle{
    @Override
    public int getSeat() {
        return 4;
    }

    @Override
    public int getTank() {
        return 12;
    }
}
