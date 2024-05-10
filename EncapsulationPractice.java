class EncapsulationPractice{

    public static void main(String args[]){
        Gajala gj=new Gajala("kukka","pilli");
        System.out.println(gj.name);
        System.out.println(gj.getSpouse());

        Gajala gj1=new Gajala("ukka","illi");
        System.out.println(gj1.name);
        System.out.println(gj1.getSpouse());

        Gajala gj2=new Gajala();
    }
}

class Gajala{
    String name;
    private String spouse;

    Gajala(){
        System.out.println("Default constructor");
    }

    Gajala(String name,String spouse){
        this.name=name;
        this.spouse=spouse;
        System.out.println("Paarametrised constructor");
    }

    public void setSpouse(String spouse){
        this.spouse=spouse;
    }

    public String getSpouse(){
        return this.spouse;
    }
}