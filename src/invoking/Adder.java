package invoking;

public class Adder {
    public int addThem(int x, int y){
        return x + y;
    }
    // overload to add the double instead of int
    public double addThem(double x, double y){
        return x + y;
    }
}
//from another class invoke the addThem method
 class TestAdder{
    public static void main(String[] args) {
        Adder a = new Adder();
        int b = 27;
        int c = 3;
        int Results = a.addThem (b,c);
        double doubleResult = a.addThem(22.9,9.3);
    }
}
