// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class PagesGuardianMfaArgs extends com.pulumi.resources.ResourceArgs {

    public static final PagesGuardianMfaArgs Empty = new PagesGuardianMfaArgs();

    /**
     * Indicates whether to use the custom Guardian MFA HTML (`true`) or the default Auth0 page (`false`).
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether to use the custom Guardian MFA HTML (`true`) or the default Auth0 page (`false`).
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Customized content for the Guardian MFA page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
     * 
     */
    @Import(name="html", required=true)
    private Output<String> html;

    /**
     * @return Customized content for the Guardian MFA page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
     * 
     */
    public Output<String> html() {
        return this.html;
    }

    private PagesGuardianMfaArgs() {}

    private PagesGuardianMfaArgs(PagesGuardianMfaArgs $) {
        this.enabled = $.enabled;
        this.html = $.html;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagesGuardianMfaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagesGuardianMfaArgs $;

        public Builder() {
            $ = new PagesGuardianMfaArgs();
        }

        public Builder(PagesGuardianMfaArgs defaults) {
            $ = new PagesGuardianMfaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Indicates whether to use the custom Guardian MFA HTML (`true`) or the default Auth0 page (`false`).
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether to use the custom Guardian MFA HTML (`true`) or the default Auth0 page (`false`).
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param html Customized content for the Guardian MFA page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
         * 
         * @return builder
         * 
         */
        public Builder html(Output<String> html) {
            $.html = html;
            return this;
        }

        /**
         * @param html Customized content for the Guardian MFA page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
         * 
         * @return builder
         * 
         */
        public Builder html(String html) {
            return html(Output.of(html));
        }

        public PagesGuardianMfaArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("PagesGuardianMfaArgs", "enabled");
            }
            if ($.html == null) {
                throw new MissingRequiredPropertyException("PagesGuardianMfaArgs", "html");
            }
            return $;
        }
    }

}
