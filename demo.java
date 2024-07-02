public class demo {
    public static void main(String[] args) {
        try {
            Throww.validate(5);
        }
        catch (ArithmeticException e){
            System.out.println("exception handelled "+ "  " + e.getMessage());
        }
    
    }
}
