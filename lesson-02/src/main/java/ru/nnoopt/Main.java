package ru.nnoopt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean("productService", ProductService.class);

        CartService cartService = context.getBean("cartService", CartService.class);

        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.print("Enter product title: ");
            String title = sc.nextLine();

            System.out.print("Enter cost: ");
            double cost = sc.nextDouble();

            System.out.print("Enter consistency: ");
            String consistency = sc.nextLine();

            try {
                productService.insert(new Product(title, cost, consistency));
            } catch (IllegalArgumentException ex){
                System.out.println("Incorrect consistency");
            }


            System.out.println(productService.getCount() + " products in repo");
        }

    }
}
