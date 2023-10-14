// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuardianPushCustomApp {
    /**
     * @return Custom Application Name.
     * 
     */
    private @Nullable String appName;
    /**
     * @return Apple App Store URL. Must be HTTPS or an empty string.
     * 
     */
    private @Nullable String appleAppLink;
    /**
     * @return Google Store URL. Must be HTTPS or an empty string.
     * 
     */
    private @Nullable String googleAppLink;

    private GuardianPushCustomApp() {}
    /**
     * @return Custom Application Name.
     * 
     */
    public Optional<String> appName() {
        return Optional.ofNullable(this.appName);
    }
    /**
     * @return Apple App Store URL. Must be HTTPS or an empty string.
     * 
     */
    public Optional<String> appleAppLink() {
        return Optional.ofNullable(this.appleAppLink);
    }
    /**
     * @return Google Store URL. Must be HTTPS or an empty string.
     * 
     */
    public Optional<String> googleAppLink() {
        return Optional.ofNullable(this.googleAppLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuardianPushCustomApp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String appName;
        private @Nullable String appleAppLink;
        private @Nullable String googleAppLink;
        public Builder() {}
        public Builder(GuardianPushCustomApp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.appleAppLink = defaults.appleAppLink;
    	      this.googleAppLink = defaults.googleAppLink;
        }

        @CustomType.Setter
        public Builder appName(@Nullable String appName) {
            this.appName = appName;
            return this;
        }
        @CustomType.Setter
        public Builder appleAppLink(@Nullable String appleAppLink) {
            this.appleAppLink = appleAppLink;
            return this;
        }
        @CustomType.Setter
        public Builder googleAppLink(@Nullable String googleAppLink) {
            this.googleAppLink = googleAppLink;
            return this;
        }
        public GuardianPushCustomApp build() {
            final var o = new GuardianPushCustomApp();
            o.appName = appName;
            o.appleAppLink = appleAppLink;
            o.googleAppLink = googleAppLink;
            return o;
        }
    }
}
