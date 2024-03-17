public class Typecaste {
    public static void main(String a[]) {
    double D= 15.123456789101112123;
    int i=(int)D;
    System.out.println("The naswer is  " +i);    
    
    System.out.println("------------------------");

    float float1 =15.123456789101112123777f;
    int j=(int)float1;
    System.out.println("The naswer is  " +j);

    System.out.println("------------------------");

    int k= 56;
    byte E=(byte)k;
    System.out.println("The naswer is  " +E);

    System.out.println("------------------------");

    byte byte1= 127;
    int q=(int)byte1;
    System.out.println("The naswer is  " +q);

    System.out.println("------------------------");

    // byte byte2= 128;
    // int h=(int)byte2;
    // System.out.println("The naswer is  " +q);

    byte b1=125;
    byte b2=1;
    int ans = b1+b2;// this is type promotion (when ever we are performing any arithmetic  operation between 2 variables, by default java retuns int )
    byte add=(byte)ans;
    
    System.out.println(add); 





    







    


    }
}
