import java.util.*;

public class ProductRepository implements IRepository<Product> {
    List<Product> pList = new ArrayList<>();
    Map<String, Product> pMap = new HashMap<>();
    @Override
    public boolean add(Product item) {
        if (item == null || item.getId() == null) {
            return false;
        }
        if (pMap.containsKey(item.getId())) {
            return false;
        }
        pList.add(item);
        pMap.put(item.getId(), item);
        return true;
    }
    @Override
    public boolean removeById(String id) {
        if (id == null || !pMap.containsKey(id)) {
            return false;
        }
        Product product = pMap.remove(id);
        pList.remove(product);
        return true;
    }
    @Override
    public Product findById(String id) {
        if (id == null) return null;
        return pMap.get(id);
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(pList);
    }
}
