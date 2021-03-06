package gr.eap.RLGameEcoClient.comm;
//o server epikoinonei me tous client meso tis Response
public abstract class Response extends CommunicationsObject {
	private int commandID;
	private ConnectionState connectionState;

	public int getCommandID() {
		return commandID;
	}

	public void setCommandID(int commandID) {
		this.commandID = commandID;
	}



	public ConnectionState getConnectionState() {
		return connectionState;
	}

	public void setConnectionState(ConnectionState connectionState) {
		this.connectionState = connectionState;
	}
	
	public abstract void process();
}
