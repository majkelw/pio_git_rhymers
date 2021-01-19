package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int ERROR_CODE = -1;
	private Node last;
	private final int i = 0;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return ERROR_CODE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return ERROR_CODE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}


}
