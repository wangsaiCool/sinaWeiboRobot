package examples.comment;

import utils.WeiboConfig;
import weibo4j.Comments;
import examples.oauth2.Log;
import weibo4j.model.CommentWapper;
import weibo4j.model.WeiboException;

public class GetCommentById {

	public static void main(String[] args) {
		String access_token = WeiboConfig.getValue("access_token");
//		String id = args[1];
		String id = "4255081577189463";
		Comments cm = new Comments(access_token);
		try {
			CommentWapper comment = cm.getCommentById(id);
			Log.logInfo(comment.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
