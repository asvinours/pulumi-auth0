// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAttackProtectionBruteForceProtection {
    /**
     * @return List of trusted IP addresses that will not have attack protection enforced against them. This field allows you to specify multiple IP addresses, or ranges. You can use IPv4 or IPv6 addresses and CIDR notation.
     * 
     */
    private List<String> allowlists;
    /**
     * @return Whether brute force attack protections are active.
     * 
     */
    private Boolean enabled;
    /**
     * @return Maximum number of consecutive failed login attempts from a single user before blocking is triggered. Only available on public tenants.
     * 
     */
    private Integer maxAttempts;
    /**
     * @return Determines whether the IP address is used when counting failed attempts. Possible values: `count_per_identifier_and_ip` (lockout an account from a given IP Address) or `count_per_identifier` (lockout an account regardless of IP Address).
     * 
     */
    private String mode;
    /**
     * @return Action to take when a brute force protection threshold is violated. Possible values: `block` (block login attempts for a flagged user account), `user_notification` (send an email to user when their account has been blocked).
     * 
     */
    private List<String> shields;

    private GetAttackProtectionBruteForceProtection() {}
    /**
     * @return List of trusted IP addresses that will not have attack protection enforced against them. This field allows you to specify multiple IP addresses, or ranges. You can use IPv4 or IPv6 addresses and CIDR notation.
     * 
     */
    public List<String> allowlists() {
        return this.allowlists;
    }
    /**
     * @return Whether brute force attack protections are active.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Maximum number of consecutive failed login attempts from a single user before blocking is triggered. Only available on public tenants.
     * 
     */
    public Integer maxAttempts() {
        return this.maxAttempts;
    }
    /**
     * @return Determines whether the IP address is used when counting failed attempts. Possible values: `count_per_identifier_and_ip` (lockout an account from a given IP Address) or `count_per_identifier` (lockout an account regardless of IP Address).
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Action to take when a brute force protection threshold is violated. Possible values: `block` (block login attempts for a flagged user account), `user_notification` (send an email to user when their account has been blocked).
     * 
     */
    public List<String> shields() {
        return this.shields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttackProtectionBruteForceProtection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowlists;
        private Boolean enabled;
        private Integer maxAttempts;
        private String mode;
        private List<String> shields;
        public Builder() {}
        public Builder(GetAttackProtectionBruteForceProtection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlists = defaults.allowlists;
    	      this.enabled = defaults.enabled;
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.mode = defaults.mode;
    	      this.shields = defaults.shields;
        }

        @CustomType.Setter
        public Builder allowlists(List<String> allowlists) {
            if (allowlists == null) {
              throw new MissingRequiredPropertyException("GetAttackProtectionBruteForceProtection", "allowlists");
            }
            this.allowlists = allowlists;
            return this;
        }
        public Builder allowlists(String... allowlists) {
            return allowlists(List.of(allowlists));
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetAttackProtectionBruteForceProtection", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder maxAttempts(Integer maxAttempts) {
            if (maxAttempts == null) {
              throw new MissingRequiredPropertyException("GetAttackProtectionBruteForceProtection", "maxAttempts");
            }
            this.maxAttempts = maxAttempts;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetAttackProtectionBruteForceProtection", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder shields(List<String> shields) {
            if (shields == null) {
              throw new MissingRequiredPropertyException("GetAttackProtectionBruteForceProtection", "shields");
            }
            this.shields = shields;
            return this;
        }
        public Builder shields(String... shields) {
            return shields(List.of(shields));
        }
        public GetAttackProtectionBruteForceProtection build() {
            final var _resultValue = new GetAttackProtectionBruteForceProtection();
            _resultValue.allowlists = allowlists;
            _resultValue.enabled = enabled;
            _resultValue.maxAttempts = maxAttempts;
            _resultValue.mode = mode;
            _resultValue.shields = shields;
            return _resultValue;
        }
    }
}
