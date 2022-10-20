
package kata2v4;

import java.util.Map;

public class Kata2V4 {


    public static void main(String[] args) {
        Integer[] data = {1,6,2,8,3,8,2,7,3,4,2,9,0,6};
        Histograma histo = new Histograma(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        histogr.forEach((k,v) -> System.out.println(k + " ==> " + v));

    }
    
}
