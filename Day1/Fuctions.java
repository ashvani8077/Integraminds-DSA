package Day1;

public class Fuctions {
    public static void main(String[] args) {
        Fuctions f=new Fuctions();
        f.address();
    }

    // static void address(){
    //     System.out.println("Rakesh");
    //     System.out.println("No 32");
    //     System.out.println("ABC Street");
    //     System.out.println("Chennai");
    //     System.out.println();
    // }


    //*This method is in heap and stack is responsible for execution of program for moving a function from heap to stack we make Object reference */
    void address(){
        System.out.println("Rakesh");
        System.out.println("No 32");
        System.out.println("ABC Street");
        System.out.println("Chennai");
        System.out.println();
    }
}
