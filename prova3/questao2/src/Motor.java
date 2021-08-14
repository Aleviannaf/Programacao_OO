public class Motor {
  private int numCilindro;
  private int potencia;

  
  public String imprimir() {
    return "Motor \n[Cilindro=" + numCilindro + ", \nPotencia=" + potencia + "]";
  }

  
  public void leitura(int cilindro, int potencia){
    this.setNumCilindro(cilindro);
    this.setPotencia(potencia);
  }

  public Motor(){
    this.setNumCilindro(0);
    this.setPotencia(0);
  }

  public Motor(int cil, int pot){
    this.setNumCilindro(cil);
    this.setPotencia(pot);
  }

 
  public int getNumCilindro() {
    return numCilindro;
  }

  public int getPotencia() {
    return potencia;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }

  public void setNumCilindro(int numCilindro) {
    this.numCilindro = numCilindro;
  }

}
