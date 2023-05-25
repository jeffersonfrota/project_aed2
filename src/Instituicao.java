import util.*;

public class Instituicao {
    private int idInstituicao;
    private String nomeInstituicao;
    private LinkedList2<Unidade> listaUnidade;
    
    public Instituicao(int idInstituicao, String nomeInstituicao) {
        this.idInstituicao = idInstituicao;
        this.nomeInstituicao = nomeInstituicao;
        this.listaUnidade = new LinkedList2<>();
    }

    public int getIdInstituicao() {
        return idInstituicao;
    }

    public void setIdInstituicao(int idInstituicao) {
        this.idInstituicao = idInstituicao;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }
    
    public String toString() {
        return "Instituicao [idInstituicao=" + idInstituicao + ", nomeInstituicao=" + nomeInstituicao
        + ", listaUnidade=" + listaUnidade + "]";
    }

    public LinkedList2<Unidade> getListaUnidade() {
        return listaUnidade;
    }

    public void setListaUnidade(LinkedList2<Unidade> listaUnidade) {
        this.listaUnidade = listaUnidade;
    }

    public void inserirUnidade(int idUnidade, String nomeUnidade, int idCurso, String nomeCurso,int idProfessor, String nomeProfessor, int idSala, String nomeSala, int idDisciplina, String nomeDisciplina, int idTurma, int diaSemana, int quantAluno, String horarioI, String horarioF, String nomeTurma){

        Unidade unidade = new Unidade(idUnidade,nomeUnidade);
        unidade.inserirCurso(idCurso, nomeCurso, idProfessor, nomeProfessor, idSala, nomeSala, idDisciplina, nomeDisciplina, idTurma, diaSemana, quantAluno, horarioI, horarioF, nomeTurma);

        if(this.listaUnidade.getHead() == null){
            this.listaUnidade.inserir(unidade);
        }
        else{
            Node<Unidade> current = consultar(unidade);     
            if(current != null){
                current.getImportante().inserirCurso(idCurso, nomeCurso, idProfessor, nomeProfessor, idSala, nomeSala, idDisciplina, nomeDisciplina, idTurma, diaSemana, quantAluno, horarioI, horarioF, nomeTurma);
            }
            else{
                this.listaUnidade.inserir(unidade);
            }
        }
    }

    public Node<Unidade> consultar(Unidade unidade){
        Node<Unidade> current = this.listaUnidade.getHead();
        while(current != null)
        {
            if(current.getImportante().getIdUnidade() == unidade.getIdUnidade() &&  current.getImportante().getNomeUnidade() == unidade.getNomeUnidade()){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

}
