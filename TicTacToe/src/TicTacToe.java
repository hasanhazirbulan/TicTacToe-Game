import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;


public class TicTacToe implements ActionListener {



    Random random = new Random();
    JFrame frame =  new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;


     TicTacToe() {

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(800,800);
         frame.getContentPane().setBackground(new Color(50,50,50));
         frame.setLayout(new BorderLayout());
         frame.setVisible(true);

         textField.setBackground(new Color(25,25,25));
         textField.setForeground(new Color(25,255,0));
         textField.setFont(new Font("Ink Free", Font.BOLD, 75));
         textField.setHorizontalAlignment(JLabel.CENTER);
         textField.setText("Tic-Tac-Toe");
         textField.setOpaque(true);

         titlePanel.setLayout(new BorderLayout());
         titlePanel.setBounds(0,0,800,100);

         buttonPanel.setLayout(new GridLayout(3,3));
         buttonPanel.setBackground(new Color(150,150,150));




         titlePanel.add(textField);
         frame.add(titlePanel, BorderLayout.NORTH);
         frame.add(buttonPanel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void firstTurn() {

    }

    public void check() {

    }

    public void xWins(int a, int b, int c) {

    }

    public void oWins(int a, int b, int c) {

    }

}
