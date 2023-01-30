package CSW25;


public class HighArray {

	private int[] a;
	private int nElems;
	
	public HighArray(int max) {
		a = new int[max];
		nElems = 0;
	}
	public  void insert(int value) {
		a[nElems] = value;
		nElems++;
	}
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(a[i]);
		}
	}
	public boolean find(int key) {
		int j;
		for (j = 0; j < nElems; j++)
			if (a[j] == key)
				break;
		if (j == nElems)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		int maxSize = 100;
		HighArray h = new HighArray(maxSize);

		h.insert(20);
		h.insert(77);
		h.insert(44);
		h.insert(12);
		h.insert(34);
		h.insert(11);
	
		h.display();
		
		int searchKey = 55;
		if(h.find(searchKey))
			System.out.println("Element is found");
		else
			System.out.println("Element is not found");
	}
}
	