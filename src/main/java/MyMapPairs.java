import java.util.ArrayList;
import java.util.List;

public class MyMapPairs<K, V> {
    List<MyMap<K, V>> pair = new ArrayList<>();

    public void put(K kluch, V value){
        for(MyMap<K,V> x: pair) {
            if(kluch.equals(x.getKluch())){
                x.setValue(value);
                return;
            }
        }
        MyMap<K, V> map = new MyMap<>(kluch, value);
        pair.add(map);
    }

    public V getValue(K kluch){
        for(MyMap<K,V> x: pair) {
            if (kluch.equals(x.getKluch())) {
                return x.getValue();
            }
        }
        return null;
    }



    @Override
    public String toString(){
       return pair.toString();
    }
}
