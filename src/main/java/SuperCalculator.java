import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperCalculator {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("超级计算器");
        jFrame.setSize(600, 400);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new BorderLayout());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image iconImage = tk.getImage("src/main/resources/计算器.jpg");
        jFrame.setIconImage(iconImage);

        final JTextField jtf = new JFormattedTextField();//文本框
        jtf.setBackground(Color.ORANGE);
        final JTextArea jta = new JTextArea();//文本区
        jta.setBackground(Color.PINK);
        jFrame.add(BorderLayout.CENTER, jtf);
        jFrame.add(BorderLayout.NORTH, jta);

        jtf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setText(jtf.getText());
            }
        });
    }

    public void init(){

    }
}
