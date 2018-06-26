package examples.timeline;

import utils.WeiboConfig;
import weibo4j.Timeline;
import examples.oauth2.Log;
import weibo4j.model.StatusWapper;
import weibo4j.model.WeiboException;

public class GetUserTimeline {

	public static void main(String[] args) {
//		String access_token = args[0];
		String access_token = WeiboConfig.getValue("access_token");
		Timeline tm = new Timeline(access_token);
		try {
			StatusWapper status = tm.getUserTimeline();
			Log.logInfo(status.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
