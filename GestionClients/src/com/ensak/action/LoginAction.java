package com.ensak.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;  
import org.apache.struts2.interceptor.SessionAware;

public class LoginAction extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String password;
	SessionMap<String,String> sessionmap;  

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
	@Override
	public String execute(){
	    if(login.equals("admin") && password.equals("admin")) {  
	        return "success";  
	    }  
	    else{  
	        return "error";  
	    }  
	}  

	public void setSession(Map map) {  
	    sessionmap = (SessionMap)map;  
	    sessionmap.put("login","true");  
	}  
	  
	public String logout(){  
	    sessionmap.invalidate();  
	    return "success";  
	}  
}
