/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ling
 */
public class IntegerMapper implements IMapper<Integer>{
    @Override
    public Integer mapping(ResultSet rs) throws SQLException {
        return rs.getInt(1);
    }
    
}
