
public class BTNode<E>
{
	public E data;
	public BTNode<E> left, right;
	public BTNode(E initialData, BTNode<E> initialLeft, BTNode<E> initialRight)
	{
		data = initialData;
		left = initialLeft;
		right = initialRight; 
	}
	
	//method to set the left node 
	public void setLeft(BTNode<E> newleft)
	{
		left = newleft;
	}
	
	
	//method to set the right node
	public void setRight(BTNode<E> newRight)
	{
		right = newRight;
	}
	
	public void inOrderPrint()
	{
		if (left != null)
		{
			System.out.print("(");
			left.inOrderPrint();
		}
			System.out.print(data);
		if (right != null)
		{
			right.inOrderPrint();
			System.out.print(")");
		}
	}
	
	//This method turns the tree on a 90 degree angle print the right subtree, root, and left subtree
	public void print(int level)
	{
		if(right != null)
		{			
			right.print(level+1);
		}
		for(int i = 1; i <= level; i++)
		{
			System.out.print("    ");
			
		}
		System.out.println(data);
		if(left != null)
		{
			left.print(level+1);
		}
	}
}
