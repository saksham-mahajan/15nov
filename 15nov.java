/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paren;

/**
 *
 * @author Saksham mahajan
 */
import java.util.*;
public class Paren {
    static boolean isOpeningBracket(char i)
	{
		if(i=='('||i=='{'||i=='[')
			return true;
		return false;
	}
	static boolean isSame(char i,char j)
	{
		if(i=='('&&j==')'||i=='['&&j==']'||i=='{'&&j=='}')
			return true;
		return false;
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
	System.out.println("enter the astring");
	String s=sc.next();
	Stack<Character> s1=new Stack<Character>();
	Stack<Character> s2=new Stack<Character>();
	for(int i=0;i<s.length();i++)
	{
		if(isOpeningBracket(s.charAt(i)))
			s1.push(s.charAt(i));
		if(!isOpeningBracket(s.charAt(i)))
		{
			if(isSame(s1.peek(),s.charAt(i)))
				s1.pop();
			else
				s2.push(s.charAt(i));
		}
	}
	if(s1.isEmpty())
	{
		if(s2.isEmpty())
			System.out.println("Balanced");
	}
	else
		System.out.println("Not Balanced");
}
}
