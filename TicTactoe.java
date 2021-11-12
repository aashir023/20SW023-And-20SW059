import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTactoe extends JFrame {

    static  int d=1;
    static int r1=0;
    static int r2=0;
    static int r3=0;
    static int c1=0;
    static int c2=0;
    static int c3=0;
    static int s1=0;
    static int s2=0;




    JFrame frame;
    JPanel panel1, panel2;
    JLabel label1, label2, label3, label4, label5;
    ImageIcon image;
    JTextField t1, t2;
    JButton button1, button2;

    JPanel pnl1,pnl2;
    JLabel l1;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;

    String player1;
    String player2;

    TicTactoe()
    {


        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel("TIC TAC TOE");
        label3 = new JLabel("GAME: ");
        label4 = new JLabel("Enter First Player: ");
        label5 = new JLabel("Enter Second Player: ");
        t1 = new JTextField(50);
        t2 = new JTextField(50);




        button1 = new JButton("Play");
        button2 = new JButton("Quit");
        image = new ImageIcon("C:\\Users\\village computer mpk\\IdeaProjects\\2nd java program\\img.png");

        label1.setIcon(image);
        label1.setBounds(0, 80, 560, 350);

        label2.setBounds(20, 0, 200, 80);
        label2.setForeground(Color.gray);
        label2.setFont(new Font("ARIAL,", Font.ITALIC, 30));
        label2.setLayout(new GridLayout());

        label3.setBounds(50, 50, 200, 80);
        label3.setForeground(Color.gray);
        label3.setFont(new Font("ARIAL,", Font.ITALIC, 30));
        label3.setLayout(new GridLayout());

        label4.setBounds(50, 50, 230, 80);
        label4.setForeground(Color.white);
        label4.setFont(new Font("ARIAL,", Font.BOLD, 20));
        label4.setLayout(null);

        t1.setBounds(70, 110, 200, 30);
        t1.setBackground(new Color(74, 31, 61));
        t1.setForeground(Color.white);

        label5.setBounds(50, 150, 230, 80);
        label5.setForeground(Color.white);
        label5.setFont(new Font("ARIAL,", Font.BOLD, 20));
        label5.setLayout(null);

        t2.setBounds(70, 210, 200, 30);
        t2.setBackground(new Color(74, 31, 61));
        t2.setForeground(Color.white);

        button1.setBounds(80, 270, 80, 30);
        button1.setBackground(new Color(74, 31, 61));
        button1.setForeground(Color.white);
        button1.setFocusable(false);

        button2.setBounds(180, 270, 80, 30);
        button2.setBackground(new Color(74, 31, 61));
        button2.setForeground(Color.white);
        button2.setFocusable(false);


        frame.setSize(500, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        panel1.setBounds(0, 0, 230, 400);
        panel1.setBackground(new Color(74, 31, 61));
        panel1.setLayout(null);


        panel2.setBounds(200, 0, 400, 400);
        panel2.setBackground(new Color(186, 79, 84));
        panel2.setLayout(null);


        frame.add(panel1);
        frame.add(panel2);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        panel2.add(label4);
        panel2.add(t1);
        panel2.add(label5);
        panel2.add(t2);
        panel2.add(button1);
        panel2.add(button2);
        frame.setVisible(true);




        setSize(500,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");

        pnl1 = new JPanel();
        pnl1.setBounds(0,0,500,100);
        pnl1.setBackground(Color.CYAN);

        l1 = new JLabel();
        l1.setBounds(10,25,50,30);
        l1.setFont(new Font("Arial",Font.PLAIN,30));



        pnl2 = new JPanel();
        pnl2.setBounds(0,100,500,450);
        pnl2.setLayout(new GridLayout(3,3));


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(d%2!=0)
                {
                    btn1.setBackground(Color.BLACK);
                    btn1.setText("X");
                    l1.setText(player2+ "'s Turn");
                    btn1.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn1.setForeground(Color.white);
                    btn1.setEnabled(false);
                    r1=r1*10+1;
                    c1=c1*10+1;
                    s1+=11;

                }
                else{
                    btn1.setBackground(Color.BLACK);
                    btn1.setText("O");
                    l1.setText(player1+"'s Turn");
                    btn1.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn1.setForeground(Color.white);
                    btn1.setEnabled(false);
                    r1=r1*10+4;
                    c1=c1*10+4;
                    s2+=11;
                }
                d+=1;
                if(r1 == 111 || c1 == 111 || s1 == 66)
                {
                    l1.setText(player1+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);


                }
                else if(r1 == 444 || c1 == 444 || s2 == 66)
                {
                    l1.setText(player2+" Wins");

                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);

                }
                else if (d==10)
                {
                    l1.setText("TIE");
                }
            }
        });


        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(d%2!=0)
                {
                    btn2.setBackground(Color.BLACK);
                    btn2.setText("X");
                    l1.setText(player2+"'s Turn");
                    btn2.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn2.setForeground(Color.white);
                    btn2.setEnabled(false);
                    r1=r1*10+1;
                    c2=c2*10+1;
                }
                else{
                    btn2.setBackground(Color.BLACK);
                    btn2.setText("O");
                    l1.setText(player1+"'s Turn");
                    btn2.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn2.setForeground(Color.white);
                    btn2.setEnabled(false);
                    r1=r1*10+4;
                    c2=c2*10+4;
                }

                d+=1;
                if(r1 == 111 || c2 == 111)
                {
                    l1.setText(player1+" Wins");
                    btn1.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);

                }
                else if (r1 == 444 || c2 == 444)
                {
                    l1.setText(player2+" Wins");
                    btn1.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);

                }
                else if (d == 10)
                {
                    l1.setText("TIE");
                }

            }
        });


        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(d%2!=0)
                {
                    btn3.setBackground(Color.BLACK);
                    btn3.setText("X");
                    l1.setText(player2+"'s Turn");
                    btn3.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn3.setForeground(Color.white);
                    btn3.setEnabled(false);
                    r1=r1*10+1;
                    c3=c3*10+1;
                    s1+=13;

                }
                else{
                    btn3.setBackground(Color.BLACK);
                    btn3.setText("O");
                    l1.setText(player1+"'s Turn");
                    btn3.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn3.setForeground(Color.white);
                    btn3.setEnabled(false);
                    r1=r1*10+4;
                    c3=c3*10+4;
                    s2+=13;
                }
                d+=1;
                if(r1 == 111 || c3 == 111 || s1 == 66)
                {
                    l1.setText(player1+" Wins");
                    btn2.setEnabled(false);
                    btn1.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);

                }
                else if(r1 == 444 || c3 == 444 || s2 == 66)
                {
                    l1.setText(player2+" Wins");
                    btn2.setEnabled(false);
                    btn1.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);


                }
                else if (d==10)
                {
                    l1.setText("TIE");
                }
            }
        });


        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(d%2!=0)
                {
                    btn4.setBackground(Color.BLACK);
                    btn4.setText("X");
                    l1.setText(player2+"'s Turn");
                    btn4.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn4.setForeground(Color.white);
                    btn4.setEnabled(false);
                    r2=r2*10+1;
                    c1=c1*10+1;

                }
                else{
                    btn4.setBackground(Color.BLACK);
                    btn4.setText("O");
                    l1.setText(player1+"'s Turn");
                    btn4.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn4.setForeground(Color.white);
                    btn4.setEnabled(false);
                    r2=r2*10+4;
                    c1=c1*10+4;

                }
                d+=1;
                if(r2 == 111 || c1 == 111 )
                {
                    l1.setText(player1+" Wins");

                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn1.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);

                }
                else if(r2 == 444 || c1 == 444 )
                {
                    l1.setText(player2+" Wins");

                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn1.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);

                }
                else if (d==10)
                {
                    l1.setText("TIE");
                }

            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(d%2!=0)
                {
                    btn5.setBackground(Color.BLACK);
                    btn5.setText("X");
                    l1.setText(player2+"'s Turn");
                    btn5.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn5.setForeground(Color.white);
                    btn5.setEnabled(false);
                    r2=r2*10+1;
                    c2=c2*10+1;
                    s1+=22;


                }
                else{
                    btn5.setBackground(Color.BLACK);
                    btn5.setText("O");
                    l1.setText(player1+"'s Turn");
                    btn5.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn5.setForeground(Color.white);
                    btn5.setEnabled(false);
                    r2=r2*10+4;
                    c2=c2*10+4;
                    s2+=22;
                }
                d+=1;
                if(r2 == 111 || c2 == 111 || s1 == 66)
                {
                    l1.setText(player1+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn1.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);

                }
                else if(r2 == 444 || c2 == 444 || s2 == 66)
                {
                    l1.setText(player2+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn1.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);


                }
                else if (d==10)
                {
                    l1.setText("TIE");
                }

            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(d%2!=0)
                {
                    btn6.setBackground(Color.BLACK);
                    btn6.setText("X");
                    l1.setText(player2+"'s Turn");
                    btn6.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn6.setForeground(Color.white);
                    btn6.setEnabled(false);
                    r2=r2*10+1;
                    c3=c3*10+1;

                }
                else{
                    btn6.setBackground(Color.BLACK);
                    btn6.setText("O");
                    l1.setText(player1+"'s Turn");
                    btn6.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn6.setForeground(Color.white);
                    btn6.setEnabled(false);
                    r2=r2*10+4;
                    c3=c3*10+4;

                }
                d+=1;
                if(r2 == 111 || c3 == 111 )
                {
                    l1.setText(player1+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn1.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);

                }
                else if(r2 == 444 || c3 == 444 )
                {
                    l1.setText(player2+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn1.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);


                }
                else if (d==10)
                {
                    l1.setText("TIE");
                }
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(d%2!=0)
                {
                    btn7.setBackground(Color.BLACK);
                    btn7.setText("X");
                    l1.setText(player2+"'s Turn");
                    btn7.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn7.setForeground(Color.white);
                    btn7.setEnabled(false);
                    r3=r3*10+1;
                    c1=c1*10+1;
                    s1+=31;

                }
                else{
                    btn7.setBackground(Color.BLACK);
                    btn7.setText("O");
                    l1.setText(player1+"'s Turn");
                    btn7.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn7.setForeground(Color.white);
                    btn7.setEnabled(false);
                    r3=r3*10+4;
                    c1=c1*10+4;
                    s2+=31;
                }
                d+=1;
                if(r3 == 111 || c1 == 111 || s1 == 66)
                {
                    l1.setText(player1+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn1.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);

                }
                else if(r3 == 444 || c1 == 444 || s2 == 66)
                {
                    l1.setText(player2+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn1.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);


                }
                else if (d==10)
                {
                    l1.setText("TIE");
                }
            }
        });


        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(d%2!=0)
                {
                    btn8.setBackground(Color.BLACK);
                    btn8.setText("X");
                    l1.setText(player2+"'s Turn");
                    btn8.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn8.setForeground(Color.white);
                    btn8.setEnabled(false);
                    r3=r3*10+1;
                    c2=c2*10+1;

                }
                else{
                    btn8.setBackground(Color.BLACK);
                    btn8.setText("O");
                    l1.setText(player1+"'s Turn");
                    btn8.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn8.setForeground(Color.white);
                    btn8.setEnabled(false);
                    r3=r3*10+4;
                    c2=c2*10+4;

                }
                d+=1;
                if(r3 == 111 || c2 == 111)
                {
                    l1.setText(player1+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn1.setEnabled(false);
                    btn9.setEnabled(false);

                }
                else if(r3 == 444 || c2 == 444)
                {
                    l1.setText(player2+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn1.setEnabled(false);
                    btn9.setEnabled(false);


                }
                else if (d==10)
                {
                    l1.setText("TIE");
                }
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(d%2!=0)
                {
                    btn9.setBackground(Color.BLACK);
                    btn9.setText("X");
                    l1.setText(player2+"'s Turn");
                    btn9.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn9.setForeground(Color.white);
                    btn9.setEnabled(false);
                    r3=r3*10+1;
                    c3=c3*10+1;
                    s1+=33;

                }
                else{
                    btn9.setBackground(Color.BLACK);
                    btn9.setText("O");
                    l1.setText(player1+"'s Turn");
                    btn9.setFont(new Font("Arial", Font.ITALIC, 50));
                    btn9.setForeground(Color.white);
                    btn9.setEnabled(false);
                    r3=r3*10+4;
                    c3=c3*10+4;
                    s2+=33;
                }
                d+=1;
                if(r3 == 111 || c3 == 111 || s1 == 66)
                {
                    l1.setText(player1+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn1.setEnabled(false);

                }
                else if(r3 == 444 || c3 == 444 || s2 == 66)
                {
                    l1.setText(player2+" Wins");
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn1.setEnabled(false);


                }
                else if (d==10)
                {
                    l1.setText("TIE");
                }

            }
        });

        this.add(pnl1);
        pnl1.add(l1);
        this.add(pnl2);
        pnl2.add(btn1);
        pnl2.add(btn2);
        pnl2.add(btn3);
        pnl2.add(btn4);
        pnl2.add(btn5);
        pnl2.add(btn6);
        pnl2.add(btn7);
        pnl2.add(btn8);
        pnl2.add(btn9);




        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if (e.getSource()==button1)
            {
                 player1 = t1.getText();
                 player2 = t2.getText();

                 l1.setText(player1+ "'s Turn");
                frame.setVisible(false);
                setVisible(true);
            }

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==button2)
                {
                    frame.setVisible(false);
                }
            }
        });



    }


}
