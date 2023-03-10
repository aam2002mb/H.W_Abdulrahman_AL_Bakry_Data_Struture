package H.W.Lab4;

public class SinglyLinkedList<E> {

        static class Node<E> {
            private E element;
            private Node<E> next;

            public Node(E e, Node<E> n) {
                element = e;
                next = n;
            }

            public E getElement() {
                return element;
            }

            public Node<E> getNext() {
                return next;
            }

            public void setNext(Node<E> next) {
                this.next = next;
            }
        }

        // ---------end of nested Node class---------
        // instance variables of the SinglyLinkedList
        private Node<E> head = null;
        private Node<E> tail = null;
        private int size = 0;

        public SinglyLinkedList() {
        }

        // access methods
        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public E first() {
            if (isEmpty()) return null;
            return head.getElement();
        }

        public E last() {
            if (isEmpty()) return null;
            return tail.getElement();
        }

        public void addFirst(E e) {
            head = new Node<>(e, head);
            if (size == 0)
                tail = head;
            size++;
        }

        public void addLast(E e) {
            Node<E> newest = new Node<>(e, null);
            if (isEmpty())
                head = newest;
            else
                tail.setNext(newest);
            tail = newest;
            size++;
        }

        public E removeFirst() {
            if (isEmpty()) return null;
            E answer = head.getElement();
            head = head.getNext();
            size--;
            if (size == 0)
                tail = null;
            return answer;
        }
        public E second_to_last(){
            Node<E>secondToLast=null;
            Node<E>curr=head;
            while (curr!=null){
                if (curr.next==null)
                {
                    break;
                }
                secondToLast=curr;
                curr=curr.next;
            }
            return secondToLast.element;
        }
    public void rotate() {
        tail.next = head;
        head = head.next;
        tail = tail.next;
        tail.next = null;
    }
    public SinglyLinkedList<E>  margin(SinglyLinkedList<E> L,SinglyLinkedList<E> M) {
        L.size = L.size + M.size;
        L.tail.next = M.head;
        L.tail = M.tail;
        return L;
    }
    public void revers(SinglyLinkedList<E> L) {

        if (!isEmpty()) {
            Node prev = null;
            Node curr = head;
            Node next = null;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }
    }
