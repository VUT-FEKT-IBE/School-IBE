package Cvika09;

public class Employee // třída zaměstnance
{
    private String nickname;
    private String email;
    private char[] password;

    enum employeeType {ACTIVE, INACTIVE, DELETED}


    public Employee(String name, String mail, char[] pass)  // konstruktor zaměstnance
    {
        this.nickname = name;
        this.email = mail;
        this.password = pass;
    }

    public String toString()  // implementovaná metoda toString aby výstup byl jaký chceme
    {
        return "nickname=" + nickname + ", email=" + email;
    }

    public String getEmail()
    {
        return email;
    }

    public int compareTo(Employee Emp) // komparátor pro implementaci printu podle seřazení mailů
    {
        return this.getEmail().compareTo(Emp.getEmail());
    }
}
