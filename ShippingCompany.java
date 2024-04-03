import java.util.HashSet;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private ArrayList<Transport> inService; 

    /**
     * Construtor para objetos da classe ShippingCompany
     */
    public ShippingCompany(String name){
        // inicializa variáveis de instância
        this.name = name;
        this.inService = new ArrayList<>();
        
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public String getName(){
        // escreva seu código aqui
        return name;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        this.forEach((transport) -> {           
            sb.append(transport.toString());
        });
        
        return sb.toString();
    }
}
