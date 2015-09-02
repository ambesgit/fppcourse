package lessonone_two;

public class ProblemNine {
public static void getStudentGrad(){
	int count=0;
	
	char[] key={'D','B','D','C','C','D','A','E','A','D'};
	char[][] studentRecord={
			{'A','B','A','C','C','D','E','E','A','D'},
			{'D','B','A','B','C','A','E','E','A','D'},
			{'E','D','D','A','C','B','E','E','A','D'},
			{'C','B','A','E','D','C','E','E','A','D'},
			{'A','B','D','C','C','D','E','E','A','D'},
			{'B','B','E','C','C','D','E','E','A','D'},
			{'B','B','A','C','C','D','E','E','A','D'},
			{'E','B','E','C','C','D','E','E','A','D'}
			};
	for(int i=0;i<key.length;i++){
		if(i<studentRecord.length){
		for(int j=0;j<studentRecord[0].length;j++){
			if(key[j]==studentRecord[i][j]){
				count++;
			}
		}
		
		System.out.printf("student %d"+"'"+"s correct count is %d\n",i,count);
		count=0;
		}
	}
}
}
