package Object;

public class A {
    static String car = "i10";

    public static void main(String arg[]) {
        B obj = new B();
        int result = obj.sum(2, 3);
        System.out.println(result);
        String x = obj.s;
        System.out.println(x);
        System.out.println(car);
        System.out.println(sum(1, 2));
    }

    public static int sum(int n1, int n2) {
        int answer = n1 + n2;
        System.out.println(answer);
        return answer;

    }

}

class B {
    public int sum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    String s = "abcd";
}
