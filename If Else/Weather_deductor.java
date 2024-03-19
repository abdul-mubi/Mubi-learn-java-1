//0 to 30 --cold
//31 to 60 -- warm
//61 - 90 --hot
//91-100 --- too hot

public class Weather_deductor {
    public static void main(String arg[]) {
        int weather = -75;
        if (weather >= 0 && weather <= 30) {
            System.out.println("the weather is cold");
        } else if (weather >= 31 && weather <= 60) {
            System.out.println("the weather is warm");
        } else if (weather >= 61 && weather <= 90) {
            System.out.println("the weather is hot");
        } else if (weather >= 91 && weather <= 100) {
            System.out.println("the weather is too hot");
        } else {
            System.out.println("given input is incorrect");
        }
    }

}
