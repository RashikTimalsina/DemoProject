package com.rashiktimalsina;

public class PrimeNumbers {
    public static void main(String[] args) {
        int count=0;
        for(int i=10; i<50; i++){
            if(isPrime(i)){
                System.out.println("Number " + i + " is prime ");
                count++;

                if(count==8){               //This will print the prime numbers upto given count number between the range
                    System.out.println("Exiting the loop");
                    break;                  //this will exit the loop
                }
            }

        }

    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
