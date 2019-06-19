package JUNIT.testingClass;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
     
	@Before
	public void before() {
		System.out.println("This is before method");
	}
	
	@After
	public void after() {
		System.out.println("This is after method");
	}
    public void testMethodA()
    {
    	App a=new App();
    	assertEquals(10, a.methodA(10));
    }
    public void testListStudent() {
    	App a=new App();
    	List<Student> s=new ArrayList<Student>();
    	s.add(new Student(10,"dedwe"));
      	s.add(new Student(123,"de"));
      	assertEquals(s, a.listStudent(s));
      	
    }
    public void testRollNoStudent() {
    	App a=new App();
    	List<Student> s=new ArrayList<Student>();
    	s.add(new Student(10,"dedwe"));
      	s.add(new Student(123,"de"));
      	assertEquals(123, a.returnRollNo(s, "de"));
      	
    }
    public void testNotRollNoStudent() {
    	App a=new App();
    	List<Student> s=new ArrayList<Student>();
    	s.add(new Student(10,"dedwe"));
      	s.add(new Student(123,"de"));
      	assertEquals(-1, a.returnRollNo(s, "deh"));
      	
    }
}
