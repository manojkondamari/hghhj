package com.mano.bde.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext cont=new ClassPathXmlApplicationContext("com/mano/bde/first/configmeta.xml");
        
        Customers customerDetails=(Customers)cont.getBean("cus");
        Orders orderDetails=(Orders)cont.getBean("ord");
        
        System.out.println(customerDetails.getCustomerName());
        System.out.println(customerDetails.getCustomerAddress());
        System.out.println(customerDetails.getCustomerId());
        System.out.println(customerDetails.getOrderId());
        
        System.out.println(orderDetails.getProductId());
        System.out.println(orderDetails.getProductName());
        System.out.println(orderDetails.getDate());
        
        Customers cust=(Customers)cont.getBean("cus2");
        System.out.println(cust.getCustomerName());
        System.out.println(cust.getCustomerId());
    }
}
