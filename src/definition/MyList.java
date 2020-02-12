/*
 * Created by IntelliJ IDEA.
 * User: kanishk
 * Date: 12/02/20
 * Time: 4:13 PM
 */
package definition;

import adt.ListADT;


public class MyList<E> implements ListADT {

    public Node<E> head;
    public Node<E> tail;
    public int size = 0;

    @Override
    public boolean add(Object item) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public int search(Object item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public String toString(){
        final StringBuilder stringBuilder = new StringBuilder("[");
        Node<E> temp = head;
        for (int i = 0; i < size && temp != null; i++) {
            E data = temp.getData();
            stringBuilder.append(data);
            stringBuilder.append(i < (size -1) ? "," : "");
            temp.getNext();

        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }


    private class Node<E>{
        private Node<E> previous;
        private Node<E> next;
        private E data;

        private Node(Node<E> previous, Node<E> next, E data) {
            this.previous = previous;
            this.next = next;
            this.data = data;
        }

        private Node<E> getPrevious() {
            return previous;
        }

        private void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        private Node<E> getNext() {
            return next;
        }

        private void setNext(Node<E> next) {
            this.next = next;
        }

        private E getData() {
            return data;
        }

        private void setData(E data) {
            this.data = data;
        }
    }
}
