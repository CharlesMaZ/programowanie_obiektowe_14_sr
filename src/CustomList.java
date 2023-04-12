import java.util.NoSuchElementException;

public class CustomList <T>{
    class Node{
        T value;
        Node next;
    }
    Node first = null;
    Node last = null;
    void addLast(T value){
        Node nowy = new Node();
        nowy.value = value;
        nowy.next = null;
        if(last == null){
            last = nowy;
            first = nowy;
        } else{
            last.next = nowy;
            last = nowy;
        }
    }
    T getLast(){
        if (last == null){
            throw new NoSuchElementException();
        }else {
            return last.value;
        }
    }
    void addFirst(T value){
        Node nowy = new Node();
        nowy.value = value;
        nowy.next = null;
        if(last == null) {
            last = nowy;
            first = nowy;
        }else {
            nowy.next = first;
            first = nowy;
        }
    }
    T getFirst() {
        if (first == null){
            throw new NoSuchElementException();
        }else {
            return first.value;
        }
    }

    T removeFirst(){
        if(first == null){
            throw new NoSuchElementException();
        }else if(first == last) {
            last = null;

            T temp = first.value;
            first = null;
            return temp;
        }else{
            T temp = first.value;
            first = first.next;
            return temp;
        }
    }

    T removeLast(){
        if(last == null){
            throw new NoSuchElementException();
        }else if(first == last){
            last = null;

            T temp = first.value;
            first = null;
            return temp;
        }else{
            T temp = last.value;
            Node currentNode = first;
            while(currentNode.next != last){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            last = currentNode;
            return temp;
        }
    }
}
