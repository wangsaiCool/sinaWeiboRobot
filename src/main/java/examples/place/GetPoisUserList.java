package examples.place;

import weibo4j.Place;
import examples.oauth2.Log;
import weibo4j.model.UserWapper;
import weibo4j.model.WeiboException;

public class GetPoisUserList {

	public static void main(String[] args) {
		String access_token = args[0];
		String poiid = args[1];
		Place p = new Place(access_token);
		try {
			UserWapper uw = p.poisUsersList(poiid);
			Log.logInfo(uw.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
