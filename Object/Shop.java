package Object;

public class Shop {
    public static void main(String arg[]) {

        dress obj = new dress();
        int obj1 = obj.dressmodel(50, 100);
        System.out.println(obj1);

    }

}

class dress {
    public int dressmodel(int cost, int total) {
        int result = cost + total;
        return result;

    }
}
