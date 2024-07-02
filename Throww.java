public class Throww {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("invalidte");
        }
        else {

            System.out.println("you can vote");
        }
    }
}
