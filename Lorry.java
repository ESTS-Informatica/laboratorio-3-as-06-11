
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int numberOfPallets;
    private int trailers;

    /**
     * Construtor para objetos da classe Lorry
     */
    public Lorry(int numberOfPallets, int trailers, String licensePlate){
        // inicializa variáveis de instância
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int getNumberOfPallets(){
        // escreva seu código aqui
        return numberOfPallets;
    }
    public int getTrailers(){
        return trailers;
    }
    
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }
    
    public void setTrailers(int trailers){
        this.trailers = trailers;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "NºPaletes", numberOfPallets));
        sb.append(String.format("%15s: %s\n", "Atrelados", trailers));
               
        
        return sb.toString();
    }
}
