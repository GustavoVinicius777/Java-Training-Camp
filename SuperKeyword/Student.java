package SuperKeyword;

public class Student extends Person {

    private double gpa;

    public Student(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }
    public double getgpa(){
        return gpa;
    }
    public void showgpa(){
        System.out.println(super.getfirst() + "´s gpa is: " + this.gpa);
    }
}
