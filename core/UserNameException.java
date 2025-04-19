package core;

public class UserNameException extends Exception{
    @Override
    public String getMessage(){
        return "Username is too short";
    }
}
