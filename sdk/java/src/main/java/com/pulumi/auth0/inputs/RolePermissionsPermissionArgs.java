// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RolePermissionsPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolePermissionsPermissionArgs Empty = new RolePermissionsPermissionArgs();

    /**
     * Description of the permission.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the permission.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of permission.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of permission.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Resource server identifier associated with the permission.
     * 
     */
    @Import(name="resourceServerIdentifier", required=true)
    private Output<String> resourceServerIdentifier;

    /**
     * @return Resource server identifier associated with the permission.
     * 
     */
    public Output<String> resourceServerIdentifier() {
        return this.resourceServerIdentifier;
    }

    /**
     * Name of resource server that the permission is associated with.
     * 
     */
    @Import(name="resourceServerName")
    private @Nullable Output<String> resourceServerName;

    /**
     * @return Name of resource server that the permission is associated with.
     * 
     */
    public Optional<Output<String>> resourceServerName() {
        return Optional.ofNullable(this.resourceServerName);
    }

    private RolePermissionsPermissionArgs() {}

    private RolePermissionsPermissionArgs(RolePermissionsPermissionArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.resourceServerIdentifier = $.resourceServerIdentifier;
        this.resourceServerName = $.resourceServerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolePermissionsPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolePermissionsPermissionArgs $;

        public Builder() {
            $ = new RolePermissionsPermissionArgs();
        }

        public Builder(RolePermissionsPermissionArgs defaults) {
            $ = new RolePermissionsPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the permission.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the permission.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of permission.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of permission.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceServerIdentifier Resource server identifier associated with the permission.
         * 
         * @return builder
         * 
         */
        public Builder resourceServerIdentifier(Output<String> resourceServerIdentifier) {
            $.resourceServerIdentifier = resourceServerIdentifier;
            return this;
        }

        /**
         * @param resourceServerIdentifier Resource server identifier associated with the permission.
         * 
         * @return builder
         * 
         */
        public Builder resourceServerIdentifier(String resourceServerIdentifier) {
            return resourceServerIdentifier(Output.of(resourceServerIdentifier));
        }

        /**
         * @param resourceServerName Name of resource server that the permission is associated with.
         * 
         * @return builder
         * 
         */
        public Builder resourceServerName(@Nullable Output<String> resourceServerName) {
            $.resourceServerName = resourceServerName;
            return this;
        }

        /**
         * @param resourceServerName Name of resource server that the permission is associated with.
         * 
         * @return builder
         * 
         */
        public Builder resourceServerName(String resourceServerName) {
            return resourceServerName(Output.of(resourceServerName));
        }

        public RolePermissionsPermissionArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("RolePermissionsPermissionArgs", "name");
            }
            if ($.resourceServerIdentifier == null) {
                throw new MissingRequiredPropertyException("RolePermissionsPermissionArgs", "resourceServerIdentifier");
            }
            return $;
        }
    }

}
