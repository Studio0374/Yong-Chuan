/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Map;
import java.util.Objects;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class InsightsQuestionnairesQuestion extends Resource {

    private static final long serialVersionUID = 10229949486791L;

    public static InsightsQuestionnairesQuestionCreator creator(
        final String categorySid,
        final String question,
        final String answerSetId,
        final Boolean allowNa
    ) {
        return new InsightsQuestionnairesQuestionCreator(
            categorySid,
            question,
            answerSetId,
            allowNa
        );
    }

    public static InsightsQuestionnairesQuestionDeleter deleter(
        final String pathQuestionSid
    ) {
        return new InsightsQuestionnairesQuestionDeleter(pathQuestionSid);
    }

    public static InsightsQuestionnairesQuestionReader reader() {
        return new InsightsQuestionnairesQuestionReader();
    }

    public static InsightsQuestionnairesQuestionUpdater updater(
        final String pathQuestionSid,
        final Boolean allowNa
    ) {
        return new InsightsQuestionnairesQuestionUpdater(
            pathQuestionSid,
            allowNa
        );
    }

    /**
     * Converts a JSON String into a InsightsQuestionnairesQuestion object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return InsightsQuestionnairesQuestion object represented by the provided JSON
     */
    public static InsightsQuestionnairesQuestion fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(
                json,
                InsightsQuestionnairesQuestion.class
            );
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a InsightsQuestionnairesQuestion object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return InsightsQuestionnairesQuestion object represented by the provided JSON
     */
    public static InsightsQuestionnairesQuestion fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(
                json,
                InsightsQuestionnairesQuestion.class
            );
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String questionSid;
    private final String question;
    private final String description;
    private final Map<String, Object> category;
    private final String answerSetId;
    private final Boolean allowNa;
    private final Integer usage;
    private final Map<String, Object> answerSet;
    private final URI url;

    @JsonCreator
    private InsightsQuestionnairesQuestion(
        @JsonProperty("account_sid") final String accountSid,
        @JsonProperty("question_sid") final String questionSid,
        @JsonProperty("question") final String question,
        @JsonProperty("description") final String description,
        @JsonProperty("category") final Map<String, Object> category,
        @JsonProperty("answer_set_id") final String answerSetId,
        @JsonProperty("allow_na") final Boolean allowNa,
        @JsonProperty("usage") final Integer usage,
        @JsonProperty("answer_set") final Map<String, Object> answerSet,
        @JsonProperty("url") final URI url
    ) {
        this.accountSid = accountSid;
        this.questionSid = questionSid;
        this.question = question;
        this.description = description;
        this.category = category;
        this.answerSetId = answerSetId;
        this.allowNa = allowNa;
        this.usage = usage;
        this.answerSet = answerSet;
        this.url = url;
    }

    public final String getAccountSid() {
        return this.accountSid;
    }

    public final String getQuestionSid() {
        return this.questionSid;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Map<String, Object> getCategory() {
        return this.category;
    }

    public final String getAnswerSetId() {
        return this.answerSetId;
    }

    public final Boolean getAllowNa() {
        return this.allowNa;
    }

    public final Integer getUsage() {
        return this.usage;
    }

    public final Map<String, Object> getAnswerSet() {
        return this.answerSet;
    }

    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        InsightsQuestionnairesQuestion other =
            (InsightsQuestionnairesQuestion) o;

        return (
            Objects.equals(accountSid, other.accountSid) &&
            Objects.equals(questionSid, other.questionSid) &&
            Objects.equals(question, other.question) &&
            Objects.equals(description, other.description) &&
            Objects.equals(category, other.category) &&
            Objects.equals(answerSetId, other.answerSetId) &&
            Objects.equals(allowNa, other.allowNa) &&
            Objects.equals(usage, other.usage) &&
            Objects.equals(answerSet, other.answerSet) &&
            Objects.equals(url, other.url)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountSid,
            questionSid,
            question,
            description,
            category,
            answerSetId,
            allowNa,
            usage,
            answerSet,
            url
        );
    }
}
