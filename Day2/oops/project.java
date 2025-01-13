package Day2.oops;

interface Switch
{
    abstract void on();
    abstract void off();
}


class Fan implements Switch{

    @Override
    public void on(){
        System.out.println("Fan is on");
    }

    @Override
    public void off(){
        System.out.println("Fan is off");
    }
}

class Light implements Switch{
    @Override
    public void on(){
        System.out.println("Light is on");
    }

    @Override
    public void off(){
        System.out.println("Light is off");
    }
}

class Both implements Switch{

    @Override
    public void on(){
        System.out.println("Fan is on");
    }

    @Override
    public void off(){
        System.out.println("Fan is off");
    }
}

public class project {

    Switch press(char op){
        if(op=='F'){
            return new Fan();
        }
        else if(op=='L'){
            return new Light();
        }
        else{
            return new Both();
        }
    }
    public static void main(String[] args) {
        project p=new project();
        Switch s=p.press('f');
        s.on();
        s.off();
    }
}