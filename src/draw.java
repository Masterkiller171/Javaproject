import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class draw {
    private long value = 0; //Is the amount of clicks
    private long totalValue = 0;
    private JButton doubler;
    private JPanel Panel;
    private JLabel lb; //Label showing the amount of clicks
    private JLabel stats;
    private JButton but; //Button to click to increase the value of clicks
    private JButton clckmulti; //Button for the multiplier click
    private JButton gamble; //Button for the auto click function
    private JFrame p = new JFrame(); //Creating a frame for the grid
    private int muliplierPrice = 10; //Is the default price to buy a multiplier
    private int multiplier = 1; //Is the default multiplier for the clicks
    private int doubles = 1;
    private int doublePrice = 50;

//Constructs all classes to main
    public void controlGUI(){
        buildGUI();
        buildClickGUI();
    }
//Building the grid of the GUI
    private void buildGUI(){
        p = new JFrame("clicker");
        p.setSize(1000,1000);
        p.setLayout(new GridLayout(0, 2));
        p.setVisible(true);

        Panel = new JPanel();
        Panel.setLayout(new FlowLayout());

    }

//Building the GUI it self
    private void buildClickGUI(){


        lb = new JLabel("click");
        but = new JButton("click dis");
        stats = new JLabel("<html> Total clicks: " + this.totalValue + "<br> multiplier level: " + this.multiplier + " </html>");
        p.add(lb);
        p.add(stats);
        p.add(but);

        clckmulti = new JButton("Buy Click multiplier, cost: " + this.muliplierPrice + " Multiplier: " + this.multiplier);
        p.add(clckmulti);

        doubler = new JButton("Doubles the current multiplier, cost: " + this.doublePrice + " doubler level: " + this.doubles);
        p.add(doubler);

        gamble = new JButton("Gamble");
        p.add(gamble);

        but.addActionListener(this::actionPerformed);
        clckmulti.addActionListener(this::actionPerformed);
        doubler.addActionListener(this::actionPerformed);
    }

    //Actions performed when a button is pressed
    private void actionPerformed(ActionEvent e){
        if(e.getSource() == but){
            lb.setText("clicks: " + this.value);

            value += this.multiplier * this.doubles;
            totalValue += multiplier * doubles;
            stats.setText("<html> Total clicks: " + this.totalValue + "<br> multiplier level: " + this.multiplier + " </html>");

        }else if(e.getSource() == clckmulti){
            if(this.value > this.muliplierPrice) {

                value -= this.muliplierPrice;
                muliplierPrice *= 2;
                this.multiplier++;

                lb.setText("clicks: " + this.value);
                clckmulti.setText("Buy Click multiplier, cost: " + this.muliplierPrice + " Multiplier: " + this.multiplier);

            }else if(e.getSource() == doubler){
                if(this.value > this.doublePrice) {
                    this.doubles++;
                    this.value -= this.doublePrice;
                    doublePrice *= 3;
                    doubler.setText("Doubles the current multiplier, cost: " + doublePrice + " doubler level: " + this.doubles);
                }
            }
        }
}

}