// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOrganizationConnection {
    private Boolean assignMembershipOnLogin;
    private String connectionId;

    private GetOrganizationConnection() {}
    public Boolean assignMembershipOnLogin() {
        return this.assignMembershipOnLogin;
    }
    public String connectionId() {
        return this.connectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationConnection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean assignMembershipOnLogin;
        private String connectionId;
        public Builder() {}
        public Builder(GetOrganizationConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignMembershipOnLogin = defaults.assignMembershipOnLogin;
    	      this.connectionId = defaults.connectionId;
        }

        @CustomType.Setter
        public Builder assignMembershipOnLogin(Boolean assignMembershipOnLogin) {
            this.assignMembershipOnLogin = Objects.requireNonNull(assignMembershipOnLogin);
            return this;
        }
        @CustomType.Setter
        public Builder connectionId(String connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }
        public GetOrganizationConnection build() {
            final var o = new GetOrganizationConnection();
            o.assignMembershipOnLogin = assignMembershipOnLogin;
            o.connectionId = connectionId;
            return o;
        }
    }
}
