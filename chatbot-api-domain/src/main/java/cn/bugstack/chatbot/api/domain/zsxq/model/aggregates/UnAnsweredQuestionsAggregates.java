package cn.bugstack.chatbot.api.domain.zsxq.model.aggregates;

import cn.bugstack.chatbot.api.domain.zsxq.model.res.RespData;

/**
 * @Title: UnAnsweredQuestionsAggregates
 * @Author Vacant Seat
 * @Date 2025/2/12 5:40
 */

/**
 * 未回答问题的接口信息
 */
public class UnAnsweredQuestionsAggregates {
    private boolean succeeded;
    private RespData resp_data;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public RespData getResp_data() {
        return resp_data;
    }

    public void setResp_data(RespData resp_data) {
        this.resp_data = resp_data;
    }
}
