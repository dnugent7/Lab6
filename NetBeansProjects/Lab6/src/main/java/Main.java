/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AsuS
 */
public class Main {
    private String name;
   private int idNumber;
   private String department ;
   private String position;

   //constructor with 4 fields
   public Main(String name, int idNumber, String department, String position) {
       super();
       this.name = name;
       this.idNumber = idNumber;
       this.department = department;
       this.position = position;
   }
  
   public Main(String name, int idNumber) {
       super();
       this.name = name;
       this.idNumber = idNumber;
       this.department = "";
       this.position = "";
   }
  
   public Main() {
       super();
       this.name = "";
       this.idNumber = 0;
       this.department = "";
       this.position = "";
   }


   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public int getIdNumber() {
       return idNumber;
   }
   public void setIdNumber(int idNumber) {
       this.idNumber = idNumber;
   }
   public String getDepartment() {
       return department;
   }
   public void setDepartment(String department) {
       this.department = department;
   }
   public String getPosition() {
       return position;
   }
   public void setPosition(String position) {
       this.position = position;
   }
  

   public static void main(String[] args) {
       Employee emp = new Employee("Susan Meyers",47899,"Accounting","Vice President");
       Employee emp1 = new Employee("Mark Jones",39119,"IT","Programmer");
       Employee emp2 = new Employee("Joy Rogers",81774,"Manufacturing","Engineer");
      
       System.out.printf("%-20s%-20s%-20s%-20s\n","Name","ID Number","Department","Position");
       System.out.printf("%-20s%-20d%-20s%-20s\n",emp.getName(),emp.getIdNumber(),emp.getDepartment(),emp.getPosition());
       System.out.printf("%-20s%-20d%-20s%-20s\n",emp1.getName(),emp1.getIdNumber(),emp1.getDepartment(),emp1.getPosition());
       System.out.printf("%-20s%-20d%-20s%-20s\n",emp2.getName(),emp2.getIdNumber(),emp2.getDepartment(),emp2.getPosition());
      
   }

}
}
