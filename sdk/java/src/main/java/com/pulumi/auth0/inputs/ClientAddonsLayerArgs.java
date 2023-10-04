// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsLayerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsLayerArgs Empty = new ClientAddonsLayerArgs();

    @Import(name="expiration")
    private @Nullable Output<Integer> expiration;

    public Optional<Output<Integer>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    @Import(name="keyId", required=true)
    private Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId;
    }

    @Import(name="principal")
    private @Nullable Output<String> principal;

    public Optional<Output<String>> principal() {
        return Optional.ofNullable(this.principal);
    }

    @Import(name="privateKey", required=true)
    private Output<String> privateKey;

    public Output<String> privateKey() {
        return this.privateKey;
    }

    @Import(name="providerId", required=true)
    private Output<String> providerId;

    public Output<String> providerId() {
        return this.providerId;
    }

    private ClientAddonsLayerArgs() {}

    private ClientAddonsLayerArgs(ClientAddonsLayerArgs $) {
        this.expiration = $.expiration;
        this.keyId = $.keyId;
        this.principal = $.principal;
        this.privateKey = $.privateKey;
        this.providerId = $.providerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsLayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsLayerArgs $;

        public Builder() {
            $ = new ClientAddonsLayerArgs();
        }

        public Builder(ClientAddonsLayerArgs defaults) {
            $ = new ClientAddonsLayerArgs(Objects.requireNonNull(defaults));
        }

        public Builder expiration(@Nullable Output<Integer> expiration) {
            $.expiration = expiration;
            return this;
        }

        public Builder expiration(Integer expiration) {
            return expiration(Output.of(expiration));
        }

        public Builder keyId(Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public Builder principal(@Nullable Output<String> principal) {
            $.principal = principal;
            return this;
        }

        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        public Builder privateKey(Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public Builder providerId(Output<String> providerId) {
            $.providerId = providerId;
            return this;
        }

        public Builder providerId(String providerId) {
            return providerId(Output.of(providerId));
        }

        public ClientAddonsLayerArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            $.privateKey = Objects.requireNonNull($.privateKey, "expected parameter 'privateKey' to be non-null");
            $.providerId = Objects.requireNonNull($.providerId, "expected parameter 'providerId' to be non-null");
            return $;
        }
    }

}
