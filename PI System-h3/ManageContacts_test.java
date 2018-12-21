package pi_system;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManageContacts_test {

	@Test
	void test_create() {
		ManageContacts mcc = new ManageContacts();
		mcc.create("tori", "12342345", "jip10kr");
		assertTrue(mcc.contacts[0][0]=="dotori");
	}
	@Test
	void test_delete() {
		ManageContacts mcd = new ManageContacts();
		mcd.create("tori", "12342345", "jip10kr");
		mcd.delete("dotori");
		mcd.delete("y");
		assertNull(mcd.contacts[0][0]);
		
	}

}
