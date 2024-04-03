
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int packages;

    /**
     * Construtor para objetos da classe Van
     */
    public Van(int packages, String licensePlate){
        // inicializa variáveis de instância
        super(licensePlate);
        this.packages = packages;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int getPackages(){
        // escreva seu código aqui
        return packages;
    }
    
    public void setPackages(int packages){
        this.packages = packages;
    }
    
     @Override
    public String toString() 
    {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nº de pacotes", packages));
                    
        return sb.toString();
    }
}
