package file;

import java.io.*;

public class Output {
    static void output() {
        // output
        OutputStream os = System.out;
//        os.write(😍); // range is exceeded

//        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//            osw.write("Hello World ");
//            osw.write(97);
//            osw.write(10); // new line
//            osw.write('A');
//            osw.write('\n');
//            char[] arr = "hello world".toCharArray();
//            osw.write(arr);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try (FileWriter fw = new FileWriter("hello.txt", true)) {
            fw.write("this should be appended");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("hello.txt"))) {
            bw.write("Bhavesh");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
