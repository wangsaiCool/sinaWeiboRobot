package examples.comment;

import utils.WeiboConfig;
import weibo4j.Comments;
import examples.oauth2.Log;
import weibo4j.model.CommentWapper;
import weibo4j.model.WeiboException;

public class GetCommentToMe {

    public static void main(String[] args) {
//		String access_token = args[0];
        String access_token = WeiboConfig.getValue("access_token");
        Comments cm = new Comments(access_token);
        try {
            CommentWapper comment = cm.getCommentToMe();
            Log.logInfo(comment.toString());
        } catch (WeiboException e) {
            e.printStackTrace();
        }
    }

}
