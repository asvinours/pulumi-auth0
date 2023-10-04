// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourceServerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceServerArgs Empty = new GetResourceServerArgs();

    /**
     * Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * The ID of the resource server. If not provided, `identifier` must be set.
     * 
     */
    @Import(name="resourceServerId")
    private @Nullable Output<String> resourceServerId;

    /**
     * @return The ID of the resource server. If not provided, `identifier` must be set.
     * 
     */
    public Optional<Output<String>> resourceServerId() {
        return Optional.ofNullable(this.resourceServerId);
    }

    private GetResourceServerArgs() {}

    private GetResourceServerArgs(GetResourceServerArgs $) {
        this.identifier = $.identifier;
        this.resourceServerId = $.resourceServerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceServerArgs $;

        public Builder() {
            $ = new GetResourceServerArgs();
        }

        public Builder(GetResourceServerArgs defaults) {
            $ = new GetResourceServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param resourceServerId The ID of the resource server. If not provided, `identifier` must be set.
         * 
         * @return builder
         * 
         */
        public Builder resourceServerId(@Nullable Output<String> resourceServerId) {
            $.resourceServerId = resourceServerId;
            return this;
        }

        /**
         * @param resourceServerId The ID of the resource server. If not provided, `identifier` must be set.
         * 
         * @return builder
         * 
         */
        public Builder resourceServerId(String resourceServerId) {
            return resourceServerId(Output.of(resourceServerId));
        }

        public GetResourceServerArgs build() {
            return $;
        }
    }

}
