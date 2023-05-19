public class Professor {
    
    private int idProfessor;
    private String nomeProfessor;

    Professor(int id, String nome){
        this.idProfessor = id;
        this.nomeProfessor = nome;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String toString() {
        return "Professor [idProfessor=" + idProfessor + ", nomeProfessor=" + nomeProfessor + "]";
    }

        
}
