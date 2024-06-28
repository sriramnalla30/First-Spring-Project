package com.nipuna;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class Test 
{
	public static void main(String args[])
	{
	   Resource resource=new ClassPathResource("applicationContext.xml");  //where to find the xml file
	   BeanFactory factory=new XmlBeanFactory(resource); //is responsible for instantiating, configuring, 
	    												 //and assembling the beans inthe xml file	
	      
	    Student student=(Student)factory.getBean("studentbean");// here it  acceses the bean ID
	    												//        studentbean and assings the object to the student instance
	    student.displayInfo();  
}
	
}