package participants.payments;

import java.util.HashMap;
import java.util.Map;

public class ClientItems {
    public Map<String, Integer> items;

    public ClientItems() {
        items = new HashMap<>();

        items.put("Item 1", 5);
        items.put("Item 2", 1);
        items.put("Item 3", 1);
        items.put("Item 4", 6);
        items.put("Item 5", 3);
        items.put("Item 6", 9);
        items.put("Item 7", 6);
        items.put("Item 8", 9);
        items.put("Item 9", 4);
    }
}
