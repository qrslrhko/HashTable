# HashTable


##### learn how to generate different number of id and scores
```java
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
```
##### how to store id and score array into the hash table
```java
		for(i=0;i<10; i++){
		hmap.put(mylist[i],student_socre[i]) ;
		}
```
##### how to pass arguments to other classes

The output is like this:
```java
ID:1    Score is :78
ID:2    Score is :92
ID:3    Score is :83
ID:4    Score is :30
ID:5    Score is :77
ID:6    Score is :42
ID:7    Score is :53
ID:8    Score is :11
ID:9    Score is :42
ID:10    Score is :53
```
