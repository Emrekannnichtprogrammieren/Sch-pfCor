package cor;

import java.util.ArrayList;

public class LinkedList {
	private Node head;
	
	public void add(int value) {
		Node tmp = new Node(value);
		
		if (head == null) {
			head = tmp;
			return;
		} 
		
		Node it;
		it = head;
		
		while (it.hasNext()) {
			it = it.next();
		}
		
		it.setNext(tmp);	
	}
	

	public void delete(int pos) {
		
		if(pos == 0) {
			head = head.next();
			return;
		}
		Node del = head;
		for (int x = 0; x < pos -1; x++) {
			if(!del.hasNext()) {
				return;
			}
			del = del.next();
		}
		if(!del.hasNext()) {
			del.setNext(null);
			return;
		}
		
	Node Node2 = del.next().next();
	del.setNext(Node2);
		
		
	}
	
	
	@Override
	public String toString() {
		String ret = "";
		
		Node it = head;
		while (it.hasNext()) {
			ret += "" + it.getValue() + " ";
			it = it.next();
		}
		ret += "" + it.getValue() + " ";
		return ret;
	}	
	
	
	
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(4);
		ll.add(6);
		ll.add(8);
		ll.add(32);
		ll.add(41);
		ll.add(55);
		ll.add(77);
		System.out.println(ll);
		
		ll.delete(4);
		ll.delete(6);
        System.out.println(ll);
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(4);
//		ArrayList<Integer> pointer = al;
//		for (int i = 0; i < pointer.size(); i++) {
//			System.out.println(pointer.get(i));
//		}
	}
}
