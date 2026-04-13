/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.register_login;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class userAuthenticatorTest {
    
    public userAuthenticatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class userAuthenticator.
     */
    @Test
    public void testCheckusername() { 
        
        System.out.println("checkusername");
        String username = "";
        userAuthenticator instance = new userAuthenticator();
        boolean expResult = false;
        boolean result = instance.checkusername(username);
        assertEquals(expResult, result); 
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkPassword method, of class userAuthenticator.
     */
    @Test
    public void testCheckpassword() {
        System.out.println("checkpassword");
        String password = "";
        userAuthenticator instance = new userAuthenticator();
        boolean expResult = false;
        boolean result = instance.checkpassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkCellphone_number method, of class userAuthenticator.
     */
    @Test
    public void testCheckcellphone_number() {
        System.out.println("checkcellphone_number");
        String cellphone_number = "";
        userAuthenticator instance = new userAuthenticator();
        boolean expResult = false;
        boolean result = instance.checkcellphone_number(cellphone_number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerUser method, of class userAuthenticator.
     */
    @Test
    public void testRegisteruser() {
        System.out.println("registeruser");
        userAuthenticator instance = new userAuthenticator();
        instance.registeruser();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of userLogin method, of class userAuthenticator.
     */
    @Test
    public void testUserlogin() {
        System.out.println("userlogin");
        userAuthenticator instance = new userAuthenticator();
        instance.userlogin();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
