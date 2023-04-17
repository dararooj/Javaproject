package List;
import java.util.*;
import java.util.ArrayList;

public class ArrayList2 {
    void arraylist2(){
     Student S1=new Student("nisha",3,17);
     Student S2=new Student("farhat",7,16);
     Student S3=new Student("asifa",2,18);
     Map<Student,Student> mapp=new HashMap<>();
     mapp.put(S1,S1);
     mapp.put(S2,S2);
     mapp.put(S3,S3);

     System.out.println(mapp);
        for (Map.Entry<Student,Student> k:mapp.entrySet()){
            System.out.println(k.getKey()+" "+k.getValue());
        }
    }
}
class Student {
        String name;
        int rollno;
        int age;
        @Override
        public String toString(){
            return this.name+" " +this.rollno+" " +this.age;
        }
        Student(String name,int rollno,int age){
            this.name=name;
            this.rollno=rollno;
            this.age=age;
        }
    }

