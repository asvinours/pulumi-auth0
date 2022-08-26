// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOptionsPasswordComplexityOptions {
    /**
     * @return Minimum number of characters allowed in passwords.
     * 
     */
    private @Nullable Integer minLength;

    private ConnectionOptionsPasswordComplexityOptions() {}
    /**
     * @return Minimum number of characters allowed in passwords.
     * 
     */
    public Optional<Integer> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsPasswordComplexityOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer minLength;
        public Builder() {}
        public Builder(ConnectionOptionsPasswordComplexityOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minLength = defaults.minLength;
        }

        @CustomType.Setter
        public Builder minLength(@Nullable Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public ConnectionOptionsPasswordComplexityOptions build() {
            final var o = new ConnectionOptionsPasswordComplexityOptions();
            o.minLength = minLength;
            return o;
        }
    }
}
