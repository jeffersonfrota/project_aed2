public class App {
    public static void main(String[] args) throws Exception {

        /*

        ****** TESTES PARA A CRIAÇAO DO METODO "inserirTurma" NA CLASSE CURSO;

        Professor professor = new Professor(12,"wanderley");
        Sala sala = new Sala(305, "Sala 305");
        Disciplina disciplina = new Disciplina(5110, "AED");
        Turma turma1 = new Turma(3,2,40,"20:30", "22:00", "BSI-3", professor, sala, disciplina);

        Professor professor1 = new Professor(10,"Federson");
        Sala sala1 = new Sala(205, "Sala 205");
        Disciplina disciplina1 = new Disciplina(5010, "POO");
        Turma turma = new Turma(4,3,42,"20:00", "21:30", "BSI-2", professor1, sala1, disciplina1);

        */


        Curso curso = new Curso(1, "BSI");
        curso.inserirTurma(12, "wanderley", 305, "Sala 305", 5110,"AED", 3,2,40,"20:30", "22:00", "BSI-3");
        curso.inserirTurma(10,"Federson",205, "Sala 205", 5010, "POO", 4,3,42,"20:00", "21:30", "BSI-2");

        System.out.println(curso);

    }
}
