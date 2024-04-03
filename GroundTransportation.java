
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String licensePlate;
    private static final double FEES = 3.0;

    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate){
        // inicializa variáveis de instância
        this.licensePlate = licensePlate;
        setFees(FEES);
        
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public void setLicensePlate(){
        this.licensePlate = licensePlate;
    }
}
