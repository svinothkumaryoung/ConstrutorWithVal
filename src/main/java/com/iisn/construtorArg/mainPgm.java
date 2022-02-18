package com.iisn.construtorArg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainPgm {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("construtorVal.xml");
        PojoClass pc=(PojoClass) ac.getBean("obj2");
        pc.printData1();
    }

}
