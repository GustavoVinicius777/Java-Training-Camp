package fiftytwoandahead;

public class Engine {

    private String motortype;

    public Engine(String motortype){
        this.motortype = motortype;
    }
    public String gettype(){
        return motortype;
    }
    public void start(){
        System.out.println("You start the " + motortype + " fiftytwoandahead.Engine");
    }
}
