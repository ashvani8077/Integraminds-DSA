package Day2;

public class whileLoop {
    public static void main(String[] args) {
        int i,j;
        i=1;
        int k=1;
        while (i<=3) {
            j=1;
            while (j<=i) {
                System.out.print(k++ +" ");
                j++;
                
            }
            System.out.println();
            i++;
        }
    }
}
