package Splitwise;

public class Main {
    public static void main(String[] args) {
        SplitWise splitwise = new SplitWise();
        try{
            splitwise.demo();
        }catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
