import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Christopher Santos
//Assignment 5
public class Main {

	public static void main(String[] args)
	{
		
		Scanner sc = null;
		try
		{
			sc = new Scanner(new File("in.dat"));
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Hello!! This is a postfix expression calculor.");
		System.out.println("After each expression is displayed and calculated please press enter to go to the next expression.");
		
		
	}
	
	
	//Used to print the original expression
	public static void printOriginalExpression(String expression)
	{
		System.out.println(expression);
	}
	
	
	//Used to reprint postfix expression a fully parenthesized infix expression
	public static void printInfixExpression(String expression)
	{
		
	}
	
	//Used to print he expression tree
	public static void printExpressionTree()
	{
		
	}
	
}
