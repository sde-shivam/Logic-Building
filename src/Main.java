import java.util.*;
import java.util.Scanner;
class Main {

    //Bionomial Function------->
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    static int bionomialFact(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n - r);
        int ncr = n_fact / (r_fact * nmr_fact);
        return ncr;
    }

    //Check Prime Number or Not ------>
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    // Prime number in Range ------->

    public static void primeinRange(int n) {
        for (int i = 2; i < n; i++) {
            boolean checkPrime = isPrime(i);
            if (checkPrime) {
                System.out.print(i + ",");
            }
        }
    }

    // Binary to decimal convertion---->
    public static void binaryToDecimal(int binNum) {
        int myNumber = binNum;
        int decNumber = 0;
        int pow = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNumber = lastDigit * (int) Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;

        }
        System.out.print("Decimal of binary number " + myNumber + " is = " + decNumber);
    }

    // Decimal to binary conversion--------->
    public static void decToBin(int num) {
        int pow = 0;
        int binNum = 0;
        while (num > 0) {
            int rem = num % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        System.out.print("Binary of Decimal number is = " + binNum);
    }

    //Hollow Rectangle pattern-------------->
    public static void hollowRect(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Inverted & Rotated half pyramid------------->
    public static void invertRotatePyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Inverted half pyramid with numbers -------->
    public static void invertedHalfPyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //Floyd's Triangle Pattern--------------------->
    public static void floydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    //0-1 Triangle ------------------->
    public static void binTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //Butterfly pattern ---------------------->
    public static void butterflyPtrn(int n) {
        for (int i = 1; i <= n; i++) {
            //stars--->n
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces---->2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //stars--->n
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            //stars--->n
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces---->2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //stars--->n
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Solid Rhombus ------------>
    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //for spaces--->
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for stars----->
            for (int j = 1; j <= n; j++) {
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
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Diamond pattern------------>
    public static void diamond_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Print the Reverse number ----------------->
    public static void reverseNum(int num) {
        while (num > 0) {
            int last_digit = num % 10;
            System.out.print(last_digit);
            num = num / 10;
        }

    }

    //Reverse the original number-------------->
    public static void reverseOgNum(int num) {
        int rev = 0;
        while (num > 0) {
            int last_digit = num % 10;
            rev = (rev * 10) + last_digit;
            num = num / 10;
        }
        System.out.print(rev);
    }

    //Bigger in 3 numbers--------------------->
    public static void bigNum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.print("A is bigger");
        } else if (b > c) {
            System.out.print("B is bigger");
        } else {
            System.out.print("c is bigger");
        }
    }

    //Update array by argument ------------------->
    public static void updateArr(int marks[]) {
        for (int i = 0; i < marks.length; i++)
            marks[i] = marks[i] + 2;
    }

    //Linear search in array----------------> Complexity = O(n)
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
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
    public static void linearSearch2(int arr[], int target) {
        List<Integer> Result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                Result.add(i);
            }
        }
        System.out.print(Result);
    }
      /* int arr[]={3,20,10,40,10};
                int target =10;
             linearSearch2(arr,target);  */

    //Largest Element in Array---------------->
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //----------For -infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    //Smallest Element in Array---------------->
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; //----------For +infinity
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    //Binary Search --------------------->
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    /* int numbers[]={10,11,12,13,14,15,16,17};
       int key = 11;
        int result = binarySearch(numbers,key);
        System.out.print("Element present at index : "+result); */

    //Reverse an array ----------------->
    public static void reverseArr(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = 0;
            int end = numbers.length - 1;
            while (start < end) {
                //swap ------>
                int temp = numbers[end];
                numbers[end] = numbers[start];
                numbers[start] = temp;
                start++;
                end--;
            }
        }
    }

    /*int numbers[] = {2,3,4,5,6,7,8};
      reverseArr(numbers);
      for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
     } */
    //print the pairs of a number from array ----------->
    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];//2,4,6,8,10
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Number of pairs = " + tp);
    }

    // Print the number of possible subarrays from an array and their sum and min,max------------>
    public static void printSubArr(int numbers[]) {
        int ts = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k]; //Sum
                    if (max < sum) {   //max value
                        max = sum;
                    }
                    if (min > sum) {   //min value
                        min = sum;
                    }
                }

                System.out.println("------>Sum : " + sum);

                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Minimum sum is  : " + min);
        System.out.println("Maximum sum is  : " + max);
        System.out.print("Total number of subarray : " + ts);

    }

    /*int numbers[] = {2,4,6,8,10};
      printSubArr(numbers);*/
    //Calculate the max sum of sub-array by Brute force method---->
    public static void maxSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println("CurrSum : " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max sum of sub-array : " + maxSum);
    }
       /*int numbers[]={1,2,3,4,5,6};
        maxSum(numbers);*/

    // Odd and Even numbers present in array----------------->
    public static void numberArr(int numbers[]) {
        int even = 0;
        int odd = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
        System.out.println("Max value : " + max);
    }

    //Find missing number in array --------------->
    public static int missNum(int numbers[], int n) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] - numbers[i] != 1) {
                return numbers[i] + 1;
            }
            if (numbers[numbers.length - 1] != n) {
                return n;
            }
        }
        return -1;
    }
     /*int numbers[]={1,2,3,4,6,7,8,9,10};
        int n = 10;
        int result = missNum(numbers,n);
        System.out.println("Missing number is :"+result);*/

    //move all 0 in array at last index------------->
    public static void zeroAtLast(int num[]) {
        int pos = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[pos] = num[i];
                pos++;
            }
        }
        while (pos < num.length) {
            num[pos] = 0;
            pos++;
        }
    }
    /*int num[]={0,0,1,2,3,4};
        zeroAtLast(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);*/

    //Count of even & odd numbers in array---------------->
    public static void evenOdd(int num[]) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Count of even numbers :" + even);
        System.out.print("Count of odd numbers :" + odd);
    }

    //Majority element in array (Brute force)------->
    public static int majorityEl(int num[]) {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (num[i] == num[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return num[i];
            }
        }
        return -1;
    }

    /*int num[]={1,2,2,3,2,4,2};
    System.out.print(majorityEl(num));*/
    //missing and repete number -------------->
    public static void findNum(int myNum[]) {
        Arrays.sort(myNum);
        int repeat = -1;
        int missing = -1;
        for (int i = 0; i < myNum.length - 1; i++) {
            if (myNum[i + 1] - myNum[i] > 1) {
                missing = myNum[i] + 1;
            }
            if (myNum[i] == myNum[i + 1]) {
                repeat = myNum[i];

            }
        }
        System.out.println("Missing number is - " + missing);
        System.out.println("Repeat number - " + repeat);
    }
    /*int myNum[]={1,2,4,4,2,3,5,2,1};
        findNum(myNum);
        }*/

    //Average of elements present in array--------->
    public static float avgOfEl(int num[]) {
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        return (float)sum/num.length;
    }
}
       /* int num[]={1,2,3,4};
        float result = Main.avgOfEl(num);
       System.out.print("avg : "+result);*/

    //Two sum in array(brute force)------------>
    public static int twoSum(int num[],int target){
       for(int i=0;i<num.length;i++){
            int start=i;
           for(int j=i+1;j<num.length;j++){
               int end=j;
               if(num[start]+num[end]==target){
                   System.out.print(start+","+end+" ");

               }
           }
       }
       return -1;
    }
    /*int num[]={11,32,13,24,76,14};
        int target = 38;
        twoSum(num,target);*/
    //Count the Odd numbers in given range ------->
    public static int oddNum(int start,int end){
       int count=0;
       for(int i=start;i<=end;i++){
           if(i % 2 != 0){
               count++;
           }
       }
       return count;
    }
    //
    /*int result = oddNum(1,5);
        System.out.println("Count : "+result);*/
    //Best Time to Buy and Sell Stock(Brute force)-------->
     public static int buySell(int num[]){
         int maxProfit=0;
         for(int buy=0;buy<num.length-1;buy++){
             for(int sell=buy+1;sell<num.length;sell++){
                 int profit = num[sell]-num[buy];
                 if(profit>maxProfit){
                     maxProfit=profit;
                 }
             }
         }
         return maxProfit;
     }
     /*int num[]={7,5,5,3,6,4,10};
        int result = buySell(num);
        System.out.print(result);*/
    //Second largest number in array----------->
    public static int secLargest(int num[]){
      int largest=Integer.MIN_VALUE;
      int secLargest=Integer.MIN_VALUE;
      for(int i=0;i<num.length;i++){
          if(num[i]>largest){
              secLargest=largest;
              largest=num[i];
          }else if(num[i]>secLargest && secLargest!=largest){
                 secLargest=num[i];
          }
      }
        return secLargest;
    }
    /*int num[]={1,2,3,4,5};
        int r = secLargest(num);
        System.out.print(r);*/
    //Skip a number which is divisible ny 10 in array------>
   public static void skipNum(int num[]){
       for(int i=0;i<num.length;i++){
           if(num[i]%10==0){
               continue;
           }else{
           System.out.println(num[i]);
       }
       }
   }
    /* int num[]={13,22,30,41,50,11,43,12,90};
        skipNum(num);*/
   //Calculate sum of subarray (prefix sum)---------->
    public static void sumSubArray(int num[]){
        int currSum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]= new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){   // prefix array created...
            prefix[i]=prefix[i-1]+num[i];
        }
         for(int i=0;i<num.length;i++){
                int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;

             currSum = start==0 ? prefix[end]: prefix[end]-prefix[start-1];
            if(max<currSum){
                max=currSum;
            }
            }
        }
         System.out.print("Max sum : "+max);

    }
    /*int num[]={1,2,4};
        sumSubArray(num);*/
    //Calculate max sum of subarray(kadanes Algoritham)------------>
    public static void kadanes(int num[]){
        int currSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            currSum=currSum+num[i];
          if(currSum<0){
              currSum=0;
          }
           max=Math.max(currSum,max);
        }
        System.out.print("Max sum : "+max);
    }
    /*int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);*/
    //Calculate the frequency of a character
    public static void freq(String str) {
        int freq[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int AcsiiOfCh = ch;  //Can be - int AcsiiOfCh = (int)ch;
            freq[AcsiiOfCh]++;  //Each charater is converted to ACSII value
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]); //Converting ACSII TO CHARACTER
            }
        }
    }
 //Find Duplicate in array (optimize soln by hashset)------>
public static boolean findDuplicate(int num[]) {
    Set<Integer> visited = new HashSet<>();
    for (int i = 0; i < num.length; i++) {
        if (visited.contains(num[i])) {
            return true;
        } else {
            visited.add(num[i]);
        }
    }
    return false;
}
/*int num[]={1,2,3,4,5};
    boolean ans = findDuplicate(num);
    System.out.print(ans);*/
//Product of array except self(brute Force)----------->
 public static void productArr(int num[]){
     int result[]=new int[num.length];
     for(int i=0;i<num.length;i++){
         int product=1;
       for(int j=0;j<num.length;j++){
         if(j!=i){
             product*=num[j];
         }
       }
       result[i]=product;
     }
     for(int i=0;i<result.length;i++){
         System.out.print(result[i]+",");
     }
 } /*int num[]={1,2,3,4};
     productArr(num);*/
// Find the missing number--------------------->
public static int missingNumber(int[] nums) {
    int n = nums.length + 1;
    int expected = n * (n + 1) / 2;
    int actual = 0;
    for (int num : nums) {
        actual += num;
    }
    return expected - actual;
}
//Move all zeroes to End------------------------->
public static void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
    }
}
//Move All Negative Numbers to One Side---------------->
   public static void moveNegative(int[] arr) {
      int left = 0, right = arr.length - 1;
      while (left <= right) {
        if (arr[left] < 0) {
            left++;
        } else if (arr[right] >= 0) {
            right--;
        } else {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
          }
        }
      }
  // Sort an Array of 0s, 1s and 2s----------------------->
  public static void sort012(int[] arr) {
      int low = 0, mid = 0, high = arr.length - 1;
      while (mid <= high) {
          if (arr[mid] == 0) {
              int temp = arr[low];
              arr[low] = arr[mid];
              arr[mid] = temp;
              low++;
              mid++;
          }
          else if (arr[mid] == 1) {
              mid++;
          }
          else {
              int temp = arr[mid];
              arr[mid] = arr[high];
              arr[high] = temp;
              high--;
          }
      }
  }
//Remove Duplicates from Sorted Array-------------------->
public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
// Best Time to Buy and Sell Stock -------------------------------->
public static int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;
        } else {
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
    }
    return maxProfit;
}
// Best Time to Buy and Sell Stock 2 --------------------------->
/*Input: [7,1,5,3,6,4]
Output: 7
Explanation:
Buy at 1 → Sell at 5 = +4
Buy at 3 → Sell at 6 = +3
Total = 7*/
public static int maxProfit2(int[] prices) {
    int profit = 0;

    for (int i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1]) {
            profit += prices[i] - prices[i - 1];
        }
    }
    return profit;
}
// get smallest and largest substring (alphabetical order)------------->
String getSmallAndLarge(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);
    for (int i = 1; i <= s.length() - k; i++) {
        String sub = s.substring(i, i + k);
        if (sub.compareTo(smallest) < 0) smallest = sub;
        if (sub.compareTo(largest) > 0) largest = sub;
    }
    return smallest + "\n" + largest;
}
//Check anagrams (two strings have the exact same characters with the same frequency)->
// By inbuilt methods
public static boolean anagram(String s1,String s2) {
    if (s1.length() != s2.length()) return false;
    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a, b);
}
//Check anagrams(By ASCII value)-------------------->
static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    boolean isAnagram = true;
    int[] freq = new int[128];  // 128 includes a-z & A-Z
    for (char c : a.toCharArray())
        freq[c]++;
    for (char c : b.toCharArray())
        freq[c]--;
    for (int f : freq) {
        if (f != 0) {
            isAnagram = false;
        }
    }
    return isAnagram;
}
// Find unique element in array(XOR METHOD (A^A=0 & A^0=A) Basically it eleminate the pair )---------------->
public static int uniqueEl(int num[]){
    int unique = 0;
    for(int i=0;i<num.length;i++){
        unique=unique^num[i];
    }
    return unique;
}
public static void main (String args[]){
     int num[]={1,1,4,5,5};
    int result = uniqueEl((num));
    System.out.print(result);
    }










