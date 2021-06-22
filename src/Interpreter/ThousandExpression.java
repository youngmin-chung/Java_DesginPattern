package Interpreter;

// Terminal Expression (Literal Expression)
// Implements interpret
// An instance is required for each terminal symbol in the sentence
public class ThousandExpression extends Expression{
    @Override
    public String One() {
        return "M";
    }

    @Override
    public String Four() {
        return " ";
    }

    @Override
    public String Five() {
        return " ";
    }

    @Override
    public String Nine() {
        return " ";
    }

    @Override
    public int Multiplier() {
        return 1000;
    }
}
