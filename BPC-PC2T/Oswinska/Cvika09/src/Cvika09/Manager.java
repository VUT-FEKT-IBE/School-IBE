package Cvika09;

import java.util.ArrayList;
import java.util.List;

public class Manager
{
    private String nickname;
    private String email;
    private char[] password;

    private List<Employee> listofEmployees = new ArrayList<>();
    private List<Secretarian> listofRelationships = new ArrayList<>();

    public Manager(String nickname,String email, char[] password) // Manažerův konstruktor
    {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }
    public void addRelation(Secretarian sec)
    {
        listofRelationships.add(sec);
    }
    public void addEmployee(Employee emp)
    {
        listofEmployees.add(emp);
    }
    public void listEmployees()
    {
        for (int i = 0; i < listofEmployees.size(); i++)
        {
            System.out.println(listofEmployees.get(i));
        }
    }
    public void listRelation()
    {
        for (int i = 0; i < listofRelationships.size(); i ++)
        {
            System.out.println(listofRelationships.get(i));
        }
    }

    public String toString()
    {
        return "nickname=" + nickname + ", email=" + email;
    }
}
