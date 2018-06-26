package examples.timeline;

import utils.WeiboConfig;
import weibo4j.Timeline;
import examples.oauth2.Log;
import weibo4j.model.Status;
import weibo4j.model.WeiboException;

public class UpdateStatus {

	public static void main(String[] args) {
//		String access_token = args[0];
		String access_token = WeiboConfig.getValue("access_token");
		String statuses = "hello,this text is send by JAVA ,for testing the API of Sina Weibo. ";
		Timeline tm = new Timeline(access_token);
		try {
			Status status = tm.updateStatus(statuses);
			Log.logInfo(status.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}	
	}

}
