package prog5;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         StringBuffer str= new StringBuffer(sc.nextLine());
         for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	 if(str.charAt(i)>='a' && str.charAt(i)<='z')
        		 ch=(char)(str.charAt(i)-32);
        	 if(str.charAt(i)>='A' && str.charAt(i)<='Z')
        		 ch=(char)(str.charAt(i)+32);
                 str.setCharAt(i, ch);
         }
                System.out.println(str);
	}

}
