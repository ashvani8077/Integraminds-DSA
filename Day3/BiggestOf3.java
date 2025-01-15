package Day3;

public class BiggestOf3 {
    public static void main(String[] args) {
        int a=11,b=22,c=33;
        if(a>b&&a>c){
            System.out.println("A is big");
        }
        else{
            if(b>c){
                System.out.println("B is big");
            }
            else{
                System.out.println("C is big.");
            }
        }
    }
}
