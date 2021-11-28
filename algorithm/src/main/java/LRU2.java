import java.util.LinkedHashMap;
import java.util.Map;

public class LRU2<K, V> extends LinkedHashMap<K, V> {
    private final int MAX_CACHE_SIZE;

    public LRU2(int cacheSize) {
        super((int) Math.ceil(cacheSize / 0.75d) + 1, 0.75f, true);
        MAX_CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_CACHE_SIZE;
    }
}
