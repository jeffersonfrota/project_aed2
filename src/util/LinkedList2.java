package util;

public class LinkedList2<T> {
 
    private Node<T> head = null;

    public String inserir(T importante)
    
    {
        Node<T> node = new Node<T>(importante);
        Node<T> current = this.head;

        if(head == null)
        {            
            this.head = node;
            return "Node cadastrado com sucesso!";
        }else
        {
            while(current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(node);
            return "\nNode cadastrado com sucesso!\n";
        } 
    }

    public String toString() {
        return "\n\t\t" + head + "";
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    
    
}
