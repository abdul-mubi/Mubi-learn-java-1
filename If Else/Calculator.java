public class Calculator {
    public static void main(String arg[]){
        int x=5;
        int y=3;
        String operator="add";
        int result;

        if(operator=="add"){
            result= x+y;
            System.out.println(result);
        }
        else if(operator=="sub"){
            result=x-y;
            System.out.println(result);
        }
    }
}
