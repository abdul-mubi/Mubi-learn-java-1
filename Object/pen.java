package Object;

public class pen {
    public static void main(String arg[]) {
        computer obj = new computer();
        obj.palymusic();
        String str = obj.getpen(5);
        System.out.println(str);

    }

}

class computer {
    public void palymusic() {
        System.out.println("playing music");

    }

    public String getpen(int cost) {
        if (cost >= 20)
            return "pen";
        else
            return "nothing";

    }

}
