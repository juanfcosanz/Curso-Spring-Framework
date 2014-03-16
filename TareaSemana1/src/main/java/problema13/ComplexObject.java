package problema13;

import java.util.Properties;

public class ComplexObject {
	
	private Properties administrator;
	private Properties support;
	
	public void setAdminEmails(String adminEmails, Properties administrator, Properties support) {
	
		this.administrator = administrator;
		this.support = support;
	}


	public Properties getAdministrator() {
		return administrator;
	}


	public Properties getSupport() {
		return support;
	}
	
	
	
	
	
	
	
	
	
	
}
