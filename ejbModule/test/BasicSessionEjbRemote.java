package test;

import javax.ejb.Remote;

@Remote
public interface BasicSessionEJBRemote {
	String getMessage();
}
