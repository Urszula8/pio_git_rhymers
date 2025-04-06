package edu.kis.vh.nursery.list;
/**This data structure contains integer values**/
public class IntLinkedList {
    private static class Node {

        private final int value;
        private Node prev, next;

        private Node(int i) {
            value = i;
        }

    }

    public static final int LIST_IS_EMPTY_VALUE = -1;
    Node last;
    int i;
/**Adds number to the end of the list**/
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }
/**Returns false if the list is not full**/
    public boolean isFull() {
        return false;
    }
/**Returns value of the last element of the list. If the list is empty, returns -1**/
    public int top() {
        if (isEmpty())
            return LIST_IS_EMPTY_VALUE;
        return last.value;
    }
/**deletes last element of the list and returns its value. If list is empty, returns -1**/
    public int pop() {
        if (isEmpty())
            return LIST_IS_EMPTY_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
