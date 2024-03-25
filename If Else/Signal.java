public class Signal {
   public static void main(String arg[]) {
      String colour = "black";

      if (colour == "red") {
         System.out.println("vahicle should stop");
      } else if (colour == "yellow") {
         System.out.println("vahicle should wait");

      } else if (colour == "green") {
         System.out.println("vahicle should go");
      } else {
         System.out.println("not a colour in signal");
      }

   }

}
