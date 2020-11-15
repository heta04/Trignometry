import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TrignometricTest {


   
	@Test
	void PowerTest(){
		
		assertEquals(Math.pow(2, 2), Trignometic.power(2,2));
		assertEquals(Math.pow(2, 3), Trignometic.power(2,3));
		assertEquals(Math.pow(2, 4), Trignometic.power(2,4));
		assertEquals(Math.pow(2, 5), Trignometic.power(2,5));
		
	}
	
	
	
	@Test
	void toradiantest() {
				
		 assertEquals(Math.toRadians(20), Trignometic.toradian(20),0.0001);
		 assertEquals(Math.toRadians(120), Trignometic.toradian(120),0.0001);
		 assertEquals(Math.toRadians(270), Trignometic.toradian(270),0.0001);
		 assertEquals(Math.toRadians(340), Trignometic.toradian(340),0.0001);
				
	}
	
	@Test
	void sin_radiantest() {
		
		 assertEquals(Math.sin(0.3490658503988659), Trignometic.sine2(0.3490658503988659),0.0001);
		 assertEquals(Math.sin(1.9198621771937625), Trignometic.sine2(1.9198621771937625),0.0001);
		 assertEquals(Math.sin(2.0943951023931953), Trignometic.sine2(2.0943951023931953),0.0001);

	}
	
	@Test
	void sin_degreetest() {
			
		 assertEquals(Math.sin(Math.toRadians(20)), Trignometic.sine2(Trignometic.toradian(20)),0.0001);
		 assertEquals(Math.sin(Math.toRadians(110)), Trignometic.sine2(Trignometic.toradian(110)),0.0001);
		 assertEquals(Math.sin(Math.toRadians(270)), Trignometic.sine2(Trignometic.toradian(270)),0.0001);
			
	}
	
	@Test
	void cos_radiantest() {
			
		 assertEquals(Math.cos(0.3490658503988659), Trignometic.cos(0.3490658503988659),0.0001);
		 assertEquals(Math.cos(1.9198621771937625), Trignometic.cos(1.9198621771937625),0.0001);
		 assertEquals(Math.cos(2.0943951023931953), Trignometic.cos(2.0943951023931953),0.0001);
			
	}
	
	@Test
	void cos_degreetest() {
			
		 assertEquals(Math.cos(Math.toRadians(20)), Trignometic.cos(Trignometic.toradian(20)),0.0001);
		 assertEquals(Math.cos(Math.toRadians(110)), Trignometic.cos(Trignometic.toradian(110)),0.0001);
		 assertEquals(Math.cos(Math.toRadians(120)), Trignometic.cos(Trignometic.toradian(120)),0.0001);
			
	}
	
	@Test
	void tan_radiantest() {
		
		 assertEquals(Math.tan(0.3490658503988659), Trignometic.tan(0.3490658503988659),0.001);
		 assertEquals(Math.tan(1.9198621771937625), Trignometic.tan(1.9198621771937625),0.001);
		 assertEquals(Math.tan(2.0943951023931953), Trignometic.tan(2.0943951023931953),0.0001);
			
	
				
	}
	
	@Test
	void tan_degreetest() {
			
		 assertEquals(Math.tan(Math.toRadians(20)), Trignometic.tan(Trignometic.toradian(20)),0.0001);
		 assertEquals(Math.tan(Math.toRadians(110)), Trignometic.tan(Trignometic.toradian(110)),0.0001);
		 assertEquals(Math.tan(Math.toRadians(120)), Trignometic.tan(Trignometic.toradian(120)),0.0001);
				
	}
}
