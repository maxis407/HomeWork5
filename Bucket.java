import java.util.LinkedList;
import java.util.List;

public class Bucket {

private List<Pair> list;
public Bucket(){

    this.list = new LinkedList<>();

}

public List<Pair> getList(){
    return list;
}


public void addPair(Pair pair){
    list.add(pair);
}

public void removePair(Pair pair){
   list.remove(pair);
}

}
