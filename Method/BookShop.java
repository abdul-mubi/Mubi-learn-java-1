package Method;

class Availability {
    Boolean availability;
    int a = 1;

    public Boolean getAvailability(String bookName) {
        if (bookName == "RDPD") {
            availability = true;
        } else if (bookName == "AH") {
            availability = false;
        }
        return availability;
    }
}

public class BookShop {
    public static void main(String[] args) {
        Availability obj = new Availability();
        Boolean result = obj.getAvailability("RDPD");
        System.out.println(result);
    }
}