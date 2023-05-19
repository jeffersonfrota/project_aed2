package util;

public class LinkedList2<T> {
 
    Node<T> head = null;

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
        return "\n\t\tLinkedList2 [head=" + head + "]";
    }

    
}
