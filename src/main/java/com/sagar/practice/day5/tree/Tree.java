package day5.tree;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;

    }
}

public class Tree {

    static int idx=-1;
    public static Node buildTree(int nodes[]){
          
        idx++;
        if(nodes[idx]==-1)
        {
            return null;
        }
        Node newNode=new Node(nodes[idx]);

        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;

    }
  
    static void postOrder(Node root)
    {
            if(root==null)
                return;
           
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");

    }
    static void inOrder(Node root)
    {
            if(root==null)
                return;

            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
            

    }
   
  
 
    public static void main(String[] args) {
       
         //int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         //int nodes[]={10,20,30,-1,-1,40,60,-1,-1,-1,80,50,-1,70,-1,-1,90,-1,-1};
        

         //int nodes[]={10,20,30,-1,-1,40,60,-1,-1,-1,80,50,-1,70,-1,-1,90,-1,-1};
       // int nodes[]={10,20,30,-1,-1,50,70,90,-1,-1,80,-1,-1,60,-1,-1,40,-1,100,-1,120,110,-1,-1,130,-1,-1};
        
        int nodes[]={3,4,6,-1,-1,-1,5,7,-1,-1,8,-1,-1};

         //building tree using buildTree
         Node root=buildTree(nodes);
       
       inOrder(root);
         
          
        


    }
    
}
