import java.util.*;

public class BinTree<T> implements Iterable<T> {

    Node root;

    public BinTree(T data) {
        this.root = new Node(data);
    }


    public void add(T data) {
        // add data to existing tree
        this.root.insertNewNode(data);
    }

    public void printAll() {
        List<T> list = new ArrayList<>();
        getInorder(root, list);
        System.out.println(list);
    }

    public int count() {
        List<T> list = new ArrayList<>();
        getInorder(root, list);
        return list.size();
    }


    void getInorder(Node node, List<T> list) {
        // check left
        if (node.left != null) {
            getInorder(node.left, list);
        }

        // add node data
        list.add((T) node.data);

        // check right
        if (node.right != null) {
            getInorder(node.right, list);
        }
    }


    @Override
    public Iterator<T> iterator() {

        List<T> list = new ArrayList<>();
        getInorder(root, list);

        return new binTreeIterator<T>(list);
    }
}



class binTreeIterator<T> implements Iterator<T>{

    List<T> list = null;
    int i;

    public binTreeIterator(List<T> list) {
        this.list = list;
        int i = 0;
    }

    @Override
    public boolean hasNext() {
        if (i > (list.size()-1)) {
            return false;
        }
        return true;
    }

    @Override
    public T next() {
        i++;
        return (T) list.get(i-1);
    }
}