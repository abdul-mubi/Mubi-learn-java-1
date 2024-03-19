public class Eligibilty {
    public static void main(String arg[]) {
        int age = 20;
        char sex = 'F';

        if (age >= 18 && sex == 'M') {
            System.out.println("the  male person is eligible");
        } else if (age < 18 && sex == 'M') {
            System.out.println("the  male person is not eligible");
        }
        if (age >= 21 && sex == 'F') {
            System.out.println("the Female person is eligible");
        } else if (age < 21 && sex == 'F') {
            System.out.println("the  male person is not eligible");
        }

    }

}
