package Interpreter;

import java.util.ArrayList;
import java.util.Scanner;

public class InterpreterTester {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.println("*******************************: ");
        System.out.println("Roman Numerals using the letters ");
        System.out.println("M,    D,   C,   L,  X,  V and I: ");
        System.out.println("1000, 500, 100, 50, 10, 5 and 1 ");
        System.out.print("Enter a ROMAN Number ex. MMXVII: ");

        String roman= sc.nextLine();              //reads string

        Context context = new Context(roman);

        ArrayList<Expression> tree = new ArrayList<Expression>();
        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());

        for (Expression e: tree) {
            e.Interpret(context);
        }



        System.out.println("Roman Numeral \"" + roman + "\" is equal to " + context.getOutput());


    }
}
