public class bizzbuzz {
    public static void main(String[] args) {
        for(int x=1; x<=99; x++) {
            if ((x%7==0) && ((x%10==7) || (x>=70 && x<=79)))
                System.out.println("bizzbuzz");
            else {
                if (x%7==0) System.out.println("bizz");
                else if ((x%10==7) || (x/10==7)) System.out.println("buzz");
                else System.out.println(x);
            }
        }
    }
}
