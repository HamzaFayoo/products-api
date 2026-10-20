package uk.ac.westminster.products_api;
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
public void setId(Long id) { this.id = id; }
public void setName(String name) { this.name = name; }
public void setPrice(double price) { this.price = price; }