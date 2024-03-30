package Methodoverloading;

public class Calculator {
    public static void main(String arg[]) {
        demo obj = new demo();
        int result = obj.add(2, 6);
        System.out.println(result);
        // int r1 = obj.add(3, 8);
        // System.out.println(r1);
        // int r2 = obj.add1(1, 2, 3);
        // System.out.println(r2);

    }

}

class demo {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}
