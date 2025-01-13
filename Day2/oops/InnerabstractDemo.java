package Day2.oops;

abstract class GLA{
    abstract void inbox();
    abstract void sentItem();
    abstract void draft();
    abstract void spam();
    void demo(){
        System.out.println("Can access the non abstract method of superclass");
    }
}




class Vimal extends GLA{


    @Override
    public void inbox(){
        System.out.println("hello");
    }

    @Override
    public void sentItem(){
        System.out.println("sentItem");
    }

    @Override
    public void draft(){
        System.out.println("draft");
    }

    @Override
    public void spam(){
        System.out.println("span");
    }
    
}

public class InnerabstractDemo {
    public static void main(String[] args) {
        Vimal v=new Vimal();
        v.demo();
    }
}