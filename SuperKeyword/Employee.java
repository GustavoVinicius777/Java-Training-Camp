package SuperKeyword;

public class Employee extends Person {

    private int salary;

    public Employee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }
    public int getsalary(){
        return salary;
    }
    public void showsalary(){
        System.out.println(super.getfirst() + "´s salary is R$" + this.salary);
    }
}
