package ass4;

public class ProtocoleFactory {

	public static Protocol getFInstance(String connectionType) {
		
		return  Connection.getInstance(connectionType);
	}
	
}
