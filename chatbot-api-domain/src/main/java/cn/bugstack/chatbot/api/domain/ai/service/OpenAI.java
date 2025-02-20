package cn.bugstack.chatbot.api.domain.ai.service;

import cn.bugstack.chatbot.api.domain.ai.IOpenAI;
import cn.bugstack.chatbot.api.domain.ai.model.aggregates.AIAnswer;
import cn.bugstack.chatbot.api.domain.ai.model.vo.Choices;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @Title: OpeAI
 * @Author Vacant Seat
 * @Date 2025/2/14 5:13
 */

@Service
public class OpenAI implements IOpenAI {

    @Value("${chatbot-api.openAIKey}")
    private String openAIKey;
    private Logger logger = LoggerFactory.getLogger(OpenAI.class);
    @Override
    public String doChatGPT(String question) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost("https://ark.cn-beijing.volces.com/api/v3/chat/completions");
        post.addHeader("Content-Type","application/json");
        post.addHeader("Authorization","Bearer " + openAIKey);
        String paramJson = "{\n" +
                "    \"model\": \"ep-20250214044114-56fmk\",\n" +
                "    \"messages\": [\n" +
                "        {\n" +
                "            \"role\": \"user\",\n" +
                "            \"content\": \"" + question +  "\"\n" +
                "        }\n" +
                "    ]\n" +
                "  }";
       /* String paramJson = String.format(
                "{\n" +
                        "    \"model\": \"ep-20250214044114-56fmk\",\n" +
                        "    \"messages\": [\n" +
                        "        {\n" +
                        "            \"role\": \"user\",\n" +
                        "            \"content\": \"%s\"\n" +  // 添加双引号包裹question
                        "        }\n" +
                        "    ]\n" +
                        "}",
                question.replace("\"", "\\\"")  // 处理question中的特殊字符
        );*/
        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);
        CloseableHttpResponse response = httpClient.execute(post);
        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String jsonStr = EntityUtils.toString(response.getEntity());
            AIAnswer aiAnswer = JSON.parseObject(jsonStr, AIAnswer.class);
            StringBuilder answers = new StringBuilder();
            List<Choices> choices = aiAnswer.getChoices();
            for(Choices choice:choices){
                answers.append(choice.getMessage().getContent());
            }
            return answers.toString();

        }else {
            throw new RuntimeException("api.openai.com Err Code is" + response.getStatusLine().getStatusCode());
        }

    }
}
