
import java.util.Date;

class Aluno {
    protected String nome;
    protected String cpf;
    protected Date dataDeVinculo;

    public Aluno(String nome, String cpf, Date dataDeVinculo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeVinculo = dataDeVinculo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nCPF: " + cpf +
               "\nData de vínculo: " + dataDeVinculo;
    }
}

class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(String nome, String cpf, Date data) {
        super(nome, cpf, data);
    }

    @Override
    public String toString() {
        return "Aluno de Graduação\n" + super.toString();
    }
}

class AlunoTecnico extends Aluno {

    public AlunoTecnico(String nome, String cpf, Date data) {
        super(nome, cpf, data);
    }

    @Override
    public String toString() {
        return "Aluno Técnico\n" + super.toString();
    }
}

class AlunoPosGraduacao extends Aluno {
    private boolean isQualificacao;

    public AlunoPosGraduacao(String nome, String cpf,
                             Date data, boolean qualificacao) {
        super(nome, cpf, data);
        this.isQualificacao = qualificacao;
    }

    @Override
    public String toString() {
        return "Aluno de Pós-Graduação\n" +
               super.toString() +
               "\nQualificação: " + isQualificacao;
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = {
            new AlunoGraduacao("Ana", "111", new Date()),
            new AlunoTecnico("Pedro", "222", new Date()),
            new AlunoPosGraduacao("Maria", "333", new Date(), true)
        };

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            System.out.println("------------------");
        }
    }
}
