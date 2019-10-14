/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpadatawithmaven;

import com.j2ee.dao.repository.ProductRepository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("./beans.xml");

        ProductRepository pr = (ProductRepository) context.getBean("productRepository");
        System.out.println("Total............"+pr.count());
        System.out.println("Find Mango Id:" +pr.findByName("Mango").get(0).getId());
        
    }
    
}
