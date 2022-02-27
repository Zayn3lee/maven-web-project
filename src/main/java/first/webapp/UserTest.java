package first.webapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	private UserCollection uc;
	private User u1;
	private User u2;
	private final int USER_COLLECTION_SIZE = 2;
	
	@BeforeEach
	void setUp() throws Exception {
		//Arrange
		uc = new UserCollection();
		u1 = new User("Zayne", "password", "email.com", "English");
		u1 = new User("Jane", "pass", "electronicmail.com", "Chinese");
		
		uc.addUser(u1);
		uc.addUser(u2);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetUsers() {
		List<User> testUc = uc.getUsers();
		//Assert that the user collection is equal to USER_COLLECTION_SIZE
		assertEquals(testUc.size(), USER_COLLECTION_SIZE);
	}

	@Test
	void testAddUser() {
		List<User> testUc = uc.getUsers();
		// Assert that the User collection is equal to collection size which is 2;
		assertEquals(testUc.size(), USER_COLLECTION_SIZE);
		
		// Act
		uc.addUser(u1);
		// Assert that the user collection has increased by 1
		assertEquals(uc.getUsers().size(), USER_COLLECTION_SIZE+1);
	}

}
