package ru.nnoopt.products;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/product/*")
public class ProductServlet extends HttpServlet {

    private ProductRepository productRepository;

    @Override
    public void init() throws ServletException {
        this.productRepository = new ProductRepository();
        this.productRepository.insert(new Product(1L, "Bread", 63L));
        this.productRepository.insert(new Product(2L, "Bread", 63L));
        this.productRepository.insert(new Product(3L, "Bread", 63L));
        this.productRepository.insert(new Product(4L, "Bread", 63L));
        this.productRepository.insert(new Product(5L, "Bread", 63L));
        this.productRepository.insert(new Product(6L, "Bread", 63L));
        this.productRepository.insert(new Product(7L, "Bread", 63L));
        this.productRepository.insert(new Product(8L, "Bread", 63L));
        this.productRepository.insert(new Product(9L, "Bread", 63L));
        this.productRepository.insert(new Product(10L, "Bread", 63L));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
