package ru.nnoopt;


import org.springframework.stereotype.Service;

@Service
public class ProductService {



    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void insert (Product product){
        if (product.getConsistency().equals("SOLID") || product.getConsistency().equals("LIQUID")) {
            this.productRepository.insert(product);
        }else {
            throw new IllegalArgumentException("Incorrect consistency");
        }
    }

    public long getCount(){
        return productRepository.getCount();
    }
}
