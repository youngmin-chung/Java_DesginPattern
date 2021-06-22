package Interpreter;
// Terminal Expression (Literal Expression)
// Implements interpret
// An instance is required for each terminal symbol in the sentence
public class TenExpression extends Expression{
    @Override
    public String One() {
        return "X";
    }

    @Override
    public String Four() {
        return "XL";
    }

    @Override
    public String Five() {
        return "L";
    }

    @Override
    public String Nine() {
        return "XC";
    }

    @Override
    public int Multiplier() {
        return 10;
    }
}
