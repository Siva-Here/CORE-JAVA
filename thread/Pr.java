// package thread;

// class A extends Thread{
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println("hii");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException ex) {
//                 System.out.println(ex);
//             }
//         }
//     }
// }

// class B extends Thread{
//     public void run(){

//         for(int i=0;i<100;i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class Pr{
//     public static void main(String args[]){
//         A obj1=new A();
//         B obj2=new B(); 
//         obj1.start();
//         obj2.start();

//     }
// }

package thread;

// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println("hii");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException ex) {
//                 System.out.println(ex);
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){

//         for(int i=0;i<100;i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

public class Pr {
    public static void main(String args[]) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("hii");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        Runnable obj2 = () -> {

            for (int i = 0; i < 100; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}