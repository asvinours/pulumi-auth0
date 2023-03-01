// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionOptionIdpInitiated {
    private String clientAuthorizeQuery;
    private String clientId;
    private String clientProtocol;

    private GetConnectionOptionIdpInitiated() {}
    public String clientAuthorizeQuery() {
        return this.clientAuthorizeQuery;
    }
    public String clientId() {
        return this.clientId;
    }
    public String clientProtocol() {
        return this.clientProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionOptionIdpInitiated defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientAuthorizeQuery;
        private String clientId;
        private String clientProtocol;
        public Builder() {}
        public Builder(GetConnectionOptionIdpInitiated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuthorizeQuery = defaults.clientAuthorizeQuery;
    	      this.clientId = defaults.clientId;
    	      this.clientProtocol = defaults.clientProtocol;
        }

        @CustomType.Setter
        public Builder clientAuthorizeQuery(String clientAuthorizeQuery) {
            this.clientAuthorizeQuery = Objects.requireNonNull(clientAuthorizeQuery);
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder clientProtocol(String clientProtocol) {
            this.clientProtocol = Objects.requireNonNull(clientProtocol);
            return this;
        }
        public GetConnectionOptionIdpInitiated build() {
            final var o = new GetConnectionOptionIdpInitiated();
            o.clientAuthorizeQuery = clientAuthorizeQuery;
            o.clientId = clientId;
            o.clientProtocol = clientProtocol;
            return o;
        }
    }
}
