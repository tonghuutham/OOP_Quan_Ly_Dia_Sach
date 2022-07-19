/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import models.NCC;

/**
 *
 * @author Ling
 */
public class NCCMapper implements IMapper<NCC>{
    @Override
    public NCC mapping(ResultSet rs) throws SQLException{
        NCC ncc = new NCC(rs.getString("ten"),rs.getString("email"), rs.getString("SDT"),  rs.getString("dia_diem"));
        ncc.setID(rs.getInt("ID"));
        return ncc;
        // String ID, String ten, String SDT, String email, String diaDiem
    }
}
