package com.ailiens.common.model;

import java.io.Serializable;

/**
 * Created by vaibhav on 17/11/15.
 */
public class OnBoard implements Serializable{
    /**
	 *
	 */
	private static final long serialVersionUID = -8663607112896563822L;
	String question,answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
