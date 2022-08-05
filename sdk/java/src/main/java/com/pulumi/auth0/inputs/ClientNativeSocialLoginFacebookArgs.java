// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientNativeSocialLoginFacebookArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientNativeSocialLoginFacebookArgs Empty = new ClientNativeSocialLoginFacebookArgs();

    /**
     * Boolean
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Boolean
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ClientNativeSocialLoginFacebookArgs() {}

    private ClientNativeSocialLoginFacebookArgs(ClientNativeSocialLoginFacebookArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientNativeSocialLoginFacebookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientNativeSocialLoginFacebookArgs $;

        public Builder() {
            $ = new ClientNativeSocialLoginFacebookArgs();
        }

        public Builder(ClientNativeSocialLoginFacebookArgs defaults) {
            $ = new ClientNativeSocialLoginFacebookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Boolean
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClientNativeSocialLoginFacebookArgs build() {
            return $;
        }
    }

}
