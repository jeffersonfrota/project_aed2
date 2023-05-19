package util;

public class Node<T> {
    private T importante;
    private Node<T> next;
    private Node<T> down;
    
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

    public Node<T> getDown() {
        return down;
    }

    public void setDown(Node<T> down) {
        this.down = down;
    }

    public String toString() {
        return "Node [importante=" + importante + ", \nNext=" + next + ", \nDown=" + down + "]";
    }



   
}
