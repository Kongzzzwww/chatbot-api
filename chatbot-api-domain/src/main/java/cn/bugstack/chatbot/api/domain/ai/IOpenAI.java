package cn.bugstack.chatbot.api.domain.ai;

import java.io.IOException;

/**
 * @Title: IOpenAI
 * @Author Vacant Seat
 * @Date 2025/2/14 5:10
 */
public interface IOpenAI {
    String doChatGPT(String question) throws IOException;
}
