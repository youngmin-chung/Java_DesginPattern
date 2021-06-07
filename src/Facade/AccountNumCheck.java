package Facade;

public class AccountNumCheck {
    private int accountNumber = 123456789;
    public int getAccountNumber() {return accountNumber;}
    public boolean accountActive(int accountNumberCheck){
        if(accountNumberCheck == getAccountNumber()){
            return true;
        }else {
            return false;
        }
    }
}
