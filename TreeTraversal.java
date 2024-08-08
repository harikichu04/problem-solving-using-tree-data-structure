
class Treenode {
    int value;
    Treenode left, right;

    Treenode(int x) {
        value=x;
        left = right = null;
    }
}

public class TreeTraversal {
    public static void Preorder(Treenode node) {
        if (node == null)
        return;
        System.out.print(node.value + " ");
            Preorder(node.left);
            Preorder(node.right);
       
    }
    public static void Postorder(Treenode node) {
        if (node == null)
        return;
        Preorder(node.left);
        Preorder(node.right);
        System.out.print(node.value + " ");
       
    }
     public static  void Inorder(Treenode node) {
        if (node == null)
        return;
        Preorder(node.left);
        System.out.print(node.value + " ");
        Preorder(node.right);
       
    }

    public static void main(String[] args) {
        Treenode root = new Treenode(1);
        root.left=new Treenode(2);
        root.right=new Treenode(3);
        root.left.left=new Treenode(4);
        root.left.right=new Treenode(5);
        root.left.right.left=new Treenode(8);
        root.right.left=new Treenode(6);
        root.right.right=new Treenode(7);
        root.right.right.left=new Treenode(9);
        root.right.right.right=new  Treenode(10);
        System.out.print("Preorder:"+" ");
        Preorder(root);
        System.out.println();

        
        System.out.print("Postorder:"+" ");
        Postorder(root);
        System.out.println();

        System.out.print("Inorder:"+" ");
        Inorder(root);



      

        
    }
}

