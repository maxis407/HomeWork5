import com.sun.jdi.Value;

public class Pair<K,V> {

private K key;
private V value;

public Pair(K key, V value){
    this.key = key;
    this.value = value;
}
public void  setValue(V value){
    this.value = value;
}

public V getValue(){
    return this.value;
}

}
