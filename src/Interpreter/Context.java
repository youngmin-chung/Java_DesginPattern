package Interpreter;

// Context class :  Contains information global to the interpreter
public class Context {
    private String _input;
    private int _output;

    // Constructor
    public Context(String input){
        this._input = input;
    }

    public String getInput(){
        return _input;
    }

    public void setInput(String input){
        this._input = input;
    }

    public int getOutput(){
        return _output;
    }

    public void setOutput(int output){
        this._output = output;
    }

}
