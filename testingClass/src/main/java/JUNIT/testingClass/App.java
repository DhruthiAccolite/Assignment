package JUNIT.testingClass;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
   
    public int methodA(int a) {
    	return a;
    }
    
    public List<Student> listStudent(List<Student> student){
    	return student;
    }
    public int returnRollNo(List<Student> student,String name) {
    	for(Student s:student) {
    		if(s.getName().equals(name)) {
    			return s.getRollNo();
    		}
    	}
    	return -1;
    }
}
