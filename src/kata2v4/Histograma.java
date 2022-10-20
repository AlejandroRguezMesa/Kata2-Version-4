package kata2v4;
import java.util.HashMap;
import java.util.Map;

public class Histograma<T> {
    private final T[] data;

    public Histograma(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    public Map<T,Integer> getHistogram(){
        Map<T, Integer> histo = new HashMap<>();
        for (T i:data){
            histo.put(i, histo.containsKey(i)? histo.get(i) + 1:1);
        }
        return histo;
    
    
}
}
