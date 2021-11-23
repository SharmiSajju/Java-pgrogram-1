package org.alldaytest;

public class Pgm6 {
	public static void main(String[] args) {
		String s= "agbjhjHHDIKS123*@22%";
		String lowercase="";
		String uppercase="";
		String num="";
		String special="";
		
		
		for(int i=0; i<s.length();i++)
		{
			char c= s.charAt(i);
			if (Character.isUpperCase(c))
			{
				uppercase=uppercase+c;
			}
			else if (Character.isLowerCase(c))
		{
		lowercase=lowercase+c;
	}
		else if (Character.isDigit(c)) 
		{
			num=num+c;
		}

		else {
			special=special+c;
		}}	
				
			System.out.println(uppercase);
			System.out.println(lowercase);
			System.out.println(num);
			System.out.println(special);
			System.out.println("START");
		System.out.println("**********Sharmi*****************");
		System.out.println("FINSIH");
}}