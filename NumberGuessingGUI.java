import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NumberGuessingGUI {
    public static void main(String[] args) {
        final int[] count = {0};

        final int[] add = {0};

        int index=0;
        JFrame frame = new JFrame("NumberGuessing");
        frame.setSize(720, 720);
        frame.getContentPane().setBackground(new Color(40, 40, 43));
        JPanel homepage=new JPanel();
        homepage.setLayout(null);
        homepage.setBounds(95,40,500,500);
        homepage.setBackground(new Color(40, 40, 43));
        JLabel hometext= new JLabel("Choose any number between 1 to 99");
        hometext.setBounds(50,100,500,70);
        hometext.setForeground(Color.white);
        hometext.setFont(new Font("SansSerif",Font.BOLD,25));
        JButton Done= new JButton("Done");
        Done.setFont(new Font("SansSerif",Font.BOLD,15));
       Done.setBounds(220,200,80,40);
       Done.setBackground(new Color(60,  32, 240));
        homepage.add(hometext);
        homepage.add(Done);

        JPanel yesno= new JPanel();
        yesno.setLayout(new BorderLayout());
        yesno.setBackground(new Color(40, 40, 43));
        yesno.setBounds(95,540,500,100);


        JLabel text= new JLabel("Is your Number in this set");
        text.setForeground(Color.white);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setFont(new Font("SansSerif",Font.BOLD,15));


        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,80,20));
        buttonPanel.setBackground(new Color(40, 40, 43));
        JButton yes= new JButton("Yes");
        yes.setBackground(new Color(0,150,223));
       yes.setPreferredSize(new Dimension(70,30));


        JButton no = new JButton("No");
        no.setBackground(new Color(255,80,80));
        no.setPreferredSize(new Dimension(70,30));
        buttonPanel.add(yes);
        buttonPanel.add(no);

        yesno.add(text,BorderLayout.NORTH);
        yesno.add(buttonPanel,BorderLayout.CENTER);


        JPanel for1=new JPanel();
        for1.setBackground(new Color(40, 40, 43));
        for1.setBounds(95,40,500,500);
        for1.setLayout(new GridLayout(10,5));
        Border br= BorderFactory.createLineBorder(Color.black);
        for1.setBorder(br);
        int num=1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
        Button btn = new Button("" + (2 * num - 1));

        num++;
        btn.setForeground(Color.BLACK);
        btn.setFont(new Font("SansSerif", Font.BOLD, 15));
        btn.setBackground(new Color(60, 32, 240));
        for1.add(btn);
    }
}
        JPanel for2=new JPanel();
        for2.setBackground(new Color(40, 40, 43));
        for2.setBounds(95,40,500,500);
        for2.setLayout(new GridLayout(10,5));

         num=2;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                if (num >= 100) {
                    break;
                }
                Button btn = new Button("" +num);

                num++;
                btn.setForeground(Color.BLACK);
                btn.setFont(new Font("SansSerif", Font.BOLD, 15));
                btn.setBackground(new Color(60, 32, 240));
                if (num % 4 == 0) {
                    num = num + 2;
                }

                for2.add(btn);
            }
        }
        JPanel for4=new JPanel();
        for4.setBackground(new Color(40, 40, 43));
        for4.setBounds(35,40,500,500);
        for4.setLayout(new GridLayout(10,5));
        num=4;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                if (num >= 100) {
                    break;
                }
                Button btn = new Button("" +num);
                num++;
                btn.setForeground(Color.BLACK);
                btn.setFont(new Font("SansSerif", Font.BOLD, 15));
                btn.setBackground(new Color(60, 32, 240));
                for4.add(btn);
                if (num % 8 == 0) {
                    num = num + 4;
                }

            }
        }
        JPanel for8=new JPanel();
        for8.setBackground(new Color(40, 40, 43));
        for8.setBounds(95,40,500,500);
        for8.setLayout(new GridLayout(10,5));
        num=8;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                if (num >= 100) {
                    break;
                }
                Button btn = new Button("" +num);
                num++;
                btn.setForeground(Color.BLACK);
                btn.setFont(new Font("SansSerif", Font.BOLD, 15));
                btn.setBackground(new Color(60, 32, 240));
                for8.add(btn);
                if (num % 16 == 0) {
                    num = num + 8;
                }

            }
        }

        JPanel for16=new JPanel();
        for16.setBackground(new Color(40, 40, 43));
        for16.setBounds(95,40,500,500);
        for16.setLayout(new GridLayout(10,5));
        num=16;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                if (num >= 100) {
                    break;
                }
                Button btn = new Button("" +num);
                num++;
                btn.setForeground(Color.BLACK);
                btn.setFont(new Font("SansSerif", Font.BOLD, 15));
                btn.setBackground(new Color(60, 32, 240));
                for16.add(btn);
                if (num % 32 == 0) {
                    num = num + 16;
                }

            }
        }
        JPanel for32= new JPanel();
        for32.setBackground(new Color(40, 40, 43));
        for32.setBounds(95,40,500,500);
        for32.setLayout(new GridLayout(10,5));
        num=32;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                if (num >= 100) {
                    break;
                }
                Button btn = new Button("" +num);
                num++;
                btn.setForeground(Color.BLACK);
                btn.setFont(new Font("SansSerif", Font.BOLD, 15));
                btn.setBackground(new Color(60, 32, 240));
                for32.add(btn);
                if (num % 64 == 0) {
                    num = num + 32;
                }

            }
        }
        JPanel for64    =   new JPanel();
        for64.setBackground(new Color(40, 40, 43));
        for64.setBounds(95,40,500,500);
        for64.setLayout(new GridLayout(10,5));
        num=64;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                if (num >= 100) {
                    break;
                }
                Button btn = new Button("" +num);
                num++;
                btn.setForeground(Color.BLACK);
                btn.setFont(new Font("SansSerif", Font.BOLD, 15));
                btn.setBackground(new Color(60, 32, 240));
                for64.add(btn);


            }
        }


        JPanel [] board={for1,for2,for4,for8,for16,for32,for64};
        Done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               board[0].setVisible(true);
                homepage.setVisible(false);
                for64.setVisible(true);
                yesno.setVisible(true);
            }
        });

        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add[0] =answer( add[0],count[0]);

              count[0]++;
              if(count[0]>=7){
                  homepage.setVisible(false);
                  for64.setVisible(false);
                  yesno.setVisible(false);
                  endscreen(frame,add[0]);
              }
              else {
                  board[count[0] - 1].setVisible(false);
                  board[count[0]].setVisible(true);
              }}
        });
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0]++;

                if(count[0]>=7){
                endscreen(frame,add[0]);
                    homepage.setVisible(false);
                    for64.setVisible(false);
                    yesno.setVisible(false);
                }
                board[count[0]-1].setVisible(false);
                board[count[0]].setVisible(true);
            }
        });
        frame.add(homepage);
        yesno.setVisible(false);
        frame.add(yesno);


        for1.setVisible(true);
        frame.add(for1);
        for2.setVisible(false);
        frame.add(for2);
        for4.setVisible(false);
        frame.add(for4);
        for8.setVisible(false);
        frame.add(for8);
        for16.setVisible(false);
        frame.add(for16);
        for32.setVisible(false);
        frame.add(for32);
        for64.setVisible(false);
        frame.add(for64);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static  int answer(int add,int k ){

        int [] power = {1,2,4,8,16,32,64};
        if(k>power.length){
            return add;
        }
            add=add+power[k];

        return add;
    }

    static void endscreen(JFrame frame,int ans){
        JPanel endscreen=new JPanel();
        endscreen.setBounds(95,100,500,500);
        endscreen.setBackground(new Color(40, 40, 43));
        if(ans>99 || ans==0){
            JLabel endtext=new JLabel("Invalid response");
            endtext.setForeground(Color.white);
            endtext.setFont(new Font("SansSerif",Font.BOLD,25));
            endscreen.add(endtext);
            frame.add(endscreen);
        }
        else{
        JLabel endtext=new JLabel("Your number is : "+ans);
        endtext.setForeground(Color.white);
        endtext.setFont(new Font("SansSerif",Font.BOLD,25));
        endscreen.add(endtext);
        frame.add(endscreen);}

    }
}
