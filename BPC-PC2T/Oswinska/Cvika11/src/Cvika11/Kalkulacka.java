package Cvika11;

import java.awt.event.*;
import javax.swing.*;

public class Kalkulacka extends JFrame implements ActionListener
{
    static JFrame frame;
    static JTextField text;
    String a, b ,c;

    Kalkulacka()
    {
        super();
        a = b = c = "";
    }

    public static void main (String[] args)
    {
        frame = new JFrame("Kalkulátor"); // vytvoření objektu  našeho okna
        Kalkulacka Calc = new Kalkulacka();
        text = new JTextField(16);
        text.setEditable(false);

        JButton Button1 = new JButton("1"); // vytvoření tlačítek
        JButton Button2 = new JButton("2");
        JButton Button3 = new JButton("3");
        JButton Button4 = new JButton("4");
        JButton Button5 = new JButton("5");
        JButton Button6 = new JButton("6");
        JButton Button7 = new JButton("7");
        JButton Button8 = new JButton("8");
        JButton Button9 = new JButton("9");

        JButton Button10 = new JButton("+");
        JButton Button11 = new JButton("-");
        JButton Button12 = new JButton("=");

        JPanel panel = new JPanel();
        
        Button1.addActionListener(Calc); // přidání sledování na tlačítka ať víme co dělají
        Button2.addActionListener(Calc);
        Button3.addActionListener(Calc);
        Button4.addActionListener(Calc);
        Button5.addActionListener(Calc);
        Button6.addActionListener(Calc);
        Button7.addActionListener(Calc);
        Button8.addActionListener(Calc);
        Button9.addActionListener(Calc);
        Button10.addActionListener(Calc);
        Button11.addActionListener(Calc);
        Button12.addActionListener(Calc);
        
        panel.add(text); // přidání tlačítek na panel
        panel.add(Button1);
        panel.add(Button2);
        panel.add(Button3);
        panel.add(Button4);
        panel.add(Button5);
        panel.add(Button6);
        panel.add(Button7);
        panel.add(Button8);
        panel.add(Button9);
        panel.add(Button10);
        panel.add(Button11);
        panel.add(Button12);

        frame.add(panel);
        frame.setSize(200,220);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Vypnutí programu po uzavření okna
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') // Pokud je zadáno číslo zapiš ho na obrazovku
        {
            if (!b.equals(""))
            {
                c = c + s;
            }
            else
            {
                a = a + s;
            }
            text.setText(a + b + c);
        }
        else if (s.charAt(0) == '=') // Pokud je zadáno = vypočítej a tisk na obrazovku
        {
            int val = 0;

            if (b.equals("+"))
                val = (Integer.parseInt(a) + Integer.parseInt(c));
            else if (b.equals("-"))
            {
                val = (Integer.parseInt(a) - Integer.parseInt(c));
            }
            text.setText(a + b + c + " = " + val);

            a = Integer.toString(val);  // možnost pokračovat v počítání bez znovu napsání výsledku
            b = c = ""; // Nulování operandu a cislice se kterou chceme porovnat

        }
        else
        {
            if (b.equals("") || c.equals("")) // pokud neni zadan operand a tedy i cislice kterou chceme porovnat - zapíšeme operand
            {
                b = s;
            }
            else
            {
                int val = 0;
                if (b.equals("+"))
                    val = (Integer.parseInt(a) + Integer.parseInt(c));
                else if (b.equals("-"))
                {
                    val = (Integer.parseInt(a) - Integer.parseInt(c));
                }
                a = Integer.toString(val); // možnost pokračovat dál bez znovu zápisu
                b = s; // zapsani operandu
                c = ""; // nulovani cislice se kterou cheme porovnat
            }
            text.setText(a + b + c);
        }
    }

}
