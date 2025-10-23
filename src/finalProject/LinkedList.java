package finalProject;

public class LinkedList <T>{
		private int size;
		private Node<T> head;
		
		public int size()
		{
			return size;
		}
		
		public void add(T item)
		{
			 Node<T> node = new Node<T>(item);
			 
			 //If the list is empty, make this new node the first node
		     if (this.head == null) 
		     {
		     	this.head = node;
		     	this.size++;
		     	return;
		     }
		     
		     Node<T> currentNode = head;
		     //Iterate until the last node in the list
		     while(currentNode.next != null)
		     {
		    	 currentNode = currentNode.next;
		     }
		     
		     //Add this new node to the end of the list
		     currentNode.next = node;
		     this.size++;
		}
		
		/*  Maybe do these later
		public void add(int index, Node<T> node)
		{
			
		}
		
		public void addFirst(Node<T> node)
		{
			
		}
		*/
		
		public boolean contains(Object o)
		{
			Node<T> currNode = head;
			while(currNode.next != null)
			{
				if(currNode.getValue().equals(o))
				{
					return true;
				}
				currNode = currNode.next;
			}
			return false;
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
		
		/*  Maybe later
		public void remove()
		{
			
		}
		
		public void remove(int index)
		{
			
		}
		
		
		public void removeFirst()
		{
			
		}
		*/
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
		
		/*  Maybe later
		public T getFirst()
		{
			return null;
		}
		
		public T getLast()
		{
			return null;
		}
		
		public int indexOf(Object o)
		{
			return 0;
		}
		
		public void clear()
		{
			
		}
		*/
		
		
		
		
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

