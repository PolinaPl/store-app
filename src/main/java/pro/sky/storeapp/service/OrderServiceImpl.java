package pro.sky.storeapp.service;

import org.springframework.stereotype.Service;
import pro.sky.storeapp.model.Busket;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final Busket busket;

    public OrderServiceImpl(Busket busket) {
        this.busket = busket;
    }

    @Override
    public List<Integer> addItems(List<Integer> id) {
        return busket.addItems(id);
    }

    @Override
    public List<Integer> getItems() {
        return busket.getItems();
    }
}
