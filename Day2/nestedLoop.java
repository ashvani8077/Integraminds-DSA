package Day2;

public class nestedLoop {
    public static void main(String[] args) {
        // int i;
        // for(i=1;i<=3;i++){
        //     int j;
        //     for(j=1;j<=3;j++){
        //         System.out.println(i+" - "+j);
        //     }
        //     System.out.println("................");
        // }

        //pattern
        int k=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
