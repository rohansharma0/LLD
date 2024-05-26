package HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer , String> hm = new HashMap<Integer , String>();
        hm.put(1 , "One");
        hm.put(2 , "Two");
        hm.put(4 , "Four");

        System.out.println(hm.get(1));
    }
}
