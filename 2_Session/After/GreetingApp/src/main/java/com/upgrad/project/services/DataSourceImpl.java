package com.upgrad.project.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dataSource")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DataSourceImpl {
     public DataSourceImpl(){
         System.out.println("DataSourceImpl()  called");
     }

}
