public class Sala {
    private int idSala;
    private String nomeSala;

    Sala(int id, String nome){
        this.idSala = id;
        this.nomeSala = nome;
    }

    public int getIdSala() {
        return idSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public String toString() {
        return "Sala [idSala=" + idSala + ", nomeSala=" + nomeSala + "]";
    }
   
}
