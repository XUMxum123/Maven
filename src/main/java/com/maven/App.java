package com.maven;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.managerdao.UserDao;
import com.xum.AmericaPerson;
import com.xum.ChinesePerson;
import com.xum.ParseXml;

public class App 
{
	private static ApplicationContext context;
	
    public static void main(String[] args)
    {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //beanContext(context);       
        //parseXml();
        //attribute(context);
        internationlization(context);
    }
    
    private static void internationlization(ApplicationContext context) {
    	String[] name = {"welcome"};
    	String welcome = context.getMessage("welcome", name, Locale.getDefault());
    	System.out.println("welcome=" + welcome);
    }
    
    private static void attribute(ApplicationContext context) {
    	UserDao userDao = (UserDao)context.getBean("userDao");
    	//System.out.println(userDao.toString());
    	System.out.println(userDao.println());
    }
    
    private static void beanContext(ApplicationContext context) {
        ChinesePerson chinesePerson = (ChinesePerson)context.getBean("chineseperson");
        AmericaPerson americaPerson = (AmericaPerson)context.getBean("americaperson");
        System.out.println("chinesePerson="+chinesePerson.sayLanguage());
        System.out.println("americaPerson="+americaPerson.sayLanguage());
    }
    
    private static void parseXml() {
        ParseXml parseXml = new ParseXml();
        try {
        		parseXml.createXML();
        		parseXml.readXML();
        } catch(Exception e) {
        		e.printStackTrace();
        }
    }
}
