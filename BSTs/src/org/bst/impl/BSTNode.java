package org.bst.impl;

public class BSTNode {

	int nodeData;

	BSTNode leftNode;
	BSTNode rightNode;

	public boolean addNodeToTree(int data) {

		if (data == this.nodeData)
			return false;
		else if (data < this.nodeData) {

			if (this.leftNode == null) {
				leftNode = new BSTNode();
				leftNode.nodeData = data;
				return true;

			} else {
				this.leftNode.addNodeToTree(data);

			}

		}

		else if (data > this.nodeData) {
			if (this.rightNode == null) {
				rightNode = new BSTNode();
				rightNode.nodeData = data;
				return true;

			} else {

				this.rightNode.addNodeToTree(data);
			}
		}

		return false;

	}
	
	
	public boolean findNode(int data){
		
		if(this.nodeData==data){
			
			return true;
		}
		else if (data<this.nodeData){
			
			if(leftNode==null){
				
				return false;
			}
			else {
				return leftNode.findNode(data);
			}
		}
		else if(data>this.nodeData){
			
			if(rightNode==null)
				return false;
			else 
				return rightNode.findNode(data);
			
			
		}
		return false;
	}

	
    public boolean remove(int value, BSTNode parent) {
        if (value < this.nodeData) {
              if (leftNode != null)
                    return leftNode.remove(value, this);
              else
                    return false;
        } else if (value > this.nodeData) {
              if (rightNode != null)
                    return rightNode.remove(value, this);
              else
                    return false;
        } else {												// all data match conditions
              if (leftNode != null && rightNode != null) {
                    this.nodeData = rightNode.minValue();		//putting minimum value from right   node
                    rightNode.remove(this.nodeData, this);		//removing minimum value from right node
              } else if (parent.leftNode == this) {
                    parent.leftNode = (leftNode != null) ? leftNode : rightNode;  //single case
              } else if (parent.rightNode == this) {
                    parent.rightNode = (leftNode != null) ? leftNode : rightNode;  
              }
              return true;
        }
  }

  public int minValue() {
        if (leftNode == null)
              return nodeData;
        else
              return leftNode.minValue();
  }

	
}
