package Interpreter;

// Abstract Expression: declares an abstract interpret operation
// that is common to all nodes in the abstract syntax tree
public abstract class Expression {
    public void Interpret(Context context)
    {
        String input = context.getInput();
        int output = context.getOutput();


        if (context.getInput().length() == 0)
            return;

        if (context.getInput().startsWith(Nine()))
        {
            output += (9 * Multiplier());
            input = context.getInput().substring(2);
            context.setInput(input);
            context.setOutput(output);
        }
        else if (context.getInput().startsWith(Four()))
        {
            output += (4 * Multiplier());
            input = context.getInput().substring(2);
            context.setInput(input);
            context.setOutput(output);
        }
        else if (context.getInput().startsWith(Five()))
        {
            output += (5 * Multiplier());
            input = context.getInput().substring(1);
            context.setInput(input);
            context.setOutput(output);
        }

        while (context.getInput().startsWith(One()))
        {
            output += (1 * Multiplier());
            input = context.getInput().substring(1);
            context.setInput(input);
            context.setOutput(output);
        }
    }

    public abstract String One();
    public abstract String Four();
    public abstract String Five();
    public abstract String Nine();
    public abstract int Multiplier();
}
