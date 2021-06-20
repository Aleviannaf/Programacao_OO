package aula12b;

public class Aluno {
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade!");
    }

    public int getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
