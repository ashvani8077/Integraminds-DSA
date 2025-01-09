package Day1.Bank;

public class SBI {
    public int availableBalance=10000;
    public void  deposit(int depositAmount){
        availableBalance=availableBalance+depositAmount;
        System.out.println("Available Balance: "+availableBalance);
    }

    public void credit(int creditAmount){
        availableBalance=availableBalance-creditAmount;
        System.out.println("Available Balance: "+availableBalance);
    }
    
    public void myCurrentBalance(){
        System.out.println("Available Balance: "+availableBalance);
    }

    public static void main(String[] args) {
        SBI s=new SBI();
        s.deposit(100);
        s.credit(1000);
    }
}


