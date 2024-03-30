package Object;

public class Computer {
    public static void main(String arg[]) {
        laptop obj = new laptop();
        String result = obj.draw();
        System.out.println(result);

    }

}

class laptop {
    public String draw() {

        String result;
        result = "draw a house";
        System.out.println(result);
        return result;

    }
}
