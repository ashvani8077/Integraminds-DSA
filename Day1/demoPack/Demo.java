package Day1.demoPack;

import Day1.Bank.SBI;

public class Demo {
    public static void main(String args[]) {
        SBI s = new SBI();
        s.myCurrentBalance(); 
        s.credit(5000);
        s.myCurrentBalance();
    }
}
