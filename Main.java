import java.util.Scanner;

class Calculator{
    int num=5;

    public int add(int num1,int num2){
        // System.out.println("In Add");
        return num1+num2;
    }
}

class Students{
    int age;
    String name;
    double marks;

    public void Details(){
        System.out.println("NAME : "+this.name);
        System.out.println("AGE : "+this.age);
        System.out.println("MARKS : "+this.marks);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World..."); 
        int num=69;
        System.out.println((float) num);
        String day="Monday";

        switch(day){
            case "Monday"-> System.out.println("I am gajala");
            default -> System.out.println("I am gutlee");
        }
        Calculator calc =new Calculator();
        System.out.println(calc.add(2,3));
        System.out.println("\n");
        // ARRAYS
        int arr[]={1,2,3,4};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        };
        int arr1[]=new int[20];
        for(int i=0;i<20;i++){
            arr1[i]=i;
        }
        for(int i=0;i<20;i++){
            // arr1[i]=i;
            System.out.println(arr1[i]);
        }
        System.out.println("Gajalaa...break");
        for(int n:arr1){
            System.out.println(n);
        }

        // ARRAY OF OBJECTS

        Scanner input=new Scanner(System.in);
        System.out.println("Please neter how many student details you want to enter....");
        int size=input.nextInt();
        Students objArr[]=new Students[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1) +" Student details");

            Students s = new Students();
            System.out.print("Enter the name of the Student : ");
            s.name=input.next();
            System.out.print("Enter the age of the Student : ");
            s.age=input.nextInt();
            System.out.print("Enter the marks of the Student : ");
            s.marks=input.nextDouble();
            objArr[i]=s;
        };
        for(Students s:objArr){
            s.Details();
        }
    }
} 