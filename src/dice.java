import java.util.Random;
import java.util.ArrayList;
public class dice {
    private Random random = new Random();
    private int Guess;
    private int genNum;
    private int bal;
    private int xp;
    private ArrayList<String> items;
    private ArrayList<String> allItems;
    private int diceModifier;
    private int balModifier;
    private int lvl;

    public dice() {
        this.diceModifier = 6;
        this.balModifier = 5;
        // allItems.add("shrinker");
        // allItems.add("moneygrabber");
        numberGenerator();

    }
    public void numberGenerator(){
        int rando = random.nextInt(diceModifier);
        this.genNum = rando + 1;
    }
    public String numchecker() {
        if (this.Guess == this.genNum) {
            bal += balModifier;
            xp += 10;
            return "You chose the good number!";
        } else {
            if(bal > 0) {
                bal -= 1;
            }
            xp += 5;
            return "You chose the wrong number";
        }
    }
    public void levelUp(){
        int counter = 0;
        while(true) {
            if (this.xp < counter * 10){
                lvl += 1;
            }
            counter++;
        }
    }
    public int getLevel(){
        return this.lvl;
    }

    public String getShop(String item){
        item.toLowerCase();
        if(item.equals("shrinker")){
            bal -= 5;
            xp += 10;
            diceModifier -= 1;
            items.add("Shrinker");
            return "bought shrinker";
        }else if(item.equals("moneygrabber")){
            if(xp > 20) {
                bal -= 10;
                xp += 20;
                balModifier += 1;
                return "bought moneygrabber";
            }else{
                return "your level is too low!";
            }
        }return "";
    }
     public void setGuess(int guess) {
        Guess = guess;
    }

    public int getBal() {
        return bal;
    }

    public int getXp() {
        return xp;
    }

    public int getDiceModifier() {
        return diceModifier;
    }

    public int getBalModifier() {
        return balModifier;
    }

    public int getLvl() {
        return lvl;
    }
}
