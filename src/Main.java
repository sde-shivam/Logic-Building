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

         // Binary to decimal convertion---->
       public static void binaryToDecimal(int binNum){
        int myNumber = binNum;
        int decNumber = 0;
        int pow = 0;
        while(binNum>0){
            int lastDigit = binNum % 10;
            decNumber = lastDigit *(int)Math.pow(2,pow);
            pow++;
            binNum = binNum/10;

        }
        System.out.print("Decimal of binary number "+myNumber+" is = "+decNumber);
       }

         // Decimal to binary conversion--------->
            public static void decToBin(int num){
                int pow=0;
                int binNum=0;
              while(num>0){
                int rem = num % 2;
                binNum = binNum +( rem * (int)Math.pow(10,pow));
                pow++;
                num=num/2;
              }
        System.out.print("Binary of Decimal number is = "+binNum);
            }

          //Hollow Rectangle pattern-------------->
        public static void hollowRect(int row,int column){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1 || i==row || j==1 || j==column) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
        //Inverted & Rotated half pyramid------------->
        public static void invertRotatePyramid(int n) {
            for (int i = 1; i <=n;i++){
                for(int j=1;j<=n-i;j++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //Inverted half pyramid with numbers -------->
        public static void invertedHalfPyramid(int n){

         for(int i=1;i<=n;i++){
             for(int j=1;j<=n-i+1;j++){
                 System.out.print(j);
             }
             for(int j=1;j<i;j++){
                 System.out.print(" ");
             }
             System.out.println();
         }
        }
        public static void main (String args[]){

            invertedHalfPyramid(5);

        }
    }








