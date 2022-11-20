class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
         ArrayList<Integer> ans = new ArrayList<>();
         if(root==null)return ans;
         Queue<Node> mq = new LinkedList<>();
         Queue<Node> hq = new LinkedList<>();
         mq.add(root);
         boolean flag = true;
         while(mq.size()>0){
             root = mq.remove();
             if(flag){
                ans.add(root.data);
                flag = false;
             }
             if(root.left!=null)hq.add(root.left);
             if(root.right!=null)hq.add(root.right);
             if(mq.size()==0){
                 mq=hq;
                 hq= new LinkedList<>();
                 flag = true;
             }
         }
         return ans;
    }
}
