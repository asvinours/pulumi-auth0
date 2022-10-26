// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalClientJwtConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClientJwtConfigurationArgs Empty = new GlobalClientJwtConfigurationArgs();

    /**
     * Algorithm used to sign JWTs.
     * 
     */
    @Import(name="alg")
    private @Nullable Output<String> alg;

    /**
     * @return Algorithm used to sign JWTs.
     * 
     */
    public Optional<Output<String>> alg() {
        return Optional.ofNullable(this.alg);
    }

    /**
     * Number of seconds during which the JWT will be valid.
     * 
     */
    @Import(name="lifetimeInSeconds")
    private @Nullable Output<Integer> lifetimeInSeconds;

    /**
     * @return Number of seconds during which the JWT will be valid.
     * 
     */
    public Optional<Output<Integer>> lifetimeInSeconds() {
        return Optional.ofNullable(this.lifetimeInSeconds);
    }

    /**
     * Permissions (scopes) included in JWTs.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<Map<String,String>> scopes;

    /**
     * @return Permissions (scopes) included in JWTs.
     * 
     */
    public Optional<Output<Map<String,String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * Indicates whether the client secret is Base64-encoded.
     * 
     */
    @Import(name="secretEncoded")
    private @Nullable Output<Boolean> secretEncoded;

    /**
     * @return Indicates whether the client secret is Base64-encoded.
     * 
     */
    public Optional<Output<Boolean>> secretEncoded() {
        return Optional.ofNullable(this.secretEncoded);
    }

    private GlobalClientJwtConfigurationArgs() {}

    private GlobalClientJwtConfigurationArgs(GlobalClientJwtConfigurationArgs $) {
        this.alg = $.alg;
        this.lifetimeInSeconds = $.lifetimeInSeconds;
        this.scopes = $.scopes;
        this.secretEncoded = $.secretEncoded;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalClientJwtConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalClientJwtConfigurationArgs $;

        public Builder() {
            $ = new GlobalClientJwtConfigurationArgs();
        }

        public Builder(GlobalClientJwtConfigurationArgs defaults) {
            $ = new GlobalClientJwtConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alg Algorithm used to sign JWTs.
         * 
         * @return builder
         * 
         */
        public Builder alg(@Nullable Output<String> alg) {
            $.alg = alg;
            return this;
        }

        /**
         * @param alg Algorithm used to sign JWTs.
         * 
         * @return builder
         * 
         */
        public Builder alg(String alg) {
            return alg(Output.of(alg));
        }

        /**
         * @param lifetimeInSeconds Number of seconds during which the JWT will be valid.
         * 
         * @return builder
         * 
         */
        public Builder lifetimeInSeconds(@Nullable Output<Integer> lifetimeInSeconds) {
            $.lifetimeInSeconds = lifetimeInSeconds;
            return this;
        }

        /**
         * @param lifetimeInSeconds Number of seconds during which the JWT will be valid.
         * 
         * @return builder
         * 
         */
        public Builder lifetimeInSeconds(Integer lifetimeInSeconds) {
            return lifetimeInSeconds(Output.of(lifetimeInSeconds));
        }

        /**
         * @param scopes Permissions (scopes) included in JWTs.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<Map<String,String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Permissions (scopes) included in JWTs.
         * 
         * @return builder
         * 
         */
        public Builder scopes(Map<String,String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param secretEncoded Indicates whether the client secret is Base64-encoded.
         * 
         * @return builder
         * 
         */
        public Builder secretEncoded(@Nullable Output<Boolean> secretEncoded) {
            $.secretEncoded = secretEncoded;
            return this;
        }

        /**
         * @param secretEncoded Indicates whether the client secret is Base64-encoded.
         * 
         * @return builder
         * 
         */
        public Builder secretEncoded(Boolean secretEncoded) {
            return secretEncoded(Output.of(secretEncoded));
        }

        public GlobalClientJwtConfigurationArgs build() {
            return $;
        }
    }

}
