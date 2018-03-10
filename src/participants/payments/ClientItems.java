package participants.payments;

import java.util.HashMap;
import java.util.Map;

public class ClientItems {
    public Map<String, Double> items;

    public ClientItems() {
        items = new HashMap<>();

        items.put("Item 1", 0.5);
        items.put("Item 2", 0.6);
        items.put("Item 3", 0.8);
        items.put("Item 4", 0.7);
        items.put("Item 5", 0.6);
        items.put("Item 6", 0.9);
        items.put("Item 7", 0.7);
        items.put("Item 8", 1.0);
        items.put("Item 9", 0.9);
    }
}
