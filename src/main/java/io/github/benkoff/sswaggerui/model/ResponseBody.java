package io.github.benkoff.sswaggerui.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/*
 * Created by Ben Novikov on 2018-01-10
 * A JSON object containing link&#x60;s information
 */
@ApiModel(description = "A JSON object containing link`s information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-30T06:46:06.357Z")
public class ResponseBody {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("user")
    private String user = null;

    @JsonProperty("url")
    private String url = null;

    @JsonProperty("label")
    private String label = null;

    @JsonProperty("reference")
    private String reference = null;

    @JsonProperty("active")
    private Boolean active = null;

    public ResponseBody id(String id) {
        this.id = id;
        return this;
    }

    /**
     * link`s ID at database
     * @return id
     **/
    @ApiModelProperty(value = "link`s ID at database")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResponseBody user(String user) {
        this.user = user;
        return this;
    }

    /**
     * the user which saved the link
     * @return user
     **/
    @ApiModelProperty(value = "the user which saved the link")


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ResponseBody url(String url) {
        this.url = url;
        return this;
    }

    /**
     * the link been saved before
     * @return url
     **/
    @ApiModelProperty(value = "the link been saved before")


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ResponseBody label(String label) {
        this.label = label;
        return this;
    }

    /**
     * a label given by user
     * @return label
     **/
    @ApiModelProperty(value = "a label given by user")


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ResponseBody reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * a reference assigned by user
     * @return reference
     **/
    @ApiModelProperty(value = "a reference assigned by user")


    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public ResponseBody active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * active links only are visible to the user specified
     * @return active
     **/
    @ApiModelProperty(value = "active links only are visible to the user specified")


    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseBody ResponseBody = (ResponseBody) o;
        return Objects.equals(this.id, ResponseBody.id) &&
                Objects.equals(this.user, ResponseBody.user) &&
                Objects.equals(this.url, ResponseBody.url) &&
                Objects.equals(this.label, ResponseBody.label) &&
                Objects.equals(this.reference, ResponseBody.reference) &&
                Objects.equals(this.active, ResponseBody.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, url, label, reference, active);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseBody {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
