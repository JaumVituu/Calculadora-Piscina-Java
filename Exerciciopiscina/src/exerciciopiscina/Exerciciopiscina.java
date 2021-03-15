package exerciciopiscina;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Exerciciopiscina extends JFrame implements ActionListener{
    JTextField tflargura, tfcomp, tfprofun, tfresult;
    JLabel lbllarg, lblcomp, lblprofun, lblresult;
    JButton btcalcular, btlimpar;


    public static void main(String[] args) {
        JFrame janela = new Exerciciopiscina();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    Exerciciopiscina()
    {
    setTitle("Calculadora");
    setBounds(300,50,350,90);
    getContentPane().setBackground(new Color (150,150,150));
    getContentPane().setLayout (new GridLayout (3,4));
    
    lbllarg = new JLabel("Largura");
    lbllarg.setForeground(Color.black);
    lbllarg.setFont(new Font (" ",Font.BOLD, 14));
    lblcomp = new JLabel("Comprimento");
    lblcomp.setForeground(Color.black);
    lblcomp.setFont(new Font (" ",Font.BOLD, 14));
    lblprofun = new JLabel("Profundidade");
    lblprofun.setForeground(Color.black);
    lblprofun.setFont(new Font (" ",Font.BOLD, 14));
    lblresult = new JLabel("Preço");
    lblresult.setForeground(Color.black);
    lblresult.setFont(new Font (" ",Font.BOLD, 14));
    
    btcalcular = new JButton("Calculo");  btcalcular.addActionListener(this);
    btlimpar = new JButton("Limpar");     btlimpar.addActionListener(this);

    tflargura = new JTextField();
    tfcomp = new JTextField();
    tfprofun = new JTextField();
    tfresult = new JTextField();
    tfresult.setEditable(false);
    
    getContentPane().add(lblcomp);
    getContentPane().add(tfcomp);
    getContentPane().add(lblprofun);
    getContentPane().add(tfprofun);
    getContentPane().add(lbllarg);
    getContentPane().add(tflargura);
    getContentPane().add(lblresult);
    getContentPane().add(tfresult); 
    getContentPane().add(btcalcular);
    getContentPane().add(btlimpar);   
}
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==btlimpar)
        { 
            tflargura.setText("");
            tfcomp.setText("");
            tfprofun.setText("");
            tfresult.setText("");
            return;
        }
        double largura = 0, profun = 0, comp = 0, result = 0;
        try
        {
            largura = Double.parseDouble(tflargura.getText());
            comp = Double.parseDouble(tfcomp.getText());
            profun = Double.parseDouble(tfprofun.getText());
        }
        
        catch(NumberFormatException erro)
        {
            tfresult.setText("só pode número, mermão");
            return;
        }
        
        if (e.getSource()==btcalcular) result = largura*comp*profun*300;
        tfresult.setText("" + result);
    }
    }
    
