import util.LinkedList2;

public class Instituicao {
    int idInstituicao;
    String nomeInstituicao;
    LinkedList2<Unidade> listaUnidade;
    
    public Instituicao(int idInstituicao, String nomeInstituicao) {
        this.idInstituicao = idInstituicao;
        this.nomeInstituicao = nomeInstituicao;
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
    
}
