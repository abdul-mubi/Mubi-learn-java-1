package Demo;

public class TestCal {
    public static void main(String arg[]) {
        int num1 = 8;
        int num2 = 9;
        int result = add(2, 3);
        System.out.println(result);
        int result1 = sub(1, 2);
        System.out.println(result1);
        int result2 = mul(num2, num1, "Abdul");
        System.out.println((result2));
    }

    public static int add(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static int sub(int num1, int num2) {
        int result;
        result = num1 - num2;
        return result;
    }

    public static int mul(int num1, int num2, String name) {
        int result = num1 * num2;
        return result;
    }

}
