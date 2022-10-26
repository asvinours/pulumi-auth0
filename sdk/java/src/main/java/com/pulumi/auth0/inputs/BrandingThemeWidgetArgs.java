// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class BrandingThemeWidgetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrandingThemeWidgetArgs Empty = new BrandingThemeWidgetArgs();

    /**
     * Header text alignment. Available options: `center`, `left`, `right`.
     * 
     */
    @Import(name="headerTextAlignment", required=true)
    private Output<String> headerTextAlignment;

    /**
     * @return Header text alignment. Available options: `center`, `left`, `right`.
     * 
     */
    public Output<String> headerTextAlignment() {
        return this.headerTextAlignment;
    }

    /**
     * Logo height. Value needs to be between `1` and `100`.
     * 
     */
    @Import(name="logoHeight", required=true)
    private Output<Double> logoHeight;

    /**
     * @return Logo height. Value needs to be between `1` and `100`.
     * 
     */
    public Output<Double> logoHeight() {
        return this.logoHeight;
    }

    /**
     * Logo position. Available options: `center`, `left`, `right`, `none`.
     * 
     */
    @Import(name="logoPosition", required=true)
    private Output<String> logoPosition;

    /**
     * @return Logo position. Available options: `center`, `left`, `right`, `none`.
     * 
     */
    public Output<String> logoPosition() {
        return this.logoPosition;
    }

    /**
     * Logo url.
     * 
     */
    @Import(name="logoUrl", required=true)
    private Output<String> logoUrl;

    /**
     * @return Logo url.
     * 
     */
    public Output<String> logoUrl() {
        return this.logoUrl;
    }

    /**
     * Social buttons layout.  Available options: `bottom`, `top`.
     * 
     */
    @Import(name="socialButtonsLayout", required=true)
    private Output<String> socialButtonsLayout;

    /**
     * @return Social buttons layout.  Available options: `bottom`, `top`.
     * 
     */
    public Output<String> socialButtonsLayout() {
        return this.socialButtonsLayout;
    }

    private BrandingThemeWidgetArgs() {}

    private BrandingThemeWidgetArgs(BrandingThemeWidgetArgs $) {
        this.headerTextAlignment = $.headerTextAlignment;
        this.logoHeight = $.logoHeight;
        this.logoPosition = $.logoPosition;
        this.logoUrl = $.logoUrl;
        this.socialButtonsLayout = $.socialButtonsLayout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrandingThemeWidgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrandingThemeWidgetArgs $;

        public Builder() {
            $ = new BrandingThemeWidgetArgs();
        }

        public Builder(BrandingThemeWidgetArgs defaults) {
            $ = new BrandingThemeWidgetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerTextAlignment Header text alignment. Available options: `center`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder headerTextAlignment(Output<String> headerTextAlignment) {
            $.headerTextAlignment = headerTextAlignment;
            return this;
        }

        /**
         * @param headerTextAlignment Header text alignment. Available options: `center`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder headerTextAlignment(String headerTextAlignment) {
            return headerTextAlignment(Output.of(headerTextAlignment));
        }

        /**
         * @param logoHeight Logo height. Value needs to be between `1` and `100`.
         * 
         * @return builder
         * 
         */
        public Builder logoHeight(Output<Double> logoHeight) {
            $.logoHeight = logoHeight;
            return this;
        }

        /**
         * @param logoHeight Logo height. Value needs to be between `1` and `100`.
         * 
         * @return builder
         * 
         */
        public Builder logoHeight(Double logoHeight) {
            return logoHeight(Output.of(logoHeight));
        }

        /**
         * @param logoPosition Logo position. Available options: `center`, `left`, `right`, `none`.
         * 
         * @return builder
         * 
         */
        public Builder logoPosition(Output<String> logoPosition) {
            $.logoPosition = logoPosition;
            return this;
        }

        /**
         * @param logoPosition Logo position. Available options: `center`, `left`, `right`, `none`.
         * 
         * @return builder
         * 
         */
        public Builder logoPosition(String logoPosition) {
            return logoPosition(Output.of(logoPosition));
        }

        /**
         * @param logoUrl Logo url.
         * 
         * @return builder
         * 
         */
        public Builder logoUrl(Output<String> logoUrl) {
            $.logoUrl = logoUrl;
            return this;
        }

        /**
         * @param logoUrl Logo url.
         * 
         * @return builder
         * 
         */
        public Builder logoUrl(String logoUrl) {
            return logoUrl(Output.of(logoUrl));
        }

        /**
         * @param socialButtonsLayout Social buttons layout.  Available options: `bottom`, `top`.
         * 
         * @return builder
         * 
         */
        public Builder socialButtonsLayout(Output<String> socialButtonsLayout) {
            $.socialButtonsLayout = socialButtonsLayout;
            return this;
        }

        /**
         * @param socialButtonsLayout Social buttons layout.  Available options: `bottom`, `top`.
         * 
         * @return builder
         * 
         */
        public Builder socialButtonsLayout(String socialButtonsLayout) {
            return socialButtonsLayout(Output.of(socialButtonsLayout));
        }

        public BrandingThemeWidgetArgs build() {
            $.headerTextAlignment = Objects.requireNonNull($.headerTextAlignment, "expected parameter 'headerTextAlignment' to be non-null");
            $.logoHeight = Objects.requireNonNull($.logoHeight, "expected parameter 'logoHeight' to be non-null");
            $.logoPosition = Objects.requireNonNull($.logoPosition, "expected parameter 'logoPosition' to be non-null");
            $.logoUrl = Objects.requireNonNull($.logoUrl, "expected parameter 'logoUrl' to be non-null");
            $.socialButtonsLayout = Objects.requireNonNull($.socialButtonsLayout, "expected parameter 'socialButtonsLayout' to be non-null");
            return $;
        }
    }

}
