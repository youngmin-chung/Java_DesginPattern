package Facade;

/* The Facade Design Pattern decouples or separates the client from all of the sub components
*  The Facades aim is to simplify interfaces so you don't have to worry about what is going on under the hoo
*
* */
public class BankAccountFacade {
    private int accountNum;
    private int securityCode;

    AccountNumCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundCheck fundChecker;

    WelcomeToBank welcomeComment;

    public BankAccountFacade(int newAcctNum, int newSecCode){
        accountNum = newAcctNum;
        securityCode = newSecCode;

        welcomeComment = new WelcomeToBank();

        acctChecker = new AccountNumCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundCheck();
    }

    public int getAccountNumber() {return accountNum;}
    public int getSecurityCode() {return securityCode;}

    public void withdrawCash(double cashToGet){
        if(acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode()) && fundChecker.haveEnoughMoney(cashToGet)){
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public void depositCash(double cashToDeposit){
        if(acctChecker.accountActive(getAccountNumber())&& codeChecker.isCodeCorrect(getSecurityCode())){
            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete\n");
        }else {
            System.out.println("Transaction failed\n");
        }
    }
}
