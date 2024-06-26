
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private int numberOfContainers;
    private static final double FEES = 4.0;

    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation()
    {
        // inicializa variáveis de instância
       this.name = name;
       this.numberOfContainers = numberOfContainers;
       setFees(FEES);
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public String getName(){
        return name;
    }
    
    public void setName(){
        this.name = name;
    }
    public int getnumberOfContainers(){
        return numberOfContainers;
    }
    
    public void setnumberOfContainers(){
        this.numberOfContainers = numberOfContainers;
    }
    
    @Override
    public double getPriceWithFees(){
        return getPrice() * (1.0 + (getFees() * 0.01));
    }
    @Override
    public String getTransportType(){
        return "Transporte Aereo";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome" , name));
        sb.append(String.format("%15s: %s\n", "Nº Contentores", numberOfContainers));
        
        
        return sb.toString();
    }
}
