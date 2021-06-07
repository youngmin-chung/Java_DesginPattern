package Facade;

public class FacadeTester {
    public static void main(String[] args){
        BankAccountFacade accessingBank = new BankAccountFacade(123456789, 1234);
        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(990.00);
    }
}
