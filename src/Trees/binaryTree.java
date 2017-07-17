package Trees;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * This is a binary search tree
 */
public class binaryTree {

	 static Node root;
	 
	 static ArrayList<Node> lst_n1=new ArrayList<Node>();
	 class Node{
		int data;
		Node leftChild;
		Node rightChild;
		
		Node(int d){
			data=d;
			leftChild=null;
			rightChild=null;
		}
	}
	 
	 binaryTree()
	 {
		 root=null;
	 }
	 
	 
	 
	 void insert(int data){
		Node n=new Node(data);
		if(root==null)
		{
			root=n;
		}
		else{
			Node temp=root;
			Node parent;
			
			while(true)
			{
				parent=temp;
				
				if(data<temp.data)
				{
					temp=temp.leftChild;
					
					if(temp==null)
					{
						parent.leftChild=n;
						break;
					}
				}
				
				else if(data>temp.data)
				{
					temp=temp.rightChild;
					
					if(temp==null)
					{
						parent.rightChild=n;
						break;
					}
				}
					
			}
			
			
			
			/**
			 * This commented code would add duplicate
			 */
		/*	while(temp!=null)
			{
				if(data<temp.data)
				{
					temp=temp.leftChild;
				}
				if(data>temp.data)
				{
					temp=temp.rightChild;
				}
			}
			temp=n;*/
		}
		
		 
	 }

	 
	
	 
	 
	 void find(int key)
	 {
		 	Node temp=root;
		 	
		 	if(temp.data==key)
		 	{
		 		System.out.println("found"+temp.data);
		 	}
		 	else
		 	{
		 		while(temp!=null)
			 	{
		 			if(key<temp.data)
			 		{
		 				temp=temp.leftChild;
			 		}
		 			
		 			if(key>temp.data)
			 		{
		 				temp=temp.rightChild;
			 		}
		 			
		 			if(key==temp.data)
		 			{
		 				System.out.println("found"+temp.data);
		 				break;
		 			}
			 	}
		 	}
	 }
	
	 
	static void inorder(Node temp){
		
		if(temp==null)
			return;
		inorder(temp.leftChild);

		System.out.println(temp.data);
		
		inorder(temp.rightChild);
		
		
	}
	
	
	static void preorder(Node temp){
		
		if(temp==null)
			return;
		System.out.println(temp.data);
		preorder(temp.leftChild);

		
		
		preorder(temp.rightChild);
		
		
	}
	
	
	
	
	static void postorder(Node temp){
		
		if(temp==null)
			return;
		
		postorder(temp.leftChild);
		
		postorder(temp.rightChild);
		
		System.out.println(temp.data);
		
	}
	 
	/**
	 * The node to be deleted is a leaf
	 */
	void delete(int key){
		 Node temp=root;
		 Node parent=temp;
		 boolean isLeftChild=false;
		 while(temp.data!=key)
		 {
			 parent=temp;
			 if(key<temp.data)
			 {
				 temp=temp.leftChild;
				 isLeftChild=true;
			 }
			 else if (key>temp.data)
			 {
				 temp=temp.rightChild;
			 }
		 }
		 
		 if(temp==null)
			 return;
		 
		 if(temp.leftChild==null && temp.rightChild==null)
		 {
			if(temp==root)
				root=null;
			if(isLeftChild==true)
			{
				parent.leftChild=null;
			}
			else{
				parent.rightChild=null;
			}
			
		 }
	 }
	
	
	/**
	 * The node to be deleted has one child
	 */
	void oneChildDelete(int key)
	{
		Node temp=root;
		Node parent=null;
		Node child=null;
		boolean isLeftChild=false;
		while(temp!=null)
		{
			
			 if(temp.data==key)
				{
					break;
				}
			 parent=temp;
			 if(key<temp.data)
			{
				isLeftChild=true;
				temp=temp.leftChild;
			}
			else if (key>temp.data)
			{
				temp=temp.rightChild;
			}
				
			
		}
		
		if(temp.rightChild!=null || temp.leftChild!=null)
		{
			//replace if the node to be deleted is root
			if(temp==root)
			{
				if(temp.rightChild!=null)
				{
					root=temp.rightChild;
				}
				else{
					root=temp.leftChild;
				}
			}
			
			else if (isLeftChild)
			{
				parent.leftChild=temp.leftChild;
			}
			else {
				parent.rightChild=temp.rightChild;
			}
		}
	}
	
	
	static Node findSuccessor(Node key)
	{
		Node successorParent=key;
		Node successor=key;
			
		Node temp=key.rightChild;
		
		Node parent=root;
		Node traverse=root;
		boolean isLeftChild=false;
		
		
		
		//traverse to find the root of the delete node
		
		while(traverse!=null)
		{
			
			if(key.data==traverse.data)
			{
				break;
			}
			parent=traverse;
			 if(key.data<traverse.data)
			{
				 isLeftChild=true;
				traverse=traverse.leftChild;
			}
			else{
				traverse=traverse.rightChild;
			}
		}
		
		while(temp!=null)
		{
			successorParent=successor;
			successor=temp;
			temp=temp.leftChild;		
		}
		
		if(successor!=key.rightChild)
		{
			successorParent.leftChild=successor.rightChild;
			successor.rightChild=key.rightChild;
		}
		else{
			if(temp==root)
			{
				root=successor;
			}
			else if(isLeftChild)
			{
				parent.leftChild=successor;
			}
			else
			{
				parent.rightChild=successor;
			}
				
			successorParent.leftChild=key.leftChild;
		}
		
		return successor;
	}
	 
	
	/**
	 * To find the LCA of a  binary Search Tree
	 * 
	 */
	
	public static void lca(int n1,int n2,Node localRoot)
	{
		
		if(localRoot.data>n1 && localRoot.data>n2)
		{	
		lca(n1,n2,localRoot.leftChild);
		}
		else if(localRoot.data<n1 && localRoot.data<n2){
			lca(n1,n2,localRoot.rightChild);
		}
		else{
			System.out.println("LCA is "+localRoot.data);
			return;
		}
		
	}
	

	 
	 public static void main(String args[])
	 {
		 binaryTree bt=new binaryTree();
		 bt.insert(3);
		 bt.insert(2);
		 bt.insert(5);
		 bt.insert(4);
		 bt.insert(6);
		 
		 bt.postorder(root);
		 
	 }



}
