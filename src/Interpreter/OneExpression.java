package Interpreter;
// Terminal Expression (Literal Expression)
// Implements interpret
// An instance is required for each terminal symbol in the sentence
public class OneExpression extends Expression{
    @Override
    public String One() {
        return "I";
    }

    @Override
    public String Four() {
        return "IV";
    }

    @Override
    public String Five() {
        return "V";
    }

    @Override
    public String Nine() {
        return "IX";
    }

    @Override
    public int Multiplier() {
        return 1;
    }
}
