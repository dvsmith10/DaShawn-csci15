import java.util.Scanner;


public class SmithDaShawn_RomanNumerals {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		String roman;
	       int[] result = new int[30]; 
	       int len=0,total = 0,i=0,j=0;
	       
	   Scanner sc = new Scanner(System.in);   
	   System.out.println("Enter a Roman Number : ");
	   
	roman = sc.next(); 
	len = roman.length();
	for(i = 0; i < roman.length(); i++) 
		
	{
	if( roman.charAt(i) == 'M')
	   result[i] = 1000;
	else if( roman.charAt(i) == 'D')
	   result[i] = 500;
	else if( roman.charAt(i) == 'C')
	   result[i] = 100;
	else if( roman.charAt(i) == 'L')
	   result[i] = 50;
	else if( roman.charAt(i) == 'X')
	   result[i] = 10;
	else if( roman.charAt(i) == 'V')
	   result[i] = 5;
	else if( roman.charAt(i) == 'I')
	   result[i] = 1;   
}
	
	while(j<=len) 
	{
	   if(result[j] > result[j+1] || result[j] == result[j+1] )
	   {
	       total = total + result[j];
	       j++;
	   }
	   else
	   {
	       total = total + (result[j+1] - result[j]);
	       j=j+2;
	   }
	}
	System.out.println("Decimanl number is :"+total); }
}
