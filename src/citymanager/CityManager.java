/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citymanager;

import DAO.CidadeDAO;
import Model.Cidade;
import java.util.List;

/**
 *
 * @author bruno
 */
public class CityManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cidade cidade1 = new Cidade(1, "São Paulo", "São Paulo", "Brasil", 200000000);
        CidadeDAO cidadeDAO = new CidadeDAO();
        
      
        cidadeDAO.insert(cidade1);
       // cidadeDAO.delete(cidade1);
       
       
      List<Cidade> cidades = cidadeDAO.select() ;
        
     
        
        
        for (Cidade l : cidades ) {
            
            System.out.println(l);
            
        }
        
        
    }
    
}
