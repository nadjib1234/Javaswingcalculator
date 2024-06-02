

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Le Controlleur fait la coordination des interactions entre la vue et le modèle

public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculateListener(new CalculateListener());
        this.theView.subCalculateListener(new CalculateListener());
        this.theView.multipleCalculateListener(new CalculateListener());
        this.theView.deviseCalculateListener(new CalculateListener());
        this.theView.powerCalculateListener(new CalculateListener());
        this.theView.cos(new CalculateListener());
        this.theView.sin(new CalculateListener());
        this.theView.sqrt(new CalculateListener());
        this.theView.tang(new CalculateListener());

        this.theView.lol(new CalculateListener());
        this.theView.addCalculateListener0(new CalculateListener());
        this.theView.subCalculateListener0(new CalculateListener());
        this.theView.multipleCalculateListener0(new CalculateListener());
        this.theView.deviseCalculateListener0(new CalculateListener());
        this.theView.bin(new CalculateListener());
        this.theView.oct(new CalculateListener());
        this.theView.hex(new CalculateListener());



    }

    class CalculateListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            float firstNumber;
            float secondNumber ;
           float n1 ;
           float n2 ;
          int deci;

            try {


                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                n1=theView.getFirstNumber0();
                n2=theView.getSecondNumber0();
                deci= (int) theView.getdecim();
                if (e.getSource() == theView.addButton)
                    theModel.addTwoNumbers(firstNumber, secondNumber);
                else if (e.getSource() == theView.susButton)
                    theModel.susTwoNumbers(firstNumber, secondNumber);
                else if (e.getSource() == theView.multipleButton)
                    theModel.multipleTwoNumbers(firstNumber, secondNumber);
                else if (e.getSource() == theView.deviseButton)
                    theModel.deviseTwoNumbers(firstNumber, secondNumber);
                else if (e.getSource() == theView.powerButton)
                    theModel.powerTwoNumbers(firstNumber, secondNumber);
                else if (e.getSource() == theView.cos)
                    theModel.cosTwoNumbers(firstNumber);
                else if (e.getSource() == theView.sin)
                    theModel.sinTwoNumbers(firstNumber);
                else if (e.getSource()==theView.tang)
                    theModel.tang(firstNumber);
                else if (e.getSource() == theView.square)
                    theModel.sqrtTwoNumbers(firstNumber);
                else if (e.getSource() == theView.addButton0) {
theModel.addTwoNumbers(n1,n2);
theView.setsimplesolution(theModel.getCalculationValue());
                }
                else if (e.getSource()==theView.susButton0){
                    theModel.susTwoNumbers(n1,n2);
                    theView.setsimplesolution(theModel.getCalculationValue());
                }
                else if(e.getSource()==theView.multipleButton0){
                 theModel.multipleTwoNumbers(n1,n2);
                    theView.setsimplesolution(theModel.getCalculationValue());
                }
                else if (e.getSource()==theView.deviseButton0){
                    theModel.deviseTwoNumbers(n1,n2);
                    theView.setsimplesolution(theModel.getCalculationValue());
                }
                    else if(e.getSource()==theView.bin){
                        theModel.binTwoNumbers( deci);
                    theView.hah(theModel.getCalculationValue());}
                    else if(e.getSource()==theView.oct){
                    theModel.octTwoNumbers( deci);theView.hah(theModel.getCalculationValue());}
                    else if(e.getSource()==theView.hex){

                    theView.decinum.setText(""+theModel.hexTwoNumbers(deci));}
                    theView.setCalcSolution(theModel.getCalculationValue());
            }

            catch(NumberFormatException ex){

                    System.out.println(ex);

                    theView.displayErrorMessage("You Need to Enter 2 floats");

                }

            }

    }}



