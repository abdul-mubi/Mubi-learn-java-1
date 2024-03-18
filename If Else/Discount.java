public class Discount {
    public static void main(String arg[]){
        int product1=100;
        int product2=100;
        int product3=300;
        int result=product1+product2+product3;
        if(result>=100 && result<500){
            System.out.println("eligible for 10% discount");
        }
        else if (result>=500){
            System.out.println("eligible for 20% discount"); 
        }
        else if (result<100){
            System.out.println("NO discount"); 
        }
        else{
            System.out.println("exit"); 
            }
        }
    }

