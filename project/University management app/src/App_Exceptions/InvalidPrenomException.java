/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package App_Exceptions;

/**
 *
 * @author amir,chedi,nour
 */
public class InvalidPrenomException extends Exception {
     @Override 
    public String getMessage()
    {
      return "nom or prenom invalid " ; 
    }
    
}
