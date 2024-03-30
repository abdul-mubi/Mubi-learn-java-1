package Object;

public class Light {
    public static void main(String arg[]) {
        lamp obj = new lamp();
        obj.turnon();
        lamp1 obj1 = new lamp1();
        obj1.turnoff();

    }

}

class lamp {
    public void turnon() {
        System.out.println("turnon the light");
    }
}

class lamp1 {
    public void turnoff() {
        System.out.println("turnoff the light");
    }
}
