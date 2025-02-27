package Tp;

public class Clientfichier extends Client {
    private String CodeFidelite;
    private float TauxReduction;

    public Clientfichier(String CodeClient, String NomClient, String AdrClient, String TelClient,
                         String CodeFidelite, float TauxReduction) {
        super(CodeClient, NomClient, AdrClient, TelClient);
        this.CodeFidelite = CodeFidelite;
        this.TauxReduction = TauxReduction;
    }

    @Override
    public String toString() {
        return super.toString() + " ClientFidel{" +
                "CodeFidelite='" + CodeFidelite + '\'' +
                ", TauxReduction=" + TauxReduction +
                '}';
    }
}
