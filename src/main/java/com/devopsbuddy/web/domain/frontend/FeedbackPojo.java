package com.devopsbuddy.web.domain.frontend;

import java.io.Serializable;

public class FeedbackPojo implements Serializable{
/*
 * since this object may travel between multiple jvms we will serializable constant
 * used to avoid a classpath exception
 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String firstName;
	private String lastName;
	private String feedback;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FeedbackPojo [email=");
		builder.append(getEmail());
		builder.append(", firstName=");
		builder.append(getFirstName());
		builder.append(", lastName=");
		builder.append(getLastName());
		builder.append(", feedback=");
		builder.append(getFeedback());
		builder.append("]");
		return builder.toString();
	}	
}
