package com.example.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;

@ApiModel
public class UserDO extends DtoBase {

    @ApiModelProperty(value = "userName", required = true)
    private String username;

    @ApiModelProperty(value = "name", required = true)
    private String name;

    @ApiModelProperty(value = "password", required = true)
    private Date dateOfBirth;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserDO username(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDO name(String name) {
        this.name = name;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void dsetDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public UserDO dateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (! super.equals(o)) return false;
        final UserDO that = (UserDO) o;
        return  Objects.equals(username, that.username)&
                Objects.equals(name, that.name)&
                Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, name, dateOfBirth);
    }

    @Override
    protected StringBuilder fieldsToString() {
        final StringBuilder sb = super.fieldsToString();
        appendField(sb, "username", username);
        appendField(sb, "name", name);
        appendField(sb, "dateOfBirth", dateOfBirth);
        return sb;
    }

}