package org.bst.impl;

public class MainBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bst =new BinarySearchTree();
		if(bst.addValue(6))
			System.out.println("value added-->6");
		if(bst.addValue(5))
			System.out.println("value added -->7");
		if(bst.addValue(4))
			System.out.println("value added-->8");

		if(bst.addValue(11))
			System.out.println("value added-->11");
		if(bst.addValue(233))
			System.out.println("value added -->23");
		if(bst.addValue(223))
			System.out.println("value added-->17");

		if(bst.addValue(333))
			System.out.println("value added-->6");
		if(bst.addValue(1223))
			System.out.println("value added -->7");
		if(bst.addValue(3320))
			System.out.println("value added-->8");

		if(bst.addValue(490))
			System.out.println("value added-->11");
		if(bst.addValue(930210))
			System.out.println("value added -->23");
		if(bst.addValue(3100931))
			System.out.println("value added-->17");

		
		

		if(bst.remove(4))
			System.out.println("removed");
		else 
			System.out.println("not found");
		

		if(bst.remove(9))
			System.out.println("removed");
		else 
			System.out.println("not found");

	}

}
