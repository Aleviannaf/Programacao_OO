package Aula10b;

public class Aluno extends Pessoas{
   
    private int matricula;
    private String curso;


    public void cancelarMatricula(){
        System.out.println("Cancelar internet");
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