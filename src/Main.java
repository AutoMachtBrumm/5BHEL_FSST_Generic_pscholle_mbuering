public class Main {
    public static void main(String[] args){

        // BinTree<Integer> tree = new BinTree<Integer>();
        BinTreeInt treeInt = new BinTreeInt();

        treeInt.add(10);
        treeInt.add(5);
        treeInt.add(18);
        treeInt.add(2);
        treeInt.add(7);
        treeInt.add(24);
        treeInt.add(15);
        treeInt.add(9);

        treeInt.printAll();
        System.out.println(treeInt.root);


        BinTree<String> treeString = new BinTree<String>("asdf");
        treeString.add("Bendra");
        treeString.add("Scharnreitner");
        treeString.add("Wiedermann");

        treeString.printAll();
        System.out.println(treeString.root);

    }
}
