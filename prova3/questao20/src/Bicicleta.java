public class Bicicleta extends Veiculo{
  private float velocidade;

  Bicicleta(){
    this.velocidade =0;
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
  
  public float getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(float velocidade) {
    this.velocidade = velocidade;
  }

} 