package psd3.sprint2.object;

public class SessionSetupLogin {
String login;
String password;

public SessionSetupLogin() {
	
}

public SessionSetupLogin(String login, String password){
	this.login=login;
	this.password=password;
	
}
public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
	
}
