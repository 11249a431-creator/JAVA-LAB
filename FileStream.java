import java.io.*;
public class FileStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("sample.txt");
        String data = "Hello Java File Streams";
        out.write(data.getBytes());
        out.close();
        System.out.println("Data written successfully.");
        FileInputStream in = new FileInputStream("sample.txt");
        int ch;
        System.out.println("File contents:");
        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }
        in.close();
    }
}
