package mum.domain;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 3678107792576131001L;
	private String name;
	private String password;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
