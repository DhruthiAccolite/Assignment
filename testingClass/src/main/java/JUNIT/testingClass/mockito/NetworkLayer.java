package JUNIT.testingClass.mockito;

public class NetworkLayer {
	DBDAO database;
	 public boolean save(String fileName) {
		 	database.save(fileName);
	        System.out.println("Saved in database in Main class");
	        System.out.println("Saved in network location");
	        return true;
	    }
}
