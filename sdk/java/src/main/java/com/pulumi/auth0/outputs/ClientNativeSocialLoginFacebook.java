// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientNativeSocialLoginFacebook {
    private @Nullable Boolean enabled;

    private ClientNativeSocialLoginFacebook() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientNativeSocialLoginFacebook defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ClientNativeSocialLoginFacebook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ClientNativeSocialLoginFacebook build() {
            final var o = new ClientNativeSocialLoginFacebook();
            o.enabled = enabled;
            return o;
        }
    }
}
