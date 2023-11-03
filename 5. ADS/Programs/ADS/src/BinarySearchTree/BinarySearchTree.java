package BinarySearchTree;
class Node{
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}
public class BinarySearchTree {
    Node root;
    
    public Node insertNode(Node root, int val){
        if (root==null) {
            return new Node(val);
        }
        else if (root.data<val) {
            root.right= insertNode(root.right, val);
        }
        else
            root.left=insertNode(root.left, val);
        return root;
    }
    
    public boolean search(Node root,int val){
        if (root==null) {
            return false;
        }
        if (root.data==val) {
            return true;
        }
        if (root.data<val) {
            return search(root.right, val);
        }
        else 
            return search(root.left, val);
    }
    
    public Node delete(Node root,int val){
        if (root==null) {
            return null;
        }
        else if (root.data<val) {
            root.right=delete(root.right, val);
        }
        else if (root.data>val) {
            root.left =delete(root.left, val);
        }
        else{
            if (root.left==null && root.right==null) {
                return null;
            }
            else if (root.left==null) {
                return root.right;
            }
            else if (root.right ==null) {
                return root.left;
            }
            else{
                int rightMin = getRightMin(root.right);
                root.data = rightMin;
                root.right=delete(root.right, rightMin);
            }
        }
        return root;
    }
    private int getRightMin(Node right) {
        Node temp = right;
        while (temp.left!=null) {            
            temp = temp.left;
        }
        return temp.data;
    }
    
    public void inorder(Node root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);  
    }
    
    public void postorder(Node root){
        if (root==null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    
    public void preorder(Node root){
        if (root==null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
        
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root=bst.insertNode(bst.root, 100);
        bst.root=bst.insertNode(bst.root, 50);
        bst.root=bst.insertNode(bst.root, 10);
        bst.root=bst.insertNode(bst.root, 60);
        bst.root=bst.insertNode(bst.root, 200);
        bst.root=bst.insertNode(bst.root, 250);
        bst.root=bst.insertNode(bst.root, 150);
        bst.root=bst.insertNode(bst.root, 300);
        
        //PostOrder
        System.out.println("**************Post Order****************\n");
        bst.postorder(bst.root);
        
        //Preorder
        System.out.println("**************Pre Order****************\n");
        bst.preorder(bst.root);
        
        //Inorder
        System.out.println("\n*************In order**********");
        System.out.println("\n******Before Deleating*******");
        bst.inorder(bst.root);
//        System.out.println(bst.search(bst.root, 300));
        bst.delete(bst.root, 200);
        System.out.println("\n******After Deleating*******");
        bst.inorder(bst.root);
    }
}