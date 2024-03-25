package Demo;

public class Traffic {
    public static void main(String arg[]) {

        String result = trafficrule("red");
        System.out.println(result);

    }

    public static String trafficrule(String colour) {
        String action;
        if (colour == "red") {
            action = "stop";
        } else if (colour == "yellow") {
            action = "wait";
        } else if (colour == "green") {
            action = "move";
        } else {
            action = "no";
        }
        return action;

    }

}
