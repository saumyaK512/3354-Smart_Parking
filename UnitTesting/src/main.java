import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class main {
	
	private static int updateOccupancy(String lot, int space, boolean occupancy) {
		// should be database call for lot
		// hardcoded as "returning" 148 if it is "PS4" and failure otherwise for demo purposes
		if(lot.compareTo("PS4") != 0) {
			return -1;
		}
		int numOfSpaces = 148;
		
		// compare space number to num of spaces range
		if (space < 1 || space > numOfSpaces) {
			return -2;
		}
		
		// should be database call to update info
		// hardcoded as a success always
		return 0;
	}
	
	@Test
	public void tests() {
		assertEquals("Test for all valid", 0, updateOccupancy("PS4",10,true));
		assertEquals("Test for invalid lot", -1, updateOccupancy("test",10,true));
		assertEquals("Test for valid lot, negative space", -2, updateOccupancy("PS4",-10,true));
		assertEquals("Test for valid lot, space too high", -2, updateOccupancy("PS4",1000,true));
		assertEquals("Test for valid space lower boundary", 0, updateOccupancy("PS4",1,true));
		assertEquals("Test for invalid space lower boundary", -2, updateOccupancy("PS4",0,true));
		assertEquals("Test for valid space upper boundary", 0, updateOccupancy("PS4",148,true));
		assertEquals("Test for invalid space upper boundary", -2, updateOccupancy("PS4",149,true));
	}
	
	public static void main(String[] args) {
		// Main method
	}

}
