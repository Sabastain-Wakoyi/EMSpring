package org.snva.emspring.config;


import org.snva.emspring.Runner;
import org.snva.emspring.bean.Employee;
import org.snva.emspring.readutils.ReadUtil;
import org.snva.emspring.services.EmployeeServiceImpl;
import org.snva.emspring.uiservice.EmployeeUIServiceImpl;
import org.springframework.context.annotation.Bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserConfig {

    @Bean(name="reader")
    public BufferedReader getBufferedReader(){
       return new BufferedReader(new InputStreamReader(System.in));
    }

    @Bean(name="employee")
    public List<Employee> getEmployees(){
        return new ArrayList<Employee>();
    }

    @Bean(name = "runner")
    public Runner getRunner(){
        return new Runner();
    }

    @Bean(name = "readUtil")
    public ReadUtil getReadUtil(){
        return new ReadUtil();
    }

    @Bean(name = "employeeUIServiceImpl ")
    public EmployeeUIServiceImpl getEmployeeUIServiceImpl(){
        return new EmployeeUIServiceImpl();
    }

    @Bean(name = "employeeServiceImpl")
    public EmployeeServiceImpl getEmployeeServiceImpl(){
        return new EmployeeServiceImpl();
    }


}
