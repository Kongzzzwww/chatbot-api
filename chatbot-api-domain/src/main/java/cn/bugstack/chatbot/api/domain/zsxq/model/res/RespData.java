package cn.bugstack.chatbot.api.domain.zsxq.model.res;

import cn.bugstack.chatbot.api.domain.zsxq.model.vo.Topics;

import java.util.List;

/**
 * @Title: RespData
 * @Author Vacant Seat
 * @Date 2025/2/12 5:32
 */
public class RespData {
    private List<Topics> topics;


    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }
}
