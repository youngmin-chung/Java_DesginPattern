package Observer;

import java.util.ArrayList;

// Uses the Subject interface to update all Observers
public class StockGrabber implements Subject {

    private ArrayList<Observer> observerArrayList;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber(){
        // Create an ArrayList to hold all observers
        observerArrayList = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        // Adds a new observer to the ArrayList
        observerArrayList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        // Get the index of the observer to delete
        int observerIndex = observerArrayList.indexOf(o);
        // Print out message (Have to increment index to match)
        System.out.println("Observer " + (observerIndex+1) + " deleted");

        observerArrayList.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        // Cycle through all observers and notifies them of price changes
        for(Observer observer : observerArrayList){
            observer.update(ibmPrice, applPrice, googPrice);
        }
    }

    // Change prices for all stocks and notifies observers of changes
    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAPPLPrice(double newAPPLPrice){
        this.applPrice = newAPPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice){
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
}
