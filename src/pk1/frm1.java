package pk1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm1 {
    private JButton button1;
    private JRadioButton radioButton1;
    private JTextField textField1;
    private JTextPane textPane1;
    private JList list1;
    private JProgressBar progressBar1;
    private JScrollBar scrollBar1;
    private JPanel pnl11;

    public frm1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("clickeed");

            }
        });
    }

    public static void main(String[] args) {


    }
}
