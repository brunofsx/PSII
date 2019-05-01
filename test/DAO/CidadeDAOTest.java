/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cidade;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class CidadeDAOTest {
    
    public CidadeDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of select method, of class CidadeDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        CidadeDAO instance = new CidadeDAO();
        List<Cidade> expResult = null;
        List<Cidade> result = instance.select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class CidadeDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Cidade cidade = null;
        CidadeDAO instance = new CidadeDAO();
        boolean expResult = false;
        boolean result = instance.insert(cidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CidadeDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Cidade t = null;
        CidadeDAO instance = new CidadeDAO();
        boolean expResult = false;
        boolean result = instance.delete(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CidadeDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Cidade t = null;
        CidadeDAO instance = new CidadeDAO();
        boolean expResult = false;
        boolean result = instance.update(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
