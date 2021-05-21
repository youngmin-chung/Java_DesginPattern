package Observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
    // Could be used to set how many seconds to wait in Thread.sleep() below

    // private int startTime;
    private int endTime;

    private String stock;
    private double price;

    // Will hold reference to the StockGrabber object
    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice){
        // Store the reference to the stockGrabber object so I can make calls to its methods
        this.stockGrabber = stockGrabber;

        // startTime = newStartTime; Not used to have variable sleep time
        stock = newStock;
        price = newPrice;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 20; i++){
            try {
                Thread.sleep(2000);

            }catch(InterruptedException e){

            }

            // Generate a random number between -.03 and .03
            double randomNum  = (Math.random()*(.06)) - .03;

            // Formats decimals to 2 places
            DecimalFormat df = new DecimalFormat("#.##");
            // Change the price and then convert it back into a double
            price = Double.valueOf(df.format(price + randomNum));

            if(stock == "IBM")
                ((StockGrabber)stockGrabber).setIBMPrice(price);
            if(stock == "APPL")
                ((StockGrabber)stockGrabber).setAPPLPrice(price);
            if(stock == "GOOG")
                ((StockGrabber)stockGrabber).setGOOGPrice(price);

            System.out.println(stock + ": " + df.format((price+randomNum)) + " "+ df.format(randomNum));
        }
    }
}
