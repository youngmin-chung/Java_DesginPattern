package ChainOfRes;

public class CORTester {
    public static void main (String[] args){
        // Here I define all of the objects in the chain
        Chain chainCalc1 = new AddNum();
        Chain chainCalc2 = new SubNum();
        Chain chainCalc3 = new MulNum();
        Chain chainCalc4 = new DivNum();
        // Here I tell each object where to forward the data if it can't process the request
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);
        // Define the data in the Numbers Object and send it to the first Object in the chain
        Numbers request = new Numbers(4,2,"mult");

        chainCalc1.calculate((request));
    }

}
