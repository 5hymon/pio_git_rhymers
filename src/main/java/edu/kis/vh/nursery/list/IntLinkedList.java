package edu.kis.vh.nursery.list;

/**
 * Class which is handling communication with List
 */
public class IntLinkedList {
    private Node last;
    private int i;

    /**
     * Method checking if List is empty
     * @return True when empty
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Method checking if List is full
     * @return false all the time
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Method returning last element from List
     * @return  -1 when List is Empty
     *          last element when is not Empty
     */
    public int top() {
        if (isEmpty()) return -1;
        return last.getValue();
    }

    /**
     * Method is removing last element from List and return it
     * @return  -1 when List is Empty
     *          last element when is not Empty
     */
    public int pop() {
        if (isEmpty()) return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}
