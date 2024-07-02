public class exception {
    public static void main(String[] args) {
        int d =0;
        try{
            int a =42/d;
            String s ="manu";
            System.out.println("my name is "+ s);
        } /*catch (ArithmeticException e ){  
           System.out.println("exception caught" + e);                 

        }*/
        catch(NullPointerException e){

        }
        catch(Exception e ){

            System.out.println("will not be printed");   
        }
        
      
    }
}
                