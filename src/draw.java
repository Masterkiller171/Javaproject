import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class draw{
    private int value = 0;
    private Label lb;
    private Button but;
    Frame f = new Frame();

    public void controlGUI(){
        buildGUI();
        buildGUIContent();
    }

    private void buildGUI(){

        f.setSize(400,400);
        f.setLayout(new GridLayout(1, 1));
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }
    private void buildGUIContent(){
        lb = new Label();
        but = new Button("click dis");
        lb.setText("clicks: " + this.value);
        but.setActionCommand("counter");
        f.add(lb);
        f.add(but);
    }

}
