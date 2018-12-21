package pi_system;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;







public class ManageAppointmentsTest {

	

	@Test

	public void testCreate() {

		

		ManageAppointment myapp = new ManageAppointment();

		myapp.app_Create("1","20181225","home","kevin");

		assertTrue(myapp.appointment[0][3] == "kevin");

	}

	

	@Test

	public void testUpdate() {

		

		ManageAppointment myapp = new ManageAppointment();

		myapp.app_Create("1","20181225","home","kevin");

		myapp.app_Update(1,3,"harry");

		assertTrue(myapp.appointment[0][3] == "harry");

	}



}
