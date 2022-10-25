// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EmailTemplateState extends com.pulumi.resources.ResourceArgs {

    public static final EmailTemplateState Empty = new EmailTemplateState();

    /**
     * Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Indicates whether the template is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Indicates whether the template is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    @Import(name="from")
    private @Nullable Output<String> from;

    /**
     * @return Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    public Optional<Output<String>> from() {
        return Optional.ofNullable(this.from);
    }

    /**
     * Whether the `reset_email` and `verify_email` templates should include the user&#39;s email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
     * 
     */
    @Import(name="includeEmailInRedirect")
    private @Nullable Output<Boolean> includeEmailInRedirect;

    /**
     * @return Whether the `reset_email` and `verify_email` templates should include the user&#39;s email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> includeEmailInRedirect() {
        return Optional.ofNullable(this.includeEmailInRedirect);
    }

    /**
     * URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
     * 
     */
    @Import(name="resultUrl")
    private @Nullable Output<String> resultUrl;

    /**
     * @return URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
     * 
     */
    public Optional<Output<String>> resultUrl() {
        return Optional.ofNullable(this.resultUrl);
    }

    /**
     * Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    @Import(name="subject")
    private @Nullable Output<String> subject;

    /**
     * @return Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    public Optional<Output<String>> subject() {
        return Optional.ofNullable(this.subject);
    }

    /**
     * Syntax of the template body. You can use either text or HTML with Liquid syntax.
     * 
     */
    @Import(name="syntax")
    private @Nullable Output<String> syntax;

    /**
     * @return Syntax of the template body. You can use either text or HTML with Liquid syntax.
     * 
     */
    public Optional<Output<String>> syntax() {
        return Optional.ofNullable(this.syntax);
    }

    /**
     * Template name. Options include `verify_email`, `verify_email_by_code`, `reset_email`, `welcome_email`, `blocked_account`, `stolen_credentials`, `enrollment_email`, `mfa_oob_code`, `user_invitation`, `change_password` (legacy), or `password_reset` (legacy).
     * 
     */
    @Import(name="template")
    private @Nullable Output<String> template;

    /**
     * @return Template name. Options include `verify_email`, `verify_email_by_code`, `reset_email`, `welcome_email`, `blocked_account`, `stolen_credentials`, `enrollment_email`, `mfa_oob_code`, `user_invitation`, `change_password` (legacy), or `password_reset` (legacy).
     * 
     */
    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * Number of seconds during which the link within the email will be valid.
     * 
     */
    @Import(name="urlLifetimeInSeconds")
    private @Nullable Output<Integer> urlLifetimeInSeconds;

    /**
     * @return Number of seconds during which the link within the email will be valid.
     * 
     */
    public Optional<Output<Integer>> urlLifetimeInSeconds() {
        return Optional.ofNullable(this.urlLifetimeInSeconds);
    }

    private EmailTemplateState() {}

    private EmailTemplateState(EmailTemplateState $) {
        this.body = $.body;
        this.enabled = $.enabled;
        this.from = $.from;
        this.includeEmailInRedirect = $.includeEmailInRedirect;
        this.resultUrl = $.resultUrl;
        this.subject = $.subject;
        this.syntax = $.syntax;
        this.template = $.template;
        this.urlLifetimeInSeconds = $.urlLifetimeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailTemplateState $;

        public Builder() {
            $ = new EmailTemplateState();
        }

        public Builder(EmailTemplateState defaults) {
            $ = new EmailTemplateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param body Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param enabled Indicates whether the template is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether the template is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param from Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
         * 
         * @return builder
         * 
         */
        public Builder from(@Nullable Output<String> from) {
            $.from = from;
            return this;
        }

        /**
         * @param from Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
         * 
         * @return builder
         * 
         */
        public Builder from(String from) {
            return from(Output.of(from));
        }

        /**
         * @param includeEmailInRedirect Whether the `reset_email` and `verify_email` templates should include the user&#39;s email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder includeEmailInRedirect(@Nullable Output<Boolean> includeEmailInRedirect) {
            $.includeEmailInRedirect = includeEmailInRedirect;
            return this;
        }

        /**
         * @param includeEmailInRedirect Whether the `reset_email` and `verify_email` templates should include the user&#39;s email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder includeEmailInRedirect(Boolean includeEmailInRedirect) {
            return includeEmailInRedirect(Output.of(includeEmailInRedirect));
        }

        /**
         * @param resultUrl URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
         * 
         * @return builder
         * 
         */
        public Builder resultUrl(@Nullable Output<String> resultUrl) {
            $.resultUrl = resultUrl;
            return this;
        }

        /**
         * @param resultUrl URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
         * 
         * @return builder
         * 
         */
        public Builder resultUrl(String resultUrl) {
            return resultUrl(Output.of(resultUrl));
        }

        /**
         * @param subject Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
         * 
         * @return builder
         * 
         */
        public Builder subject(@Nullable Output<String> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
         * 
         * @return builder
         * 
         */
        public Builder subject(String subject) {
            return subject(Output.of(subject));
        }

        /**
         * @param syntax Syntax of the template body. You can use either text or HTML with Liquid syntax.
         * 
         * @return builder
         * 
         */
        public Builder syntax(@Nullable Output<String> syntax) {
            $.syntax = syntax;
            return this;
        }

        /**
         * @param syntax Syntax of the template body. You can use either text or HTML with Liquid syntax.
         * 
         * @return builder
         * 
         */
        public Builder syntax(String syntax) {
            return syntax(Output.of(syntax));
        }

        /**
         * @param template Template name. Options include `verify_email`, `verify_email_by_code`, `reset_email`, `welcome_email`, `blocked_account`, `stolen_credentials`, `enrollment_email`, `mfa_oob_code`, `user_invitation`, `change_password` (legacy), or `password_reset` (legacy).
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Template name. Options include `verify_email`, `verify_email_by_code`, `reset_email`, `welcome_email`, `blocked_account`, `stolen_credentials`, `enrollment_email`, `mfa_oob_code`, `user_invitation`, `change_password` (legacy), or `password_reset` (legacy).
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        /**
         * @param urlLifetimeInSeconds Number of seconds during which the link within the email will be valid.
         * 
         * @return builder
         * 
         */
        public Builder urlLifetimeInSeconds(@Nullable Output<Integer> urlLifetimeInSeconds) {
            $.urlLifetimeInSeconds = urlLifetimeInSeconds;
            return this;
        }

        /**
         * @param urlLifetimeInSeconds Number of seconds during which the link within the email will be valid.
         * 
         * @return builder
         * 
         */
        public Builder urlLifetimeInSeconds(Integer urlLifetimeInSeconds) {
            return urlLifetimeInSeconds(Output.of(urlLifetimeInSeconds));
        }

        public EmailTemplateState build() {
            return $;
        }
    }

}
