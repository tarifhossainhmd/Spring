/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 *
 * @author Java
 */
@Service("jpaService")
@Repository
@Transactional
public class ProductServiceImpJpa implements  ProductService{
    @PersistenceContext
    private EntityManager em;
    @Override
    @Transactional(readOnly = true)
    public List<Product> getProducts() {
        return em.createNamedQuery("product.findAll").getResultList();
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product finProductById(int id) {
        TypedQuery productQuery = em.createNamedQuery("product.findById",Product.class);
        productQuery.setParameter("id", id);
        return (Product) productQuery.getSingleResult();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
   
    
}
