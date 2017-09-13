package KBC;

public class Cases {
	
	void cases() {
		boolean lifeLine[] = new boolean[4];
		lifeLine[1] = true;
		lifeLine[2] = true;
		lifeLine[3] = true;
		lifeLine[4] = true;
		
		switch(Answer) {
		case 1:
			if(lifeLine[1] = false) {
				System.out.println("You can not use this lifeline");
				break;
			}
			else {
				System.out.println(Correct Answer);
				lifeLine[1] = false;
				break;
			}
		case 2:
			if(lifeLine[2] = false) {
				System.out.println("You can not use this lifeline");
				break;
			}
			else {
				question(q++)
				lifeLine[2] = false;
				break;
			}
			
			
			
		} 
	}
}
