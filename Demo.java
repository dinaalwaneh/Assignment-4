package ass4;


public class Demo {

 
	public static void main(String[] args) {
		
	
		Protocol ssh = ProtocoleFactory.getFInstance(ConnectionType.SSH);
		Protocol ssh2 = ProtocoleFactory.getFInstance(ConnectionType.SSH);
		Protocol telnet = ProtocoleFactory.getFInstance(ConnectionType.TELNET);
		Protocol scp = ProtocoleFactory.getFInstance(ConnectionType.SCP);
		Protocol ftp = ProtocoleFactory.getFInstance(ConnectionType.FTP);
		
		
		if(ssh == ssh2) {
			System.out.println(" ssh is equal to ssh2");
		}
		ssh.send(" testing ssh ");
		telnet.send("Testing telnet ");
		scp.send("Testing scp");
		
		
		System.out.println(Connection.getCurrentConnections());
		Connection.release(ConnectionType.SSH);
		System.out.println(Connection.getCurrentConnections());
		
		ftp = Connection.getInstance(ConnectionType.FTP);
		System.out.println(Connection.getCurrentConnections());
		
		
		ssh = Connection.getInstance(ConnectionType.SSH);
		ftp = Connection.getInstance(ConnectionType.FTP);
		ftp = Connection.getInstance(ConnectionType.FTP);
		
		ftp = Connection.getInstance(ConnectionType.FTP);
		ftp.send("Testing FTP");
		 
		
		
	}

}