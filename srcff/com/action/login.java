package com.action;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;



public class login {
	 private String uname;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String demglu(){
	    HttpServletRequest request=ServletActionContext.getRequest();
	  
	    
	   System.out.println("执行了登录");
       
	   String result="";
	   if(uname.equals("123")){
	     result = "sucess";	   
	   }
	   else {
		result = "failed";
	}
	   return result;
   }
	public static void main(String[] args) {
		Class c=login.class;
		Field f[]=c.getDeclaredFields();
		for(Field fs:f){
			System.out.println(fs.getType().getSimpleName());
			System.out.println(fs.getName());
		}
		
	}
}
