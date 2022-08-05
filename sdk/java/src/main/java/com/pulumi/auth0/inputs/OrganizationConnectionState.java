// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationConnectionState Empty = new OrganizationConnectionState();

    /**
     * When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
     * 
     */
    @Import(name="assignMembershipOnLogin")
    private @Nullable Output<Boolean> assignMembershipOnLogin;

    /**
     * @return When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
     * 
     */
    public Optional<Output<Boolean>> assignMembershipOnLogin() {
        return Optional.ofNullable(this.assignMembershipOnLogin);
    }

    /**
     * The ID of the connection to enable for the organization.
     * 
     */
    @Import(name="connectionId")
    private @Nullable Output<String> connectionId;

    /**
     * @return The ID of the connection to enable for the organization.
     * 
     */
    public Optional<Output<String>> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }

    /**
     * The name of the enabled connection.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the enabled connection.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the organization to enable the connection for.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The ID of the organization to enable the connection for.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The strategy of the enabled connection.
     * 
     */
    @Import(name="strategy")
    private @Nullable Output<String> strategy;

    /**
     * @return The strategy of the enabled connection.
     * 
     */
    public Optional<Output<String>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    private OrganizationConnectionState() {}

    private OrganizationConnectionState(OrganizationConnectionState $) {
        this.assignMembershipOnLogin = $.assignMembershipOnLogin;
        this.connectionId = $.connectionId;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.strategy = $.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationConnectionState $;

        public Builder() {
            $ = new OrganizationConnectionState();
        }

        public Builder(OrganizationConnectionState defaults) {
            $ = new OrganizationConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignMembershipOnLogin When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
         * 
         * @return builder
         * 
         */
        public Builder assignMembershipOnLogin(@Nullable Output<Boolean> assignMembershipOnLogin) {
            $.assignMembershipOnLogin = assignMembershipOnLogin;
            return this;
        }

        /**
         * @param assignMembershipOnLogin When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
         * 
         * @return builder
         * 
         */
        public Builder assignMembershipOnLogin(Boolean assignMembershipOnLogin) {
            return assignMembershipOnLogin(Output.of(assignMembershipOnLogin));
        }

        /**
         * @param connectionId The ID of the connection to enable for the organization.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(@Nullable Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId The ID of the connection to enable for the organization.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param name The name of the enabled connection.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the enabled connection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId The ID of the organization to enable the connection for.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The ID of the organization to enable the connection for.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param strategy The strategy of the enabled connection.
         * 
         * @return builder
         * 
         */
        public Builder strategy(@Nullable Output<String> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy The strategy of the enabled connection.
         * 
         * @return builder
         * 
         */
        public Builder strategy(String strategy) {
            return strategy(Output.of(strategy));
        }

        public OrganizationConnectionState build() {
            return $;
        }
    }

}
