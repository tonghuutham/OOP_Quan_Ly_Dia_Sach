/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import java.util.List;
import models.BookProduct;
import models.MovieProduct;
import models.Product;

/**
 *
 * @author Ling
 */
public interface ProductDAO {
    public void add(Product product);
    public void update(Product product);
    public void delete(Product product);
    public Product getByID(int ID);
    public List<Product> showAll();
}
