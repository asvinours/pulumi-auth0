// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionOptionsSigningKey {
    private String cert;
    private String key;

    private ConnectionOptionsSigningKey() {}
    public String cert() {
        return this.cert;
    }
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsSigningKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cert;
        private String key;
        public Builder() {}
        public Builder(ConnectionOptionsSigningKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder cert(String cert) {
            this.cert = Objects.requireNonNull(cert);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public ConnectionOptionsSigningKey build() {
            final var o = new ConnectionOptionsSigningKey();
            o.cert = cert;
            o.key = key;
            return o;
        }
    }
}
