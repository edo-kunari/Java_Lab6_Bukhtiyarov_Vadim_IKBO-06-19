import javax.swing.*;
import java.awt.*;
import java.awt.event .*;
class BorderExample extends JFrame {
    JPanel[] pnl = new JPanel[9];
    JTextField jta = new JTextField("Enter number");
    JButton but = new JButton("Send");
    public BorderExample()
    {
        super("Example");
        setLayout(new GridLayout(3,3));
        for(int i = 0; i < pnl.length; i++){
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(49, 209, 215));
            add(pnl[i]);
        }
        pnl[4].setBackground(new Color(20, 83, 85));
        JTextField jta = new JTextField("Enter number");
        Font fnt = new Font("Times new 30 roman",Font.BOLD,20);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(jta,BorderLayout.CENTER);
        jta.setSize(2,20);
        JButton but = new JButton("Send");
        pnl[7].add(but,BorderLayout.WEST);
        int  r1 = (int) (Math.random() * 20);
        String r = Integer.toString(r1);
        but.addMouseListener(new MouseListener() {
            int popitki = 0;
            int t = 0;
            public void mouseClicked(MouseEvent event) {
                popitki++;
                if (popitki == 4)
                    System.exit(1);
                if (jta.getText().equals(r))
                    JOptionPane.showMessageDialog(null, "Вы угадали!\nПоздравляю!");
                else
                    JOptionPane.showMessageDialog(null, "Вы не угадали :(\nОставшихся попыток: "+(3-popitki));

            }
            public void mouseEntered(MouseEvent event) {} public void mouseExited(MouseEvent event) {} public void mousePressed(MouseEvent event) {} public void mouseReleased(MouseEvent event) {}
        });

        setSize(600,400);
    }

    public static void main(String[]args) {
        new BorderExample().setVisible(true); }
}
