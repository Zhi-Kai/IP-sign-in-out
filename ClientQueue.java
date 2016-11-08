package Exercise_10042016;

import java.util.ArrayList;

public class ClientQueue {
	private ArrayList Clients = new ArrayList();
	protected ArrayList Listeners = new ArrayList();

	public void addClientListener(ClientListener Listener) {
		Listeners.add(Listener);
	}

	public void add(Client client) {
		Clients.add(client);
		ClientEvent event = new ClientEvent(client);
		// ------------------將event存入ClientLister------------------//	
		ClientListener listener =  (ClientListener) Listeners.get(0);
		listener.clientadd(event);	
	}
	
	public void remove(Client client){
		Clients.remove(client);
		ClientEvent event = new ClientEvent(client);		
		// ------------------將event存入ClientLister------------------//
		ClientListener listener =  (ClientListener) Listeners.get(0);
		listener.clientremove(event);
	}
}
