/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel.Mapper;

import java.sql.*;

/**
 *
 * @author Ling
 */
public class StringMapper implements IMapper<String>{
    @Override
    public String mapping(ResultSet rs) throws SQLException {
        return rs.getString(1);
    }
}
