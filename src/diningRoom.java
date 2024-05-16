import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class diningRoom extends JPanel implements ActionListener{
    //mainHallway main = new mainHallway();
    JPanel diningRoom = new JPanel();
    int frameWidth = 1200;
    int frameHeight = 800;

    public diningRoom() {
        diningRoom.setVisible(true);  // and set its visibility to true, or else u cant see it
        diningRoom.setLayout(null);
        diningRoom.setBounds(0,0,frameWidth,frameHeight);
        diningRoom.setBackground(Color.red);
        System.out.println("Hello");
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        diningRoom object = new diningRoom();
    }
}
