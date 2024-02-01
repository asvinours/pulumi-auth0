// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetTenantSession {
    /**
     * @return When active, users will be presented with a consent prompt to confirm the logout request if the request is not trustworthy. Turn off the consent prompt to bypass user confirmation.
     * 
     */
    private Boolean oidcLogoutPromptEnabled;

    private GetTenantSession() {}
    /**
     * @return When active, users will be presented with a consent prompt to confirm the logout request if the request is not trustworthy. Turn off the consent prompt to bypass user confirmation.
     * 
     */
    public Boolean oidcLogoutPromptEnabled() {
        return this.oidcLogoutPromptEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTenantSession defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean oidcLogoutPromptEnabled;
        public Builder() {}
        public Builder(GetTenantSession defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oidcLogoutPromptEnabled = defaults.oidcLogoutPromptEnabled;
        }

        @CustomType.Setter
        public Builder oidcLogoutPromptEnabled(Boolean oidcLogoutPromptEnabled) {
            if (oidcLogoutPromptEnabled == null) {
              throw new MissingRequiredPropertyException("GetTenantSession", "oidcLogoutPromptEnabled");
            }
            this.oidcLogoutPromptEnabled = oidcLogoutPromptEnabled;
            return this;
        }
        public GetTenantSession build() {
            final var _resultValue = new GetTenantSession();
            _resultValue.oidcLogoutPromptEnabled = oidcLogoutPromptEnabled;
            return _resultValue;
        }
    }
}
