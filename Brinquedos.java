public class Brinquedos extends Vendedor{
    private String brinquedo;
    private String tipo;
    private String referencia;
    private double preco;

    public Brinquedos() {
        
    }

    public Brinquedos(String brinquedo, String tipo, String referencia, double preco) {
        this.brinquedo = brinquedo;
        this.tipo = tipo;
        this.referencia = referencia;
        this.preco = preco;
    }

    public String getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

    
}
