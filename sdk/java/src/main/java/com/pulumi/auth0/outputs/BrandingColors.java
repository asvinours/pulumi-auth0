// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrandingColors {
    /**
     * @return Background color of login pages in hexadecimal.
     * 
     */
    private @Nullable String pageBackground;
    /**
     * @return Primary button background color in hexadecimal.
     * 
     */
    private @Nullable String primary;

    private BrandingColors() {}
    /**
     * @return Background color of login pages in hexadecimal.
     * 
     */
    public Optional<String> pageBackground() {
        return Optional.ofNullable(this.pageBackground);
    }
    /**
     * @return Primary button background color in hexadecimal.
     * 
     */
    public Optional<String> primary() {
        return Optional.ofNullable(this.primary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandingColors defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String pageBackground;
        private @Nullable String primary;
        public Builder() {}
        public Builder(BrandingColors defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pageBackground = defaults.pageBackground;
    	      this.primary = defaults.primary;
        }

        @CustomType.Setter
        public Builder pageBackground(@Nullable String pageBackground) {
            this.pageBackground = pageBackground;
            return this;
        }
        @CustomType.Setter
        public Builder primary(@Nullable String primary) {
            this.primary = primary;
            return this;
        }
        public BrandingColors build() {
            final var _resultValue = new BrandingColors();
            _resultValue.pageBackground = pageBackground;
            _resultValue.primary = primary;
            return _resultValue;
        }
    }
}
