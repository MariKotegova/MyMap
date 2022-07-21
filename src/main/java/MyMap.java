public class MyMap<K, V> {
    public K kluch;
    public V value;

    public MyMap(K kluch, V value){
        this.kluch = kluch;
        this.value = value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKluch() {
        return kluch;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString(){
        return kluch + " " + value.toString();
    }
}
