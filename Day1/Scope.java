package Day1;

public class Scope {
    int gv=100;
    void sampleFun(){
        int lv=50;
        System.out.println(gv);
    }

    void demo(){
        System.out.println(gv);
        System.out.println();
    }

    public static void main(String[] args) {
        //System.out.println(gv);
        //***gv not print here because we print a variable in stack that is inside in heap**//

        Scope s=new Scope();
        System.out.println(s.gv);
    }
}
