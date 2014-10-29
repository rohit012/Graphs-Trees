package org.bst.impl;

public class BinarySearchTree {

	BSTNode root;

	public BinarySearchTree(){

		root=new BSTNode();
		root.nodeData=9;
		
	}

	public boolean addValue(int nodeData){
		if (root==null)
			return false;

		else
			return root.addNodeToTree(nodeData);

	}

	public boolean remove(int value) {
		if (root == null)
			return false;
		else {
			if (root.nodeData == value) {
				BSTNode auxRoot = new BSTNode();
				auxRoot.nodeData=0;
				auxRoot.leftNode=(root);
				boolean result = root.remove(value, auxRoot); //normal remove
				root = auxRoot.leftNode;
				return result;
			} else {
				return root.remove(value, null);
			}
		}
	}
}


