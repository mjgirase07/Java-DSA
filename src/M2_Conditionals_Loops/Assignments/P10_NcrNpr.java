package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P10_NcrNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value of n and r");
        int n,r,nminr;
        n = in.nextInt();
        r = in.nextInt();
        nminr = n-r;
        int nfact=1,rfact=1,nrfact=1;

        for (int i = 1; i <=n; i++) {
            nfact *= i;
        }
        for (int i = 1; i <=r; i++) {
            rfact *= r;

        }
        for (int i = 1; i <=nminr; i++) {
            nrfact *= nminr;

        }
        if (nfact==0){
            nfact=1;
        }
        if (rfact==0){
            rfact=1;
        }
        if (nrfact==0){
            nrfact=1;
        }
        float ncr = (float) (nfact/rfact*nrfact);
        float npr = (float) (nfact/nrfact);
        System.out.println(nfact+" "+rfact+" "+nrfact);
        System.out.println("NCR:"+ncr+" & NPR:"+npr);
    }
}
