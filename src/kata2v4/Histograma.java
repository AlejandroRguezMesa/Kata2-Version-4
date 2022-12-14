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
        Map<T, Integer> histogram = new HashMap<>();
        for (T i:data){
            histogram.put(i, histogram.containsKey(i)? histogram.get(i) + 1:1);
        }
        return histogram;
    
    
}
}
