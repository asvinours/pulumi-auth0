// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrandingThemeWidget {
    /**
     * @return Header text alignment. Available options: `center`, `left`, `right`. Defaults to `center`.
     * 
     */
    private @Nullable String headerTextAlignment;
    /**
     * @return Logo height. Value needs to be between `1` and `100`. Defaults to `52.0`.
     * 
     */
    private @Nullable Double logoHeight;
    /**
     * @return Logo position. Available options: `center`, `left`, `right`, `none`. Defaults to `center`.
     * 
     */
    private @Nullable String logoPosition;
    /**
     * @return Logo url. Defaults to an empty string.
     * 
     */
    private @Nullable String logoUrl;
    /**
     * @return Social buttons layout. Available options: `bottom`, `top`. Defaults to `bottom`.
     * 
     */
    private @Nullable String socialButtonsLayout;

    private BrandingThemeWidget() {}
    /**
     * @return Header text alignment. Available options: `center`, `left`, `right`. Defaults to `center`.
     * 
     */
    public Optional<String> headerTextAlignment() {
        return Optional.ofNullable(this.headerTextAlignment);
    }
    /**
     * @return Logo height. Value needs to be between `1` and `100`. Defaults to `52.0`.
     * 
     */
    public Optional<Double> logoHeight() {
        return Optional.ofNullable(this.logoHeight);
    }
    /**
     * @return Logo position. Available options: `center`, `left`, `right`, `none`. Defaults to `center`.
     * 
     */
    public Optional<String> logoPosition() {
        return Optional.ofNullable(this.logoPosition);
    }
    /**
     * @return Logo url. Defaults to an empty string.
     * 
     */
    public Optional<String> logoUrl() {
        return Optional.ofNullable(this.logoUrl);
    }
    /**
     * @return Social buttons layout. Available options: `bottom`, `top`. Defaults to `bottom`.
     * 
     */
    public Optional<String> socialButtonsLayout() {
        return Optional.ofNullable(this.socialButtonsLayout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandingThemeWidget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String headerTextAlignment;
        private @Nullable Double logoHeight;
        private @Nullable String logoPosition;
        private @Nullable String logoUrl;
        private @Nullable String socialButtonsLayout;
        public Builder() {}
        public Builder(BrandingThemeWidget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerTextAlignment = defaults.headerTextAlignment;
    	      this.logoHeight = defaults.logoHeight;
    	      this.logoPosition = defaults.logoPosition;
    	      this.logoUrl = defaults.logoUrl;
    	      this.socialButtonsLayout = defaults.socialButtonsLayout;
        }

        @CustomType.Setter
        public Builder headerTextAlignment(@Nullable String headerTextAlignment) {
            this.headerTextAlignment = headerTextAlignment;
            return this;
        }
        @CustomType.Setter
        public Builder logoHeight(@Nullable Double logoHeight) {
            this.logoHeight = logoHeight;
            return this;
        }
        @CustomType.Setter
        public Builder logoPosition(@Nullable String logoPosition) {
            this.logoPosition = logoPosition;
            return this;
        }
        @CustomType.Setter
        public Builder logoUrl(@Nullable String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        @CustomType.Setter
        public Builder socialButtonsLayout(@Nullable String socialButtonsLayout) {
            this.socialButtonsLayout = socialButtonsLayout;
            return this;
        }
        public BrandingThemeWidget build() {
            final var o = new BrandingThemeWidget();
            o.headerTextAlignment = headerTextAlignment;
            o.logoHeight = logoHeight;
            o.logoPosition = logoPosition;
            o.logoUrl = logoUrl;
            o.socialButtonsLayout = socialButtonsLayout;
            return o;
        }
    }
}
