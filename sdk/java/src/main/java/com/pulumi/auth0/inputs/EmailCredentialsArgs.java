// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EmailCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailCredentialsArgs Empty = new EmailCredentialsArgs();

    /**
     * String, Case-sensitive. AWS Access Key ID. Used only for AWS.
     * 
     */
    @Import(name="accessKeyId")
    private @Nullable Output<String> accessKeyId;

    /**
     * @return String, Case-sensitive. AWS Access Key ID. Used only for AWS.
     * 
     */
    public Optional<Output<String>> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }

    /**
     * String, Case-sensitive. API Key for your email service. Will always be encrypted in our database.
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return String, Case-sensitive. API Key for your email service. Will always be encrypted in our database.
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * String. API User for your email service.
     * 
     */
    @Import(name="apiUser")
    private @Nullable Output<String> apiUser;

    /**
     * @return String. API User for your email service.
     * 
     */
    public Optional<Output<String>> apiUser() {
        return Optional.ofNullable(this.apiUser);
    }

    @Import(name="domain")
    private @Nullable Output<String> domain;

    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * String. Default region. Used only for AWS, Mailgun, and SparkPost.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return String. Default region. Used only for AWS, Mailgun, and SparkPost.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * String, Case-sensitive. AWS Secret Key. Will always be encrypted in our database. Used only for AWS.
     * 
     */
    @Import(name="secretAccessKey")
    private @Nullable Output<String> secretAccessKey;

    /**
     * @return String, Case-sensitive. AWS Secret Key. Will always be encrypted in our database. Used only for AWS.
     * 
     */
    public Optional<Output<String>> secretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }

    /**
     * String. Hostname or IP address of your SMTP server. Used only for SMTP.
     * 
     */
    @Import(name="smtpHost")
    private @Nullable Output<String> smtpHost;

    /**
     * @return String. Hostname or IP address of your SMTP server. Used only for SMTP.
     * 
     */
    public Optional<Output<String>> smtpHost() {
        return Optional.ofNullable(this.smtpHost);
    }

    /**
     * String, Case-sensitive. SMTP password. Used only for SMTP.
     * 
     */
    @Import(name="smtpPass")
    private @Nullable Output<String> smtpPass;

    /**
     * @return String, Case-sensitive. SMTP password. Used only for SMTP.
     * 
     */
    public Optional<Output<String>> smtpPass() {
        return Optional.ofNullable(this.smtpPass);
    }

    /**
     * Integer. Port used by your SMTP server. Please avoid using port 25 if possible because many providers have limitations on this port. Used only for SMTP.
     * 
     */
    @Import(name="smtpPort")
    private @Nullable Output<Integer> smtpPort;

    /**
     * @return Integer. Port used by your SMTP server. Please avoid using port 25 if possible because many providers have limitations on this port. Used only for SMTP.
     * 
     */
    public Optional<Output<Integer>> smtpPort() {
        return Optional.ofNullable(this.smtpPort);
    }

    /**
     * String. SMTP username. Used only for SMTP.
     * 
     */
    @Import(name="smtpUser")
    private @Nullable Output<String> smtpUser;

    /**
     * @return String. SMTP username. Used only for SMTP.
     * 
     */
    public Optional<Output<String>> smtpUser() {
        return Optional.ofNullable(this.smtpUser);
    }

    private EmailCredentialsArgs() {}

    private EmailCredentialsArgs(EmailCredentialsArgs $) {
        this.accessKeyId = $.accessKeyId;
        this.apiKey = $.apiKey;
        this.apiUser = $.apiUser;
        this.domain = $.domain;
        this.region = $.region;
        this.secretAccessKey = $.secretAccessKey;
        this.smtpHost = $.smtpHost;
        this.smtpPass = $.smtpPass;
        this.smtpPort = $.smtpPort;
        this.smtpUser = $.smtpUser;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailCredentialsArgs $;

        public Builder() {
            $ = new EmailCredentialsArgs();
        }

        public Builder(EmailCredentialsArgs defaults) {
            $ = new EmailCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyId String, Case-sensitive. AWS Access Key ID. Used only for AWS.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(@Nullable Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * @param accessKeyId String, Case-sensitive. AWS Access Key ID. Used only for AWS.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        /**
         * @param apiKey String, Case-sensitive. API Key for your email service. Will always be encrypted in our database.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey String, Case-sensitive. API Key for your email service. Will always be encrypted in our database.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param apiUser String. API User for your email service.
         * 
         * @return builder
         * 
         */
        public Builder apiUser(@Nullable Output<String> apiUser) {
            $.apiUser = apiUser;
            return this;
        }

        /**
         * @param apiUser String. API User for your email service.
         * 
         * @return builder
         * 
         */
        public Builder apiUser(String apiUser) {
            return apiUser(Output.of(apiUser));
        }

        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param region String. Default region. Used only for AWS, Mailgun, and SparkPost.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region String. Default region. Used only for AWS, Mailgun, and SparkPost.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secretAccessKey String, Case-sensitive. AWS Secret Key. Will always be encrypted in our database. Used only for AWS.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(@Nullable Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * @param secretAccessKey String, Case-sensitive. AWS Secret Key. Will always be encrypted in our database. Used only for AWS.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        /**
         * @param smtpHost String. Hostname or IP address of your SMTP server. Used only for SMTP.
         * 
         * @return builder
         * 
         */
        public Builder smtpHost(@Nullable Output<String> smtpHost) {
            $.smtpHost = smtpHost;
            return this;
        }

        /**
         * @param smtpHost String. Hostname or IP address of your SMTP server. Used only for SMTP.
         * 
         * @return builder
         * 
         */
        public Builder smtpHost(String smtpHost) {
            return smtpHost(Output.of(smtpHost));
        }

        /**
         * @param smtpPass String, Case-sensitive. SMTP password. Used only for SMTP.
         * 
         * @return builder
         * 
         */
        public Builder smtpPass(@Nullable Output<String> smtpPass) {
            $.smtpPass = smtpPass;
            return this;
        }

        /**
         * @param smtpPass String, Case-sensitive. SMTP password. Used only for SMTP.
         * 
         * @return builder
         * 
         */
        public Builder smtpPass(String smtpPass) {
            return smtpPass(Output.of(smtpPass));
        }

        /**
         * @param smtpPort Integer. Port used by your SMTP server. Please avoid using port 25 if possible because many providers have limitations on this port. Used only for SMTP.
         * 
         * @return builder
         * 
         */
        public Builder smtpPort(@Nullable Output<Integer> smtpPort) {
            $.smtpPort = smtpPort;
            return this;
        }

        /**
         * @param smtpPort Integer. Port used by your SMTP server. Please avoid using port 25 if possible because many providers have limitations on this port. Used only for SMTP.
         * 
         * @return builder
         * 
         */
        public Builder smtpPort(Integer smtpPort) {
            return smtpPort(Output.of(smtpPort));
        }

        /**
         * @param smtpUser String. SMTP username. Used only for SMTP.
         * 
         * @return builder
         * 
         */
        public Builder smtpUser(@Nullable Output<String> smtpUser) {
            $.smtpUser = smtpUser;
            return this;
        }

        /**
         * @param smtpUser String. SMTP username. Used only for SMTP.
         * 
         * @return builder
         * 
         */
        public Builder smtpUser(String smtpUser) {
            return smtpUser(Output.of(smtpUser));
        }

        public EmailCredentialsArgs build() {
            return $;
        }
    }

}
