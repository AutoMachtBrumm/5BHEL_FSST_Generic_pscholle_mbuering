public class Main {
    public static void main(String[] args){

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
        treeInt.count();
        System.out.println(treeInt.root);


        BinTree<String> treeString = new BinTree<String>("Hugo");
        treeString.add("Bendra");
        treeString.add("Scharnreitner");
        treeString.add("Wiedermann");

        treeString.printAll();
        System.out.println(treeString.count() + " Elemente\n" + treeString.root);


        BinTree<Schueler> treeSchueler = new BinTree<Schueler>(new Schueler("Scholla <3"));
        treeSchueler.add(new Schueler("Marco <3"));
        treeSchueler.add(new Schueler("Marco² <<3"));
        treeSchueler.add(new Schueler("Marco³ <<<3"));

        treeSchueler.printAll();
        System.out.println(treeSchueler.root);

        for(Schueler s:treeSchueler){

            System.out.println(s);

        }


    }
}
