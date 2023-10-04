// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonSpringcm {
    private String acsUrl;

    private GetClientAddonSpringcm() {}
    public String acsUrl() {
        return this.acsUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonSpringcm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acsUrl;
        public Builder() {}
        public Builder(GetClientAddonSpringcm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acsUrl = defaults.acsUrl;
        }

        @CustomType.Setter
        public Builder acsUrl(String acsUrl) {
            this.acsUrl = Objects.requireNonNull(acsUrl);
            return this;
        }
        public GetClientAddonSpringcm build() {
            final var o = new GetClientAddonSpringcm();
            o.acsUrl = acsUrl;
            return o;
        }
    }
}
