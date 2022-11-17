class BinaryTree {


	public static class Node {
	
		int data;
		Node left;
		Node right;
		
		public Node(int n) {
			this.data = n;
			this.left = null;
			this.right = null;
		
		}
		
		Node root;
		
		public BinaryTree() {
		
		
		}
		
		public BinaryTree(int key) {
			
			root = new Node(key);
		
		}
	
	}

}
