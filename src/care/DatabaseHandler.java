package care;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DatabaseHandler {
     Connection connect = null;
     public void connectDatabase(){
        try{
            connect = DriverManager.getConnection("jdbc:mysql://localhost/disability","root","");
            System.out.println("Successfully Connected to Mysql");

        }catch(Exception e){
            System.out.println("Not Connected..");
            e.printStackTrace();
        }
    }
      public static Connection connectDatabase1(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/disability","root","");
            System.out.println("Successfully Connected to Mysql");
            return conn;

        }catch(Exception e){
            System.out.println("Not Connected..");
            e.printStackTrace();
            return null;
        }
    }
     

      /*   public ResultSet testQuery(){
            ResultSet resultSet = null;
        try{
            String query = "SELECT * FROM user";
            Statement statement ;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            
//            String query = "SELECT * FROM student WHERE student_name =? and id_student =?";
//            PreparedStatement pStatement = connect.prepareStatement(query);
//            pStatement.setString(1, "ABC");
//            pStatement.setString(2, "1");
//            resultSet = pStatement.executeQuery();
            
            System.out.println("Successfully Done Query..");
           
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }           
        return resultSet;
    }
    
    public void showResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("u_id");
                String fname = resultSet.getString("fname");
                String lname = resultSet.getString("lname");
                String username = resultSet.getString("username");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String birth = resultSet.getString("birth");
                String gender = resultSet.getString("gender");         
                System.out.println(id + " " + fname + " " + lname +" "+ username +" "+ phone +" "+ email +" "+ birth +" "+ gender);
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }*/
     public void patientinsertData(String first_name,String last_name,String username,String password,String repassword,String gender,String birthdate,String address,String mobile,String disability){
        try{
            String query = "INSERT INTO patient(first_name,last_name,username,password,repassword,gender,birthdate,address,mobile,disability) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1, first_name);
            pStatement.setString(2, last_name);
            pStatement.setString(3, username);
            pStatement.setString(4, password);
            pStatement.setString(5, repassword);
            pStatement.setString(6, gender);
            pStatement.setString(7, birthdate);
            pStatement.setString(8, address);
            pStatement.setString(9, mobile);
            pStatement.setString(10, disability);
              
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");           
        }catch(Exception e){
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
          public void doctorinsertData(String first_name,String last_name,String username,String password,String repassword,String gender,String birthdate,String address,String mobile){
        try{
            String query = "INSERT INTO doctor(first_name,last_name,username,password,repassword,gender,birthdate,address,mobile) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1, first_name);
            pStatement.setString(2, last_name);
            pStatement.setString(3, username);
            pStatement.setString(4, password);
            pStatement.setString(5, repassword);
            pStatement.setString(6, gender);
            pStatement.setString(7, birthdate);
            pStatement.setString(8, address);
            pStatement.setString(9, mobile);
              
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");           
        }catch(Exception e){
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
           public void othersinsertData(String first_name,String last_name,String username,String password,String repassword,String gender,String birthdate,String address,String mobile){
        try{
            String query = "INSERT INTO others(first_name,last_name,username,password,repassword,gender,birthdate,address,mobile) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1, first_name);
            pStatement.setString(2, last_name);
            pStatement.setString(3, username);
            pStatement.setString(4, password);
            pStatement.setString(5, repassword);
            pStatement.setString(6, gender);
            pStatement.setString(7, birthdate);
            pStatement.setString(8, address);
            pStatement.setString(9, mobile);
              
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");           
        }catch(Exception e){
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
           
           public void patientupdateData(String first_name,String last_name,String username,String password,String repassword,String gender,String birthdate,String address,String mobile,String disability){
               try{
                   
                   String query = "Update patient set first_name='"+first_name+"',last_name='"+last_name+"',username='"+username+"',password='"+password+"',repassword='"+repassword+"',gender='"+gender+"',birthdate='"+birthdate+"',address='"+address+"',mobile='"+mobile+"',disability='"+disability+"' where username='"+username+"'";
                   //pst = conn.prepareStatement(query);
                   //pst.execute();
                   PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1, first_name);
            pStatement.setString(2, last_name);
            pStatement.setString(3, username);
            pStatement.setString(4, password);
            pStatement.setString(5, repassword);
            pStatement.setString(6, gender);
            pStatement.setString(7, birthdate);
            pStatement.setString(8, address);
            pStatement.setString(9, mobile);
              
            pStatement.executeUpdate();
            
                   JOptionPane.showMessageDialog(null,"Updated");
               }
               catch(Exception e){
                   System.out.println("Error in updating");
                    e.printStackTrace();
               }
               
           }
          public void test(String username){
        try{
            Statement stat = connect.createStatement();
            String selectQuery = "SELECT count(*) from patient where username ='"+username+"'";
            ResultSet rs =stat.executeQuery(selectQuery);
        if(rs.next()){
            JOptionPane.showMessageDialog(null,"Username already taken","Access Denied",JOptionPane.ERROR_MESSAGE);
           System.out.print("not ok");
            
        }       
     }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }      
     }
}

