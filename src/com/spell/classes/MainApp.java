package com.spell.classes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
Checker ch = (Checker)context.getBean("textEditor");
ch.spellCheck();
	}

}
