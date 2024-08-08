package ex_August;

public class BankAccount {

    //This are Instance variables
    String bankname;
    int balance;
    String bankcode;

//    BankAccount(){
//        bankname = "HDFC";
//        balance = 100;
//        bankcode = "HDFC001";
//    }

    BankAccount(String bName,int bal, String bCode) {
        this.bankname = bName;
        this.balance = bal;
        this.bankcode = bCode;
    }

    void printDetails() {
        System.out.println("Bank Name -> " + bankname);
        System.out.println("Bank Code -> " + bankcode);
        System.out.println("Bal ->" + balance);
    }
}