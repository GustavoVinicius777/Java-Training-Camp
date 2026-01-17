package fiftysixandahead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AaaReadFiles {
    static void main(String[] args){

        // How to read a file using java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filepath = "C:\\Users\\#####\\Desktop\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filepath));){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException a){
            System.out.println("Could not locate the file");
        }
        catch(IOException z){
            System.out.println("Something went wrong");
        }
    }
}
