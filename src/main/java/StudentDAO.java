import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class StudentDAO {
    public Student getStudent(int id ){
        try{
            String query = "select id,name,age,course from student where id = " + id;
            System.out.println(query);
            Student s = new Student();
            s.id = id;
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                s.id = rs.getInt("id");
                s.name = rs.getString("name");
                s.age = rs.getInt("age");
                s.course = rs.getString("course");
                return s;
            }else System.out.println("No record");
            rs.close();
            st.close();
            con.close();
            //String name = rs.getString(1);
            //s.name = name;
            //return s;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
