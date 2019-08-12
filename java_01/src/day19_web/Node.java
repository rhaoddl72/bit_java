package day19_web;

public class Node<E> {
	
	E data;
	Node<E> next;
	//제네릭 노드
	
	
	public Node(E data, Node<E> next) {
		super();
		this.data = data;
		this.next = next;
	}


	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
	
	
	

}
