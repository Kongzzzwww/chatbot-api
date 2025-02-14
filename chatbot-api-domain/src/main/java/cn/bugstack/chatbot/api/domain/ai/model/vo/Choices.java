package cn.bugstack.chatbot.api.domain.ai.model.vo;

/**
 * @Title: Choices
 * @Author Vacant Seat
 * @Date 2025/2/14 5:15
 */
public class Choices {
    private Message message;

    private int index;

    private String logprobs;

    private String finish_reason;

    public static class Message {
        private String content;
        private String role;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(String logprobs) {
        this.logprobs = logprobs;
    }

    public String getFinish_reason() {
        return finish_reason;
    }

    public void setFinish_reason(String finish_reason) {
        this.finish_reason = finish_reason;
    }
}
