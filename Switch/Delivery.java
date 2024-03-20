package Switch;

public class Delivery {
    public static void main(String arg[]) {
        String zone = "pqwe";
        switch (zone) {
            case ("bangalore"):
                System.out.println("the charge is 100");
                break;
            case ("palakkad"):
                System.out.println("the charge is 50");
                break;
            case ("southbangalore"):
                System.out.println("the charge is 90");
                break;
            default:
                System.out.println("default value");

        }

    }

}
