//To retrieve data from database about position of the player and move checker and reinsert new position of the player into database
public class Movement_monopoly {
	int Row = 0, Col = 0;
	Movement_monopoly(int steps) {
		if (Row <= 8 && Col == 0 && Row!=0) {
			Row = Row - steps;
		} else {
			if(Row==8) {
				Col=Col-steps;
			}
			else {
				Col = Col + steps;
				if (Row >= 0 && Col > 8) {
					while (Col > 8) {
						Row++;
						Col--;
					}
				}
				if (Row >= 8 && Col >= 8) {
					while(Col>8) {
						Col--;
						Row++;
					}
					while (Row > 8) {
						Col--;
						Row--;
					}
				}
			}	
		}
	}
}
