package co.edu.uptc.Logic;

import co.edu.uptc.Model.VideoBeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LinkedDouble<T> {
    private Comparator<T> comparator;
    private Node<T> head;
    private Node<T> last;

    public LinkedDouble(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public boolean isEmpty() {
        return head == null && last == null;
    }

    public void addNodeFirst(T info) {
        if (isEmpty()) {
            head = last = new Node<>(info);
        } else {
            Node<T> node = new Node<>(info);
            head.setPrevious(node);
            node.setNext(head);
            head = node;
        }
    }

    public void addNodeLast(T info) {
        if (isEmpty()) {
            head = last = new Node<>(info);
        } else {
            Node<T> node = new Node<>(info);
            last.setNext(node);
            node.setPrevious(last);
            last = node;
        }
    }

    public void addNodeBeforeTo(Node<T> before, T info) {
        try {
            if (isEmpty()) {
                head = last = new Node(info);
            } else {
                Node<T> node = new Node<>(info);
                node.setNext(before);
                node.setPrevious(before.getPrevious());
                before.getPrevious().setNext(node);
                before.setPrevious(node);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

    public void addNodeAfterTo(Node<T> after, T info) {
        try {
            if (isEmpty()) {
                head = last = new Node(info);
            } else {
                Node<T> node = new Node<>(info);
                node.setNext(after.getNext());
                after.getNext().setPrevious(node);
                node.setPrevious(after);
                after.setNext(node);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void addNodeSorted() {

    }

    public Node<T> findNode(T node) {
        Node<T> aux = head;
        while (aux != null) {
            if (comparator.compare(node, aux.getInfo()) == 0) {
                return aux;
            }
            aux = aux.getNext();
        }
        return null;
    }

    public T findInfo(T info) {
        Node<T> aux = head;
        while (aux != null) {
            if (comparator.compare(info, aux.getInfo()) == 0) {
                return aux.getInfo();
            }
            aux = aux.getNext();
        }
        return info;
    }

    public List<T> getLinkedList(boolean back) {
        ArrayList<T> out = new ArrayList<>();
        Node<T> aux = !back ? head : last;
        while (aux != null) {
            out.add(aux.getInfo());
            aux = !back ? aux.getNext() : aux.getPrevious();
        }
        return out;
    }

    public T deleteNode(Node<T> delete) {
        if (head == delete) {
            head = head.getNext();
            head.setPrevious(null);
        } else {
           delete.getPrevious().setNext(delete.getNext());
           delete.getNext().setPrevious(delete.getPrevious());
        }
        return delete.getInfo();
    }

    public int getSize() {
        int i = 1;
        Node<T> node = head;
        if (isEmpty()) {
            return 0;
        } else {
            while (node.getNext() != null) {
                node = node.getNext();
                i++;
            }
        }
        return i;
    }

    public T getObject(int pos) {
        try {
            return getLinkedList(false).get(pos);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }

    }
}
