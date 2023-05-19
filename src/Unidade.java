import util.LinkedList2;

public class Unidade {
    private int idUnidade;
    private String nomeUnidade;
    private LinkedList2<Curso> listaCurso;
    
    public Unidade(int idUnidade, String nomeUnidade) {
        this.idUnidade = idUnidade;
        this.nomeUnidade = nomeUnidade;
        
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
        return listaCurso;
    }

    public void setListaCurso(LinkedList2<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

 

    
}
