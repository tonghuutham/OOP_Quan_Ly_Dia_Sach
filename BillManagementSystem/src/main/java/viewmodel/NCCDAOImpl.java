/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;
import java.util.List;
import models.KhachHang;
import models.NCC;
import viewmodel.DAO.ServiceDAO;
import viewmodel.Mapper.IMapper;
import viewmodel.Mapper.KhachHangMapper;
import viewmodel.Mapper.NCCMapper;

/**
 *
 * @author Ling
 */
public class NCCDAOImpl extends ServiceDAO<NCC> implements NCCDAO{
    @Override
    public List<NCC> showAll(){
        IMapper<NCC> mapper = new NCCMapper();         
        String sql = "select * from ncc";
        
        List<NCC> list = query(sql, mapper);
     
        return list;
    }
    @Override
    public void add(NCC ncc){
        String sql = "insert into ncc(ten, email, sdt, dia_diem) values (?,?,?,?)";
        insert(sql, ncc.getTen(), ncc.getEmail(), ncc.getSDT(), ncc.getDiaDiem());
    }
    @Override
    public void update(NCC ncc){
        String sql = "update ncc set ten = '"+ncc.getTen()+"', email = '"+ncc.getEmail()+"', sdt = '"+ncc.getSDT()+"', dia_diem = '"+ncc.getDiaDiem()+"' where ID = ?";
        update(sql, ncc.getID());
    }
    @Override
    public void delete(NCC ncc){
        String sql = "delete from ncc where ID = ?";
        delete(sql, ncc.getID());
    }
    @Override
    public NCC getByID(int ID){
        IMapper<NCC> mapper = new NCCMapper();         
        String sql = "select * from ncc where id = ?";
        
        List<NCC> list = query(sql, mapper, ID);
     
        return list.isEmpty() ? null : list.get(0);
    
    }
}
