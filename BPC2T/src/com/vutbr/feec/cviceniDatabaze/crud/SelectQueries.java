package com.vutbr.feec.cviceniDatabaze.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vutbr.feec.cviceniDatabaze.dbconn.DBConnection;

/**
 * 
 * @author Pavel Šeda (154208)
 *
 */
public class SelectQueries {

  public SelectQueries() {}

  /**
   * Template metoda, do které se dá vkládat libovolný SQL SELECT pøíkaz. Tento template je ukázka
   * použití PreparedStatements, což je v urèitých pøípadech rychlejší alternativa ke Statements,
   * protože se SQL pøíkazy pøedkompilovávají a také je to ochrana proti SQL Injection viz.
   * https://xacker.files.wordpress.com/2010/12/sql_injection.png
   * 
   * POZN: není vhodné implementovat své metody tímto zpùsobem, daleko vhodnìjší je implementovat
   * konkrétní metody (napø. getAllUsers() pomocí PreparedStatements, do kterých vkládáme konkrétní
   * parametry)
   * 
   * @param selectQuery øetìzec pøedstavující pøíkaz SELECT
   */
  public void performPreparedStatementSelect(String selectQuery) {
    if (selectQuery == null) {
      throw new NullPointerException("query must not be null!");
    } else if (selectQuery.isEmpty()) {
      throw new IllegalArgumentException("query must not be empty!");
    }
    Connection conn = DBConnection.getDBConnection();
    try (PreparedStatement prStmt = conn.prepareStatement(selectQuery);
        ResultSet rs = prStmt.executeQuery()) {
      while (rs.next()) {
        System.out.println(rs.getString("id_user") + " : " + rs.getString("email") + ", "
            + rs.getString("name") + ", " + rs.getString("surname") + ", " + rs.getString("age")
            + ", " + rs.getString("salary"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * Template metoda, do které se dá vkládat libovolný SQL SELECT pøíkaz. Tento template je ukázka
   * použití PreparedStatements
   * 
   * POZN: není vhodné implementovat své metody tímto zpùsobem, daleko vhodnìjší je implementovat
   * konkrétní metody (napø. getAllUsers() pomocí PreparedStatements, do kterých vkládáme konkrétní
   * parametry)
   * 
   */
  public void performStatementSelect(String selectQuery) {
    if (selectQuery == null) {
      throw new NullPointerException("query must not be null!");
    } else if (selectQuery.isEmpty()) {
      throw new IllegalArgumentException("query must not be empty!");
    }

    Connection conn = DBConnection.getDBConnection();
    try (Statement prStmt = conn.createStatement();
        ResultSet rs = prStmt.executeQuery(selectQuery)) {
      while (rs.next()) {
        System.out.println(rs.getString("id_user") + " : " + rs.getString("email") + ", "
            + rs.getString("name") + ", " + rs.getString("surname") + ", " + rs.getString("age")
            + ", " + rs.getString("salary"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public boolean testIfUserExists(String userEmail) {
    if (userEmail == null) {
      throw new NullPointerException("query must not be null!");
    } else if (userEmail.isEmpty()) {
      throw new IllegalArgumentException("query must not be empty!");
    }

    Connection conn = DBConnection.getDBConnection();
    String testUserExistence = "SELECT * FROM user WHERE email = ?";

    try (PreparedStatement prStmt = conn.prepareStatement(testUserExistence);) {
      prStmt.setString(1, userEmail);
      ResultSet rs = prStmt.executeQuery();
      if (rs.next())
        return true;
      else
        return false;
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  public void getAllUsers() {
    performPreparedStatementSelect("SELECT * FROM user");
  }

  public void printUserEmailAndSalary(String email) {
    Connection conn = DBConnection.getDBConnection();
    String userEmailAndSalary = "SELECT email, salary FROM User WHERE email = ?";

    try (PreparedStatement prStmt = conn.prepareStatement(userEmailAndSalary);) {
      prStmt.setString(1, email);
      ResultSet rs = prStmt.executeQuery();
      if (rs.next())
        System.out.println("Email uživatele je: " + rs.getString("email") + " plat uživatele je: "
            + rs.getString("salary"));
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * doplòte String selectAlluserEmailNameAndSurname, tak aby se vypsal email, jméno a pøíjmení
   * všech uživatelù v databázi
   * 
   * POZN: Pøíkaz SELECT * FROM User (není správnì, protože ten by do objektu ResultSet vrátil
   * všechny sloupce tabulky (I když by "naoko" díky implementovaným výpisùm vypsal pouze email,
   * name a surname
   */
  public void getAllUserEmailAndNameAndSurname() {
    Connection conn = DBConnection.getDBConnection();
    String selectAlluserEmailNameAndSurname = "SELECT email,name,surname FROM User";

    try (PreparedStatement prStmt = conn.prepareStatement(selectAlluserEmailNameAndSurname);
        ResultSet rs = prStmt.executeQuery()) {
      while (rs.next()) {
        System.out.println(
            rs.getString("email") + ", " + rs.getString("name") + ", " + rs.getString("surname"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * prostudujte si tuto metodu nebo následující metodu "getAllUsersWithRoleUserById" a všimìte si,
   * jak pracuje JOIN tabulek
   */
  public void getAllUsersWithRoleUser() {
    Connection conn = DBConnection.getDBConnection();
    String selectAllUsersWithRoleUser =
        "SELECT id_user, email, name, surname, age, salary FROM user JOIN user_has_role ON user.id_user = user_has_role.user_id_user WHERE role_id_role=1";

    try (PreparedStatement prStmt = conn.prepareStatement(selectAllUsersWithRoleUser);
        ResultSet rs = prStmt.executeQuery();) {
      while (rs.next()) {
        System.out.println(rs.getString("id_user") + " : " + rs.getString("email") + ", "
            + rs.getString("name") + ", " + rs.getString("surname") + ", " + rs.getString("age")
            + ", " + rs.getString("salary"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void getAllUsersWithRoleUserById(int id) {
    Connection conn = DBConnection.getDBConnection();
    String selectAllUsersWithRoleUser =
        "SELECT id_user, email, name, surname, age, salary FROM user JOIN user_has_role ON user.id_user = user_has_role.user_id_user WHERE role_id_role=?";
    try (PreparedStatement prStmt = conn.prepareStatement(selectAllUsersWithRoleUser);) {
      prStmt.setInt(1, id);
      ResultSet rs = prStmt.executeQuery();

      while (rs.next()) {
        System.out.println(rs.getString("id_user") + " : " + rs.getString("email") + ", "
            + rs.getString("name") + ", " + rs.getString("surname") + ", " + rs.getString("age")
            + ", " + rs.getString("salary"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  public int getUserSalary(String email) {
	  Connection conn = DBConnection.getDBConnection();
	    String userEmailAndSalary = "SELECT email, salary FROM User WHERE email = ?";

	    try (PreparedStatement prStmt = conn.prepareStatement(userEmailAndSalary);) {
	      prStmt.setString(1, email);
	      ResultSet rs = prStmt.executeQuery();
	      if (rs.next())
	        return rs.getInt("salary");
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
		return -1;
  }
  
  public int getID(String email) {
	  Connection conn = DBConnection.getDBConnection();
	    String userEmailAndSalary = "SELECT id_user FROM User WHERE email = ?";

	    try (PreparedStatement prStmt = conn.prepareStatement(userEmailAndSalary);) {
	      ResultSet rs = prStmt.getGeneratedKeys();
	      if (rs.next())
	    	  return rs.getInt(1);
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
		return -1;
  }

  /**
   * Doplòte celou implementaci k získání výpisu všech rolí v DB.
   * 
   * HINT: podívejte se na strukturu jiných metod v této tøídì popøípadì se inspirujte na internetu
   * napø.: https://www.mkyong.com/jdbc/jdbc-preparestatement-example-select-list-of-the-records/
   */
  public void printAllRolesInDB() {
    // 1. získejte connection k databázi
    // 2. vytvoøte SQL pøíkaz k získání všech rolí v DB
    // 3. vložte tento pøíkaz jako prepareStatement k získané connection k databázi
    // 4. vyvolejte tento PreparedStatement
    // 5. uložte výsledek do ResultSetu
    // 6. pøes cyklus projdìte výsledek ResultSetu a vypište role v systému (pro získání správné
    // kolonky se podívejte na návrh databáze, abyste znali název sloupce (popøípadì lze ještì
    // získat data ze sloupce poøadovým èíslem (zaèínajíc od 1)))

    // tyto operace obalte v try-catch bloku popøípadì v try-with-resources bloku
	  Connection conn = DBConnection.getDBConnection();
	    String userEmailAndSalary = "SELECT * FROM role";

	    try (PreparedStatement prStmt = conn.prepareStatement(userEmailAndSalary);) {
	      ResultSet rs = prStmt.executeQuery();
	      while (rs.next()) {
	        System.out.println(rs.getString(2));
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
  }
}

