package Object;

public class Match {
    String name = "Abdul";

    public static void main(String arg[]) {
        Cricket obj = new Cricket();
        int result = obj.score(200);
        System.out.println(result);
        String X = obj.name;
        System.out.println(X);
        System.out.println(Team("XXXXX"));

    }

    public static String Team(String name1) {
        String result = "xyzz";
        return result;

    }
}

class Cricket {
    String name = "koli";

    public int score(int n1) {
        int result;
        result = 100;
        return result;
    }

}
