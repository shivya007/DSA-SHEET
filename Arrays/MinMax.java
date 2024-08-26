
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
/* 
Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(int i =0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        Pair<Long, Long> p = new Pair<>(min, max);
        return p;
    }
}