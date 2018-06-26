package examples.timeline;

import utils.WeiboConfig;
import weibo4j.Timeline;
import examples.oauth2.Log;
import weibo4j.model.Status;
import weibo4j.model.WeiboException;

public class ShowStatus {

	public static void main(String[] args) {
		String access_token =WeiboConfig.getValue("access_token");
//		String access_token = args[0];
//		String id = args[1];
		String id = "4255081577189463";
		Timeline tm = new Timeline(access_token);
		try {
			Status status = tm.showStatus(id);
			String[] strArr = status.toString().split(" +");
			for (int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
			}
//			Log.logInfo(status.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
