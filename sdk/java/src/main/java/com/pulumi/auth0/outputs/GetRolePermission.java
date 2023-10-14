// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRolePermission {
    private String description;
    private String name;
    private String resourceServerIdentifier;
    private String resourceServerName;

    private GetRolePermission() {}
    public String description() {
        return this.description;
    }
    public String name() {
        return this.name;
    }
    public String resourceServerIdentifier() {
        return this.resourceServerIdentifier;
    }
    public String resourceServerName() {
        return this.resourceServerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolePermission defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String name;
        private String resourceServerIdentifier;
        private String resourceServerName;
        public Builder() {}
        public Builder(GetRolePermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.resourceServerIdentifier = defaults.resourceServerIdentifier;
    	      this.resourceServerName = defaults.resourceServerName;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resourceServerIdentifier(String resourceServerIdentifier) {
            this.resourceServerIdentifier = Objects.requireNonNull(resourceServerIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder resourceServerName(String resourceServerName) {
            this.resourceServerName = Objects.requireNonNull(resourceServerName);
            return this;
        }
        public GetRolePermission build() {
            final var o = new GetRolePermission();
            o.description = description;
            o.name = name;
            o.resourceServerIdentifier = resourceServerIdentifier;
            o.resourceServerName = resourceServerName;
            return o;
        }
    }
}
