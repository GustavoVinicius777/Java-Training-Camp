package SuperKeyword;

public class AaaAaSuper {
    static void main(String[] args){

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parents constructors to initialize attributes

        Person pessoa = new Person("Gustavo", "Vinicius");
        Student estudante = new Student("Harry", "Potter", 3.45);
        Employee funcionario = new Employee("Gusta", "beast", 1615);

        System.out.println(estudante.getgpa());
        estudante.showname();
        pessoa.showname();

        estudante.showgpa();
        funcionario.showsalary();


    }
}
