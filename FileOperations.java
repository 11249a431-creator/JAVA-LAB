import java.io.*;
public class FileOperations{
    public static void main(String[] args) throws IOException{
        File file =new File("sample.txt");
        if(file.createNewFile()){
            System.out.println("File created sucessfully.");
        }else{
            System.out.println("File already exits.");
        }
        FileWriter writer=new FileWriter(file);
        writer.write("Hello! This is a java file operation program.");
        writer.close();
        System.out.println("Data written successfully.");
        FileReader reader = new FileReader(file);
        int ch;
        System.out.println("File contents:");
        while((ch = reader.read())!=-1){
            System.out.print((char)ch);
        }
        reader.close();
        if(file.delete()){
            System.out.println("\nFile delete successfully.");
            } else{
                System.out.println("\nFile couold not be detected.");
                }
    }
}