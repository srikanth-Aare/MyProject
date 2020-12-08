package PasswordGenerator_Project;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomPassword 
{
		static String randomlettes(int n,String str) 
		 { 
		     // create Stringbuffer size of lower case
		     StringBuilder sb = new StringBuilder(n); 

		     for (int i = 0; i < n; i++) 
		     { 
		         // generate a random number between 
		         // 0 to str variable length 
		         int index = (int)(str.length() * Math.random()); 

		         // add Character one by one in end of sb 
		         sb.append(str .charAt(index)); 
		     } 

		     return sb.toString();
		 } 
		
		//this method for shuffles the given string
		public static String shuffleString(String string)
		{
		  List<String> letters = Arrays.asList(string.split(""));
		  Collections.shuffle(letters);
		  String shuffled = "";
		  for (String letter : letters) {
		    shuffled += letter;
		  }
		  return shuffled;
		}
		
		//this method for trim the string based on the length
		public static String truncate(String value,int length) {
			if(value != null && value.length()>length) {
				value=value.substring(0,length);
			}
			return value;
		}
		
		//extra method 
		public static boolean isInteger(Object object) { 
			if(object instanceof Integer) { 
				return true; 
			} else { 
				String string = object.toString(); 
				 
				try { 
					Integer.parseInt(string); 
				} catch(Exception e) { 
					return false; 
				}	 
			} 
		   
		    return true; 
		} 

			
public static void main(String[] args) 
{
	String password="";
	String yes="YES";
	String no="NO";
	
	System.out.println("password length should be 8 to 20 :");
	System.out.println("enter password length:");
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		boolean isanInt=sc.hasNextInt();
		
		if(isanInt) 
		{
	while(true)
	{
	int passwordLength=sc.nextInt();
	sc.nextLine();
	if(passwordLength>7 && passwordLength <=20 )
	{
   System.out.println();
   System.out.println("do you want to include lowercase alphabets:");
   
   while(true) 
   {
   System.out.println("input should either yes (or) no :");
   String sl=sc.nextLine();
   String upsl=sl.toUpperCase();
	
   if(upsl.equals(yes)) {
	   
	   String passwordlettes=randomlettes(passwordLength,"abcdefghijklmnopqrstuvxyz");
	   password=password+passwordlettes;
	   break;
   }
   if(upsl.equals(no)) {
	   break;
   }
   else 
   {
	  System.out.println("Invalid input : enter again # "); 
	  
   }
   }
  
   System.out.println();
   System.out.println("do you want to include uppercase alphabets:");
   while(true) 
   {
   System.out.println("input should either yes (or) no :");
   String ul=sc.nextLine();
   String upul=ul.toUpperCase();
	
   if(upul.equals(yes)) {
	   String passwordlettes=randomlettes(passwordLength,"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	   password=password+passwordlettes;
	   break;
   }
   else if(upul.equals(no)) {
	   break;
   }
   else 
   {
	   System.out.println("Invalid input : enter again # "); 
   }
   }
   
   System.out.println();
   
   System.out.println("do you want to include numbers(0-9):");
   
   while(true) 
   {
   System.out.println("input should either yes (or) no :");
   String num=sc.nextLine();
   String upnum=num.toUpperCase();
	
   if(upnum.equals(yes)) {
	   String passwordlettes=randomlettes(passwordLength,"0123456789");
	   password=password+passwordlettes;
	   break;
   }
   else if(upnum.equals(no)) {
	  break;
   }
   else 
   {
	   System.out.println("Invalid input : enter again # "); 
   }
   }
   
   System.out.println();
   
   System.out.println("do you want to include special characters:");
   
   while(true) 
   {
   System.out.println("input should either yes (or) no :");
   String schar=sc.nextLine();
   String upchar=schar.toUpperCase();
	
   if(upchar.equals(yes)) {
	   String passwordlettes=randomlettes(passwordLength,".,!@#$%^&*()-[]':;~{`?}");
	   password=password+passwordlettes;
	   break;
   }
   else if(upchar.equals(no)) {
	   break;
   }
   else 
   {
	   System.out.println("Invalid input : enter again # "); 
   }
   }
   
   if(password.length()==0) 
   {
	   System.out.println();
	   System.out.println("password not generated:");
   }
   else 
   {
   System.out.println();
   String result=shuffleString(password);
   System.out.println("password is :"+truncate(result,passwordLength));
   }
   break;
	}
	else
	{
		System.out.println("enter again# ");
		System.out.println("password length must be 8 to 20: ");
	}
	}
	break;
		}
		else {
			System.out.println("input should be integer: ");
			System.out.println("enter again # ");
		}
		sc.nextLine();
	}
	sc.close();
}
}