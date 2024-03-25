package Method;

public class EvenOdd {
    public static void main(String arg[]) {
        boolean ans;
        ans = findEvenOdd(3);
        System.out.println(ans);
    }

    public static boolean findEvenOdd(int num) {
        boolean result;
        if (num % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
