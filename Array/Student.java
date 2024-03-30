package Array;

public class Student {
    public static void main(String arg[]) {
        studentdetails obj = new studentdetails();
        obj.name = "Abdul";
        obj.rollno = 1;

        studentdetails obj1 = new studentdetails();
        obj1.name = "Rayan";
        obj1.rollno = 2;
        studentdetails stu[] = new studentdetails[2];// aray creation
        stu[0] = obj;
        stu[1] = obj1;
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].name + ":" + stu[i].rollno);
        }

    }

}

class studentdetails {
    int rollno;
    String name;

}
