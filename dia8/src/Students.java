public class Students {

    private String name;
    private int age;
    private double gpa;
    private boolean isEnrolled;

    public Students(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public double getgpa(){
        return gpa;
    }
    void study(){
        System.out.println(this.name + " is Studying ;) \n");
    }
}
