/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import DAO.CidadeDAO;
import Model.Cidade;
import io.dropwizard.jersey.params.IntParam;
import io.dropwizard.jersey.params.LongParam;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    
    
     @POST
    public boolean create(Cidade cidade) {
        return this.dao.insert(cidade);
    }
    
     @GET
    public List<Cidade> read() {
        return dao.select();
    }
    
    @GET
    @Path("{id}")
    public Cidade readOne(@PathParam("id") IntParam id) {
        int idProfessor = id.get();
        // Precisa implementar no DAO
        return dao.select(idProfessor);
    }
    
 /*    @GET
    @Path("{id/nome}")
    public Cidade readTwo(@PathParam("nome") String nome) {
        String NomeProfessor = nome;
        // Precisa implementar no DAO
        return dao.select(nome);
    }
    
  */ 
    
    
    @PUT
    @Path("{id}")
   public boolean update(@PathParam("id") LongParam id, Cidade cidade) {
     return dao.update(cidade);
    }
    
    @DELETE
    @Path("{id}")
    public boolean delete(@PathParam("id") IntParam id) {
       
        
        return dao.delete(id.get());
        
    }
    
    
    
    
}
