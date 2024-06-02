import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorView<click> extends JFrame {

    public JTextField firstNumber = new JTextField(10);
    public JTextField secondNumber = new JTextField(10);
    public JButton calculateButton = new JButton("Calculate");
    public JTextField fn1 = new JTextField(10);
    public JTextField sn1 = new JTextField(10);
    public JTextField r1 = new JTextField(10);
    public JButton addButton0 = new JButton("+");
    public JButton susButton0 = new JButton("-");
    public JButton multipleButton0 = new JButton("*");
    public JButton deviseButton0 = new JButton("/");
    public JTextField calcSolution = new JTextField(10);
    public JButton addButton = new JButton("+");
    public JButton susButton = new JButton("-");
    public JButton multipleButton = new JButton("*");
    public JButton deviseButton = new JButton("/");
    public JButton powerButton = new JButton("y^x");
    public JButton bin= new JButton("binnaire form");
    public JButton oct = new JButton("octal form");
    public JButton hex = new JButton("hexa form");
    public JButton SImpleview = new JButton("simple");
    public JButton Sientific = new JButton("sience");
    public JButton binnaire = new JButton("binnaire");
    public JButton cos = new JButton("cos");
    public JButton tang = new JButton("tang");
    public JTextField decinum = new JTextField(10);

    public JButton sin = new JButton("sin");
    public JButton square = new JButton("sqrt");


    CalculatorView() {
firstNumber.setText("0");
secondNumber.setText("0");
fn1.setText("0");
sn1.setText("0");
decinum.setText("0");
JPanel calcPanel = new JPanel();
        JPanel p = new JPanel();
        JPanel s = new JPanel();
        JPanel simpe = new JPanel();
        JPanel p1 = new JPanel();
        p1.add(decinum);
        simpe.add(bin);
        simpe.add(oct);
        simpe.add(hex);
        s.add(fn1);
        s.add(sn1);
        JPanel z =new JPanel();
        s.add(r1);
        z.add(addButton0);
        p1.setSize(600,400);
        JPanel q =new JPanel();
        q.add(p1);
        q.add(simpe);
        q.setLayout(new GridLayout(2,3));
        z.add(susButton0);

        z.add(multipleButton0);

        z.add(deviseButton0);

        JPanel x =new JPanel();
          x.setLayout(new GridLayout(5,1));
          x.add(s);
          x.add(z);
        x.setSize(600,400);
       p.setSize(150, 50);
        p.add(firstNumber);
        p.add(secondNumber);
        p.add(calcSolution);

        calcPanel.add(addButton);
        calcPanel.add(susButton);
        calcPanel.add(multipleButton);
        calcPanel.add(deviseButton);
        calcPanel.add(cos);
        calcPanel.add(sin);
        calcPanel.add(tang);
        calcPanel.add(square);
        calcPanel.add(powerButton);
        calcPanel.setLayout(new GridLayout(3, 3, 20, 25));
        JPanel p4 = new JPanel();

        p4.add(p);
        p4.add(calcPanel);

        binnaire.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JFrame k = new JFrame("aa");
                k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                k.setContentPane(q);
                k.pack();
                k.setVisible(true);
            }

        });
        SImpleview.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JFrame f = new JFrame("ss");
               f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                f.setContentPane(x);
                f.pack();
                f.setVisible(true);
            }

        });
        Sientific.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JFrame p = new JFrame("LOL");
                p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                p.setContentPane(p4);
                p.pack();
                p.setVisible(true);
                //this.setVisible(false);
            }

        });
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(3, 1, 25, 25));
        p3.add(SImpleview);
        p3.add(Sientific);
        p3.add(binnaire);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(p3);
        this.pack();
        this.setVisible(true);

    }


    public float getFirstNumber() {

        return Float.parseFloat(firstNumber.getText());

    }

    public float getSecondNumber() {

        return Float.parseFloat(secondNumber.getText());

    }
    public float getFirstNumber0() {

        return Float.parseFloat(fn1.getText());

    }

    public float getSecondNumber0() {

        return Float.parseFloat(sn1.getText());

    }
    public float getdecim() {

        return Float.parseFloat(decinum.getText());

    }

    public float getCalcSolution() {

        return Float.parseFloat(calcSolution.getText());

    }

    public void setCalcSolution(float solution) {

        calcSolution.setText(Float.toString(solution));

    }
    public void setsimplesolution(float a1 ) {
      r1.setText(Float.toString(a1));
    }
    public void hah(float a1 ) {
        decinum.setText(Float.toString(a1));
    }
    // Si on clique sur le bouton, on execute une méthode dans le controlleur

    void lol(ActionListener listenForCalcButton ) {
        calculateButton.addActionListener(listenForCalcButton);
    }



    void addCalculateListener(ActionListener listenForCalcButton ) {



        addButton.addActionListener(listenForCalcButton);

    }
    void subCalculateListener(ActionListener listenForCalcButton){

        susButton.addActionListener(listenForCalcButton);

    }
    void multipleCalculateListener(ActionListener listenForCalcButton){

        multipleButton.addActionListener(listenForCalcButton);

    }
    void deviseCalculateListener(ActionListener listenForCalcButton){

        deviseButton.addActionListener(listenForCalcButton);

    }
    void sqrt(ActionListener listenForCalcButton){

        square.addActionListener(listenForCalcButton);

    }
    void cos(ActionListener listenForCalcButton){

        cos.addActionListener(listenForCalcButton);

    }
    void tang(ActionListener listenForCalcButton){

        tang.addActionListener(listenForCalcButton);

    }
    void sin(ActionListener listenForCalcButton){

        sin.addActionListener(listenForCalcButton);

    }
    void powerCalculateListener(ActionListener listenForCalcButton){

        powerButton.addActionListener(listenForCalcButton);

    }

    void addCalculateListener0(ActionListener listenForCalcButton ) {



        addButton0.addActionListener(listenForCalcButton);

    }
    void subCalculateListener0(ActionListener listenForCalcButton){

        susButton0.addActionListener(listenForCalcButton);

    }
    void multipleCalculateListener0(ActionListener listenForCalcButton){

        multipleButton0.addActionListener(listenForCalcButton);

    }
    void deviseCalculateListener0(ActionListener listenForCalcButton){

        deviseButton0.addActionListener(listenForCalcButton);

    }
    void oct(ActionListener listenForCalcButton){

        oct.addActionListener(listenForCalcButton);

    }
    void bin(ActionListener listenForCalcButton){

        bin.addActionListener(listenForCalcButton);

    }
    void hex(ActionListener listenForCalcButton){

        hex.addActionListener(listenForCalcButton);

    }
    void displayErrorMessage(String errorMessage) {

        JOptionPane.showMessageDialog(this, errorMessage);

    }


}

