// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TenantSessionCookie {
    /**
     * @return Behavior of tenant session cookie. Accepts either &#34;persistent&#34; or &#34;non-persistent&#34;.
     * 
     */
    private @Nullable String mode;

    private TenantSessionCookie() {}
    /**
     * @return Behavior of tenant session cookie. Accepts either &#34;persistent&#34; or &#34;non-persistent&#34;.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantSessionCookie defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mode;
        public Builder() {}
        public Builder(TenantSessionCookie defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public TenantSessionCookie build() {
            final var _resultValue = new TenantSessionCookie();
            _resultValue.mode = mode;
            return _resultValue;
        }
    }
}
