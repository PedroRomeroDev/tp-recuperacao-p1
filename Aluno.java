public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Pedro");
        aluno1.setMatricula(2213);
        aluno1.setNotaFinal(7);

        System.out.println("Nome Aluno: " + aluno1.getNome());
        System.out.println("Matricula: " + aluno1.getMatricula());
        System.out.println("Nota: " + aluno1.getNotaFinal());
    }
}

class Aluno {
    private String nome;
    private int matricula;
    private double notaFinal;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }
}