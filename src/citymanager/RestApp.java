/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citymanager;

import DAO.CidadeDAO;
import WS.CidadeResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

/**
 *
 * @author bruno
 */
public class RestApp extends Application<Configuration> {
    
    public static void main(String[] args) throws Exception {
        new RestApp().run(new String[] { "server" });

    }
    
    @Override
    public void run(Configuration configuration, Environment environment) {
        CidadeDAO dao = new CidadeDAO();
        environment.jersey().register(new CidadeResource(dao));
    }
    
    
}
