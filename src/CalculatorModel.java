
import java.lang.Math;
public class CalculatorModel {



    private float calculationValue=0;

    public void addTwoNumbers(float firstNumber, float secondNumber){

        calculationValue = firstNumber + secondNumber;
    }

    public void susTwoNumbers(float firstNumber, float secondNumber){

        calculationValue = firstNumber - secondNumber;
    }
    public void multipleTwoNumbers(float firstNumber, float secondNumber){

        calculationValue = firstNumber * secondNumber;
    }
    public void deviseTwoNumbers(float firstNumber, float secondNumber){

        calculationValue =  firstNumber / secondNumber;
    }
    public void powerTwoNumbers(float firstNumber, float secondNumber){

     calculationValue = (int) Math.pow(firstNumber,secondNumber);
    }
    public String hexTwoNumbers(int number){ return Integer.toHexString(number);}
    public void binTwoNumbers(int number){calculationValue =Integer.parseInt( Integer.toBinaryString(number));}
    public void octTwoNumbers(int number){ calculationValue= Integer.parseInt(Integer.toOctalString(number));}
    public void cosTwoNumbers(double number){calculationValue = (float) Math.cos(number);}
    public void sqrtTwoNumbers(double number){calculationValue = (float) Math.sqrt(number);}
    public void sinTwoNumbers(double number){calculationValue = (float) Math.sin(number);}
    public void tang(double number){calculationValue = (float) Math.tan(number);}

    public float getCalculationValue(){
        return calculationValue;

    }

}


