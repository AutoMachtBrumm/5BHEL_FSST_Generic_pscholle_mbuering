public class NodeInt {

    int data;

    NodeInt left;
    NodeInt right;

    public NodeInt(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insertNewNodeInt(int newData){

        // new data <= this node data --> left node
        if(newData < this.data) {

            // if left node already exists --> go into left node
            if(left != null) {
                left.insertNewNodeInt(newData);
            } else {
                left = new NodeInt(newData);
            }
        }

        // this node data > new Data --> right node
        else if(newData > this.data){

            // if right node already exists --> go into right node
            if(right != null) {
                right.insertNewNodeInt(newData);
            } else {
                right = new NodeInt(newData);
            }
        }
    }


}
