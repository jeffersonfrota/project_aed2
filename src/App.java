
public class App {
    public static void main(String[] args) throws Exception {

        Root root = new Root();

        root.inserirInstituicao(03, "UFG", 21, "INF", 1, "BSI",12, "wanderley", 305, "Sala 305", 5110,"AED", 3,2,40,"20:30", "22:00", "BSI-3");

        root.inserirInstituicao(03, "UFG", 21, "INF", 1, "BSI",12, "wanderley", 305, "Sala 305", 5110,"AED", 3,2,40,"20:30", "22:00", "BSI-3");
        

        root.inserirInstituicao(02, "IF", 21, "INF", 1, "BSI",12, "wanderley", 305, "Sala 305", 5110,"AED", 3,2,40,"20:30", "22:00", "BSI-3");
        
        root.inserirInstituicao(02, "IF", 24, "FACE", 1, "BSI",12, "wanderley", 305, "Sala 305", 5110,"AED", 3,2,40,"20:30", "22:00", "BSI-3");
        

        System.out.println(root);
    }
}
