package annot;

class A{
    public void show(){
        System.out.println("In A SHow");
    }
}

class B extends A{
    
    @Override
    public void show(){
        System.out.println("In B SHow");
    }
}

public class Practice {
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}
