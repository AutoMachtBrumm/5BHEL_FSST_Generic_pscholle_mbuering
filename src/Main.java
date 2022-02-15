public class Main {
    public static void main(String[] args){

        BinTree<Integer> tree = new BinTree<Integer>();

        tree.add(10);
        tree.add(5);
        tree.add(18);
        tree.add(2);
        tree.add(7);
        tree.add(24);
        tree.add(15);
        tree.add(9);

        tree.printAll();
        System.out.println(tree.root);


        BinTree<String> list = new BinTree<String>("asdf");
        list.add("Bendra");
        list.add("Scharnreitner");
        list.add("Wiedermann");

        list.printAll();
        System.out.println(list.root);

    }
}
