import java.awt.*;
import java.awt.event.*;

class gg{
    gg(){
        Frame f=new Frame("Calculator");

        Button b1=new Button("+");
        Button b2=new Button("-");
        Button b3=new Button("*");
        Button b4=new Button("/");
        TextField t1=new TextField();
        TextField t2=new TextField();

        Label l1=new Label("Answer");

        b1.setBounds(400,200,50,50);
        b2.setBounds(300,200,50,50);
        b3.setBounds(200,200,50,50);
        b4.setBounds(100,200,50,50);
        t2.setBounds(100,50,50,50);
        t1.setBounds(100,100,50,50);
        l1.setBounds(200,350,50,50);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s2=t2.getText();
                int i=Integer.parseInt(s1);
                int j=Integer.parseInt(s2);
                l1.setText(Integer.toString(i+j));
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s2=t2.getText();
                int i=Integer.parseInt(s1);
                int j=Integer.parseInt(s2);
                l1.setText(Integer.toString(i-j));
            }
        });
        
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s2=t2.getText();
                int i=Integer.parseInt(s1);
                int j=Integer.parseInt(s2);
                l1.setText(Integer.toString(i*j));
            }
        });

        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s2=t2.getText();
                int i=Integer.parseInt(s1);
                int j=Integer.parseInt(s2);
                l1.setText(Integer.toString(i/j));
            }
        });

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(t1);
        f.add(t2);
        f.add(l1);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}

class test{
    public static void main(String[] args) {
        gg g1=new gg();
    }
}