public class AaaaConstructors {

    static void main(String[] Args){

        // Constructors = A special method to initialize objects
        //                You can pass arguments to a constructor
        //                and set up initial values

        Students estudante1 = new Students("Patrik", 20, 3.7);
        Students estudante2 = new Students("Gustavo", 19, 3.8);

        System.out.println("Student name: " + estudante1.getname());
        System.out.println("AGE: " + estudante1.getage());
        System.out.println("GPA: " + estudante1.getgpa());
        estudante1.study();

        System.out.println("Student name: " + estudante2.getname());
        System.out.println("AGE: " + estudante2.getage());
        System.out.println("GPA: " + estudante2.getgpa());
        estudante2.study();
    }
}
