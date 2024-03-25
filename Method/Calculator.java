package Method;

public class Calculator {
    public static void main(String arg[]) {
        int result;
        result = calsoperation(3, 4, "sub");
        System.out.println(result);

    }

    public static int calsoperation(int x, int y, String operation) {
        int result;
        if (operation == "add") {
            result = x + y;
            System.out.println(result);
        } else if (operation == "sub") {
            result = x - y;
            System.out.println(result);
        } else if (operation == "mul") {
            result = x * y;
            System.out.println(result);
        } else if (operation == "div") {
            result = x / y;
            System.out.println(result);
        } else {
            result = 0;
        }
        return result;

    }
}
