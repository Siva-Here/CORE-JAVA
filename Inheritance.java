class Inheritance{
    public static void main(String args[]){
        AdvCalc cal=new AdvCalc();
        System.out.println(cal.pow(2,3));


        System.out.println(cal.add(2,3,4,5,6,7,8));
    }
}

class Calc{
    public double add(double... nums){
        double tot=0;
        for(double num:nums){
                tot+=num;
        }
        return tot;
    }

    public double mul(double... nums){
        double tot=1;
        for(double num:nums){
                tot*=num;
        }
        return tot;
    }
}

class AdvCalc extends Calc{
    public double sub(double n1,double n2){
        return n1-n2;
    }

    public double div(double n1,double n2){
        return n1/n2;
    }

    public double pow(double n1,double n2){
        return Math.pow(n1,n2);
    }
}