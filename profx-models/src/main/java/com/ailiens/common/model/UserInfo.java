package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = false)
public class UserInfo implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = -1968427782791409583L;

	@Pattern(regexp = "[a-zA-Z0-9]{3,20}+$|^[\\s]*$")
    private String username;

    @Pattern(regexp = "[a-zA-Z.]{2,10}+$|^[\\s]*$")
    private String title;

    //@Pattern(regexp = "^[a-zA-Z]{3,20}+$|^[\\s]*$")
    private String firstName;

    //@Pattern(regexp = "^[a-zA-Z]{1,20}+$|^[\\s]*$")
    private String middleName;

    //@Pattern(regexp = "^[a-zA-Z]{1,20}+$|^[\\s]*$")
    private String lastName;

    @Pattern(regexp = "[M|F]+$|^[\\s]*$")
    private String gender;

    @Pattern(regexp = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^[\\s]*$")
    private String dateOfBirth;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
