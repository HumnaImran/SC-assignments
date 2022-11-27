/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;
import java.util.*; 

class login{
    private
    int login_id;
    String username;
    String status;
    int pin;
    public 
     login(int i, String u, String s, int p)
            
    {
        login_id=i;
        username=u;
        status=s;
        pin=p;
        
        
        
    }
    
    int getloginid(){
        return login_id;
        
    
}
     String getusername(){
        return username;
    
}
       String getstatus(){
        return status;
        
    
}
         int getpin(){
        return pin;
        
    
}
    void setloginid(int i){
        login_id=i;
    }
     void setusername(String u){
      username=u;
    }
      void setStatus(String s){
          status=s;
          
      }
        
       void setpin(int p){
      pin=p;
    }
}
abstract class Employe{    //information hiding through abstract class
           abstract void display();
    
}
class  full_time_employees extends Employe{
     private
    String E_name;
    int E_id;
   long E_celno;
    String E_Address;
int E_Salary;
String benefits;

public 
      full_time_employees(String n, int i, long c,int s,String a, String b){
    E_name=n;
    E_id=i;
    E_celno=c;
    E_Salary=s;
    E_Address=a;
    benefits=b;
    
    
    
    
}
        void display()
{ System.out.println("............Full time Employees...........");
   System.out.println("The name of employe is "+E_name +"\n id of Employe is "+ E_id+ " \nAddress of employe is "+E_Address+ "\n Salary of employe is "+ E_Salary + " \nCell no of Employe is "+ E_celno);
}
    
    
}

class  part_time_employees extends Employe{  //inheritance
     private
    String E_name;
    int E_id;
   long E_celno;
    String E_Address;
int E_Salary;
String benefits;

public 
      part_time_employees(String n, String a, int i, long c,int s, String b){
    E_name=n;
    E_id=i;
    E_celno=c;
    E_Salary=s;
    E_Address=a;
    benefits=b;
    
    
    
    
}
        void display()
{
    System.out.println("............Part time Employees...........");
    System.out.println("The name of employe is "+E_name +"\n id of Employe is "+ E_id+ " \nAddress of employe is "+E_Address+ "\n Salary of employe is "+ E_Salary + " \nCell no of Employe is "+ E_celno);
}
    
    
}
class department{
    private
            String d_name;
    String d_place;
    String d_type;
    List<Employe>Employes; //aggregation 
    public
            department(String n, String p, String t, List<Employe>Employes){
        this.Employes=Employes;
        
    }
    public List<Employe>GetEmploye(){
        return Employes;
    }
    
}
 class company{
     private
     String company_name;
     List<department>departments;
     company(String company_name,  List<department>departments ) //aggregation
     {
         this.company_name=company_name;
         this.departments=departments;
     }
     public  int gettotalEmployessincompany(){
         int no_of_Employee=0;
         List<Employe>Employes;
         for(department dept: departments)
         {
             Employes=dept.GetEmploye();
             
             for( Employe e:Employes)
             {
                 no_of_Employee++;
             }
             
         }
         return  no_of_Employee;
     }
     
     
     
 }
class salary  {
   List<Employe>Employes; //composition
   int salary;
   salary( int s ,  List<Employe>Employes ){
       salary=s;
       this.Employes=Employes;
       
       
   }
   
 int getsalary(){
      return salary;
  }
 
 
  
}
class training{
    private
    String T_name;
    String t_type;
   String T_description;
   int year;
   List<Employe>Employes; //composition
   public
   training(String n, String t, String d, int y, List<Employe>Employes){
       T_name=n;
       t_type=t;
       T_description=d;
       year=y;
       this.Employes=Employes;
       
       
   }
  String get_taining_name()
  {
      return T_name;
      
  }
   String get_taining_type()
  {
      return t_type;
      
  }
    String get_taining_description()
  {
      return T_description;
      
  }
    int get_taining_year()
  {
      return year;
      
  }
    void display(){
        for(Employe Employe: Employes)
        {
        System.out.println("the training of "+ Employe );
    }
    
}}

/**
 *
 * @author Dell
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(" ...................Developed by Humna Imran(20-Arid-768).........................");
        full_time_employees e1=new full_time_employees("Humna", 768, 0 ,2000,  "0-1082-A", "Medical");
          full_time_employees e2=new full_time_employees("Asna",756, 0 ,2000,  "0-1082-B", "Medical");
            full_time_employees e3=new full_time_employees("Zain", 821, 0 ,2000,  "0-1082-C", "Medical");
              full_time_employees e4=new full_time_employees("sadeem", 708, 0 ,2000,  "0-1082-D", "Medical");
              part_time_employees e5=new part_time_employees("sajeeha","0-1082-A", 768, 0 ,2000, "Medical");
               part_time_employees e6=new part_time_employees("sara","0-1082-A", 768, 0 ,2000, "Medical");
                part_time_employees e7=new part_time_employees("rameen","0-1082-A", 768, 0 ,2000, "Medical");
                 part_time_employees e8=new part_time_employees("abdullah","0-1082-A", 768, 0 ,2000, "Medical");
                 e1.display();
                  e2.display();
                   e3.display();
                    e4.display();
                     e5.display();
                      e6.display();
                       e7.display();
                        e8.display();
                            List<department> departments = new ArrayList<department>();
                            company c = new company("BITS", departments);
                            System.out.print(c.gettotalEmployessincompany());
                             
                 
                 List<Employe>Employes=new ArrayList<Employe>();
                 training t1=new training("finance", "web development", " lengthy", 2022, Employes  );
                 t1.display();
                 
                 
                 
         
              
        // TODO code application logic here
    }
}
