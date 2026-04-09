interface Exam {
    void percentCal();   
}

class Student {
    String name;
    int rollNo;
    int marks1, marks2;

    Student(String n, int r, int m1, int m2) {
        name = n;
        rollNo = r;
        marks1 = m1;
        marks2 = m2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

class Result extends Student implements Exam {
    double percent;

    Result(String n, int r, int m1, int m2) {
        super(n, r, m1, m2);
    }

    public void percentCal() {
        percent = (marks1 + marks2) / 2.0;
    }

    void percentDisplay() {
        System.out.println("Percentage: " + percent + "%");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Result r = new Result("Rahul", 101, 80, 90);

        r.show();           
        r.percentCal();     
        r.percentDisplay(); 
    }
}