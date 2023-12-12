// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsMscrm {
    /**
     * @return Microsoft Dynamics CRM application URL.
     * 
     */
    private @Nullable String url;

    private ClientAddonsMscrm() {}
    /**
     * @return Microsoft Dynamics CRM application URL.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsMscrm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String url;
        public Builder() {}
        public Builder(ClientAddonsMscrm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public ClientAddonsMscrm build() {
            final var _resultValue = new ClientAddonsMscrm();
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
