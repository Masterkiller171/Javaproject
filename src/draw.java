import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class draw {
    private long value = 0;
    private Label lb;
    private Button but;
    private Button clckmulti;
    private drawShop shop = new drawShop();
    private Frame f = new Frame();

    public void controlGUI(){
        buildGUI();
        buildClickGUI();
    }

    private void buildGUI(){

        f.setSize(1000,1000);
        f.setLayout(new GridLayout(7, 2));
        f.setVisible(true);
    }

    private void buildClickGUI(){

            lb = new Label("click");
            but = new Button("click dis");
            but.setBackground(Color.red);
            lb.setAlignment(1);
            f.add(lb);
            f.add(but);

        clckmulti = new Button("Buy Click multiplier, cost: " + shop.getMuliplierPrice() + " Multiplier: " + shop.getMultiplier());
        f.add(clckmulti);
        but.addActionListener(this::actionPerformed);
        clckmulti.addActionListener(new shopper());
        }

    private void actionPerformed(ActionEvent e){
        e.getActionCommand();
        lb.setText("clicks: " + getValue());
        value += shop.getMultiplier();
    }

    public long getValue() {
        return this.value;
    }
    public void setValue(Long value){
     this.value = value;
    }
}

class shopper implements ActionListener{
    public void actionPerformed(ActionEvent e){
        drawShop shop = new drawShop();
        e.getActionCommand();
        draw draw = new draw();

        if(draw.getValue() > shop.getMuliplierPrice()) {
            shop.upDateMuliplier(draw.getValue());
            draw.setValue(draw.getValue() - shop.getMuliplierPrice());
        }
    }
}
