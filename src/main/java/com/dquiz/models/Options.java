package com.dquiz.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Table(name = "options")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Options {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int optionid;
	private int questionid;
	private String optionText;
	private String optionCode;
	
	public Options() {
		super();
	}

	public Options(int optionid, int questionid, String optionText, String optionCode) {
		super();
		this.optionid = optionid;
		this.questionid = questionid;
		this.optionText = optionText;
		this.optionCode = optionCode;
	}

	public Options(int questionid, String optionText, String optionCode) {
		super();
		this.questionid = questionid;
		this.optionText = optionText;
		this.optionCode = optionCode;
	}

	public Options(String optionText, String optionCode) {
		super();
		this.optionText = optionText;
		this.optionCode = optionCode;
	}

	public int getOptionid() {
		return optionid;
	}

	public void setOptionid(int optionid) {
		this.optionid = optionid;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}

	public String getOptionCode() {
		return optionCode;
	}

	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}
}