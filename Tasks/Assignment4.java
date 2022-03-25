package Tasks;

import java.io.*;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) throws Exception{
        // Writing in one file name file1
        FileWriter writer = new FileWriter("file1.txt", true);
        BufferedWriter buffer = new BufferedWriter(writer);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to be added in file");
        String str = sc.nextLine();
        buffer.write(str);
        buffer.close();

        File file = new File("file1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        FileWriter writer1 = new FileWriter("file2.txt", true);
        BufferedWriter buffer1 = new BufferedWriter(writer1);

        while(( st  = br.readLine()) != null){
            String f2 = st;
            buffer1.write(f2);
        }
        System.out.println("Successfully Done");
        buffer1.close();
    }
}
