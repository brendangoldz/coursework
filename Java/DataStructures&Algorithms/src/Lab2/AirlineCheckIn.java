package Lab2;

import java.util.*;


public class AirlineCheckIn {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int srvcAvg = 0, srvcMax = 0, coachSrvd = 0, firstSrvd = 0;
		double coachCap = 0, firstCap = 0;
		Scanner s = new Scanner(System.in);
		impQueue<Integer> firstClass = new Queue<>();
		impQueue<Integer> coach = new Queue<>();
		
		System.out.println("How long do you want this experiment to last?");
		int duration = s.nextInt();
		double arrTime = (Math.round((Math.random()*duration)));
		
		System.out.println("How frequently do coach passengers arrive?");
		double R2 = s.nextDouble();
		coachCap = R2*arrTime;
		for(int i = 0; i<coachCap; i++){
			coach.enqueue(i);
		}
		
		System.out.println("How frequently do first class passengers arrive?");
		double R1 = s.nextDouble();
		firstCap = R1*arrTime;
		for(int j = 0; j<firstCap; j++){
			firstClass.enqueue(j);
		}
		
		System.out.println("Whats the max amount of time for service for coach?");
		int S1 = s.nextInt();
		int srvcCoach = 0;
		
		System.out.println("Whats the max amount of time for service for first class?");
		int S2 = s.nextInt();
		int srvcFirst = 0;

		
		for(int k = 0; k<duration; k++){
			srvcFirst = (int) ((Math.random()*S2)+1);
			srvcCoach = (int) ((Math.random()*S1)+1);
				if(k>=srvcCoach){
					System.out.print("\nNext Coach person in line: " + coach.dequeue());
					coachSrvd++;
					srvcAvg += srvcCoach;
					srvcCoach = (int) ((Math.random()*S1)+1);
					if(srvcCoach>srvcMax){
						srvcMax = srvcCoach;
					}
				}
				else{
					System.out.println("\n.");
				}
				
				if(k>=srvcFirst){
					if(firstClass.size()>0)
					{
					System.out.print("\nNext First Class person in line: " + firstClass.dequeue());
					firstSrvd++;
					srvcAvg += srvcFirst;
					srvcFirst = (int) ((Math.random()*S2)+1);
					if(srvcFirst>srvcMax){
						srvcMax = srvcFirst;
					}
					}
				}
				else if(firstClass.size()==0 && coach.size()>0){
					System.out.print("\nNext Coach person in line: " + coach.dequeue());
					coachSrvd++;
					srvcAvg += srvcCoach;
					srvcCoach = (int) ((Math.random()*S1)+1);
					if(srvcCoach>srvcMax){
						srvcMax = srvcCoach;
					}
				}
				else{
					System.out.println("\n.");
				}
				
		}
		srvcAvg = srvcAvg/(coachSrvd+firstSrvd);
		
		System.out.println("\n\nAverage Service Time: " + srvcAvg + " minutes");
		/**if(S2>S1){
		System.out.println("\nMax Service Time; Coach: " + S2 + " minutes");
		}
		else{
		System.out.println("\nMax Service Time; First Class: " + S1 + " minutes");
		}**/
		System.out.println("\nMax Service Time: " + srvcMax + " minutes");
		System.out.println("\nCoach Passengers Served: " + coachSrvd + " out of "
				+ coachCap + " | size check: " + coach.size() + " |");
		System.out.println("\nFirst Class Passengers Served: " + firstSrvd + " out of "
				+ firstCap + " | size check: " + firstClass.size() + " |");
		
		
	}
}
