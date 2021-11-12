import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FirstInterface{
    JFrame frame;
    JPanel panel;
    JLabel label1, label2, label3,label4,label5,label6, label7;
    JButton button, button2;

    FirstInterface()
    {
        frame= new JFrame("Our Project");
        frame.setSize(600,450);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.pink);

        panel= new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(0,0,600,80);
        panel.setOpaque(true);


        label1= new JLabel("TIC TIC TOE GAME");
        label1.setFont(new Font("ITALIC", Font.BOLD, 40));
        label1.setForeground(Color.white);
        label1.setBounds(100,70,100,200);

        label3 = new JLabel("INTRODUCTION");
        label3.setFont(new Font("Helvetica", Font.BOLD, 30));
        label3.setForeground(Color.DARK_GRAY);
        label3.setBounds(190,10,250,200);

        label4 = new JLabel("PROJECT MEMBERS: ");
        label4.setFont(new Font("ARIAL", Font.BOLD, 20));
        label4.setForeground(Color.DARK_GRAY);
        label4.setBounds(200,70,250,200);

        label5 = new JLabel("AASHIR ALI (20SW023) ");
        label5.setFont(new Font("ARIAL", Font.BOLD, 20));
        label5.setForeground(Color.DARK_GRAY);
        label5.setBounds(200,110,250,200);

        label6 = new JLabel("MAHNOOR (20SW059) ");
        label6.setFont(new Font("ARIAL", Font.BOLD, 20));
        label6.setForeground(Color.DARK_GRAY);
        label6.setBounds(200,140,250,200);

        label7 = new JLabel("Click here to enter players:  ");
        label7.setFont(new Font("ARIAL", Font.BOLD, 30));
        label7.setForeground(Color.DARK_GRAY);
        label7.setBounds(120,200,500,200);

        button = new JButton("Click here");
        button.setFocusable(false);
        button.setBounds(150, 330, 130,40);
        button.setBackground(Color.darkGray);
        button.setForeground(Color.white);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {

                    frame.dispose();

                    new TicTactoe();
                }
            }
        });



        button2 = new JButton("Cancel");
        button2.setBackground(Color.darkGray);
        button2.setBounds(300,330,130,40);
        button2.setFocusable(false);
        button2.setForeground(Color.white);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button2) {
                    frame.dispose();
                }
            }
        });




        JLabel label2 = new JLabel();
        label2.setIcon(new ImageIcon("C:\\Users\\village computer mpk\\IdeaProjects\\2nd java program\\picture.jpg"));
        label2.setBounds(0,30,150,450);


        frame.add(panel);
        frame.add(label2);
        panel.add(label1);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(button);
        frame.add(button2);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new FirstInterface();

    }

}

