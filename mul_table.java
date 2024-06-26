/*******************
 * 
 Question:
 To print the multiplication table for a given number. 
 
 ********************/

import java.util.*;
public class mul_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to get the multiplication table : ");
        int a=sc.nextInt();
        System.out.print("Enter the range of table : ");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            System.out.println(a+" X "+i+" = "+(a*i));
        }

    }
    
}


/***********************
 OUTPUT:

Enter the number to get the multiplication table : 5
Enter the range of table : 20
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50
5 X 11 = 55
5 X 12 = 60
5 X 13 = 65
5 X 14 = 70
5 X 15 = 75
5 X 16 = 80
5 X 17 = 85
5 X 18 = 90
5 X 19 = 95
5 X 20 = 100

 **********************/
