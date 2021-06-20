package curso.src;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public void setCor(String c){
        this.cor = c;
    }

    public String getCor(){
        return this.cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public boolean getTampar(){
        return this.tampada;
    }

    public boolean getDestampar(){
        return this.tampada;
    }

    public void setTampar(){
        this.tampada = true;
    }
    public void setdDestampar(){
        this.tampada = false;
    }
    public Caneta(String m, String c, float p){
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
    }

    public void status(){
       System.out.println("Modelo: "+ this.getModelo());
       System.out.println("Ponta: "+ this.getPonta());
       System.out.println("Cor: "+ this.getCor());
       System.out.println("Tampada: "+ this.getTampar());
    }
    
}
