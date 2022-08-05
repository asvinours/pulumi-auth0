// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.AttackProtectionSuspiciousIpThrottlingPreLogin;
import com.pulumi.auth0.outputs.AttackProtectionSuspiciousIpThrottlingPreUserRegistration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AttackProtectionSuspiciousIpThrottling {
    /**
     * @return List of trusted IP addresses that will not have attack protection enforced against them.
     * 
     */
    private final @Nullable List<String> allowlists;
    /**
     * @return Whether or not breached password detection is active.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Configuration options that apply before every login attempt. Only available on public tenants.
     * 
     */
    private final @Nullable AttackProtectionSuspiciousIpThrottlingPreLogin preLogin;
    /**
     * @return Configuration options that apply before every user registration attempt. Only available on public tenants.
     * 
     */
    private final @Nullable AttackProtectionSuspiciousIpThrottlingPreUserRegistration preUserRegistration;
    /**
     * @return Action to take when a breached password is detected. Possible values: `block`, `user_notification`, `admin_notification`.
     * 
     */
    private final @Nullable List<String> shields;

    @CustomType.Constructor
    private AttackProtectionSuspiciousIpThrottling(
        @CustomType.Parameter("allowlists") @Nullable List<String> allowlists,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("preLogin") @Nullable AttackProtectionSuspiciousIpThrottlingPreLogin preLogin,
        @CustomType.Parameter("preUserRegistration") @Nullable AttackProtectionSuspiciousIpThrottlingPreUserRegistration preUserRegistration,
        @CustomType.Parameter("shields") @Nullable List<String> shields) {
        this.allowlists = allowlists;
        this.enabled = enabled;
        this.preLogin = preLogin;
        this.preUserRegistration = preUserRegistration;
        this.shields = shields;
    }

    /**
     * @return List of trusted IP addresses that will not have attack protection enforced against them.
     * 
     */
    public List<String> allowlists() {
        return this.allowlists == null ? List.of() : this.allowlists;
    }
    /**
     * @return Whether or not breached password detection is active.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Configuration options that apply before every login attempt. Only available on public tenants.
     * 
     */
    public Optional<AttackProtectionSuspiciousIpThrottlingPreLogin> preLogin() {
        return Optional.ofNullable(this.preLogin);
    }
    /**
     * @return Configuration options that apply before every user registration attempt. Only available on public tenants.
     * 
     */
    public Optional<AttackProtectionSuspiciousIpThrottlingPreUserRegistration> preUserRegistration() {
        return Optional.ofNullable(this.preUserRegistration);
    }
    /**
     * @return Action to take when a breached password is detected. Possible values: `block`, `user_notification`, `admin_notification`.
     * 
     */
    public List<String> shields() {
        return this.shields == null ? List.of() : this.shields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttackProtectionSuspiciousIpThrottling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowlists;
        private @Nullable Boolean enabled;
        private @Nullable AttackProtectionSuspiciousIpThrottlingPreLogin preLogin;
        private @Nullable AttackProtectionSuspiciousIpThrottlingPreUserRegistration preUserRegistration;
        private @Nullable List<String> shields;

        public Builder() {
    	      // Empty
        }

        public Builder(AttackProtectionSuspiciousIpThrottling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlists = defaults.allowlists;
    	      this.enabled = defaults.enabled;
    	      this.preLogin = defaults.preLogin;
    	      this.preUserRegistration = defaults.preUserRegistration;
    	      this.shields = defaults.shields;
        }

        public Builder allowlists(@Nullable List<String> allowlists) {
            this.allowlists = allowlists;
            return this;
        }
        public Builder allowlists(String... allowlists) {
            return allowlists(List.of(allowlists));
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder preLogin(@Nullable AttackProtectionSuspiciousIpThrottlingPreLogin preLogin) {
            this.preLogin = preLogin;
            return this;
        }
        public Builder preUserRegistration(@Nullable AttackProtectionSuspiciousIpThrottlingPreUserRegistration preUserRegistration) {
            this.preUserRegistration = preUserRegistration;
            return this;
        }
        public Builder shields(@Nullable List<String> shields) {
            this.shields = shields;
            return this;
        }
        public Builder shields(String... shields) {
            return shields(List.of(shields));
        }        public AttackProtectionSuspiciousIpThrottling build() {
            return new AttackProtectionSuspiciousIpThrottling(allowlists, enabled, preLogin, preUserRegistration, shields);
        }
    }
}
