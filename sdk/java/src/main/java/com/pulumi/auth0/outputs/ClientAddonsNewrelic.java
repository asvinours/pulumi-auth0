// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsNewrelic {
    /**
     * @return Your New Relic Account ID found in your New Relic URL after the `/accounts/` path, for example `https://rpm.newrelic.com/accounts/123456/query` would be `123456`.
     * 
     */
    private @Nullable String account;

    private ClientAddonsNewrelic() {}
    /**
     * @return Your New Relic Account ID found in your New Relic URL after the `/accounts/` path, for example `https://rpm.newrelic.com/accounts/123456/query` would be `123456`.
     * 
     */
    public Optional<String> account() {
        return Optional.ofNullable(this.account);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsNewrelic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String account;
        public Builder() {}
        public Builder(ClientAddonsNewrelic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
        }

        @CustomType.Setter
        public Builder account(@Nullable String account) {
            this.account = account;
            return this;
        }
        public ClientAddonsNewrelic build() {
            final var o = new ClientAddonsNewrelic();
            o.account = account;
            return o;
        }
    }
}
