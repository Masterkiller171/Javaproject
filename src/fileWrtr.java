

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fileWrtr {


    static void wrter(String encrypted, String website, String userName) {
        Scanner read = new Scanner(System.in);
        File file = new File("/Users/Youri/Desktop/Java_project/src/passWords/" + website + ".txt");

        if(file.exists()){

            System.out.println("Website already exist do you want to choose another name or overwrite or stop? Choose name or overwrite or stop");
            String choice = read.nextLine();
            if(choice.equals("name")){
                System.out.println("Choose a new name for the file.");
                String newName = read.nextLine();
                try {
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(newName);
                    pw.println(website);
                    pw.println(userName);
                    pw.flush();
                    pw.close();
                } catch (
                        IOException e) {
                    e.printStackTrace();
                }
            }else if(choice.equals("overwrite")){
                file.delete();
                try {
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(encrypted);
                    pw.println(website);
                    pw.println(userName);
                    pw.flush();
                    pw.close();
                } catch (
                        IOException e) {
                    e.printStackTrace();
                }

            }else if (choice.equals("stop")){
                System.exit(0);
            }
        }else{
            try {
                PrintWriter pw = new PrintWriter(file);
                pw.println(encrypted);
                pw.println(website);
                pw.println(userName);
                pw.flush();
                pw.close();
            } catch (
                    IOException e) {
                e.printStackTrace();
            }

        }

    }

}