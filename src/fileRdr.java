
import java.io.*;
import java.util.Scanner;

public class fileRdr {
    private String pass;
    private String name;
    private String username;

    public String second() throws IOException {

        Scanner read = new Scanner(System.in);
        System.out.println("What's the website or account name?");
        String fileName = read.nextLine();

        InputStream is = new FileInputStream("/Users/Youri/Desktop/Java_project/src/passWords/" + fileName + ".txt");
        File file = new File("/Users/Youri/Desktop/Java_project/src/passWords/" + fileName + ".txt");

        if(file.exists()) {
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));

           this.pass = buf.readLine();
           this.name = buf.readLine();
           this.username = buf.readLine();

           PasswordRandomizer rando = new PasswordRandomizer();
           rando.setWebsite(name);
           rando.setUsername(username);

        }else{
            System.out.println("Account or website does not exist!");
        }
     return pass;
    }
}
