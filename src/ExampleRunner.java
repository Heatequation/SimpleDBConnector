
public class ExampleRunner {

	public static void main(String[] args) {	
		
		// SQLConnector postgre_c = new SQLConnector("jdbc:postgresql://localhost:5432/mydb","marcel", "");
		
		SQLConnector sqlite_c = new SQLConnector("jdbc:sqlite:./database/example_db","","");
		sqlite_c.example();
		
	}
}
