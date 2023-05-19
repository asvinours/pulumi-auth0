// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserRolesState extends com.pulumi.resources.ResourceArgs {

    public static final UserRolesState Empty = new UserRolesState();

    /**
     * Set of IDs of roles assigned to the user.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return Set of IDs of roles assigned to the user.
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * ID of the user.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return ID of the user.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private UserRolesState() {}

    private UserRolesState(UserRolesState $) {
        this.roles = $.roles;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserRolesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserRolesState $;

        public Builder() {
            $ = new UserRolesState();
        }

        public Builder(UserRolesState defaults) {
            $ = new UserRolesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param roles Set of IDs of roles assigned to the user.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Set of IDs of roles assigned to the user.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles Set of IDs of roles assigned to the user.
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param userId ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserRolesState build() {
            return $;
        }
    }

}
