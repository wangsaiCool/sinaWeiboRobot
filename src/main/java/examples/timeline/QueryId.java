package examples.timeline;

import weibo4j.Timeline;
import examples.oauth2.Log;
import weibo4j.model.WeiboException;
import weibo4j.org.json.JSONObject;

public class QueryId {

	public static void main(String[] args) {
		String access_token = args[0];
		String mid = args[1];
		Timeline tm = new Timeline(access_token);
		try {
			JSONObject id = tm.queryId( mid, 1,1);
			Log.logInfo(id.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}

	}

}
