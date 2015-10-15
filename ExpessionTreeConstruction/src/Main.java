import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

//Christopher Santos
//Assignment 5
public class Main {

	public static void main(String[] args)
	{
		String expression;
		Scanner sc = null;
		try
		{
			sc = new Scanner(new File("in.dat"));
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		while(sc.hasNextLine())
		{
			expression = sc.nextLine();
			printPostFix(expression);
			buildTree(expression);
			printInfix(expression);
			
		}
		System.out.println("Hello!! This is a postfix expression calculor.");
		System.out.println("After each expression is displayed and calculated please press enter to go to the next expression.");
		
		
	}
	
	
	//Used to print the original expression
	public static void printPostFix(String expression)
	{
		System.out.println(expression);
	}
	
	
	public static Stack<String> buildTree(String expression)
	{
		Stack <BTNode<String>> treeStack = new Stack<BTNode<String>>();
		Scanner reader = new Scanner(expression);
		String op;
		while(reader.hasNext())
		{
			if(reader.hasNextInt())
			{
				op = reader.next();
				BTNode<String> node = new BTNode<String>(op,null,null);
				treeStack.push(node);
			}
			else
				op = reader.next();
				try
				{
					switch(op)
					{
					case "+":
					case "-":
					case "
					
					}
				}
				
				
			
		}
		
		
		return treeStack;
	}
	
	//Used to print expression as fully parenthesized infix expression
	public static void printInfix(String expression)
	{
		
	}
	
	//Used to print he expression tree
	public static void printExpressionTree()
	{
		
	}
	
}
