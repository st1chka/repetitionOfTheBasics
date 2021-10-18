package Repetition.Lesson2;

public class MyLinkedList<E> implements LinkedList<E> {

    public LinkedList.Node<E> firstElement;
    public LinkedList.Node<E> lastElement;
    public int size;


    @Override
    public void add(E item) {
        Node<E> last = lastElement;
        Node<E> newNode = new Node<>(last, item, null);
        lastElement = newNode;
        if (last == null) {
            firstElement = newNode;
        } else {
            last.nextNode = newNode;
        }
        size++;
    }

    @Override
    public void insertFirstElement(E item) {
        firstElement = new Node<>(null, item, firstElement);
        size++;
    }

    @Override
    public E getFirstElement() {
        if (firstElement != null) {
            return firstElement.item;
        }
        return null;
    }

    @Override
    public E getLastElement() {
        if (lastElement != null) {
            return lastElement.item;
        }
        return null;
    }

    @Override
    public E removeFirstElement() {
        if (isEmpty()) {
            return null;
        }
        Node<E> removedNode = firstElement;
        firstElement = removedNode.nextNode;
        removedNode.nextNode = null;

        size--;
        return removedNode.item;
    }

    @Override
    public E removeLastElement() {
        if (isEmpty()) {
            return null;
        }
        E element = lastElement.item;
        Node<E> prev = lastElement.prevNode;

        lastElement.item = null;
        lastElement.prevNode = null;
        lastElement = prev;

        if (prev == null) {
            firstElement = null;
        } else {
            prev.nextNode = null;
        }
        size--;

        return element;
    }

    @Override
    public boolean remove(E item) {
        Node<E> current = firstElement;
        Node<E> prev = null;
        while (current != null) {
            if (current.item.equals(item)) {
                break;
            }
            prev = current;
            current = current.nextNode;
        }
        if (current == null) {
            return false;
        } else if (current == firstElement) {
            removeFirstElement();
            return true;
        } else {
            prev.nextNode = current.nextNode;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E item) {
        Node<E> currentElement = firstElement;
        while (currentElement != null) {
            if (currentElement.item.equals(item)) {
                return true;
            }
            currentElement = currentElement.nextNode;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> currentNode = firstElement;
        while (currentNode != null) {
            sb.append(currentNode.item);
            if (currentNode.nextNode != null) {
                sb.append(", ");
            }
            currentNode = currentNode.nextNode;
        }
        sb.append("]");
        return sb.toString();
    }
}