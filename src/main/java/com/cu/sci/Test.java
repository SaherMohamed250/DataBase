package com.cu.sci;

import com.cu.sci.Dao.DBEmployee;
import com.cu.sci.models.Employee;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        DBEmployee db= new DBEmployee();
//        for(Employee employee : db.get()){
//            System.out.println(employee);
//        }
//        System.out.println(db.get(101));
        Employee employee = new Employee();
        employee.setFirstName("Saher");
        employee.setLastName("Mohamed");
        employee.setEmail("saher@gmail.com");
        employee.setJobId("SH_CLERK");
        employee.setSalary(16000);
        employee.setDepartmentId(50);
        employee.setHireDate(new Date());
//sc/
        System.out.println(db.insert(employee));
    }
}
