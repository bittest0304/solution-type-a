package problem04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int gameCount = 0;
		File file = new File("GameResult.txt");
        FileWriter writer = null;
				
		long startTime = System.currentTimeMillis();				
		
		ArrayList targetList = new ArrayList<Integer>();
		
		int num = (int)(Math.random()*10);
		while(true){
			if(num != 0) {
				targetList.add(num);		
				break;
			}
			num = (int)(Math.random()*10);						
		}		
		
		for(int i = 1 ; i < 3 ; i++) {
			int tmp = (int)(Math.random()*10);
			while( num == tmp) {
				tmp = (int)(Math.random()*10);
			}
			targetList.add(tmp);			
		}
		System.out.println(targetList);
		while(true) {
			int userNumber;			
			int S = 0;
			int B = 0;
			int O = 0;		
			Scanner scan = new Scanner(System.in);			
			userNumber = scan.nextInt();
			int compareNum = userNumber;
			
			int cnt = 2;
			while(userNumber > 0) {
				int r = userNumber % 10;
				if(targetList.contains(r)) {
					if(targetList.indexOf(r) == cnt) {
						S++;
					}else {
						B++;
					}
				}else {
					O++;
				}
				userNumber /= 10;
				cnt--;				
			}
			gameCount++;
			System.out.println(gameCount + " - " + "S:" + S + ", B:" + B + ", O:" + O);
			
			int target = (int)targetList.get(0)*100 + (int)targetList.get(1)*10 + (int)targetList.get(2);
			if(compareNum == target) {
				System.out.println("(종료)");
				long endTime = System.currentTimeMillis();				
				String time = Integer.toString(target)+ "/" + Integer.toString(gameCount)+ " : " + Long.toString((endTime - startTime)/1000/60)+ ":" + Long.toString((endTime - startTime)/1000%60) + "\n";
		        try {
					writer = new FileWriter(file, true);
				} catch (IOException e) {
					e.printStackTrace();
				}
	            try {
					writer.write(time);
				} catch (IOException e) {
					e.printStackTrace();
				}
	            try {
					writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}			
		}

	}
}