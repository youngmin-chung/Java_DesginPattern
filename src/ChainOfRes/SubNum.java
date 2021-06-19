package ChainOfRes;

public class SubNum implements Chain{
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalcWanted() == "sub"){
            System.out.println(request.getNum1() + " - " + request.getNum2() + " = " + (request.getNum1() - request.getNum2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
