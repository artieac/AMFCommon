package com.alwaysmoveforward.oauth.DomainModel;

import javax.persistence.NamedQuery;
import java.io.Serializable;

/**
 * Created by acorrea on 11/25/2015.
 */

public class Consumer implements Serializable{
    /// <summary>
    /// Gets or sets the consumer key
    /// </summary>
    private String consumerKey;
    public String getConsumerKey() { return this.consumerKey; }
    public void setConsumerKey(String value) { this.consumerKey = value;}

    /// <summary>
    /// Gets or sets the consumer secret
    /// </summary>
    private String consumerSecret;
    public String getConsumerSecret() { return this.consumerSecret; }
    public void setConsumerSecret(String value) { this.consumerSecret = value;}

    /// <summary>
    /// Gets or sets the Public Key
    /// </summary>
    private String publicKey;
    public String getPublicKey() { return this.publicKey; }
    public void setPublicKey(String value) { this.publicKey = value;}

    /// <summary>
    /// Gets or sets the contact email.
    /// </summary>
    private String contactEmail;
    public String getContactEmail() { return this.contactEmail; }
    public void setContactEmail(String value) { this.contactEmail = value;}

    /// <summary>
    /// Gets or sets the name of the consumer
    /// </summary>
    private String name;
    public String getName() { return this.name; }
    public void setName(String value) { this.name = value;}

    /// <summary>
    /// Gets or sets if the access tokens should be auto granted
    /// </summary>
    private Boolean autoGrant;
    public Boolean getAutoGrant() { return this.autoGrant; }
    public void setAutoGrant(Boolean value) { this.autoGrant = value;}

    /// <summary>
    /// Gets or sets how many hours before an access token expires for this consumer
    /// </summary>
    private Integer accessTokenLifetime;
    public Integer getAccessTokenLifetime() { return this.accessTokenLifetime; }
    public void setAccessTokenLifetime(Integer value) { this.accessTokenLifetime = value;}}
