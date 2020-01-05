import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		
		int candidatenum1=0;
		int candidatenum2=0;
		
		
		for(int i=0; i<votes.size(); i++) {
			if(votes.get(i).equalsIgnoreCase("POPE FRANCIS")) {
				candidatenum1+=1;
			}
			else if(votes.get(i).equalsIgnoreCase("edward Snowden" )) {
				candidatenum2+=1;
			}
			
		}
		if(candidatenum1>candidatenum2) {
			return "pope francis";
		}
		else if (candidatenum1<candidatenum2) {
			return "edward snowden";
		}
		else {
			return "TIE";
		}

	}
}
