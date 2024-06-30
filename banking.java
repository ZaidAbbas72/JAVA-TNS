public class banking {
    private static int totalaccount = 0;
    public banking() {
        totalaccount++;
    }

    public static int  getTotalAccount(){
        return totalaccount;

    }

    public static void main(String[] args) {
        banking sbi = new banking();
        banking bob = new banking();
        banking kotak = new banking();


        System.out.println("total bank account: " + banking.getTotalAccount());
    }


}
