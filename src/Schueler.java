import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Schueler implements Comparable<Schueler>{

    String name;

    public Schueler(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Schueler{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Schueler o) {
        if(this.hashCode() > o.hashCode()){
            return 1;
        } else if(this.hashCode() <= o.hashCode()){
            return -1;
        } else {
            return 0;
        }
    }

}
