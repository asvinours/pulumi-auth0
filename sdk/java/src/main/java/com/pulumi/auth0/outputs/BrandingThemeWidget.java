// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BrandingThemeWidget {
    /**
     * @return Header text alignment. Available options: `center`, `left`, `right`.
     * 
     */
    private String headerTextAlignment;
    /**
     * @return Logo height. Value needs to be between `1` and `100`.
     * 
     */
    private Double logoHeight;
    /**
     * @return Logo position. Available options: `center`, `left`, `right`, `none`.
     * 
     */
    private String logoPosition;
    /**
     * @return Logo url.
     * 
     */
    private String logoUrl;
    /**
     * @return Social buttons layout.  Available options: `bottom`, `top`.
     * 
     */
    private String socialButtonsLayout;

    private BrandingThemeWidget() {}
    /**
     * @return Header text alignment. Available options: `center`, `left`, `right`.
     * 
     */
    public String headerTextAlignment() {
        return this.headerTextAlignment;
    }
    /**
     * @return Logo height. Value needs to be between `1` and `100`.
     * 
     */
    public Double logoHeight() {
        return this.logoHeight;
    }
    /**
     * @return Logo position. Available options: `center`, `left`, `right`, `none`.
     * 
     */
    public String logoPosition() {
        return this.logoPosition;
    }
    /**
     * @return Logo url.
     * 
     */
    public String logoUrl() {
        return this.logoUrl;
    }
    /**
     * @return Social buttons layout.  Available options: `bottom`, `top`.
     * 
     */
    public String socialButtonsLayout() {
        return this.socialButtonsLayout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandingThemeWidget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String headerTextAlignment;
        private Double logoHeight;
        private String logoPosition;
        private String logoUrl;
        private String socialButtonsLayout;
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
        public Builder headerTextAlignment(String headerTextAlignment) {
            this.headerTextAlignment = Objects.requireNonNull(headerTextAlignment);
            return this;
        }
        @CustomType.Setter
        public Builder logoHeight(Double logoHeight) {
            this.logoHeight = Objects.requireNonNull(logoHeight);
            return this;
        }
        @CustomType.Setter
        public Builder logoPosition(String logoPosition) {
            this.logoPosition = Objects.requireNonNull(logoPosition);
            return this;
        }
        @CustomType.Setter
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = Objects.requireNonNull(logoUrl);
            return this;
        }
        @CustomType.Setter
        public Builder socialButtonsLayout(String socialButtonsLayout) {
            this.socialButtonsLayout = Objects.requireNonNull(socialButtonsLayout);
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
