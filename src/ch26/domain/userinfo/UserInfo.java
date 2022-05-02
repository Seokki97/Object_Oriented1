package ch26.domain.userinfo;

public class UserInfo {
    private String userID;
    private String password;
    private String userName;

    public String getUserID(){
        return userID;
    }
    public void setUserID(String userID){
        this.userID = userID;
    }

    public String getUserName(String userName){
        return userName;
    }

    public void setUserName(String userName){
        this.userName =userName;
    }

    public String getPassword(String password){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
