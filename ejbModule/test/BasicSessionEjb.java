package test;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class BasicSessionEJB
 */
@Stateless( mappedName="ejb/BasicSessionEJB" )
public class BasicSessionEJB implements BasicSessionEJBRemote {

    /**
     * Default constructor. 
     */
    public BasicSessionEJB() {
        // TODO Auto-generated constructor stub
    }
    public String getMessage() {
        return "Hello, EJB Wolrd!";
   }

}
