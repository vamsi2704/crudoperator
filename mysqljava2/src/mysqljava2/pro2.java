package mysqljava2;
import java.sql.*;
import java.util.Scanner;
public class pro2 
{
		    public void create() {
			try{ Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation","root","Kolli12para."); 
			Statement st=con.createStatement(); 
			st.executeUpdate(("insert into crud_employee values(8,'Ajay','support','70000','4')"));
			con.close();
			} 
			catch(Exception e)
			{ 
				System.out.println(e.toString());
			}
			}   
		
		
		    public void read() {
			try{ Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation","root","Kolli12para."); 
			Statement st=con.createStatement(); 
			ResultSet rs=st.executeQuery("select * from crud_employee");
			while(rs.next())
			{
			   System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)); 
			} 
			} 
			catch(Exception e)
			{ 
				System.out.println(e.toString());
			}
		    }
		    
		    
		    public void update() {
		    try{ Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation","root","Kolli12para."); 
		    Statement st=con.createStatement(); 
			st.executeUpdate("update crud_employee set salary= salary+20000 where emp_id=8"); 		
		    con.close(); 
		    } 
		    catch(Exception e)
			{ 
		       System.out.println(e.toString());
			}
		    }
		    
		    public void delete() {
		    try{ Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation","root","Kolli12para."); 
		    Statement st=con.createStatement(); 
			st.executeUpdate("delete from crud_employee where emp_id=8"); 		
			con.close(); 
			} 
			catch(Exception e)
			{ 
			   System.out.println(e.toString());
			}
			}
		
		public static void main(String args[])
		{
			  int a;
			   System.out.println("Select an option");
			   Scanner sc=new Scanner(System.in);
			   a=sc.nextInt();
			   pro2 c=new pro2();
			   switch(a) {
			   case 1:
			         System.out.println("Create");
			          c.create();
			         break;
			   case 2:
			         System.out.println("read");
			         c.read();
			         break;
			   case 3:
			         System.out.println("update");
			         c.update();
			         break;
			   case 4:
			         System.out.println("delete");
			         c.delete();
			         break;
			  default:
				     System.out.println("please select the correct option");
			         break;
		}
		}
	}
	
