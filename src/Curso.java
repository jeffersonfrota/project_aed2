import util.LinkedList2;

public class Curso {
    private int idCurso;
    private String nomeCurso;
    private LinkedList2<Turma> listaTurmas;

    Curso(int idCurso, String nomeCurso){
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.listaTurmas = new LinkedList2<>();
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public LinkedList2<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(LinkedList2<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }

    public String toString() {
        return "Curso\n\tidCurso: " + idCurso + ", \n\tnomeCurso: " + nomeCurso + ", \n\tlistaTurmas: " + listaTurmas;
    }
    
    public void inserirTurma(int idProfessor, String nomeProfessor, int idSala, String nomeSala, int idDisciplina, String nomeDisciplina, int idTurma, int diaSemana, int quantAluno, String horarioI, String horarioF, String nomeTurma){
        
        Professor professor = new Professor(idProfessor,nomeProfessor);
        Sala sala = new Sala(idSala, nomeSala);
        Disciplina disciplina = new Disciplina(idDisciplina, nomeDisciplina);
        Turma turma = new Turma(idTurma, diaSemana, quantAluno, horarioI, horarioF, nomeTurma, professor, sala, disciplina);

        this.listaTurmas.inserir(turma);

    }
}
