package assignment18;

public class Prize implements Comparable<Prize>{
	String name;
	int score;
	
	
	public Prize(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}


    @Override
    public int compareTo(Prize o) {
    	int r = score-o.score;
    	if(r == 0) {
    		return 1;
    	}else {
    		return r;
    	}
    
    }
	
	
	

}
