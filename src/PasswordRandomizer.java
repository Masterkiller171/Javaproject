
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PasswordRandomizer {
    private int Length;
    private String choiceNumber;
    private String Website;
    private String Username;
    private String password;
    private String choiceCases;
    private String choiceSpecials;
    private Random random = new Random();

    public PasswordRandomizer() {

    }
    public void setPassword(){
        StringBuilder sb = new StringBuilder();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String specialChar = "!@#$_-+=*&<>";
        String numbers = "1234567890";
        String combo = "";
        choiceCases.toLowerCase();

        if (choiceCases.equals("lowcase")){
            combo += alpha;
        }else if(choiceCases.equals("upcase")){
            combo += alpha.toUpperCase();
        }else if (choiceCases.equals("mixed")){
            combo = combo + alpha + alpha.toUpperCase();
        }

        if(choiceCases.equals("numbers")){
            combo += numbers;
        }else if(choiceCases.equals("nonumbers")){
            combo += "";
        }

        if (choiceNumber.equals("special")){
            combo += specialChar;
        }else if (choiceSpecials.equals("nospecial")){
            combo += "";
        }
        for(int count = 0;  count < Length; count++){
            int rando = random.nextInt(combo.length());
            char chaar= combo.charAt(rando) ;
            sb.append(chaar).toString();
        }
        this.password = sb.toString() ;
    }



    public String setWebsite(String web){
        return this.Website = web;
    }

    public String setUsername(String usrnam){
        return this.Username = usrnam;
    }
    public void setChoiceNumber(String choiceNumber) {
        this.choiceNumber = choiceNumber;
    }

    public void setChoiceCases(String choiceCases) {
        this.choiceCases = choiceCases;
    }

    public void setChoiceSpecials(String choiceSpecials) {
        this.choiceSpecials = choiceSpecials;
    }

    public void setLength(int length) {
        Length = length;
    }



    public String getWebsite(){
        return this.Website;
    }
    public String getUsername(){
        return this.Username;
    }
    public String getPassword() { return password; }
}