import java.awt.*;

public class draw{
    private long value = 0;
    private Label lb;
    private Button but;
    private Button clckmulti;
    private drawShop shop = new drawShop();
    private Frame f = new Frame();

    public void controlGUI(){
        buildGUI();

    }

    private void buildGUI(){

        f.setSize(1000,1000);
        f.setLayout(new GridLayout(7, 1));
        f.setVisible(true);
    }

    public void buildGUIContent(){

            lb = new Label();
            but = new Button("click dis");
            clckmulti = new Button("buy Click multiplier, cost: " + shop.getMuliplierPrice(new draw()) + " Multiplier: " + shop.getMultiplier(new draw()));
            lb.setAlignment(1);
            but.setActionCommand("click");
            clckmulti.setActionCommand("multi");
            test();
            f.add(but);
            f.add(lb);
            f.add(clckmulti);
        }
        private void test() {
            if (but.getActionCommand().equals("click")) {

                lb.setText("Clicks: " + value);
            } else if (clckmulti.getActionCommand().equals("multi")) {

            }
        }

    public long getValue() {
        return value;
    }

}
