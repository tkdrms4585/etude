package dataStructure;


public class SinglyLinkedList<E> implements List<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
		size = 0;
	}

	private Node<E> search(int index) {
		if (index >= size || index < 0)
			throw new IndexOutOfBoundsException();

		Node<E> n = head;

		for (int i = 0; i < index; i++)
			n = n.next;

		return n;
	}

	public void addFirst(E value) {
		Node<E> newNode = new Node<E>(value);
		newNode.next = head;
		head = newNode;

		if (size == 0)
			tail = newNode;

		size++;
	}

	public void addLast(E value) {
		Node<E> newNode = new Node<>(value);
		tail.next = newNode;
		tail = newNode;

		if (size == 0)
			head = newNode;

		size++;
	}

	@Override
	public boolean add(E value) { // 끝에 하나 추가
		addLast(value);
		return true;
	}

	@Override
	public void add(int index, E value) { // 중간 삽입
		if (index >= size || index < 0)
			throw new IndexOutOfBoundsException();

		if (index == 0) {
			addFirst(value);
			return;
		} else if (index == size) {
			addLast(value);
			return;
		} else {
			Node<E> newNode = new Node<E>(value);
			Node<E> prev = search(index - 1);

			newNode.next = prev.next;
			prev.next = newNode;
			size++;
		}
	}

	public E removeFirst() {
		if (size == 0)
			throw new IndexOutOfBoundsException();

		E e = head.data;
		head = head.next;

		if (head == null)
			tail = null;

		size--;
		return e;
	}

	public E removeLast() {
		if (size == 0)
			throw new IndexOutOfBoundsException();

		if (size == 1)
			return removeFirst();
		Node<E> prev = search(size - 2);
		E e = prev.data;

		prev.next = null;
		tail = prev;
		size--;
		return e;
	}

	@Override
	public E remove(int index) {
		if (index >= size || index < 0)
			throw new IndexOutOfBoundsException();

		if (index == 0)
			return removeFirst();
		else if (index == size - 1)
			return removeLast();
		else {
			Node<E> prev = search(index - 1);
			E e = prev.next.data;
			prev.next = prev.next.next;
			size--;
			return e;
		}
	}

	@Override
	public boolean remove(Object value) {
		Node<E> n = head;

		for (int i = 0; n != null; n = n.next, i++) {
			if (n.data.equals(value)) {
				remove(i);
				return true;
			}
		}

		return false;
	}

	@Override
	public E get(int index) {
		return search(index).data;
	}

	@Override
	public int indexOf(Object value) {
		int index = 0;
		for (Node<E> n = head; n != null; n = n.next) {
			if (value.equals(n.data))
				return index;
			index++;
		}
		return -1;
	}

	@Override
	public boolean contains(Object value) {
		return indexOf(value) > 0;
	}

	@Override
	public void set(int index, E value) {
		search(index).data = value;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public void clear() {
		head = tail = null;
		size = 0;
	}

}

class Node<E> {
	E data;
	Node<E> next;

	Node(E data) {
		this.data = data;
		this.next = null;
	}
}