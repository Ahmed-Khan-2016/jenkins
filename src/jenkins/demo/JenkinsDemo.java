/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author galibahmed
 */
public class JenkinsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(JenkinsDemo.class.getName());
        logger.log(Level.INFO, "This is message 1");
        logger.log(Level.WARNING, "This is message 2");
   }
    
}
