package file;

import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        Input.input();
//        Output.output();

        // create
        try {
            File f = new File("new-file.txt");
            f.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // write in the file
        try {
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("Java is best.");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // reading from a file
        try (BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // delete
//        try {
//            File fo = new File("random.txt");
//            fo.createNewFile();
//            if(fo.delete()) {
//                System.out.println(fo.getName());
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
