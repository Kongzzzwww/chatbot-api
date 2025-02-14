package cn.bugstack.chatbot.api.domain.zsxq.model.vo;

/**
 * @Title: UserSpecific
 * @Author Vacant Seat
 * @Date 2025/2/12 5:26
 */
public class UserSpecific {
    private boolean liked;

    private boolean subscribed;

    public void setLiked(boolean liked){
        this.liked = liked;
    }
    public boolean getLiked(){
        return this.liked;
    }
    public void setSubscribed(boolean subscribed){
        this.subscribed = subscribed;
    }
    public boolean getSubscribed(){
        return this.subscribed;
    }

}
