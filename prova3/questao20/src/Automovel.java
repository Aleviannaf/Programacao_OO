public class Automovel extends Veiculo{
  private float velocidade;
  private float litros;

  public Automovel(){
    this.velocidade = 0;
    this.litros=0;
  }

  public Automovel(float velocidade, float litros){
    this.velocidade = velocidade;
    this.litros= litros;
  }

  @Override
  public float acelerar(float velocidade) {
    this.setVelocidade(this.getVelocidade()+velocidade);
    return this.getVelocidade();
  }

  @Override
  public void parar() {
    this.setVelocidade(0);
    
  }

  public void mudarOleo(float litros){
    this.setLitros(this.getLitros()+ litros);
  }

  public String verificar(){
    return "Velocidade: " + this.getVelocidade() + " Km/h \n Tanque: "+ this.getLitros()+" L\n";
  }

  public float getLitros() {
    return litros;
  }

  public void setLitros(float litros) {
    this.litros = litros;
  }
  
  public float getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(float velocidade) {
    this.velocidade = velocidade;
  }
}
