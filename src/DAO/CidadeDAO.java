/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno
 */
public class CidadeDAO implements GenericoDAO<Cidade> {

    @Override
    public List<Cidade> select() {
            
        List<Cidade> cidades = new ArrayList();
        
        try {
            
            Connection conn = Conexao.getConn();
            
            String sql = "SELECT * FROM Cidade";
            
            PreparedStatement stm = conn.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                
                Cidade cidade= new Cidade();
                cidade.setId(rs.getInt("id"));
                cidade.setNome(rs.getString("nome"));
                cidade.setEstado(rs.getString("estado"));
                cidade.setPais(rs.getString("pais"));
                cidade.setPopulacao(rs.getInt("populacao"));
                
                
                        
                       
                
                cidades.add(cidade);
                
            }
            rs.close();
            stm.close();
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cidades;



    }

    @Override
    public boolean insert(Cidade cidade) {
       String sql = "insert into cidade(id, nome, estado, pais, populacao) values (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = Conexao.getConn().prepareStatement(sql);
            ps.setInt(1, cidade.getId());
            ps.setString(2, cidade.getNome());
            ps.setString(3, cidade.getEstado());
            ps.setString(4, cidade.getPais());
            ps.setInt(5, cidade.getPopulacao());
            
            int resposta = ps.executeUpdate();
            
            if(resposta>0) return true;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
        
    }

    @Override
    public boolean delete(int id) {
    boolean resposta = false;
        Connection conn = Conexao.getConn();
        
        
        try{
         
        String sql = "delete from cidade where id=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setInt(1, id );
        
       int resultado = stm.executeUpdate();
        
        System.out.println(resultado);
        conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resposta;
    
            }

    @Override
    public boolean update(Cidade cidade) {

  boolean resposta = false;
        try {
            Connection conn =  Conexao.getConn();
            String sql = "UPDATE cidade SET nome = ?, estado = ?, pais = ?, populacao = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cidade.getNome());
            ps.setString(2, cidade.getEstado());
            ps.setString(3, cidade.getPais());
            ps.setInt(4, cidade.getPopulacao());
           
            
            int resp = ps.executeUpdate();
            
            if(resp>0) resposta = true;
            
            ps.close();
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return resposta;


    }

    @Override
    public Cidade select(int id) {

    List<Cidade> cidades = new ArrayList();
        
        try {
            
            Connection conn = Conexao.getConn();
            
            String sql = "SELECT * FROM Cidade WHERE ID = ?";
            
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setInt(1, id);
            
            ResultSet rs = stm.executeQuery();
            
            rs.next();
                
                Cidade cidade= new Cidade();
                cidade.setId(rs.getInt("id"));
                cidade.setNome(rs.getString("nome"));
                cidade.setEstado(rs.getString("estado"));
                cidade.setPais(rs.getString("pais"));
                cidade.setPopulacao(rs.getInt("populacao"));
                
                
                        
                       
                
          
                
            
            rs.close();
            stm.close();
            conn.close();
            
             return cidade;
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        return null;



    }

    @Override
    public Cidade select(String nome) {

List<Cidade> cidades = new ArrayList();
        
        try {
            
            Connection conn = Conexao.getConn();
            
            String sql = "SELECT * FROM Cidade WHERE nome = ?";
            
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setString(1, nome);
            
            ResultSet rs = stm.executeQuery();
            
            rs.next();
                
                Cidade cidade= new Cidade();
                cidade.setId(rs.getInt("id"));
                cidade.setNome(rs.getString("nome"));
                cidade.setEstado(rs.getString("estado"));
                cidade.setPais(rs.getString("pais"));
                cidade.setPopulacao(rs.getInt("populacao"));
                
                
                        
                       
                
          
                
            
            rs.close();
            stm.close();
            conn.close();
            
             return cidade;
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        return null;





    }
    
}
