package com.hcl.ProjectMaven;

public class App 
{
    public static void main( String[] args )
    {
       Employee e1 = new Employee();
       e1.setId(1);
       e1.setName("Sam");
       e1.setAddress("NC");
      
       System.out.println(e1.getId()+e1.getName()+e1.getAddress());
    }
}
