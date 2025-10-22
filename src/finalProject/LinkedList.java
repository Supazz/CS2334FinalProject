package finalProject;

public class LinkedList <T>{
		private int size;
		private Node<T> head;
		
		public int size()
		{
			return 0;
		}
		
		public void add(Node<T> node)
		{
			
		}
		
		public void remove(T value) {
			if (this.head == null ) {
				return;
			}
			if (this.head.value == value) {
				this.head = this.head.next;
				this.size--;
				return;
			}
			
			Node <T> currentNode = this.head;
			while ( currentNode.next != null) {
				if (currentNode.next.value == value) {
				currentNode.next = currentNode.next.next;
				this.size--;
				return;
			}
			currentNode = currentNode.next;
		}
		}
		
		public T get(int index) {
			if (this.size ==0 || index  > size -1) {
				return null;
			}
			if (index == 0) {
				return (T) this.head.value;
			}
			int currentIndex =0;
			Node <T> currentNode = this.head;
			
			while ( currentNode.next != null) {
				currentNode = currentNode.next;
				if (++currentIndex == index) {
					return (T) currentNode.value;
				}
			}
			return null;
		}
		
		public void clear()
		{
			
		}
		
		
		
		
		
		private static class Node<T>
		{
			private T value;
			private Node<T> next;
			
			public Node(T value)
			{
				this.value = value;
			}
			
			public T getValue()
			{
				return value;
			}
		}
	}

