// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOptionsGatewayAuthentication {
    private @Nullable String audience;
    private @Nullable String method;
    private @Nullable String secret;
    private @Nullable Boolean secretBase64Encoded;
    private @Nullable String subject;

    private ConnectionOptionsGatewayAuthentication() {}
    public Optional<String> audience() {
        return Optional.ofNullable(this.audience);
    }
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }
    public Optional<Boolean> secretBase64Encoded() {
        return Optional.ofNullable(this.secretBase64Encoded);
    }
    public Optional<String> subject() {
        return Optional.ofNullable(this.subject);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsGatewayAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String audience;
        private @Nullable String method;
        private @Nullable String secret;
        private @Nullable Boolean secretBase64Encoded;
        private @Nullable String subject;
        public Builder() {}
        public Builder(ConnectionOptionsGatewayAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.method = defaults.method;
    	      this.secret = defaults.secret;
    	      this.secretBase64Encoded = defaults.secretBase64Encoded;
    	      this.subject = defaults.subject;
        }

        @CustomType.Setter
        public Builder audience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder secretBase64Encoded(@Nullable Boolean secretBase64Encoded) {
            this.secretBase64Encoded = secretBase64Encoded;
            return this;
        }
        @CustomType.Setter
        public Builder subject(@Nullable String subject) {
            this.subject = subject;
            return this;
        }
        public ConnectionOptionsGatewayAuthentication build() {
            final var o = new ConnectionOptionsGatewayAuthentication();
            o.audience = audience;
            o.method = method;
            o.secret = secret;
            o.secretBase64Encoded = secretBase64Encoded;
            o.subject = subject;
            return o;
        }
    }
}
