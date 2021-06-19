package ChainOfRes;

public class DivNum implements Chain{
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalcWanted() == "div"){
            System.out.println(request.getNum1() + " / " + request.getNum2() + " = " + (request.getNum1() / request.getNum2()));
        }else {
            System.out.println("Only works for add, sub, mult, and div");
        }
    }
}
