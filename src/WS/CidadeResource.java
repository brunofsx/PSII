/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import DAO.CidadeDAO;
import Model.Cidade;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author bruno
 */
@Path("/cidades")
@Produces(MediaType.APPLICATION_JSON)
public class CidadeResource {
    
    private CidadeDAO dao;
    
    public CidadeResource(CidadeDAO dao) {
        this.dao = dao;
    }
    
     @GET
    public List<Cidade> read() {
        return dao.select();
    }
    
    
}
