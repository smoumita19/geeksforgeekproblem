public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        ArrayList<Integer> arrlist = new ArrayList<>();
        traverseInOrder(root,arrlist);
        
        // code here.
        for(int i=0; i< arrlist.size() -1;i++) {
            if(arrlist.get(i) > arrlist.get(i+1)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void traverseInOrder(Node root, ArrayList<Integer> arrlist){
        
        if(root != null) {
            traverseInOrder(root.left,arrlist);
            arrlist.add(root.data);
            traverseInOrder(root.right,arrlist);
        }
        
    }
}
