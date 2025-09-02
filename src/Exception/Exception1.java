package Exception;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hi");
        System.out.println("bye");
        System.out.println("guy");
        try{
            System.out.println(200/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("noi");
        System.out.println("doi");
        System.out.println("soi");
        System.out.println("koi");
    }
}
