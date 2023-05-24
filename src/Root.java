import util.*;

public class Root {
    
    private LinkedList2<Instituicao> listaInstituicao;
    
    public Root(){
        this.listaInstituicao = new LinkedList2<>();
    }

    public LinkedList2<Instituicao> getListaInstituicao() {
        return listaInstituicao;
    }
    public void setListaInstituicao(LinkedList2<Instituicao> listaInstituicao) {
        this.listaInstituicao = listaInstituicao;
    }

        public String toString() {
        return "Root [listaInstituicao=" + listaInstituicao + "]";
    }

    public void inserirInstituicao(int idInstituicao, String nomeInstituicao, int idUnidade, String nomeUnidade, int idCurso, String nomeCurso,int idProfessor, String nomeProfessor, int idSala, String nomeSala, int idDisciplina, String nomeDisciplina, int idTurma, int diaSemana, int quantAluno, String horarioI, String horarioF, String nomeTurma){
        Instituicao instituicao = new Instituicao(idInstituicao, nomeInstituicao);
        instituicao.inserirUnidade(idUnidade, nomeUnidade, idCurso, nomeCurso, idProfessor, nomeProfessor, idSala, nomeSala, idDisciplina, nomeDisciplina, idTurma, diaSemana, quantAluno, horarioI, horarioF, nomeTurma);

       
        if(this.listaInstituicao.getHead() == null)
        {
            this.listaInstituicao.inserir(instituicao);
        }
       else{
            if(comparar(instituicao)){
                this.listaInstituicao.getHead().getImportante().inserirUnidade(idUnidade, nomeUnidade, idCurso, nomeCurso, idProfessor, nomeProfessor, idSala, nomeSala, idDisciplina, nomeDisciplina, idTurma, diaSemana, quantAluno, horarioI, horarioF, nomeTurma);
            }
        }
    }

    public boolean comparar(Instituicao instituicao){
        Node<Instituicao> current = this.listaInstituicao.getHead();
        while(current != null)
        {
            if(current.getImportante().getIdInstituicao() == instituicao.getIdInstituicao() &&  current.getImportante().getNomeInstituicao() == instituicao.getNomeInstituicao()){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}
