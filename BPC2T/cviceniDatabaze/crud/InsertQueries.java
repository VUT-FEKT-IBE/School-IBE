package cz.vutbr.feec.dbconnection.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cz.vutbr.feec.dbconnection.dbconn.DBConnection;

/**
 * 
 * @author Pavel Šeda (154208)
 *
 */
public class InsertQueries {

	public InsertQueries() {
	}

	/**
	 * Template metoda, do které se dá vkládat libovolný SQL INSERT pøíkaz.
	 * 
	 * POZN: není vhodné implementovat své metody tímto zpùsobem, daleko vhodnìjší
	 * je implementovat konkrétní metody (napø. insertNewUser(String email, char[]
	 * password) pomocí PreparedStatements, do kterých vkládáme konkrétní parametry)
	 * 
	 * @param insertQuery øetìzec pøedstavující pøíkaz INSERT
	 */
	public void performInsertQuery(String insertQuery) {
		if (insertQuery == null) {
			throw new NullPointerException("query must not be null!");
		} else if (insertQuery.isEmpty()) {
			throw new IllegalArgumentException("query must not be empty!");
		}
		Connection conn = DBConnection.getDBConnection();
		try (PreparedStatement prStmt = conn.prepareStatement(insertQuery);) {
			int rowsInserted = prStmt.executeUpdate();
			// System.out.println("Bylo vloženo uživatelù: " + rowsInserted);
			System.out.println("Byl vložen uživatel s emailem: " + "myname123@stud.feec.vutbr.cz");
		} catch (SQLException e) {
			System.out.println("Uživatel s emailem: " + "myname123@stud.feec.vutbr.cz "
					+ "již byl vložen nemusíte jej vkládat znovu");
			// e.printStackTrace();
		}
	}

	/**
	 * Úkol: Vaším úkolem je pøiøadit INSERT pøíkaz do promìnné insertUser, tak aby
	 * se vytvoøil nový uživatel dle zadaných parametrù
	 * 
	 * HINT: V této metodì jsou využity preparedStatements, takže se parametr emailu
	 * nastaví až pozdìji pøíkazem prStmt.setString(1, email)... Pro pøedstavu, jak
	 * se píší prepared statements se podívejte na následující odkaz:
	 * https://www.mkyong.com/jdbc/jdbc-preparestatement-example-insert-a-record/
	 * 
	 * @param email   uživatele
	 * @param name    uživatele
	 * @param surname uživatele
	 * @param age     uživatele
	 * @param salary  uživatele
	 */
	public void insertNewUser(String email, String name, String surname, int counter) {
		if (email == null || name == null || surname == null)
			throw new NullPointerException("Email, name and surname must be set.");
		Connection conn = DBConnection.getDBConnection();

		String insertUser = "INSERT INTO USER " + "(email,name,surname)" + " VALUES(?, ?, ?)";

		try (PreparedStatement prStmt = conn.prepareStatement(insertUser)) {
			prStmt.setString(1, email);
			prStmt.setString(2, name);
			prStmt.setString(3, surname);
			prStmt.executeUpdate();
			System.out.println("Nový uživatel byl vložen do databáze!");
		} catch (SQLException e) {
			System.out.println("Uživatel už byl vložen nebo jste zadali špatnì SQL pøíkaz INSERT");
			// e.printStackTrace();
		}
	}

	public void addRole(String email) {
		SelectQueries sl = new SelectQueries();
		int id = sl.getID(email);
		// user id 1
		Connection conn = DBConnection.getDBConnection();
		String update20PercentOfSalary = "INSERT INTO user_has_role " + "(user_id_user,role_id_role)"+" VALUES(?,?)";

		try (PreparedStatement prStmt = conn.prepareStatement(update20PercentOfSalary);) {
			prStmt.setInt(1, id);
			prStmt.setInt(2, 1);
			prStmt.executeUpdate();
			// System.out.println(rowsUpdated);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
