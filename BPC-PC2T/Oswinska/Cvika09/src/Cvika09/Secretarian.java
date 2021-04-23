package Cvika09;

public class Secretarian
{
    private String nickname;
    private String email;
    private char[] password;

    private int age;

    public Secretarian(String nickname,String email, char[] password) // Konstruktor sekretáře
    {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public String toString()
    {
        return "nickname=" + nickname + ", email=" + email;
    }
}
