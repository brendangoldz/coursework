package ArrayPractice;

public class ArrayTest implements ArrayInter{
	int length;
	int[] newArray;
	int capacity;
	
	public ArrayTest(){
		capacity = 50;
		length = 0;
		newArray = new int[capacity];
	}
	public ArrayTest(int newCapacity, int newLength){
		capacity = newCapacity;
		length = newLength;
		newArray = new int[capacity];
	}
	@Override
	public int addTo(int i) {
		// TODO Auto-generated method stub
		//System.out.println(length + "" + capacity);
		int l = length;
		if(length<=capacity){
			length++;
			newArray[l] = i;
		}
		return l;
	}

	@Override
	public int removeTo(int j) {
		// TODO Auto-generated method stub
		int temp = 0;
		int position = 0;
		for(int i = 0; i<newArray.length;i++){
			if(newArray[i]==j){
				position = i;
				temp = newArray[i];
				newArray[newArray.length-1] = newArray[i];
				length--;
			}
		}
		return position;
	}
	@Override
	public int search(int searchValue) {	
		// TODO Auto-generated method stub
		int position = 0;
		for(int i = 0; i<newArray.length;i++){
			if(searchValue == newArray[i]){
				position = i;
			}
		}
		return position;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		int temp;
		for(int i = 0; i<newArray.length;i++){
			if(newArray[i]<=newArray[i+1]){
				i++;
			}
			else{
				temp = newArray[i];
				newArray[i] = newArray[i+1];
				newArray[i+1] = temp;
			}
		}
		
	}

	@Override
	public int getElement(int k) {
		// TODO Auto-generated method stub
		return newArray[k];
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return newArray.length;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(length == capacity){
			return true;
		}
			return false;
	}
	public String toString(){
		for(int i = 0; i<newArray.length;i++){
			System.out.println(newArray[i]);
		}
		return "\nCurrent Array";
		
	}
}
