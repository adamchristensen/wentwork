
public class HuffmanTree {
	public Node root;

	public HuffmanTree(){
		this.root = new Node();
	}
	public void add(char data, String sequence){
		Node temp = this.root;
		int i = 0;
		for(i=0;i<sequence.length()-1;i++){ //loop through whole character sequence
			if(sequence.charAt(i)=='0'){ //check to see if the character is 0.
				if(temp.left == null){ //If left of tree is empty, make temp a new Node.
					temp.left = new Node();
					temp = temp.left;
				}
				else{
					temp = (Node) temp.left; //else, make temp equal to the first child on the left side of the tree.
				}
			}
			else //if character is not 0...
				if(sequence.charAt(i)=='1'){
					if(temp.right == null){ //If right of tree is empty, make temp a new Node.
						temp.right = new Node();
						temp = temp.right;
					}
					else{
						temp = (Node) temp.right;//else, make temp equal the first child on the right side of the tree.
					}
				}}

		if(sequence.charAt(i)=='0'){

			temp.left = new Node(data); //add the data to the node on the left side of the tree
		}
		else{
			temp.right = new Node(data); //add the data to the node on the right side of the tree.
		}
	}

	public String getDecodedMessage(String encoding){

		String output = "";
		Node temp = this.root; //initialize a temporary node with the value of the root node.
		for(int i = 0;i<encoding.length();i++){ //loop through the encoding

			if(encoding.charAt(i) == '0'){ //Check to see if the character in the encoding at point i is equal to 0.
				temp = temp.left; //set the value of the temporary node to the value of the first child on the left side of the tree.

				if(temp.left == null && temp.right == null){ //If the tree is empty (except the root)
					output+= temp.getData(); //Parse the values(leaves) in temp to the string "output" 
					temp = this.root; //set the temporary node to the root of the tree.
				}
			}
			else //If the character is not equal to 0...
			{
				temp = temp.right; //set the value of the temporary node to the value of the first child on the right side of the tree.
				if(temp.left == null && temp.right == null){ //If the tree is empty
					output+= temp.getData(); //Parse the values of the leaves in temp to the string "output"
					temp = this.root;  //set the temporary node to the root of the tree.
				}

			}
		}
		return output;//return the output
	}
	// Traversal of reconstructed huffman tree for debugging.
	public void traversal(Node node){
		if(node == null) //if the node is empty, just exit.
			return;
		System.out.println(node);//output the node
		traversal(node.left);//run this method recursively for the left side of the tree.
		traversal(node.right);//run this method recursively for the right side of the tree.
	}

}


class Node{//generic node class

	Node left;
	Node right;
	char data;

	public Node(){

	}
	public Node(char data){
		this.data = data;
	}
	public void setData(char data){
		this.data = data;
	}
	public char getData(){
		return this.data;
	}
	@Override
	public String toString(){
		if(this.data == Character.UNASSIGNED){
			return "No Value";
		} 
		else
			return ""+this.data;
	}
}
