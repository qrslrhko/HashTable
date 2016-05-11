import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class score {

	int[] mylist = new int[10];
	String[] student_socre  = new String[10];	
	// declare HashMap
	HashMap<Integer,String>  hmap = new HashMap<Integer,String>();
	//get a Set view of the mappings contained in this map.
	Set h_set = hmap.entrySet(); 
	public void randomID(){
		
		int i,j;
		int num =0;
	
		for(i=0; i<10;i++){
			int flag = 0;
			Random rand = new Random();
			num = rand.nextInt(10)+1;
		
				for( j=0;j<10;j++){
							
					if(mylist[j] == num){									
						i = i-1;
						flag=1;
						break;					
					}
			
				}
				
				if(flag == 0){
					mylist[i] = num;							
				}
					
		}
	}
	
	public void randomScore(){	
		int i,j;
		int R=0;
		
		for (i=0; i<10 ; i++){
			int flag_s = 0;
			Random rand_s = new Random();
			R = rand_s.nextInt(99)+1;
			String str = Integer.toString(R);
		
			for(j=0; j<10 ; j++){
				if(student_socre[j] == str){
						i = i-1;
						flag_s = 1;
				}
			}
			if(flag_s ==0){
				student_socre[i] = str;
				
			}
		
		}
			
	}
	
	public void hashTable(){
		//HashMap<Integer,String>  hmap = new HashMap<Integer,String>();
		//Set h_set = hmap.entrySet();  //get a Set view of the mappings contained in this map.
		int i;		
		
		for(i=0;i<10; i++){
		hmap.put(mylist[i],student_socre[i]) ;
		}		
		//Iterator iterator =	h_set.iterator();  // this is like a loop function
		
		// dispaly contents by iterator function
//		while( iterator.hasNext()){
//			Map.Entry Entry  = (Map.Entry)iterator.next();	
//
//			System.out.print("ID:" + Entry.getKey());
//			System.out.print("  ");
//			System.out.println("Score is :" +Entry.getValue());
//			//System.out.printf(" ID:" + Entry.getKey(), " Score is: " + Entry.getValue());
//		}
	}
			
	public void printResult(){
//		for(i=0;i<10;i++){
//		System.out.print("Student " +mylist[i]);
//		System.out.print(" ");
//		System.out.println("score is : " +student_socre[i]);
//		}
		
		// this is like a loop function
		Iterator iterator_1 = h_set.iterator();
		while (iterator_1.hasNext()){
			Map.Entry whole_map = (Map.Entry)iterator_1.next();
			System.out.print("ID: " + whole_map.getKey());
			System.out.print("   Score is :" +whole_map.getValue());
			System.out.println("   ");
		}
		
	}

	public static void main(String args[]){
		
//	BufferReader = 	br = new BufferReader(new InputStreamReader(System.in));
	score AAA = new score();
	AAA.randomID();	
	AAA.randomScore();
	AAA.hashTable();
	AAA.printResult();

	}

}
