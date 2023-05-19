public class Turma {
    private int idTurma, diaSemana, quantAluno;
    private String horarioI, horarioF, nomeTurma;
    private Professor professor;
    private Sala sala;
    private Disciplina disciplina;
    
    Turma(int idTurma, int diaSemana, int quantAluno, String horarioI, String horarioF, String nomeTurma, Professor professor, Sala sala, Disciplina disciplina){
        this.idTurma = idTurma;
        this.diaSemana = diaSemana;
        this.quantAluno = quantAluno;
        this.horarioI = horarioI;
        this.horarioF = horarioF;
        this.nomeTurma = nomeTurma;
        this.disciplina = disciplina;
        this.sala = sala;
        this.professor = professor;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getQuantAluno() {
        return quantAluno;
    }

    public void setQuantAluno(int quantAluno) {
        this.quantAluno = quantAluno;
    }

    public String getHorarioI() {
        return horarioI;
    }

    public void setHorarioI(String horarioI) {
        this.horarioI = horarioI;
    }

    public String getHorarioF() {
        return horarioF;
    }

    public void setHorarioF(String horarioF) {
        this.horarioF = horarioF;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String toString() {
        return "Turma [idTurma=" + idTurma + ", diaSemana=" + diaSemana + ", quantAluno=" + quantAluno + ", horarioI="
                + horarioI + ", horarioF=" + horarioF + ", nomeTurma=" + nomeTurma + ", professor=" + professor
                + ", sala=" + sala + ", disciplina=" + disciplina + "]";
    }

     
}


