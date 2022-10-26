// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;


public final class BrandingThemeFontsSubtitleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrandingThemeFontsSubtitleArgs Empty = new BrandingThemeFontsSubtitleArgs();

    @Import(name="bold", required=true)
    private Output<Boolean> bold;

    public Output<Boolean> bold() {
        return this.bold;
    }

    @Import(name="size", required=true)
    private Output<Double> size;

    public Output<Double> size() {
        return this.size;
    }

    private BrandingThemeFontsSubtitleArgs() {}

    private BrandingThemeFontsSubtitleArgs(BrandingThemeFontsSubtitleArgs $) {
        this.bold = $.bold;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrandingThemeFontsSubtitleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrandingThemeFontsSubtitleArgs $;

        public Builder() {
            $ = new BrandingThemeFontsSubtitleArgs();
        }

        public Builder(BrandingThemeFontsSubtitleArgs defaults) {
            $ = new BrandingThemeFontsSubtitleArgs(Objects.requireNonNull(defaults));
        }

        public Builder bold(Output<Boolean> bold) {
            $.bold = bold;
            return this;
        }

        public Builder bold(Boolean bold) {
            return bold(Output.of(bold));
        }

        public Builder size(Output<Double> size) {
            $.size = size;
            return this;
        }

        public Builder size(Double size) {
            return size(Output.of(size));
        }

        public BrandingThemeFontsSubtitleArgs build() {
            $.bold = Objects.requireNonNull($.bold, "expected parameter 'bold' to be non-null");
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            return $;
        }
    }

}
