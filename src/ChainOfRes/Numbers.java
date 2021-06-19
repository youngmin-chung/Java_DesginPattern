package ChainOfRes;

// This object will contain two numbers and a calculation to perform in the form of a String
public class Numbers {
    private int num1;
    private int num2;

    private String calcWanted;

    public Numbers(int newNum1, int newNum2, String newCalcWanted){
        num1 = newNum1;
        num2 = newNum2;
        calcWanted = newCalcWanted;
    }

    public int getNum1(){return num1;}
    public int getNum2(){return num2;}
    public String getCalcWanted(){return calcWanted;}
}
