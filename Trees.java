
   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   
 void preOrder(Node root) {
    if(root == null){
        return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);

}  
 
 void postOrder(Node root) {
    if(root == null){
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data+" ");

}  
  
 void inOrder(Node root) {
    if(root == null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);

} 
 
 void levelOrder(Node root) {
       Queue<Node> q = new LinkedList<Node>();
       q.add(root);
       
       while(!q.isEmpty()){
           Node temp = q.remove();
           int data = temp.data;
           System.out.print(data+" ");
           if(temp.left != null){
               q.add(temp.left);
           }
           if(temp.right != null){
               q.add(temp.right);
           }
       }
      
      
    }
   
 static int height(Node root) {
      	// Write your code here.
        if(root == null){
            return -1;
        }
        else{
            int left = height(root.left);
            int right = height(root.right);
            
            if(left > right)
                return left+1;
            else
                return right+1;
        }
    }
   
 void topView(Node root) {
       Hashtable<Node,Integer> hash = new Hashtable<Node,Integer>(); 
       HashSet<Integer> set = new HashSet<Integer>();
       Queue<Node> q = new LinkedList<Node>();
       q.add(root);       
       int horizontal = 0;
       hash.put(root,horizontal);
       
       while(!q.isEmpty()){
           Node temp = q.remove();
           int data = temp.data;          
           
           if(!set.contains(hash.get(temp))){
               System.out.print(data+" ");
               set.add(hash.get(temp));
           }
           
           if(temp.left != null){
               q.add(temp.left);
               hash.put(temp.left,hash.get(temp)-1);
           }
           if(temp.right != null){
               q.add(temp.right);
               hash.put(temp.right,hash.get(temp)+1);
           }
                          
       }
      
    }
    
 void topView(Node root) {       
       
       SortedSet<Integer> set = new TreeSet<Integer>();
       Queue<Node> q = new LinkedList<Node>();
       q.add(root);  
       set.add(root.data);
             
       while(!q.isEmpty()){
           Node temp = q.remove();
           int data = temp.data;          
           
           if(temp.left != null){
               q.add(temp.left);
               set.add(temp.left.data);
           }                             
       }
       
       q.add(root);
       while(!q.isEmpty()){           
           Node temp = q.remove();
           int data = temp.data;
           
            if(temp.right != null){
               q.add(temp.right);
               set.add(temp.right.data);
           }
       }
       
       for(Integer i:set){
           System.out.print(i+" ");
       }                                                                 
    }
