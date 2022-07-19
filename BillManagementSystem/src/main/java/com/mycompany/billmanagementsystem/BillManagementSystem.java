/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.billmanagementsystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import viewmodel.*;
import models.*;
import viewmodel.DAO.IServiceDAO;
import viewmodel.DAO.ServiceDAO;

/**
 *
 * @author Ling
 */
public class BillManagementSystem {

    public static void main(String[] args) {
        ProductDAO pdDAO = new ProductDAOImpl();
        List<Product> list = pdDAO.showAll();
        for (Product pd : list){
            pd.output();
        }
       
    }
}
