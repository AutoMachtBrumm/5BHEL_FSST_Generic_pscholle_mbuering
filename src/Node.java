public class Node<T> {

    T data;

    Node left;
    Node right;

    public Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // the hashcode of the given data was used to create the tree
    public void insertNewNode(T newData){
        // new data <= this node data --> left node
        if(newData.hashCode() < this.data.hashCode()) {

            // if left node already exists --> go into left node
            if(left != null) {
                left.insertNewNode(newData);
            } else {
                left = new Node(newData);
            }
        }

        // this node data > new Data --> right node
        else if(newData.hashCode() > this.data.hashCode()){

            // if right node already exists --> go into right node
            if(right != null) {
                right.insertNewNode(newData);
            } else {
                right = new Node(newData);
            }
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
