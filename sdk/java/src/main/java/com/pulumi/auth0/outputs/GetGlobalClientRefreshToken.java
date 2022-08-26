// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGlobalClientRefreshToken {
    private String expirationType;
    private Integer idleTokenLifetime;
    private Boolean infiniteIdleTokenLifetime;
    private Boolean infiniteTokenLifetime;
    private Integer leeway;
    private String rotationType;
    private Integer tokenLifetime;

    private GetGlobalClientRefreshToken() {}
    public String expirationType() {
        return this.expirationType;
    }
    public Integer idleTokenLifetime() {
        return this.idleTokenLifetime;
    }
    public Boolean infiniteIdleTokenLifetime() {
        return this.infiniteIdleTokenLifetime;
    }
    public Boolean infiniteTokenLifetime() {
        return this.infiniteTokenLifetime;
    }
    public Integer leeway() {
        return this.leeway;
    }
    public String rotationType() {
        return this.rotationType;
    }
    public Integer tokenLifetime() {
        return this.tokenLifetime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalClientRefreshToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expirationType;
        private Integer idleTokenLifetime;
        private Boolean infiniteIdleTokenLifetime;
        private Boolean infiniteTokenLifetime;
        private Integer leeway;
        private String rotationType;
        private Integer tokenLifetime;
        public Builder() {}
        public Builder(GetGlobalClientRefreshToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationType = defaults.expirationType;
    	      this.idleTokenLifetime = defaults.idleTokenLifetime;
    	      this.infiniteIdleTokenLifetime = defaults.infiniteIdleTokenLifetime;
    	      this.infiniteTokenLifetime = defaults.infiniteTokenLifetime;
    	      this.leeway = defaults.leeway;
    	      this.rotationType = defaults.rotationType;
    	      this.tokenLifetime = defaults.tokenLifetime;
        }

        @CustomType.Setter
        public Builder expirationType(String expirationType) {
            this.expirationType = Objects.requireNonNull(expirationType);
            return this;
        }
        @CustomType.Setter
        public Builder idleTokenLifetime(Integer idleTokenLifetime) {
            this.idleTokenLifetime = Objects.requireNonNull(idleTokenLifetime);
            return this;
        }
        @CustomType.Setter
        public Builder infiniteIdleTokenLifetime(Boolean infiniteIdleTokenLifetime) {
            this.infiniteIdleTokenLifetime = Objects.requireNonNull(infiniteIdleTokenLifetime);
            return this;
        }
        @CustomType.Setter
        public Builder infiniteTokenLifetime(Boolean infiniteTokenLifetime) {
            this.infiniteTokenLifetime = Objects.requireNonNull(infiniteTokenLifetime);
            return this;
        }
        @CustomType.Setter
        public Builder leeway(Integer leeway) {
            this.leeway = Objects.requireNonNull(leeway);
            return this;
        }
        @CustomType.Setter
        public Builder rotationType(String rotationType) {
            this.rotationType = Objects.requireNonNull(rotationType);
            return this;
        }
        @CustomType.Setter
        public Builder tokenLifetime(Integer tokenLifetime) {
            this.tokenLifetime = Objects.requireNonNull(tokenLifetime);
            return this;
        }
        public GetGlobalClientRefreshToken build() {
            final var o = new GetGlobalClientRefreshToken();
            o.expirationType = expirationType;
            o.idleTokenLifetime = idleTokenLifetime;
            o.infiniteIdleTokenLifetime = infiniteIdleTokenLifetime;
            o.infiniteTokenLifetime = infiniteTokenLifetime;
            o.leeway = leeway;
            o.rotationType = rotationType;
            o.tokenLifetime = tokenLifetime;
            return o;
        }
    }
}
