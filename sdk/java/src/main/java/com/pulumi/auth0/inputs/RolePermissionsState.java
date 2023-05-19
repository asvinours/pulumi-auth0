// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.RolePermissionsPermissionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RolePermissionsState extends com.pulumi.resources.ResourceArgs {

    public static final RolePermissionsState Empty = new RolePermissionsState();

    /**
     * List of API permissions granted to the role.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<RolePermissionsPermissionArgs>> permissions;

    /**
     * @return List of API permissions granted to the role.
     * 
     */
    public Optional<Output<List<RolePermissionsPermissionArgs>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * ID of the role to associate the permission to.
     * 
     */
    @Import(name="roleId")
    private @Nullable Output<String> roleId;

    /**
     * @return ID of the role to associate the permission to.
     * 
     */
    public Optional<Output<String>> roleId() {
        return Optional.ofNullable(this.roleId);
    }

    private RolePermissionsState() {}

    private RolePermissionsState(RolePermissionsState $) {
        this.permissions = $.permissions;
        this.roleId = $.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolePermissionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolePermissionsState $;

        public Builder() {
            $ = new RolePermissionsState();
        }

        public Builder(RolePermissionsState defaults) {
            $ = new RolePermissionsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param permissions List of API permissions granted to the role.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<List<RolePermissionsPermissionArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions List of API permissions granted to the role.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<RolePermissionsPermissionArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions List of API permissions granted to the role.
         * 
         * @return builder
         * 
         */
        public Builder permissions(RolePermissionsPermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }

        /**
         * @param roleId ID of the role to associate the permission to.
         * 
         * @return builder
         * 
         */
        public Builder roleId(@Nullable Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId ID of the role to associate the permission to.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        public RolePermissionsState build() {
            return $;
        }
    }

}
