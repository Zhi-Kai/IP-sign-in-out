package Exercise_10042016;

public class ping {

	public static void main(String[] args) {
		Client c1 = new Client("192.168.0.0","kylu");
		Client c2 = new Client("192.168.200.2","kyle");

		ClientQueue queue = new ClientQueue();

		queue.addClientListener(new ClientListener() {

			@Override
			public void clientadd(ClientEvent event) {
				System.out.printf("%s從%s連線%n",event.getname(),event.getip());
				
			}

			@Override
			public void clientremove(ClientEvent event) {
				System.out.printf("%s從%s離線%n",event.getname(),event.getip());
				
			}
        });
		
		queue.add(c1);
		queue.add(c2);
		
		queue.remove(c1);
		
		
	}

}
