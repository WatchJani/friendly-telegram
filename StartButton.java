import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButton extends JButton implements ActionListener {

    int x;
    int y;
    int value;

    public StartButton(int text, int x, int y){
        super(Integer.toString(text));
        this.value = text;
        this.x = x;
        this.y = y;
        this.addActionListener(this);
    }

    public int GetX(){
        return x;
    }

    public int GetY(){
        return y;
    }

    public int GetValue(){
        return value;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(this.GetX());
        System.out.println(this.GetY());
        System.out.println(this.GetValue());
    }
}
