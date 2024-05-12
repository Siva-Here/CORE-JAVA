package exceptionhandl;

public class Practice {
    public static void main(String args[]) {
        int i = 0;
        try {
            int j = 18 / i;
            System.out.println(j);
        } catch (ArithmeticException e) {
            System.out.println("Cannot DIvide by Zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Happended "+e);
        }
        catch(Exception e){
            System.out.println("Error Happened : "+e);
        }

    }

}
