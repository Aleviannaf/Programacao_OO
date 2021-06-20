package aula12b;

public class Bolsista extends Aluno {
    private int bolsa;

    public void renBolsa(){
        System.out.println("Renovando Bolsa");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Renovar mensalidade bolsista");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }


}
