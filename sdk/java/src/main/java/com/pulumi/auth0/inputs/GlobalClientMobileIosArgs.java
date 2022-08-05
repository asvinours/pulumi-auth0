// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalClientMobileIosArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClientMobileIosArgs Empty = new GlobalClientMobileIosArgs();

    @Import(name="appBundleIdentifier")
    private @Nullable Output<String> appBundleIdentifier;

    public Optional<Output<String>> appBundleIdentifier() {
        return Optional.ofNullable(this.appBundleIdentifier);
    }

    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    private GlobalClientMobileIosArgs() {}

    private GlobalClientMobileIosArgs(GlobalClientMobileIosArgs $) {
        this.appBundleIdentifier = $.appBundleIdentifier;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalClientMobileIosArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalClientMobileIosArgs $;

        public Builder() {
            $ = new GlobalClientMobileIosArgs();
        }

        public Builder(GlobalClientMobileIosArgs defaults) {
            $ = new GlobalClientMobileIosArgs(Objects.requireNonNull(defaults));
        }

        public Builder appBundleIdentifier(@Nullable Output<String> appBundleIdentifier) {
            $.appBundleIdentifier = appBundleIdentifier;
            return this;
        }

        public Builder appBundleIdentifier(String appBundleIdentifier) {
            return appBundleIdentifier(Output.of(appBundleIdentifier));
        }

        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public GlobalClientMobileIosArgs build() {
            return $;
        }
    }

}
