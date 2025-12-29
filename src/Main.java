import java.util.*;
class Main {

      //Bionomial Function------->
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
       static int bionomialFact(int n,int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);
        int ncr = n_fact/(r_fact * nmr_fact);
        return ncr;
    }

          //Check Prime Number or Not ------>
        public static boolean isPrime(int n) {
            boolean isPrime = true;
            if(n==2){
                return true;
            }
            for (int i = 2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }


        // Prime number in Range ------->

    public static void primeinRange(int n){
        for(int i=2;i<n;i++){
            boolean checkPrime = isPrime(i);
            if(checkPrime){
                System.out.print(i+",");
            }
        }
    }

        public static void main (String args[]){

            primeinRange(30);

        }
    }








