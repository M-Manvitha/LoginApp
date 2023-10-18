package com.Login;

import java.util.ResourceBundle;

public class AppLogin {
int checkLogin(String un,String pwd)
{
	ResourceBundle rb=ResourceBundle.getBundle("config");
	String uname=rb.getString("username");
	String pass=rb.getString("password");
	if(un.equals(uname) && pwd.equals(pass))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
}
