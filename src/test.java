import com.student.manage.student;
import com.student.manage.studentDao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args)throws Exception {
        System.out.println("welcome in my project i.e student management aap");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("PRESS 1 to ADD students");
            System.out.println("PRESS 2 to Delete student");
            System.out.println("PRESS 3 to display student");
            System.out.println("Press 4 to update student");
            System.out.println("PRESS 5 to exit app");
            int c=Integer.parseInt(br.readLine());
            if (c==1){
                //add student..
                System.out.println("Enter user name :");
                String name=br.readLine();

                System.out.println("Enter user phone :");
                String phone=br.readLine();

                System.out.println("Enter user city :");
                String city=br.readLine();

                //create student object to store student
                student st=new student(name,phone,city);
               boolean ans= studentDao.insertstudentToDB(st);
               if (ans){
                   System.out.println("student is added successfully..");
               }else {
                   System.out.println("Something went wrong try again...");
               }
                System.out.println(st);
            } else if (c==2) {
                //delete student...
                System.out.println("Enter student id to delete :");
                int userId=Integer.parseInt(br.readLine());
               boolean f= studentDao.deletestudent(userId);
               if (f){
                   System.out.println("Deleted");
               }else {
                   System.out.println("Something went wrong......!");
               }
            } else if (c==3) {
                //display student..
             studentDao.showAllstudent();
            } else if (c==4) {
                //update

            }else if (c==5){
                //exit
               break;
            }else {

            }
        }
        System.out.println("Thank you for using my application..");
        System.out.println("see you soon...buy buy!");
    }
}
