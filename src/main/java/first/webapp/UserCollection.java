package first.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import first.webapp.User;

import java.util.*;

/**
 * Servlet implementation class UserCollection
 */
@WebServlet("/UserCollection")
public class UserCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ArrayList<User> users = new ArrayList<>();
	private int capacity;

	public UserCollection() {
		users.add(new User("Zayne", "password", "email.com", "English"));
		users.add(new User("Jane", "pass", "electronicmail.com", "Chinese"));

		this.capacity = 20;
	}

	public UserCollection(int capacity) {
		this.capacity = capacity;
	}

	public List<User> getUsers() {
		return users;
	}

	public void addUser(User user) {
		if (users.size() != capacity) {
			users.add(user);
		}
	}
}
