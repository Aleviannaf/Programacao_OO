package banco;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("Num da conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }

    public Banco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean s){
        this.status = s;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t =="cc"){
            this.setSaldo(50);
        } else if(t == "cp"){
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        } else if(this.getSaldo() <0 ){
            System.out.println("Conta esta em divida");
        } else {
            this.setStatus(false);
            System.out.println("Pode fechar conta");
        }
    }

    public void depositar(float n){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+n);
        } else {
            System.out.println("Conta inativa!");
        }
    }

    public void sacar(float s){
        if(this.getStatus()){
            if(this.getSaldo()>= s){
                this.setSaldo(this.getSaldo()-s);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("conta inativa!");
        }
    }

    public void pagarMensal(){
        int v;
        if (this.getTipo() == "cc") {
            v = 30;
        } else {
            v = 25;
        }

        if(this.getStatus()){
            if(this.getTipo() == "cc"){
                    this.setSaldo(this.getSaldo()-v);
            } else {
                this.setSaldo(this.getSaldo()-v);
            }
        } else {
            System.out.println("Conta inativa!");
        }
    }




    
}
