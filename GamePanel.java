import javax.swing.*;

public class GamePanel extends JFrame {
    public GamePanel(){
        consructorGUI();
    }
    public void consructorGUI(){
        JFrame frame = new JFrame("Game Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);

        JButton dugmence = new StartButton(5,0,0);

        frame.add(dugmence);
        frame.setVisible(true);
    }


}
