package Day2.oops;

class Colors{

    void red(){
        System.out.println("Red color");
    }

    void blue(){
        System.out.println("Blue Color");
    }
}


class Animals extends Colors{

    void lion(){
        System.out.println("Lion");
    }

    void tiger(){
        System.out.println("Tiger");
    }
}

class Birds extends Animals{

    void eagle(){
        System.out.println("Eagle");
    }

    void peacock(){
        System.out.println("Peacock");
    }
}

public class inheritanceDemo {

    public static void main(String[] args) {
        Birds b=new Birds();
        b.red();
        b.lion();
        b.peacock();
    }
}