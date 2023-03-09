// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrandingThemeFontsTitleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrandingThemeFontsTitleArgs Empty = new BrandingThemeFontsTitleArgs();

    @Import(name="bold")
    private @Nullable Output<Boolean> bold;

    public Optional<Output<Boolean>> bold() {
        return Optional.ofNullable(this.bold);
    }

    @Import(name="size")
    private @Nullable Output<Double> size;

    public Optional<Output<Double>> size() {
        return Optional.ofNullable(this.size);
    }

    private BrandingThemeFontsTitleArgs() {}

    private BrandingThemeFontsTitleArgs(BrandingThemeFontsTitleArgs $) {
        this.bold = $.bold;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrandingThemeFontsTitleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrandingThemeFontsTitleArgs $;

        public Builder() {
            $ = new BrandingThemeFontsTitleArgs();
        }

        public Builder(BrandingThemeFontsTitleArgs defaults) {
            $ = new BrandingThemeFontsTitleArgs(Objects.requireNonNull(defaults));
        }

        public Builder bold(@Nullable Output<Boolean> bold) {
            $.bold = bold;
            return this;
        }

        public Builder bold(Boolean bold) {
            return bold(Output.of(bold));
        }

        public Builder size(@Nullable Output<Double> size) {
            $.size = size;
            return this;
        }

        public Builder size(Double size) {
            return size(Output.of(size));
        }

        public BrandingThemeFontsTitleArgs build() {
            return $;
        }
    }

}
