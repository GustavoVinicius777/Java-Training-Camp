package fiftysixandahead;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class AaaAWriteFiles {
    static void main(String[] args){

        // how to write a file using Java (4 popular options)

        // FileWriter = Good for Small or Medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        // you can use this too, this gonna save in your desktop instead of your src file
        //try(FileWriter writer = new FileWriter("C:\\Users\\*********\\Desktop\\test.txt")){

        String filepath = "test.txt";
        String textcontent1 = "I like Steak!";
        String textcontent2 = """
                I like Steak!
                its juice!
                its delicious
                its good to my mouth
                and my health as well
                """;

        try(FileWriter writer = new FileWriter(filepath)){
            writer.write(textcontent1);
            writer.write(textcontent2);
            System.out.println("File has been written :)");
        }
        catch(FileNotFoundException a){
            System.out.println("Could not locate file location");
        }
        catch(IOException z){
            System.out.println("Could not write file");
        }
    }
}
