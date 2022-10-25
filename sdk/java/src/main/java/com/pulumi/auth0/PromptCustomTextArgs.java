// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PromptCustomTextArgs extends com.pulumi.resources.ResourceArgs {

    public static final PromptCustomTextArgs Empty = new PromptCustomTextArgs();

    /**
     * JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
     * 
     */
    @Import(name="body", required=true)
    private Output<String> body;

    /**
     * @return JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
     * 
     */
    public Output<String> body() {
        return this.body;
    }

    /**
     * Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
     * 
     */
    @Import(name="language", required=true)
    private Output<String> language;

    /**
     * @return Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
     * 
     */
    public Output<String> language() {
        return this.language;
    }

    /**
     * The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`.
     * 
     */
    @Import(name="prompt", required=true)
    private Output<String> prompt;

    /**
     * @return The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`.
     * 
     */
    public Output<String> prompt() {
        return this.prompt;
    }

    private PromptCustomTextArgs() {}

    private PromptCustomTextArgs(PromptCustomTextArgs $) {
        this.body = $.body;
        this.language = $.language;
        this.prompt = $.prompt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PromptCustomTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PromptCustomTextArgs $;

        public Builder() {
            $ = new PromptCustomTextArgs();
        }

        public Builder(PromptCustomTextArgs defaults) {
            $ = new PromptCustomTextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param body JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
         * 
         * @return builder
         * 
         */
        public Builder body(Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param language Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
         * 
         * @return builder
         * 
         */
        public Builder language(Output<String> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            return language(Output.of(language));
        }

        /**
         * @param prompt The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`.
         * 
         * @return builder
         * 
         */
        public Builder prompt(Output<String> prompt) {
            $.prompt = prompt;
            return this;
        }

        /**
         * @param prompt The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`.
         * 
         * @return builder
         * 
         */
        public Builder prompt(String prompt) {
            return prompt(Output.of(prompt));
        }

        public PromptCustomTextArgs build() {
            $.body = Objects.requireNonNull($.body, "expected parameter 'body' to be non-null");
            $.language = Objects.requireNonNull($.language, "expected parameter 'language' to be non-null");
            $.prompt = Objects.requireNonNull($.prompt, "expected parameter 'prompt' to be non-null");
            return $;
        }
    }

}
