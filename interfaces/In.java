package interfaces;

interface Computer {
    public void code();
}


class Laptop implements Computer{
    public void code(){
        System.out.println("code compie run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code compile run");
    }
}

class Dev{
    public void devApp(Computer cp){
        cp.code();
    }
}

public class In{
    public static void main(String args[]){
        Dev dev1=new Dev();
        Dev dev2=new Dev();
        Computer cp = new Desktop();
        Computer cp2= new Laptop();
        dev1.devApp(cp);
        dev2.devApp(
            cp2
        );
       
    }
}