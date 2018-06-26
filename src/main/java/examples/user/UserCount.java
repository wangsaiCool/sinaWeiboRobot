package examples.user;

import utils.WeiboConfig;
import weibo4j.Users;
import examples.oauth2.Log;
import weibo4j.model.UserCounts;
import weibo4j.model.WeiboException;

import java.util.List;

public class UserCount {

	public static void main(String[] args) {
//		String access_token = args[0];
//		String uids = args[1];
		String access_token = WeiboConfig.getValue("access_token");
		String uids = WeiboConfig.getValue("uid");
		Users um = new Users(access_token);
		try {
			List<UserCounts> user = um.getUserCount(uids);
			for (UserCounts u : user) {
				Log.logInfo(u.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
