import static org.junit.jupiter.api.Assertions.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;

class TrignometricTest {


   
	DecimalFormat df = new DecimalFormat("#.######");
	
	
	TrignometricTest(){
		 df.setRoundingMode(RoundingMode.CEILING);
			
	}
    
	@Test
	void toradiantest() {
				
		 assertEquals(df.format(Math.toRadians(90)), df.format(Trignometic.toradian(90)));
		 assertEquals(df.format(Math.toRadians(180)), df.format(Trignometic.toradian(180)));
		 assertEquals(df.format(Math.toRadians(45)), df.format(Trignometic.toradian(45)));
		 assertEquals(df.format(Math.toRadians(30)), df.format(Trignometic.toradian(30)));
			
	}
	
	@Test
	void sin_radiantest() {
		
		 assertEquals(df.format(Math.sin(1.5708)), df.format(Trignometic.sine2(1.5708)));
		 assertEquals(df.format(Math.sin(3.14159)), df.format(Trignometic.sine2(3.14159)));
		 assertEquals(df.format(Math.sin(0.785398)), df.format(Trignometic.sine2(0.785398)));
		 assertEquals(df.format(Math.sin(0.523599)), df.format(Trignometic.sine2(0.523599)));
			
	}
	
	@Test
	void sin_degreetest() {
			
		 assertEquals(df.format(Math.sin(90)), df.format(Trignometic.sine2(90)));
		 assertEquals(df.format(Math.sin(180)), df.format(Trignometic.sine2(180)));
		 assertEquals(df.format(Math.sin(45)), df.format(Trignometic.sine2(45)));
		 assertEquals(df.format(Math.sin(30)), df.format(Trignometic.sine2(30)));

	}
	
	@Test
	void cos_radiantest() {
			
		 assertEquals(df.format(Math.cos(1.5708)), df.format(Trignometic.cos(1.5708)));
		 assertEquals(df.format(Math.cos(3.14159)), df.format(Trignometic.cos(3.14159)));
		 assertEquals(df.format(Math.cos(0.785398)), df.format(Trignometic.cos(0.785398)));
		 assertEquals(df.format(Math.cos(0.523599)), df.format(Trignometic.cos(0.523599)));
			
	}
	
	@Test
	void cos_degreetest() {
			
		 assertEquals(df.format(Math.cos(90)), df.format(Trignometic.cos(90)));
		 assertEquals(df.format(Math.cos(180)), df.format(Trignometic.cos(180)));
		 assertEquals(df.format(Math.cos(45)), df.format(Trignometic.cos(45)));
		 assertEquals(df.format(Math.cos(30)), df.format(Trignometic.cos(30)));
			
	}
	
	@Test
	void tan_radiantest() {
		
		 assertEquals(df.format(Math.tan(1.5708)), df.format(Trignometic.tan(1.5708)));
		 assertEquals(df.format(Math.tan(3.14159)), df.format(Trignometic.tan(3.14159)));
		 assertEquals(df.format(Math.tan(0.785398)), df.format(Trignometic.tan(0.785398)));
		 assertEquals(df.format(Math.tan(0.523599)), df.format(Trignometic.tan(0.523599)));
	
				
	}
	
	@Test
	void tan_degreetest() {
			
		assertEquals(df.format(Math.tan(90)), df.format(Trignometic.tan(90)));
		 assertEquals(df.format(Math.tan(180)), df.format(Trignometic.tan(180)));
		 assertEquals(df.format(Math.tan(45)), df.format(Trignometic.tan(45)));
		 assertEquals(df.format(Math.tan(30)), df.format(Trignometic.tan(30)));
			
	}
}
