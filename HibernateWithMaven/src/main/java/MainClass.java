




import com.dao.ProductService;
import com.dao.repository.ProductRepository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
       // ProductService ps = context.getBean("productService",ProductServiceImpl.class);
       // System.out.println(ps.getProducts().get(0).getName());
//       ProductService ps = (ProductService)context.getBean("jpaService");
//        System.out.println("----First product id ----"+ ps.getProducts().get(0).getId());
//        System.out.println("----First product name by id ----"+ ps.finProductById(5).getName());
      
        ProductRepository pr = (ProductRepository) context.getBean("productRepository");
        System.out.println("Total "+ pr.count());
        
        
    }
}
