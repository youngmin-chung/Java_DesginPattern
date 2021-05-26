package Observer;


/*
* When use...
* When we need many other objects to receive an update when another object changes
* - Stock market with thousands of stocks needs to send updates to objects representing individual stocks
* - The Subject (publisher) sends many stocks to the Observers
* - The Observers (subscribers) takes the ones they want and use them
*
* Loose coupling is a benefit
* - The Subject(publisher) doesn't need to know anything about the Observers(subscribers)
*
* Negatives: The Subject(publisher) may send updates that don't matter to the Observer(subscriber)
* */
public class GrabStocks {
    public static void main(String[] args){
        // Create the Subject object
        // It will handle updating all observers as well as deleting and adding team
        StockGrabber stockGrabber = new StockGrabber();
        // Create an Observer that will be sent updates from Subject
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(191.00);
        stockGrabber.setAPPLPrice(231.00);
        stockGrabber.setGOOGPrice(2451.00);

//        StockObserver observer2 = new StockObserver(stockGrabber);
//
//        stockGrabber.setIBMPrice(192.00);
//        stockGrabber.setAPPLPrice(232.00);
//        stockGrabber.setGOOGPrice(2452.00);
//
//        // Delete one of the observers
//
//        // stockGrabber.unregister(observer2);
//
//        stockGrabber.setIBMPrice(193.00);
//        stockGrabber.setAPPLPrice(233.00);
//        stockGrabber.setGOOGPrice(2453.00);

        // Create 3 threads using the Runnable interface GetTheStock implements Runnable, so it doesn't waste
        // its one extendable class option
        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAPPL = new GetTheStock(stockGrabber, 2, "APPL", 230.00);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 2450.00);

        // Call for the code in run to execute
        new Thread(getIBM).start();
        new Thread(getAPPL).start();
        new Thread(getGOOG).start();

    }
}
