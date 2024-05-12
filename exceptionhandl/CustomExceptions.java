package exceptionhandl;


class SivaException extends Exception{
    public SivaException(String string){
        super(string);
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try {
            j=19/i;
            if(j==0)
                throw new SivaException("J value cant be Zero...");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch(SivaException e){
            j=18/1;
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
