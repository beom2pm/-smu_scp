package pi_system;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class Todo_list_test {

	@Test
	void test_create() {
		Todo_list create=new Todo_list();
		create.List_create("test", "test description", "12/21", "12/22");
		assertNotNull(create.todo_array[0][0]);
		
	}
	@Test
	void test_delete() {
		Todo_list create=new Todo_list();
		create.List_create("test", "test description", "12/21", "12/22");
		create.List_delete("test");
		assertNull(Todo_list.todo_array[0][0]);
		
		
		
	}
}
