package Exo;

public class List {

	 private int souheil;
	
	private static final int MAX_SIZE = 10000;
	 private Element[] arr;
	 private int listLength;
	private List l;
	peivate int c0=0;
	
	
	 public List emptyList() {
		 List L = new List();
		 L.listLength = 0;
		 return L;
		 }

	 
	 
	 
	 public List insert(List L, int p, Element e) {
		 if (L.listLength < MAX_SIZE) {
		  
			 if (L.listLength != 0 && p != L.listLength + 1 ) {
				 
				 for(int i=L.listLength ; i<= p; i++ ) {
					 
					 L.arr[i + 1] = L.arr[i];
					 
		}
	}
			 
			 
			 L.arr[p] = e;
					 L.listLength = L.listLength + 1;
					 
					 
			  }
		 else {
		  System.out.println("Insertion is impossible, the list is full.");
		 }
		 return L;
		 }
	 
	 
	 
	 public List delete (List L, int p) {
		
		 
		 if(L.listLength  != 1) {
			 
			 for(int i =p  ; i<= L.listLength-1; i++)
			 {
				 arr[i]= arr[i+1];
				 

			 } 
		 }
		 
		 L.listLength--;
		 return L ;
		 
		 
		}
	 
	 
	 
	 
	 public Element access(List L, int p) {
		 
		 
		return arr[p];
		 
	 }
	 
	 
	 
	 public int lengthIterative(List L) {
	
		 return L.listLength;
		 
		 
		 
		}
		public int lengthRecursive(List L) {
	
			
		if(L.listLength == 0) {
			
			return 0;
			
		}
		else {
		
			List varKp= new List();
			
			for(int i = 0 ; i<= L.listLength; i++) {
				 
				varKp.arr[i]= L.arr[i];
				
			}
			
			varKp.delete(L, 1);
			return 1+L.lengthIterative(varKp);
			
		}
			
		}



		public boolean isEmpty(List L) {
			 
				return(L.listLength==0);
			
			}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

