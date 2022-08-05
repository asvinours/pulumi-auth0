// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientJwtConfiguration {
    /**
     * @return String. Algorithm used to sign JWTs.
     * 
     */
    private final @Nullable String alg;
    /**
     * @return Integer. Number of seconds during which the JWT will be valid.
     * 
     */
    private final @Nullable Integer lifetimeInSeconds;
    /**
     * @return Map(String). Permissions (scopes) included in JWTs.
     * 
     */
    private final @Nullable Map<String,String> scopes;
    /**
     * @return Boolean. Indicates whether or not the client secret is base64 encoded.
     * 
     */
    private final @Nullable Boolean secretEncoded;

    @CustomType.Constructor
    private ClientJwtConfiguration(
        @CustomType.Parameter("alg") @Nullable String alg,
        @CustomType.Parameter("lifetimeInSeconds") @Nullable Integer lifetimeInSeconds,
        @CustomType.Parameter("scopes") @Nullable Map<String,String> scopes,
        @CustomType.Parameter("secretEncoded") @Nullable Boolean secretEncoded) {
        this.alg = alg;
        this.lifetimeInSeconds = lifetimeInSeconds;
        this.scopes = scopes;
        this.secretEncoded = secretEncoded;
    }

    /**
     * @return String. Algorithm used to sign JWTs.
     * 
     */
    public Optional<String> alg() {
        return Optional.ofNullable(this.alg);
    }
    /**
     * @return Integer. Number of seconds during which the JWT will be valid.
     * 
     */
    public Optional<Integer> lifetimeInSeconds() {
        return Optional.ofNullable(this.lifetimeInSeconds);
    }
    /**
     * @return Map(String). Permissions (scopes) included in JWTs.
     * 
     */
    public Map<String,String> scopes() {
        return this.scopes == null ? Map.of() : this.scopes;
    }
    /**
     * @return Boolean. Indicates whether or not the client secret is base64 encoded.
     * 
     */
    public Optional<Boolean> secretEncoded() {
        return Optional.ofNullable(this.secretEncoded);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientJwtConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alg;
        private @Nullable Integer lifetimeInSeconds;
        private @Nullable Map<String,String> scopes;
        private @Nullable Boolean secretEncoded;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientJwtConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.lifetimeInSeconds = defaults.lifetimeInSeconds;
    	      this.scopes = defaults.scopes;
    	      this.secretEncoded = defaults.secretEncoded;
        }

        public Builder alg(@Nullable String alg) {
            this.alg = alg;
            return this;
        }
        public Builder lifetimeInSeconds(@Nullable Integer lifetimeInSeconds) {
            this.lifetimeInSeconds = lifetimeInSeconds;
            return this;
        }
        public Builder scopes(@Nullable Map<String,String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public Builder secretEncoded(@Nullable Boolean secretEncoded) {
            this.secretEncoded = secretEncoded;
            return this;
        }        public ClientJwtConfiguration build() {
            return new ClientJwtConfiguration(alg, lifetimeInSeconds, scopes, secretEncoded);
        }
    }
}
