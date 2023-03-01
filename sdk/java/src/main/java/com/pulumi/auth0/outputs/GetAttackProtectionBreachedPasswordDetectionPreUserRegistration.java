// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAttackProtectionBreachedPasswordDetectionPreUserRegistration {
    private List<String> shields;

    private GetAttackProtectionBreachedPasswordDetectionPreUserRegistration() {}
    public List<String> shields() {
        return this.shields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttackProtectionBreachedPasswordDetectionPreUserRegistration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> shields;
        public Builder() {}
        public Builder(GetAttackProtectionBreachedPasswordDetectionPreUserRegistration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shields = defaults.shields;
        }

        @CustomType.Setter
        public Builder shields(List<String> shields) {
            this.shields = Objects.requireNonNull(shields);
            return this;
        }
        public Builder shields(String... shields) {
            return shields(List.of(shields));
        }
        public GetAttackProtectionBreachedPasswordDetectionPreUserRegistration build() {
            final var o = new GetAttackProtectionBreachedPasswordDetectionPreUserRegistration();
            o.shields = shields;
            return o;
        }
    }
}
