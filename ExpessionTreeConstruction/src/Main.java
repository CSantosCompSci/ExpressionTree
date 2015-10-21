import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

//Christopher Santos
//Assignment 5
public class Main {

	static boolean invalidChar = false;
	static Stack <BTNode<String>> treeStack = new Stack<BTNode<String>>();
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
		System.out.println("Hello!! This is a postfix expression calculor.");
		System.out.println("After each expression is displayed and calculated please press enter to go to the next expression.");
		while(sc.hasNextLine())
		{
			expression = sc.nextLine();
			printPostFix(expression);
			buildTree(expression);
			
			
			
			new Scanner(System.in).nextLine();
		}
		
		
	}
	
	
	//Used to print the original expression
	public static void printPostFix(String expression)
	{
		System.out.println();
		System.out.println("Postfix expression: " + expression);
	}
	
	
	
	public static void buildTree(String expression)
	{
		String leftString = null;
		String s = expression;
		int p = s.indexOf('$');
		if (p >= 0) 
		    leftString = s.substring(0, p);
		  
		Scanner reader = new Scanner(leftString);
		String op;
		BTNode<String> node = null;
		BTNode<String> left, right;
		while(reader.hasNext())
		{
			if(reader.hasNextInt())
			{
				op = reader.next();
				node = new BTNode<String>(op,null,null);
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
					case "^":
					case "/":
					case "%":
					case ">":
					case "<":
					case ">=":
					case "==":
					case "!=":
					case "&&":
					case "||":
					case "*":
						node = new BTNode<String>(op,null,null);
						right = treeStack.pop();
						node.setRight(right);
						left = treeStack.pop();
						node.setLeft(left);
						treeStack.push(node);
						break;
					case "!":
						node = new BTNode<String>(op,null,null);
						right = treeStack.pop();
						node.setRight(right);
						treeStack.push(node);
						break;
				
					
						
					default:
						throw new NumberFormatException();
						
					}
				}
				catch(NumberFormatException e)
				{
					
					invalidChar = true;
				}
				
				
			
		}
		
		node = treeStack.pop();
		node.print(0);
		System.out.print("Infix Expression: "); 
		node.inOrderPrint();
		int solution = node.evaluate(node);
		System.out.println("The solution is " + solution);
		reader.close();
	}	
	

}
