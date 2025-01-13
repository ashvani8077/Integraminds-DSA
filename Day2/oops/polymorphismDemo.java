package Day2.oops;

class JBook{
    
    void book(){
        System.out.println("Book void");
    }
    void book(int n){
        System.out.println("Book price "+ n);
    }
}

public class polymorphismDemo {
    public static void main(String[] args) {
        JBook j=new JBook();
        j.book();
        j.book(5);
    }
}