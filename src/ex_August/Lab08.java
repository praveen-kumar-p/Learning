package ex_August;

public class Lab08 {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount();
        System.out.println(ba1.bankname);
        System.out.println(ba1.balance);
        System.out.println(ba1.bankcode);


        BankAccount ic = new BankAccount("sbi", 100, "sbi001");
        System.out.println(ic.bankname);
        System.out.println(ic.balance);
        System.out.println(ic.bankcode);

        BankAccount boi = new BankAccount("Bank Of India", 500, "BOI005");
        System.out.println(boi.bankname);
        System.out.println(boi.balance);
        System.out.println(boi.bankcode);

        BankAccount sb = new BankAccount("State Bank of India", 1000, "SBI002");
        System.out.println(sb.bankname);
        System.out.println(sb.balance);
        System.out.println(sb.bankcode);


        BankAccount hdfc = new BankAccount("HDFC", 2000, "HDFC01245");
        System.out.println(hdfc.bankname);
        System.out.println(hdfc.balance);
        System.out.println(hdfc.bankcode);
    }
}