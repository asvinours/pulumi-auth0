// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PromptArgs extends com.pulumi.resources.ResourceArgs {

    public static final PromptArgs Empty = new PromptArgs();

    /**
     * Indicates whether the identifier first is used when using the new Universal Login experience.
     * 
     */
    @Import(name="identifierFirst")
    private @Nullable Output<Boolean> identifierFirst;

    /**
     * @return Indicates whether the identifier first is used when using the new Universal Login experience.
     * 
     */
    public Optional<Output<Boolean>> identifierFirst() {
        return Optional.ofNullable(this.identifierFirst);
    }

    /**
     * Which login experience to use. Options include `classic` and `new`.
     * 
     */
    @Import(name="universalLoginExperience")
    private @Nullable Output<String> universalLoginExperience;

    /**
     * @return Which login experience to use. Options include `classic` and `new`.
     * 
     */
    public Optional<Output<String>> universalLoginExperience() {
        return Optional.ofNullable(this.universalLoginExperience);
    }

    /**
     * Determines if the login screen uses identifier and biometrics first. Setting this property to `true`, requires MFA factors enabled for enrollment; use the `auth0.Guardian` resource to set one up.
     * 
     */
    @Import(name="webauthnPlatformFirstFactor")
    private @Nullable Output<Boolean> webauthnPlatformFirstFactor;

    /**
     * @return Determines if the login screen uses identifier and biometrics first. Setting this property to `true`, requires MFA factors enabled for enrollment; use the `auth0.Guardian` resource to set one up.
     * 
     */
    public Optional<Output<Boolean>> webauthnPlatformFirstFactor() {
        return Optional.ofNullable(this.webauthnPlatformFirstFactor);
    }

    private PromptArgs() {}

    private PromptArgs(PromptArgs $) {
        this.identifierFirst = $.identifierFirst;
        this.universalLoginExperience = $.universalLoginExperience;
        this.webauthnPlatformFirstFactor = $.webauthnPlatformFirstFactor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PromptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PromptArgs $;

        public Builder() {
            $ = new PromptArgs();
        }

        public Builder(PromptArgs defaults) {
            $ = new PromptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifierFirst Indicates whether the identifier first is used when using the new Universal Login experience.
         * 
         * @return builder
         * 
         */
        public Builder identifierFirst(@Nullable Output<Boolean> identifierFirst) {
            $.identifierFirst = identifierFirst;
            return this;
        }

        /**
         * @param identifierFirst Indicates whether the identifier first is used when using the new Universal Login experience.
         * 
         * @return builder
         * 
         */
        public Builder identifierFirst(Boolean identifierFirst) {
            return identifierFirst(Output.of(identifierFirst));
        }

        /**
         * @param universalLoginExperience Which login experience to use. Options include `classic` and `new`.
         * 
         * @return builder
         * 
         */
        public Builder universalLoginExperience(@Nullable Output<String> universalLoginExperience) {
            $.universalLoginExperience = universalLoginExperience;
            return this;
        }

        /**
         * @param universalLoginExperience Which login experience to use. Options include `classic` and `new`.
         * 
         * @return builder
         * 
         */
        public Builder universalLoginExperience(String universalLoginExperience) {
            return universalLoginExperience(Output.of(universalLoginExperience));
        }

        /**
         * @param webauthnPlatformFirstFactor Determines if the login screen uses identifier and biometrics first. Setting this property to `true`, requires MFA factors enabled for enrollment; use the `auth0.Guardian` resource to set one up.
         * 
         * @return builder
         * 
         */
        public Builder webauthnPlatformFirstFactor(@Nullable Output<Boolean> webauthnPlatformFirstFactor) {
            $.webauthnPlatformFirstFactor = webauthnPlatformFirstFactor;
            return this;
        }

        /**
         * @param webauthnPlatformFirstFactor Determines if the login screen uses identifier and biometrics first. Setting this property to `true`, requires MFA factors enabled for enrollment; use the `auth0.Guardian` resource to set one up.
         * 
         * @return builder
         * 
         */
        public Builder webauthnPlatformFirstFactor(Boolean webauthnPlatformFirstFactor) {
            return webauthnPlatformFirstFactor(Output.of(webauthnPlatformFirstFactor));
        }

        public PromptArgs build() {
            return $;
        }
    }

}
