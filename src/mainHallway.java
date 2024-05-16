import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// imma put in some comments for kevin the jframe noob and so u guys understand stuff
// pls be organized in ur code..
public class mainHallway extends JFrame implements ActionListener {
    JFrame frame = new JFrame();  // makes frame
    JPanel doorRoom = new JPanel();
    diningRoom diningRoom = new diningRoom();

    int frameWidth = 1200;  // im making integers for these in the case that i want to change the width/height
    int frameHeight = 800;  // and i wont have to change every button's sizes individually, just change these ints
    int arrowSize = 40;
    JButton upArrow = new JButton();
    ImageIcon upArrowImage = new ImageIcon(new ImageIcon("uparrow.png").getImage().getScaledInstance(arrowSize, arrowSize, Image.SCALE_DEFAULT));
    JButton downArrow = new JButton();
    ImageIcon downArrowImage = new ImageIcon(new ImageIcon("downarrow.png").getImage().getScaledInstance(arrowSize, arrowSize, Image.SCALE_DEFAULT));
    JButton leftArrow = new JButton();
    ImageIcon leftArrowImage = new ImageIcon(new ImageIcon("leftarrow.png").getImage().getScaledInstance(arrowSize, arrowSize, Image.SCALE_DEFAULT));
    // ^ makes an image icon that can be used to set the icon of a button
    JButton rightArrow = new JButton();
    ImageIcon rightArrowImage = new ImageIcon(new ImageIcon("rightarrow.png").getImage().getScaledInstance(arrowSize, arrowSize, Image.SCALE_DEFAULT));
    JButton[] buttonList = {upArrow, downArrow, leftArrow, rightArrow};

    public mainHallway() {
        frame.setLayout(null);  // all the "setLayout(null)" means when you put buttons and stuff inside,
        // u can set their bounds to pixels and it wont automatically be centered
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frameWidth, frameHeight);
        frame.setLocationRelativeTo(null);  // centers the frame on your screen
        frame.getContentPane().setBackground(Color.white);

        for (int i=0; i<4; i++) {
            buttonList[i].addActionListener(this);
            buttonList[i].setFocusable(false);
            buttonList[i].setContentAreaFilled(false);
            buttonList[i].setBorderPainted(false);
        }
        upArrow.setBounds(frameWidth/2-arrowSize-5, 75, arrowSize, arrowSize);
        upArrow.setIcon(upArrowImage);
        downArrow.setBounds(frameWidth/2-arrowSize-5, frameHeight-75, arrowSize, arrowSize);
        downArrow.setIcon(downArrowImage);
        leftArrow.setBounds(20, frameHeight/2-arrowSize-5, arrowSize, arrowSize);
        leftArrow.setIcon(leftArrowImage);
        rightArrow.setBounds(frameWidth-75, frameHeight/2-arrowSize-5, arrowSize, arrowSize);
        rightArrow.setIcon(rightArrowImage);

        /** front door **/  // pls make green comments to label any new section of code
        frame.add(doorRoom);  // have to add panels to the frame
        doorRoom.setVisible(true);  // and set its visibility to true, or else u cant see it
        doorRoom.setLayout(null);
        doorRoom.setBounds(0,0,frameWidth,frameHeight);
        doorRoom.setBackground(Color.red);
        doorRoom.add(leftArrow);  // have to add buttons to the panel
        doorRoom.add(rightArrow);

        /** dining room**/
        frame.add(diningRoom);
        diningRoom.add(upArrow);
        diningRoom.add(downArrow);
        diningRoom.setBackground(Color.green);
        diningRoom.setVisible(true);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {  // all button pressing and animations (i think) in here
        if (e.getSource() == leftArrow) {
            setFrameVisibility(diningRoom);
            diningRoom.setVisible(true);
            System.out.println(diningRoom.isVisible());
        }
    }

    private void setFrameVisibility(javax.swing.JPanel panel) {  // takes the panel inputted
        // makes every other panel invisible except the one given
        doorRoom.setVisible(false);
        diningRoom.setVisible(false);
        //diningRoom.setVisible(false);
        panel.setVisible(true);
        System.out.println("I =");
    }


    public static void main(String[] args) {
        mainHallway object = new mainHallway();  // need this or else the program wont run
    }
}
