//To retrieve data from database about position of the player and move checker and reinsert new position of the player into database
public class Movement_monopoly {
	int Row = 0;
	int Col = 10;
	Movement_monopoly(int steps) {
		if(Row==0 && Col>0) {
			if(steps>Col) {
				Row=Row-Col+steps;
			}
			while(steps!=0) {
				Col--;
				steps--;
			}
		}
		if(Col==0 && Row<10) {
			if(steps>10-Row) {
				Col=Col-10+Row+steps;
				steps=steps-Col;
			}
			while(steps!=0) {
				Row++;
				steps--;
			}
		}
		if(Row==10 && Col<10) {
			if(steps>10-Col) {
				Row=Col+steps-10+Row;
				steps=steps-Row;
			}
			while(steps!=0) {
				Col++;
				steps--;
			}
		}
		if(Col==10 && Row>0) {
			if(steps>Row) {
				Col=Col-Row;
				steps=steps+10-Row;
			}
			while(steps!=0) {
				Row--;
				steps--;
			}
		}
		rules(Row, Col);
	}
	void rules(int Row, int Col) {
		new Monopoly_rules(Row, Col);
	}
}
