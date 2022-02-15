public class NodeInt {

    int data;
    NodeInt left;
    NodeInt right;

    public NodeInt(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public NodeInt insertNodeInt(int data, NodeInt parent){

        if(data <= parent.data) {
            left = new NodeInt(data);
            return left;
        } else if(data > parent.data){
            right = new NodeInt(data);
            return right;
        } else {
            // error
            return null;
        }
    }


}
