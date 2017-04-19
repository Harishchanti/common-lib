package com.ailiens.common;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"access_token",
	"expires_in",
	"refresh_expires_in",
	"refresh_token",
	"token_type",
	"id_token",
	"not-before-policy",
	"session-state"
})
public class AilAuthToken {

	@JsonProperty("access_token")
	private String accessToken;
	@JsonProperty("expires_in")
	private Integer expiresIn;
	@JsonProperty("refresh_expires_in")
	private Integer refreshExpiresIn;
	@JsonProperty("refresh_token")
	private String refreshToken;
	@JsonProperty("token_type")
	private String tokenType;
	@JsonProperty("id_token")
	private String idToken;
	@JsonProperty("not-before-policy")
	private Integer notBeforePolicy;
	@JsonProperty("session-state")
	private String sessionState;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return
	 * The accessToken
	 */
	@JsonProperty("access_token")
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 *
	 * @param accessToken
	 * The access_token
	 */
	@JsonProperty("access_token")
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 *
	 * @return
	 * The expiresIn
	 */
	@JsonProperty("expires_in")
	public Integer getExpiresIn() {
		return expiresIn;
	}

	/**
	 *
	 * @param expiresIn
	 * The expires_in
	 */
	@JsonProperty("expires_in")
	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	/**
	 *
	 * @return
	 * The refreshExpiresIn
	 */
	@JsonProperty("refresh_expires_in")
	public Integer getRefreshExpiresIn() {
		return refreshExpiresIn;
	}

	/**
	 *
	 * @param refreshExpiresIn
	 * The refresh_expires_in
	 */
	@JsonProperty("refresh_expires_in")
	public void setRefreshExpiresIn(Integer refreshExpiresIn) {
		this.refreshExpiresIn = refreshExpiresIn;
	}

	/**
	 *
	 * @return
	 * The refreshToken
	 */
	@JsonProperty("refresh_token")
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 *
	 * @param refreshToken
	 * The refresh_token
	 */
	@JsonProperty("refresh_token")
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 *
	 * @return
	 * The tokenType
	 */
	@JsonProperty("token_type")
	public String getTokenType() {
		return tokenType;
	}

	/**
	 *
	 * @param tokenType
	 * The token_type
	 */
	@JsonProperty("token_type")
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	/**
	 *
	 * @return
	 * The idToken
	 */
	@JsonProperty("id_token")
	public String getIdToken() {
		return idToken;
	}

	/**
	 *
	 * @param idToken
	 * The id_token
	 */
	@JsonProperty("id_token")
	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	/**
	 *
	 * @return
	 * The notBeforePolicy
	 */
	@JsonProperty("not-before-policy")
	public Integer getNotBeforePolicy() {
		return notBeforePolicy;
	}

	/**
	 *
	 * @param notBeforePolicy
	 * The not-before-policy
	 */
	@JsonProperty("not-before-policy")
	public void setNotBeforePolicy(Integer notBeforePolicy) {
		this.notBeforePolicy = notBeforePolicy;
	}

	/**
	 *
	 * @return
	 * The sessionState
	 */
	@JsonProperty("session-state")
	public String getSessionState() {
		return sessionState;
	}

	/**
	 *
	 * @param sessionState
	 * The session-state
	 */
	@JsonProperty("session-state")
	public void setSessionState(String sessionState) {
		this.sessionState = sessionState;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
