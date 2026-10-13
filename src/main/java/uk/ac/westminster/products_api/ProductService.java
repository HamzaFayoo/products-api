package uk.ac.westminster.products_api;
import io.micrometer.common.KeyValues;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;
    public List<Product> getAllProducts() {
        return products;
    }
    public Product addProduct(Product product) {
        product.setId(nextId++); // use the value, then add one
        products.add(product);
        return product;
    }
}

public Optional<Product> getProductById(Long id) {
    KeyValues products;
    return products.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst();