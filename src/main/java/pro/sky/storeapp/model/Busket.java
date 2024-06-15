package pro.sky.storeapp.model;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class Busket {
    private final List<Integer> items = new ArrayList<>();

    public List<Integer> addItems(List<Integer> id) {
        items.addAll(id);
        return items;
    }

    public List<Integer> getItems() {
        return items;
    }
}
