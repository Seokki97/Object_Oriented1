package ch26.web.userInfo;

import ch26.domain.userinfo.UserInfo;
import ch26.domain.userinfo.dao.UserInfoDao;
import ch26.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;


import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");
;
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserID("!@3145");
        userInfo.setPassword("!@312");
        userInfo.setUserName("sadas");

        UserInfoDao userInfoDao = null;

        if( dbType.equals("ORACLE")){
             userInfoDao = new UserInfoOracleDao() ;
        }
        else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoOracleDao();

        }
        else {
            System.out.println(" db eroor");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
