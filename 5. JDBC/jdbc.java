import java.sql.*;


public class Jdbc {
    public static void main(String[] args) throws Exception{
        /*
            import package
            load and register driver
            create connection
            create statement
            execute statement
            close
         */

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        String query = "Select * from student";

        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            System.out.print(rs.getInt(1) + "-");
            System.out.println(rs.getString(2));
        }

        // For cud operations use PrepareStatement just change statement with PrepareStatement
        
        con.close();

    }
}
