package cn.bugstack.chatbot.api.domain.ai.model.aggregates;

import cn.bugstack.chatbot.api.domain.ai.model.vo.Choices;

import java.util.List;

/**
 * @Title: AIAnswer
 * @Author Vacant Seat
 * @Date 2025/2/14 5:19
 */
public class AIAnswer {
    private String id;

    private String object;

    private int created;

    private String model;

    private List<Choices> choices;

    public static class Usage{
        private int completion_tokens;
        private int prompt_tokens;
        private int total_tokens;

        public int getCompletion_tokens() {
            return completion_tokens;
        }

        public void setCompletion_tokens(int completion_tokens) {
            this.completion_tokens = completion_tokens;
        }

        public int getPrompt_tokens() {
            return prompt_tokens;
        }

        public void setPrompt_tokens(int prompt_tokens) {
            this.prompt_tokens = prompt_tokens;
        }

        public int getTotal_tokens() {
            return total_tokens;
        }

        public void setTotal_tokens(int total_tokens) {
            this.total_tokens = total_tokens;
        }

        public PromptTokensDetails getPrompt_tokens_details() {
            return prompt_tokens_details;
        }

        public void setPrompt_tokens_details(PromptTokensDetails prompt_tokens_details) {
            this.prompt_tokens_details = prompt_tokens_details;
        }

        public CompletionTokensDetails getCompletion_tokens_details() {
            return completion_tokens_details;
        }

        public void setCompletion_tokens_details(CompletionTokensDetails completion_tokens_details) {
            this.completion_tokens_details = completion_tokens_details;
        }

        private PromptTokensDetails prompt_tokens_details;
        private CompletionTokensDetails completion_tokens_details;

        private class PromptTokensDetails {
            private int cached_tokens;
        }

        private class CompletionTokensDetails {
            private int reasoning_tokens;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Choices> getChoices() {
        return choices;
    }

    public void setChoices(List<Choices> choices) {
        this.choices = choices;
    }
}
