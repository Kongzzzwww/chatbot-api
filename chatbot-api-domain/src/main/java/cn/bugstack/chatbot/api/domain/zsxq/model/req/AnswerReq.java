package cn.bugstack.chatbot.api.domain.zsxq.model.req;

/**
 * @Title: AnswerReq
 * @Author Vacant Seat
 * @Date 2025/2/12 5:31
 */
public class AnswerReq {
    private ReqData req_data;

    public AnswerReq(ReqData req_data) {
        this.req_data = req_data;
    }

    public ReqData getReq_data() {
        return req_data;
    }

    public void setReq_data(ReqData req_data) {
        this.req_data = req_data;
    }

}
