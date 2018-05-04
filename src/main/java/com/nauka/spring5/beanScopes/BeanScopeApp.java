package com.nauka.spring5.beanScopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		//zaladowanie pliku konfiguracji Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//za³adowanie Bean'ów z kontekstu
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//sprawdzenie czy dwa powyzsze Bean'y s¹ t¹ sam¹ instancj¹
		System.out.println("Ten sam obiekt: " + (theCoach == alphaCoach));
		
		//za³adowanie Bean'ów typu prototype z kontekstu
		Coach theCoach2 = context.getBean("otherCoach", Coach.class);
		Coach alphaCoach2 = context.getBean("otherCoach", Coach.class);
		
		//sprawdzenie czy dwa powyzsze Bean'y s¹ t¹ sam¹ instancj¹
		System.out.println("Ten sam obiekt 2: " + (theCoach2 == alphaCoach2));
		
		context.close();
	}
}
