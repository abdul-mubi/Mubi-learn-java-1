package Object;

public class Car {
    public static void main(String arg[]) {
        model obj = new model();
        obj.carname();
        year obj1 = new year();
        obj1.yearofrelease();

    }

}

class model {
    public void carname() {
        System.out.println("toyota");
    }

}

class year {
    public void yearofrelease() {
        System.out.println("1995");

    }

}