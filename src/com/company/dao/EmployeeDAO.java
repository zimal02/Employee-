/*package com.company.dao;
import com.company.util.DBConnection;
import java.sql.*;
public class EmployeeDAO{
    public <Employee> void addEmployee(Employee emp){
        String sql="insert into employee(name,department,salary,mobilenum,dob) values(?,?,?)";
        try(
                Connection co=DBConnection.getConnection();
                PreparedStatement ps= co.prepareStatement(sql);
                ){
            System.out.println("Employee Added Successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}*/