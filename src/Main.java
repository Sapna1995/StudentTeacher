import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        insertTeacher();
        selectTeacher();
        updateTeacher();
        deleteTeacher();
        insertStudent();
        selectStudent1();
        deleteStudent();
        updateStudent();
    }

    static void insertTeacher()
    {

        Teacher teacher = new teacher();
        teacher.setT_id(sc.nextInt());
        teacher.setT_name(sc.next());
        teacher.setT_email(sc.next);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentTeacherJavaProject","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into Teacher values('"+teacher.getT_id()+"','"+teacher.getT_name()+"','"+teacher.getT_email()+"')");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    static void selectTeacher(int t_id)
    {
        Teacher teacher = new Teacher();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentTeacherJavaProject","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Teacher where t_+id = '"+t_id+"'");
            while (rs.next()){
                teacher.setT_id(rs.getInt(1));
                teacher.setT_name(rs.getString(2));
                teacher.setT_email(rs.getString(3));
            }
            System.out.println(teacher.getT_id());
            System.out.println(teacher.getT_name());
            System.out.println(teacher.getT_email());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    static void deleteTeacher()
    {
        int t_id = sc.nextInt();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentTeacherJavaProject","root","");
            Statement stmt = con.createStatement();
            int count = stmt.executeUpdate("delete from Teacher where t_id='"+t_id+"'");
            if(count>0){
                System.out.println("student is deleted from DB");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

static void updateTeacher()
        {
        Teacher teacher = new Teacher();
        teacher.setT_id(sc.nextInt());
        teacher.setT_name(sc.next());
        teacher.setT_email(sc.next);
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentTeacherJavaProject","root","");
        Statement stmt = con.createStatement();
        stmt.executeUpdate("update Teacher set name='"+teacher.get+"', email='"+stud1.getEmail()+"' where rollNo='"+stud1.getRollNo()+"'");
        selectTeacher(teacher.getT_id());
        }
        catch (Exception e){
        System.out.println(e);
        }
        }
static void deleteStudent()
        {
        int rollNo = sc.nextInt();
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentTeacherJavaProject","root","");
        Statement stmt = con.createStatement();
        int count = stmt.executeUpdate("delete from Student where rollNo='"+rollNo+"'");
        if(count>0){
        System.out.println("student is deleted from DB");
        }
        }
        catch (Exception e){
        System.out.println(e);
        }
        }
static void updateStudent()
        {
        Student student = new Student();
        student.setRollNo(sc.nextInt());
        student.setName(sc.next());
        student.setEmail(sc.next());
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentTeacherJavaProject","root","");
        Statement stmt = con.createStatement();
        stmt.executeUpdate("update Student set name='"+student.getName()+"', email='"+student.getEmail()+"' where rollNo='"+student.getRollNo()+"'");
        selectStudent1(student.getRollNo());
        }
        catch (Exception e){
        System.out.println(e);
        }
        }
static void selectStudent1(int rollNo)
        {
        Student1 stud1 = new Student1();
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentTeacherJavaProject","root","");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Student where rollNo = '"+rollNo+"'");
        while (rs.next()){
        student.setRollNo(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setEmail(rs.getString(3));
        }
        System.out.println(student.getRollNo());
        System.out.println(student.getName());
        System.out.println(student.getEmail());
        }
        catch (Exception e){
        System.out.println(e);
        }
        }
static void insertStudent()
        {

        Student student = new Student();
        student.setRollNo(sc.nextInt());
        student.setName(sc.next());
        student.setEmail(sc.next());

        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentTeacherJavaProject","root","");
        Statement stmt = con.createStatement();
        stmt.executeUpdate("insert into Student values('"+student.getRollNo()+"','"+student.getName()+"','"+student.getEmail()+"')");

        }
        catch (Exception e){
        System.out.println(e);
        }
        }
}
