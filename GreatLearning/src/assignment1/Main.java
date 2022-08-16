package assignment1;

import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	public void palindromeNo(){
		System.out.println("Enter the input");
    	int n=sc.nextInt();
    	int ans=0,temp=n;
    	do {
    		int q=n/10;
    		int r=n%10;
    		ans =(ans*10)+r;
    		n=q;
    	}while(n!=0);
    	if(ans==temp) {System.out.println("Number is palindrome no");}
    	else {System.out.println("Number is not Palindrome no");}
    	System.out.println("----------------------------");
    
		
	}
    public void printPattern(){
    	System.out.println("Enter the input");
    	int n=sc.nextInt();
    	for(int i=n;i>=1;i--) {
    		for(int j=1;j<=i;j++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    	System.out.println("----------------------------");
	}
    
    public void primeNo(){
    	int n, i=2,flag=0;
		System.out.println("enter the number :");
		n = sc.nextInt();
		if (n==0||n==1) {
			System.out.println("number is not prime");
		}
		else if (n==2) {
			System.out.println("number is prime");
		}
		else {
			while(i<n)
			{
				int p=n%i;
				i++;
				if(p==0) {
					System.out.println("Not prime");
					flag=1;
					break;
					}
				
				
			}
		  if(flag==0) {
					System.out.println("Number is prime");
				}
		}
		System.out.println("----------------------------");
	}
    
    public void finonacciSeries(){
    	System.out.println("enter the number :");
    	int n=sc.nextInt();
    	int t1=0;
    	int t2=1;
    	int temp;
    	int count=1;
    	while(count<=n) {
    		temp=t1+t2;
    		System.out.print(t1+" ");
    		t1=t2;
    		t2=temp;
    		count++;
    	}
    	System.out.println();
    	System.out.println("----------------------------");	
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice of operation.\n"+"1.Check for Palindrome no.\n"+
		"2.Print pattern.\n"+"3.Check for Prime no.\n"+"4.Print fibonacci series.\n"+"Enter 0 to exit");
			System.out.println();
			choice=sc.nextInt();
			switch(choice) {
			case 0:{choice=0;break;}
			case 1:{obj.palindromeNo();break;}
			case 2:{obj.printPattern();;;break;}
			case 3:{obj.primeNo();;break;}
			case 4:{obj.finonacciSeries();;break;}
			
			default:{System.out.println("Invalid choice.Enter a valid choice");}
			}
		}while(choice!=0);
		System.out.println("Exited successfully");
		sc.close();
		

	}

}
