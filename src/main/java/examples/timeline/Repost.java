package examples.timeline;

import weibo4j.Timeline;
import examples.oauth2.Log;
import weibo4j.model.Status;
import weibo4j.model.WeiboException;
import weibo4j.util.WeiboConfig;

public class Repost {

    //转发接口
	public static void main(String[] args) {
//		String access_token = args[0];
		String access_token = utils.WeiboConfig.getValue("access_token");
		String id = "4255081577189463";
//		String id = args[1];
		Timeline tm = new Timeline(access_token);
		try {
			Status status = tm.repost(id);
			Log.logInfo(status.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
