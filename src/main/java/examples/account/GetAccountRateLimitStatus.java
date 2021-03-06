package examples.account;

import weibo4j.Account;
import examples.oauth2.Log;
import weibo4j.model.RateLimitStatus;
import weibo4j.model.WeiboException;

public class GetAccountRateLimitStatus {

	public static void main(String[] args) {
		String access_token = args[0];
		Account am = new Account(access_token);
		try {
            RateLimitStatus json = am.getAccountRateLimitStatus();
			Log.logInfo(json.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
