package edu.eci.cvds.parcial.parcial1ertercio.service;

import edu.eci.cvds.parcial.parcial1ertercio.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

    private Map<String, Product> products = new HashMap<String, Product>();

    public ProductService() throws Exception {

        Product product1 = new Product("xbox", 1500, 5,"videogames");
        Product product2 = new Product("PS5",1500,6,"videogames");
        SaveProduct(product1);
        SaveProduct(product2);
    }


    public Product SaveProduct (Product product) throws Exception {

        if(product == null){
            throw new Exception("the producto dont have null");
        }
        if(products.get(product.getName()) != null){
            throw new Exception("the product alredy exist in database of product");
        }
        return products.put(product.getName(), product);
    }

    public Map<String, Product> getAllProducts(){
        return products;
    }

    public Product getProductById(String name) throws Exception {
        if(products.get(name)== null){
            throw new Exception("no existe el producto");
        }else {
            return products.get(name);
        }
    }

    public Product updateStock(String name, int stock) throws Exception {
        if(products.get(name) == null){
            throw new Exception("dont exist producto");
        }else{
            Product product = products.get(name);
            product.setStock(stock);
            return product;
        }
    }



}
