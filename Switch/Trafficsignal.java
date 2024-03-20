package Switch;

public class Trafficsignal {
    public static void main(String arg[]) {
        String colour = "green";
        switch (colour) {
            case "red":
                System.out.println("the vachicle should stop");
                break;
            case "yellow":
                System.out.println("hte vahicle should wait");
                break;
            case "green":
                System.out.println("the vachicle should move");
                break;
            default:
                System.out.println("wrong value given");

        }
    }

}
