package Mediator;

public class MediatorTester {
    public static void main(String[] args){

        StockMediator nyse = new StockMediator();

        WillArmstrong broker1 = new WillArmstrong(nyse);
        TeranBukenburger broker2 = new TeranBukenburger(nyse);

        broker1.saleOffer("APPL", 100);
        broker1.saleOffer("GOOG", 50);

        broker2.buyOffer("APPL", 70);
        broker2.saleOffer("TSLA", 20);

        broker1.buyOffer("TSLA", 10);

        nyse.getStockOfferings();

    }

}
