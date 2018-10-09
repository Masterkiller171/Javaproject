import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class gameSaver {
    void saver() {
        File file = new File("/Users/Youri/Desktop/Java_project/src/gameSaves/save.txt");
        dice Dice = new dice();

if(file.exists()) {
    file.delete();
    try {
        PrintWriter pw = new PrintWriter(file);
        pw.println(Dice.getBal());
        pw.println(Dice.getXp());
        pw.println(Dice.getBalModifier());
        pw.println(Dice.getDiceModifier());
        pw.println(Dice.getLvl());
        pw.flush();
        pw.close();
    } catch (
            IOException e) {
        e.printStackTrace();
    }
}else{
    try {
        PrintWriter pw = new PrintWriter(file);
        pw.println(Dice.getBal());
        pw.println(Dice.getXp());
        pw.println(Dice.getBalModifier());
        pw.println(Dice.getDiceModifier());
        pw.println(Dice.getLvl());
        pw.flush();
        pw.close();
    } catch (
            IOException e) {
        e.printStackTrace();
    }
}
    }
}
