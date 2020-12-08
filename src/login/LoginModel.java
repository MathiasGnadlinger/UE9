package login;

public class LoginModel
{
    String username;
    String password;

    public LoginModel()
    {
    this.username = "cisco";
    this.password = "cisco";
    }

    public boolean iscorrect (String name, String password)
    {
        if(name.equals(username) && this.password.equals(password))
        {
           return true;
        }
        else
        {
            return false;
        }
    }
}
