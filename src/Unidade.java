import util.*;

public class Unidade {
    private int idUnidade;
    private String nomeUnidade;
    private LinkedList2<Curso> listaCursos;
    
    public Unidade(int idUnidade, String nomeUnidade) {
        this.idUnidade = idUnidade;
        this.nomeUnidade = nomeUnidade;
        this.listaCursos = new LinkedList2<>();
    }

    public int getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(int idUnidade) {
        this.idUnidade = idUnidade;
    }

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public LinkedList2<Curso> getListaCurso() {
        return listaCursos;
    }

    public void setListaCurso(LinkedList2<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public String toString() {
        return "Unidade [idUnidade=" + idUnidade + ", nomeUnidade=" + nomeUnidade + ", listaCursos=" + listaCursos
        + "]";
    }

    public void inserirCurso(int idCurso, String nomeCurso,int idProfessor, String nomeProfessor, int idSala, String nomeSala, int idDisciplina, String nomeDisciplina, int idTurma, int diaSemana, int quantAluno, String horarioI, String horarioF, String nomeTurma){

        Curso curso = new Curso(idCurso, nomeCurso);
        curso.inserirTurma(idProfessor, nomeProfessor, idSala, nomeSala, idDisciplina, nomeDisciplina, idTurma, diaSemana, quantAluno, horarioI, horarioF, nomeTurma);
        

        if(this.listaCursos.getHead() == null){
            this.listaCursos.inserir(curso);
        }
        else{
            Node<Curso> current = consultar(curso);     
            if(current != null){
                current.getImportante().inserirTurma(idProfessor, nomeProfessor, idSala, nomeSala, idDisciplina, nomeDisciplina, idTurma, diaSemana, quantAluno, horarioI, horarioF, nomeTurma);
            }
            else{
                this.listaCursos.inserir(curso);
            }
        }
    }

    public Node<Curso> consultar(Curso curso){
        Node<Curso> current = this.listaCursos.getHead();
        while(current != null)
        {
            if(current.getImportante().getIdCurso() == curso.getIdCurso() && current.getImportante().getNomeCurso() == curso.getNomeCurso()){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }
}
