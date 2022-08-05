// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.EmailCredentialsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EmailState extends com.pulumi.resources.ResourceArgs {

    public static final EmailState Empty = new EmailState();

    /**
     * List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<EmailCredentialsArgs> credentials;

    /**
     * @return List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
     * 
     */
    public Optional<Output<EmailCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * String. Email address to use as the sender when no other &#34;from&#34; address is specified.
     * 
     */
    @Import(name="defaultFromAddress")
    private @Nullable Output<String> defaultFromAddress;

    /**
     * @return String. Email address to use as the sender when no other &#34;from&#34; address is specified.
     * 
     */
    public Optional<Output<String>> defaultFromAddress() {
        return Optional.ofNullable(this.defaultFromAddress);
    }

    /**
     * Boolean. Indicates whether or not the email provider is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Boolean. Indicates whether or not the email provider is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private EmailState() {}

    private EmailState(EmailState $) {
        this.credentials = $.credentials;
        this.defaultFromAddress = $.defaultFromAddress;
        this.enabled = $.enabled;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailState $;

        public Builder() {
            $ = new EmailState();
        }

        public Builder(EmailState defaults) {
            $ = new EmailState(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<EmailCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(EmailCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param defaultFromAddress String. Email address to use as the sender when no other &#34;from&#34; address is specified.
         * 
         * @return builder
         * 
         */
        public Builder defaultFromAddress(@Nullable Output<String> defaultFromAddress) {
            $.defaultFromAddress = defaultFromAddress;
            return this;
        }

        /**
         * @param defaultFromAddress String. Email address to use as the sender when no other &#34;from&#34; address is specified.
         * 
         * @return builder
         * 
         */
        public Builder defaultFromAddress(String defaultFromAddress) {
            return defaultFromAddress(Output.of(defaultFromAddress));
        }

        /**
         * @param enabled Boolean. Indicates whether or not the email provider is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean. Indicates whether or not the email provider is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public EmailState build() {
            return $;
        }
    }

}
