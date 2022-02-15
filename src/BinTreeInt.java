public class BinTreeInt {

    NodeInt root;

    public BinTreeInt(){
        this.root = null;
    }

    public BinTreeInt(int data){
        this.root = new NodeInt(data);
    }


    public void add(int data){
        // if no tree (root) exists --> create root
        if(this.root == null){
            this.root = new NodeInt(data);
            return;
        }

        // add data to existing tree
        this.root.insertNewNodeInt(data);
    }

    public void printAll(){
        // if tree exists
        if(root != null){
            inorder(root);
        }
    }


    void inorder(NodeInt node){
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
