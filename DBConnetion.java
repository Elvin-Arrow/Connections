
public class DBConnection {
  public static void main(String[] args) {
    try {
      //Establish connection
      Driver mysqldriver = new com.mysql.cj.jdbc.Driver();
      DriverManager.registerDriver(mysqldriver);
      Connection mysqlConnection;
      mysqlConnection = DriverManger.getConnection("jdbc:mysql:127.0.0.1:3306/sakila", "root", "");

      //Write querries
      Statement sqlstmt = mysqlConnection.createStatement();
      //Select query
      ResultSet resultantTable = sqlstmt.executeQuerry("select * from actor");
      //To update

      //Use this:
      int i = sqlstmt.executeUpdate("Update Actor set first_name = 'JOHN' where actor_id = 1");

      //Display result
      while (resultantTable.next()) {
        System.out.println(resultantTable.getInt(1) + " " + resultantTable.getString(2) + " "
        + resultantTable.getString(3) + " " + resultantTable.getString(4));
      }
    }catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
