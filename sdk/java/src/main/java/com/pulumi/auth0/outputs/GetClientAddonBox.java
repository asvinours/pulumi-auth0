// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetClientAddonBox {
    private GetClientAddonBox() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonBox defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GetClientAddonBox defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetClientAddonBox build() {
            final var _resultValue = new GetClientAddonBox();
            return _resultValue;
        }
    }
}
