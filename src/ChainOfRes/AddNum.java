package ChainOfRes;

public class AddNum implements Chain{
    private Chain nextInChain;
    // Defines the next Object to recieve the data if this one can't use it
    @Override
    public void setNextChain(Chain nextChain) {
       nextInChain = nextChain;
    }
    // Tries to calculate the data, or passes it to the Object defined in method setNextChain()
    @Override
    public void calculate(Numbers request) {
        if(request.getCalcWanted() == "add"){
            System.out.println(request.getNum1() + " + " + request.getNum2() + " = " + (request.getNum1() + request.getNum2()));
        }else {
            nextInChain.calculate(request);
        }
    }
}
