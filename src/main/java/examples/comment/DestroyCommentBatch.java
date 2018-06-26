package examples.comment;

import weibo4j.Comments;
import examples.oauth2.Log;
import weibo4j.model.Comment;
import weibo4j.model.WeiboException;

import java.util.List;

public class DestroyCommentBatch {

	public static void main(String[] args) {
		String access_token = args[0];
		String cids = args[1];
		Comments cm = new Comments(access_token);
		try {
			List<Comment> list = cm.destoryCommentBatch(cids);
			for (Comment c : list) {
				Log.logInfo(c.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
}
