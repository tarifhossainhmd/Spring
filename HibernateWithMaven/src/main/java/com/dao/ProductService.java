/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Product;
import java.util.List;

/**
 *
 * @author Java
 */
public interface ProductService {
     public List<Product> getProducts();
     public Product finProductById(int id);
     
}
