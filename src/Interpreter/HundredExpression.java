package Interpreter;
// Terminal Expression (Literal Expression)
// Implements interpret
// An instance is required for each terminal symbol in the sentence
public class HundredExpression extends Expression{
    @Override
    public String One() {
        return "C";
    }

    @Override
    public String Four() {
        return "CD";
    }

    @Override
    public String Five() {
        return "D";
    }

    @Override
    public String Nine() {
        return "CM";
    }

    @Override
    public int Multiplier() {
        return 100;
    }
}
