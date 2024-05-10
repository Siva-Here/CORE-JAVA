class Example{
    int age;
    static String name;

    static{
        name="Gajala";
    }


    public void show(){
        System.out.println(age+":"+name);
    }

    public static void show1(){
        System.out.println(name);
    }
}

class StaticWord{
    public static void main(String args[]){
        Example ex=new Example();
        ex.age=12;

        Example ex2=new Example();
        ex2.age=12;

        ex.show();
        ex2.show();
        Example.name="siva";
        Example.show1();
    }
}