package Exercise_10042016;

public class ClientEvent {
	Client client;

	ClientEvent(Client client) {
		this.client = client;
	}

	String getname() {
		return client.name;
	}

	String getip() {
		return client.ip;
	}
}

interface ClientListener {
	void clientadd(ClientEvent event);

	void clientremove(ClientEvent event);
}