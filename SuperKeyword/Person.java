package SuperKeyword;

public class Person {

    private String first;
    private String last;

    public Person (String first, String last){
        this.first = first;
        this.last = last;
    }

    public Person() {
    }

    public String getfirst(){
        return first;
    }
    public String getlast(){
        return last;
    }
    public void showname(){
    System.out.println(this.first + " " + this.last);
    }
}
