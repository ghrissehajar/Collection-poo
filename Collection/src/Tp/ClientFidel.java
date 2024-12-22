package Tp;

public class ClientFidel extends Client{
	private String CodeFidelite;
	private float TauxReduction;
	
	public ClientFidel(String CodeClient, String NomClient, String AdrClient, String TelClient, String codeFidelite,
			float tauxReduction) {
		super(CodeClient, NomClient, AdrClient, TelClient);
		CodeFidelite = codeFidelite;
		TauxReduction = tauxReduction;
	}
	

public String ToString() {
	return super.toString()+ "code fidele:"+ CodeFidelite + ", TauxReduction:" +TauxReduction ;
}
}
