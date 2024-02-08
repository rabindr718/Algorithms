package basic;

import java.util.Scanner;
 class Factorial1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value");
        int number=sc.nextInt();
        int result=0;
        int iterator=1;
        while(number>0){
            result=result*number;
            iterator++;
        }
        System.out.println(result);

        sc.close();

    }
} 