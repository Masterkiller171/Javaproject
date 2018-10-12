import java.awt.*;
import java.awt.event.ActionEvent;

public class draw {
    private long value = 0; //Is the amount of clicks
    private Label lb; //Label showing the amount of clicks
    private Button but; //Button to click to increase the value of clicks
    private Button clckmulti; //Button for the multiplier click
    private Button autoclck; //Button for the auto click function
    private Frame f = new Frame(); //Creating a frame for the grid
    private int muliplierPrice = 10; //Is the default price to buy a multiplier
    private int multiplier = 1; //Is the default multiplier for the clicks
    private boolean auto = false; //Boolean for wheter the auto click upgrade has been bought

//Constructs all classes to main
    public void controlGUI(){
        buildGUI();
        buildClickGUI();
        autoclk();
    }
//Building the grid of the GUI
    private void buildGUI(){

        f.setSize(1000,1000);
        f.setLayout(new GridLayout(10, 1));
        f.setVisible(true);
    }

//Building the GUI it self
    private void buildClickGUI(){

        lb = new Label("click");
        but = new Button("click dis");
        but.setBackground(Color.red);
        lb.setAlignment(1);
        f.add(lb);
        f.add(but);

        clckmulti = new Button("Buy Click multiplier, cost: " + this.muliplierPrice + " Multiplier: " + this.multiplier);
        f.add(clckmulti);

        autoclck = new Button("Auto clicker");
        f.add(autoclck);

        but.addActionListener(this::actionPerformed);
        clckmulti.addActionListener(this::actionPerformed);
        autoclck.addActionListener(this::actionPerformed);
    }

    //Actions performed when a button is pressed
    private void actionPerformed(ActionEvent e){
        if(e.getSource() == but){
            lb.setText("clicks: " + this.value);
            value += this.multiplier;
        }else if(e.getSource() == clckmulti){
            if(this.value > this.muliplierPrice) {
                value -= this.muliplierPrice;
                muliplierPrice *= 2;
                this.multiplier++;
                lb.setText("clicks: " + this.value);
                clckmulti.setLabel("Buy Click multiplier, cost: " + this.muliplierPrice + " Multiplier: " + this.multiplier);
            }else if(e.getSource() == autoclck){
                auto = true;
            }
        }
}

//Clicks automaticly when you buy the upgrade
    private void autoclk(){
        if(auto){
            long oldTime = System.currentTimeMillis();
            while(System.currentTimeMillis() - oldTime < 1000){
                autoclck.setLabel(value++ + "test");
                oldTime = System.currentTimeMillis();
            }
        }
    }
}