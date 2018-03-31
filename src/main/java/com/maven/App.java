package com.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xum.AmericaPerson;
import com.xum.ChinesePerson;
import com.xum.ParseXml;

public class App 
{
	private static ApplicationContext context;
	
    public static void main(String[] args)
    {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ChinesePerson chinesePerson = (ChinesePerson)context.getBean("chineseperson");
        AmericaPerson americaPerson = (AmericaPerson)context.getBean("americaperson");
        System.out.println("chinesePerson="+chinesePerson.sayLanguage());
        System.out.println("americaPerson="+americaPerson.sayLanguage());
        
        ParseXml parseXml = new ParseXml();
        try {
        		parseXml.createXML();
        		parseXml.readXML();
        } catch(Exception e) {
        		e.printStackTrace();
        }
        
    }
}
