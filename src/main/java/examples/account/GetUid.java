package examples.account;

import utils.WeiboConfig;
import weibo4j.Account;
import examples.oauth2.Log;
import weibo4j.model.WeiboException;
import weibo4j.org.json.JSONObject;

public class GetUid {

	public static void main(String[] args) {
//		String access_token = args[0];
		String access_token = WeiboConfig.getValue("access_token");
		Account am = new Account(access_token);
		try {
			JSONObject uid = am.getUid();
			Log.logInfo(uid.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
}
