
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)  throws IOException {
        int passleng;
        String website;
        String username;
        String choiceCase;
        String choiceSpecial;
        String choiceNumber;

        Scanner read = new Scanner(System.in);
        while (true) {
            //User could choose among these parameters: game, encrypt, dencrypt and openfile
            System.out.println("Do want to generate a password or play a game or encrypt or dencrypt or openfile or quit?");
            String reader = read.nextLine();
            if (reader.equals("password")) {
                System.out.println("What's the website or company?");
                website = read.nextLine();

                System.out.println("What's the username of this account?");
                username = read.nextLine();

                System.out.println("How long do you want your password to be?");
                passleng = Integer.parseInt(read.nextLine());

                System.out.println("Do you want only lower case characters, uppercases or mixed? Choose lowcase, upcase or mixed.");
                choiceCase = read.nextLine();

                System.out.println("Do you want special characters (!@#$_-+=*&<>) or not? Choose special or nospecial.");
                choiceSpecial = read.nextLine();

                System.out.println("Do you want numeric characters (0123456789) or not? Choose numbers or nonumbers.");
                choiceNumber = read.nextLine();

                PasswordRandomizer randomizer = new PasswordRandomizer();

                randomizer.setWebsite(website);
                randomizer.setUsername(username);
                randomizer.setLength(passleng);
                randomizer.setChoiceCases(choiceCase);
                randomizer.setChoiceSpecials(choiceSpecial);
                randomizer.setChoiceNumber(choiceNumber);
                randomizer.setPassword();

                System.out.println("Website: " + randomizer.getWebsite());
                System.out.println("Username: " + randomizer.getUsername());
                System.out.println("Password: " + randomizer.getPassword());

                encrypt encrypt = new encrypt(randomizer.getPassword());
                encrypt.setPassWord(randomizer.getPassword());
                String encrypted = encrypt.getencryptPassWord();
                fileWrtr.wrter(encrypted, randomizer.getWebsite(), randomizer.getUsername());

            } else if (reader.equals("game")) {
                while (true) {
                    System.out.println("Choose a number between 1 and 6.");
                    dice Dice = new dice();
                    gameSaver save = new gameSaver();
                    int guess = Integer.parseInt(read.nextLine());
                    Dice.setGuess(guess);
                    System.out.println(Dice.numchecker());
                    System.out.println("Your balance: " + Dice.getBal());
                    save.saver();
                    System.out.println("do you want to throw another one, check your balance or quit? Choose play, level, shop, balance or quit.");
                    String choice = read.nextLine();

                    choice.toLowerCase();
                    if (choice.equals("balance")) {
                        System.out.println("Your balance: " + Dice.getBal());
                    } else if (choice.equals("quit")) {
                        break;
                    } else if (choice.equals("shop")) {
                        System.out.println("Items: shrinker, moneygrabber");
                        String item = read.nextLine();


                        if (item.equals("shrinker") || item.equals("moneygrabber")) {
                            System.out.println(Dice.getShop(item));
                        }
                    } else if (choice.equals("level")) {
                        System.out.println(Dice.getLevel());
                    }
                }
            } else if (reader.equals("encrypt")) {
                System.out.println("Password?");
                String pass = read.nextLine();
                encrypt encrypt = new encrypt(pass);
                encrypt.setPassWord(pass);
                System.out.println(encrypt.getencryptPassWord());

            } else if (reader.equals("dencrypt")) {
                System.out.println("Password?");
                String dencrypt = read.nextLine();
                dencrypt dencrypted = new dencrypt(dencrypt);
                System.out.println(dencrypted.getencryptPassWord());

            } else if (reader.equals("openfile")) {
                fileRdr fileDataArr = new fileRdr();
                String data = fileDataArr.second();
                dencrypt dencrypted = new dencrypt(data);
                dencrypted.setencryptPassWord(data);
                System.out.println(dencrypted.getencryptPassWord());
            }
            else if (reader.equals("quit")){
                break;
            }
        }
    }
}
