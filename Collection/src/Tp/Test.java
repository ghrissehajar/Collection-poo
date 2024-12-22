package Tp;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Commande cmd1 = new Commande(4,new Date(),"fr1");
Commande cmd2 = new Commande(8,new Date(),"fr2");
Commande cmd3 = new Commande(6,new Date(),"fr3");

Client client1=new Client("11","hajar","111 Rue 9","012365478");
client1.EnregistrerCommande(cmd1);
client1.EnregistrerCommande(cmd2);

Client client2 =new ClientFidel("22","hajar","111 Rue 9","012365478","10", 10.5f);
client2.EnregistrerCommande(cmd3);


List<Client> clients= new ArrayList<>();
clients.add(client1);
clients.add(client2);
Map<Client,String> LCLient = new HashMap<> ();
for (Client c: clients) {
	LCLient.put(c, c.getClient());
}

for (Map.Entry<Client,String>   e : LCLient.entrySet()) {
	System.out.println("Client:" + e.getKey());
}





	}

}
