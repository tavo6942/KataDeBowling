package cl.ubb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class GameTest {
	
	Game gm;
	int result;

	@Before
	public void setUp(){
		gm = new Game();
	}

	@Test
	public void rollthreeAndRollFiveShoulbeEight() {
		gm.Roll(3);
		gm.Roll(5);
		result=gm.Score();
		
		assertEquals(8,result);
	}

}
