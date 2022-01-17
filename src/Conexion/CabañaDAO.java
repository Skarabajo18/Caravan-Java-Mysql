
package Conexion;


import Modelo.Cabaña;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CabañaDAO {
    
    public ArrayList <Cabaña> obtenerTodo()
    {
        ArrayList <Cabaña> caba=new ArrayList<Cabaña>();
        try {
            
            Connection con=Conexion.getConexion();
            String query="select * from cabanas";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            
            Cabaña caban;
            while(rs.next())
            {
                caban=new Cabaña(rs.getString(1), rs.getInt(2), rs.getInt(3),rs.getBoolean(4));
                caba.add(caban);
            }
            ps.close();
                
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CabañaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return caba;
    }
    
    public boolean ingresarCabaña(Cabaña caban)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="Insert into cabanas(numeroDeCabaña,cantidadDeCamas,CantidadDeDias,todoIncluido) values (?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setString(1, caban.getNumeroDeCabaña());
            ps.setInt(2, caban.getCantidadDeCamas());
            ps.setInt(3, caban.getCantidadDeDias());
            ps.setBoolean(4, caban.isTodoIncluido());
           
            
            
            resultado=ps.executeUpdate()==1;
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CabañaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
     
    public Cabaña buscarCabaña(String numeroDeCabaña)
    {
        Cabaña caban=null;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from cabanas where numeroDeCabaña='"+numeroDeCabaña+"'";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                caban=new Cabaña(rs.getString(1), rs.getInt(2), rs.getInt(3),rs.getBoolean(4));
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CabañaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return caban;
        
    }
        
        
    
    
}

