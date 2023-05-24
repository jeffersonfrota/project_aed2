package util;

public class Node<T> {
    private T importante;
    private Node<T> next;
    
    public Node(T importante){
        this.importante = importante;
        this.next = null;
    }

    public T getImportante() {
        return importante;
    }

    public void setImportante(T importante) {
        this.importante = importante;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public String toString() {
        return "Node [\nimportante=" + importante + ", \nNext: " + next + "]";
    }
   
}
