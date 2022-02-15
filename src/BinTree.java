public class BinTree<T> {

    Node root;

    public BinTree(){
        this.root = null;
    }

    public BinTree(T data){
        this.root = new Node(data);
    }


    public void add(T data){
        // if no tree (root) exists --> create root
        if(this.root == null){
            this.root = new Node(data);
            return;
        }

        // add data to existing tree
        this.root.insertNewNode(data);
    }

    public void printAll(){
        // if tree exists
        if(root != null){
            inorder(root);
        }
    }


    void inorder(Node node){
        // check left
        if(node.left != null){
            inorder(node.left);
        }

        // print node data
        System.out.println(node.data);

        // check right
        if(node.right != null){
            inorder(node.right);
        }
    }

}
