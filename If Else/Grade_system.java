// 0-35 = F
// 36- 50 = E
// 51 - 70 = D
// 71 - 80 = C
// 81 - 90 = B
// 91 - 100 = A 
public class Grade_system {
    public static void main (String arg[]){
        int student_mark=-1987;
        if(student_mark>=0 && student_mark<=35){
            System.out.println("the grade is  F");
        }
        else if(student_mark >= 36 && student_mark<= 50){
            System.out.println("the grade is  E");
        
        }
        else if(student_mark >= 51 && student_mark<= 70){
            System.out.println("the grade is  D"); 
        }
        else if (student_mark >= 71 && student_mark<= 80){
            System.out.println("the grade is  C"); 
        }
        else if (student_mark >= 81 && student_mark<= 90){
            System.out.println("the grade is  B");  
        }
        else if (student_mark >= 91 && student_mark<= 100){
            System.out.println("the grade is  A"); 
        }

        // else if (student_mark >100 || student_mark<0){
        //     System.out.println("the mark  is  Not within the range"); 
        // }
        else{
            System.out.println("the mark  is  Not within the range"); 
        }
            
    
}
}
