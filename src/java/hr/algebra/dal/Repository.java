/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.dal;

import hr.algebra.model.Cart;
import hr.algebra.model.Category;
import hr.algebra.model.LoginInf;
import hr.algebra.model.Product;
import java.util.List;

/**
 *
 * @author Bogoje
 */
public interface Repository {
    List<Product> selectProizvodi() throws Exception;
    List<Category> selectKategorije() throws Exception;
    
}
