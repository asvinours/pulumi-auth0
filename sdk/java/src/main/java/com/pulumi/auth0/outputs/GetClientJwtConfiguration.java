// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClientJwtConfiguration {
    private String alg;
    private Integer lifetimeInSeconds;
    private Map<String,String> scopes;
    private Boolean secretEncoded;

    private GetClientJwtConfiguration() {}
    public String alg() {
        return this.alg;
    }
    public Integer lifetimeInSeconds() {
        return this.lifetimeInSeconds;
    }
    public Map<String,String> scopes() {
        return this.scopes;
    }
    public Boolean secretEncoded() {
        return this.secretEncoded;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientJwtConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alg;
        private Integer lifetimeInSeconds;
        private Map<String,String> scopes;
        private Boolean secretEncoded;
        public Builder() {}
        public Builder(GetClientJwtConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.lifetimeInSeconds = defaults.lifetimeInSeconds;
    	      this.scopes = defaults.scopes;
    	      this.secretEncoded = defaults.secretEncoded;
        }

        @CustomType.Setter
        public Builder alg(String alg) {
            this.alg = Objects.requireNonNull(alg);
            return this;
        }
        @CustomType.Setter
        public Builder lifetimeInSeconds(Integer lifetimeInSeconds) {
            this.lifetimeInSeconds = Objects.requireNonNull(lifetimeInSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder scopes(Map<String,String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        @CustomType.Setter
        public Builder secretEncoded(Boolean secretEncoded) {
            this.secretEncoded = Objects.requireNonNull(secretEncoded);
            return this;
        }
        public GetClientJwtConfiguration build() {
            final var o = new GetClientJwtConfiguration();
            o.alg = alg;
            o.lifetimeInSeconds = lifetimeInSeconds;
            o.scopes = scopes;
            o.secretEncoded = secretEncoded;
            return o;
        }
    }
}
