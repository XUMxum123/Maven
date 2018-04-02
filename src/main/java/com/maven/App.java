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
    	/* 语言加代码	   语言加国家
			zh_CN	中文简体，中国
			zh_TW	中文繁体，台湾
			zh_HK	中文繁体，香港
			en_US	英语，美国
			en_GB	英语，英国
			es_ES	西班牙
			es_US	西班牙语，美国
			en_ZA	英语，津巴布韦*/
    	String[] name = {"welcome"};
    	//String welcome = context.getMessage("welcome", name, Locale.getDefault());
    	//String welcome = context.getMessage("welcome", name, Locale.US);
    	String welcome = context.getMessage("welcome", name, Locale.TAIWAN);
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
