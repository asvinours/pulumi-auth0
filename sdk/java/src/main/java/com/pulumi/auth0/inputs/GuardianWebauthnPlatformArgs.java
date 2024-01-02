// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuardianWebauthnPlatformArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuardianWebauthnPlatformArgs Empty = new GuardianWebauthnPlatformArgs();

    /**
     * Indicates whether WebAuthn with FIDO Device Biometrics MFA is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether WebAuthn with FIDO Device Biometrics MFA is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The Relying Party is the domain for which the WebAuthn keys will be issued, set to `true` if you are customizing the identifier.
     * 
     */
    @Import(name="overrideRelyingParty")
    private @Nullable Output<Boolean> overrideRelyingParty;

    /**
     * @return The Relying Party is the domain for which the WebAuthn keys will be issued, set to `true` if you are customizing the identifier.
     * 
     */
    public Optional<Output<Boolean>> overrideRelyingParty() {
        return Optional.ofNullable(this.overrideRelyingParty);
    }

    /**
     * The Relying Party should be a suffix of the custom domain.
     * 
     */
    @Import(name="relyingPartyIdentifier")
    private @Nullable Output<String> relyingPartyIdentifier;

    /**
     * @return The Relying Party should be a suffix of the custom domain.
     * 
     */
    public Optional<Output<String>> relyingPartyIdentifier() {
        return Optional.ofNullable(this.relyingPartyIdentifier);
    }

    private GuardianWebauthnPlatformArgs() {}

    private GuardianWebauthnPlatformArgs(GuardianWebauthnPlatformArgs $) {
        this.enabled = $.enabled;
        this.overrideRelyingParty = $.overrideRelyingParty;
        this.relyingPartyIdentifier = $.relyingPartyIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuardianWebauthnPlatformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuardianWebauthnPlatformArgs $;

        public Builder() {
            $ = new GuardianWebauthnPlatformArgs();
        }

        public Builder(GuardianWebauthnPlatformArgs defaults) {
            $ = new GuardianWebauthnPlatformArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Indicates whether WebAuthn with FIDO Device Biometrics MFA is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether WebAuthn with FIDO Device Biometrics MFA is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param overrideRelyingParty The Relying Party is the domain for which the WebAuthn keys will be issued, set to `true` if you are customizing the identifier.
         * 
         * @return builder
         * 
         */
        public Builder overrideRelyingParty(@Nullable Output<Boolean> overrideRelyingParty) {
            $.overrideRelyingParty = overrideRelyingParty;
            return this;
        }

        /**
         * @param overrideRelyingParty The Relying Party is the domain for which the WebAuthn keys will be issued, set to `true` if you are customizing the identifier.
         * 
         * @return builder
         * 
         */
        public Builder overrideRelyingParty(Boolean overrideRelyingParty) {
            return overrideRelyingParty(Output.of(overrideRelyingParty));
        }

        /**
         * @param relyingPartyIdentifier The Relying Party should be a suffix of the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder relyingPartyIdentifier(@Nullable Output<String> relyingPartyIdentifier) {
            $.relyingPartyIdentifier = relyingPartyIdentifier;
            return this;
        }

        /**
         * @param relyingPartyIdentifier The Relying Party should be a suffix of the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder relyingPartyIdentifier(String relyingPartyIdentifier) {
            return relyingPartyIdentifier(Output.of(relyingPartyIdentifier));
        }

        public GuardianWebauthnPlatformArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("GuardianWebauthnPlatformArgs", "enabled");
            }
            return $;
        }
    }

}
