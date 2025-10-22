package finalProject;

public interface ArrayList<T> {
	void add(T value);
	
	T get(int index);
	
	T remove(int index);
	
	int size();
}

class CustomArrayListImp<T> implements ArrayList {
	
	private int size;
	private int capacity;
	private Object[] internalArray;
	
	public CustomArrayListImp(int capacity) {
		this.capacity = capacity;
		internalArray = new Object[this.capacity];
	}

	@Override
	public void add(Object value) {
		// TODO Auto-generated method stub
		if(capacity == internalArray.length){
			 Object[] largerArray = new Object[(int) Math.floor(this.capacity * 1.5)];
			 
			 for(int i = 0; i < capacity; i++){
				 largerArray[i] = internalArray[i];
			 }
			 
			 internalArray = largerArray;
		}
		internalArray[capacity] = value;
		capacity ++;
		
		
		
	}

	@Override
	public Object get(Object index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}