import java.util.*;
class Main {
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
        public static void main (String args[]){

            int result = bionomialFact(5,2);
            System.out.println("Bionomial = " + result);

        }
    }








