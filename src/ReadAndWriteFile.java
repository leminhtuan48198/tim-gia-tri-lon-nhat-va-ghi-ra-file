import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) throws IOException {

        List<Integer> numbers=new LinkedList<>();
        try {
            File file =new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();}

        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);


        String str;
        while ((str=bufferedReader.readLine())!=null){
            numbers.add(Integer.parseInt(str));
        }
        bufferedReader.close();
        }
        catch (Exception e){
            System.out.println("File khong ton tai hoac loi");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max) throws IOException {
       try{ FileWriter fileWriter=new FileWriter(filePath);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("Gia tri lon nhat la "+max);
        bufferedWriter.close();
    } catch (Exception e){
           System.err.println("File khong ton tai hoac loi noi dung");
       }
    }
}
