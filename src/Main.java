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
        //Floyd's Triangle Pattern--------------------->
        public static void floydTriangle(int n){
        int num =1;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        }

        //0-1 Triangle ------------------->
        public static void binTriangle(int n){
            for(int i=1;i<=n;i++){
                for(int j =1;j<=i;j++){
                    if((i+j)%2==0) {
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }

        //Butterfly pattern ---------------------->
        public static void butterflyPtrn(int n){
        for(int i=1;i<=n;i++){
               //stars--->n
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
               //spaces---->2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
               //stars--->n
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i=n;i>=1;i--){
                //stars--->n
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //spaces---->2*(n-i)
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                //stars--->n
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        // Solid Rhombus ------------>
        public static void solidRhombus(int n){
        for(int i=1;i<=n;i++){
            //for spaces--->
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars----->
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }

    // Hollow Rhombus ------------>
    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //for spaces--->
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for stars----->
            for (int j = 1; j <= n; j++) {
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         }
         //Diamond pattern------------>
        public static void diamond_pattern(int n){
         for(int i=1;i<=n;i++){
             for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=(2*i-1);j++){
                 System.out.print("*");
             }
             System.out.println();
         }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        //Print the Reverse number ----------------->
       public static void reverseNum(int num){
        while(num>0){
            int last_digit = num % 10;
            System.out.print(last_digit);
            num =num / 10;
        }

       }
        //Reverse the original number-------------->
    public static void reverseOgNum(int num){
        int rev=0;
        while(num>0){
            int last_digit = num % 10;
            rev = (rev * 10)+ last_digit;
            num =num / 10;
        }
        System.out.print(rev);
    }
        //Bigger in 3 numbers--------------------->
       public static void bigNum(int a,int b, int c){
        if(a>b && a>c){
            System.out.print("A is bigger");
        }else if(b>c){
            System.out.print("B is bigger");
        }else{
            System.out.print("c is bigger");
        }
       }
       //Update array by argument ------------------->
       public static void updateArr(int marks[]){
         for(int i=0;i<marks.length;i++)
             marks[i]=marks[i]+2;
       }

       //Linear search in array----------------> Complexity = O(n)
      public static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
          }
        return -1;
      }
      /* Main fn -------->
       int arr[]={3,20,10,40,60};
         int target =10;
         int result = linearSearch(arr,target);
         System.out.print("Target is at index : "+ result); */

    //Linear search in array more than 1 same target index---------------->
    public static void linearSearch2(int arr[],int target){
        List<Integer>Result =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
               Result.add(i) ;
            }
        }
        System.out.print(Result);
    }
      /* int arr[]={3,20,10,40,10};
                int target =10;
             linearSearch2(arr,target);  */
    public static void main (String args[]){


    }

        }









