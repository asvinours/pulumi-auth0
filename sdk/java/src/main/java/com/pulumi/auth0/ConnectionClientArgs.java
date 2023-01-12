// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectionClientArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionClientArgs Empty = new ConnectionClientArgs();

    /**
     * ID of the client for which the connection is enabled.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return ID of the client for which the connection is enabled.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * ID of the connection on which to enable the client.
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    /**
     * @return ID of the connection on which to enable the client.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }

    private ConnectionClientArgs() {}

    private ConnectionClientArgs(ConnectionClientArgs $) {
        this.clientId = $.clientId;
        this.connectionId = $.connectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionClientArgs $;

        public Builder() {
            $ = new ConnectionClientArgs();
        }

        public Builder(ConnectionClientArgs defaults) {
            $ = new ConnectionClientArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId ID of the client for which the connection is enabled.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId ID of the client for which the connection is enabled.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param connectionId ID of the connection on which to enable the client.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId ID of the connection on which to enable the client.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        public ConnectionClientArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            return $;
        }
    }

}
