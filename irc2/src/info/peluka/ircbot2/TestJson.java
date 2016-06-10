package info.peluka.ircbot2;

import info.peluka.ircbot2.userinfo.UserInfo;
import java.io.IOException;

/**
 *
 * @author Carlos Soza C <carlos.soza at profondos.com>
 */
public class TestJson {

    public static void main(String[] args) throws IOException {

        UserInfo userInfo = UserInfoUtils.getUserInfo("2740853");
        System.out.println("WON:" + userInfo.getMilitary().getGuerrilla().getWon());

    }

}
