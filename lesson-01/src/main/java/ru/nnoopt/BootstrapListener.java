package ru.nnoopt;

import ru.nnoopt.products.Product;
import ru.nnoopt.products.ProductRepository;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BootstrapListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ProductRepository productRepository = new ProductRepository();
        productRepository.insert(new Product("Bread", 65));
        productRepository.insert(new Product("Bread", 34));
        productRepository.insert(new Product("Bread", 34));
        productRepository.insert(new Product("Bread", 66));
        productRepository.insert(new Product("Bread", 456));
        productRepository.insert(new Product("Bread", 445));
        productRepository.insert(new Product("Bread", 467));
        productRepository.insert(new Product("Bread", 72));
        productRepository.insert(new Product("Bread", 25));
        productRepository.insert(new Product("Bread", 45));

        sce.getServletContext().setAttribute("productRepository", productRepository);
    }
}
