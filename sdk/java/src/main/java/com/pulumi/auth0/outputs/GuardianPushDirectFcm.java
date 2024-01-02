// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GuardianPushDirectFcm {
    /**
     * @return The Firebase Cloud Messaging Server Key. For security purposes, we don’t retrieve your existing FCM server key to check for drift.
     * 
     */
    private String serverKey;

    private GuardianPushDirectFcm() {}
    /**
     * @return The Firebase Cloud Messaging Server Key. For security purposes, we don’t retrieve your existing FCM server key to check for drift.
     * 
     */
    public String serverKey() {
        return this.serverKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuardianPushDirectFcm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String serverKey;
        public Builder() {}
        public Builder(GuardianPushDirectFcm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverKey = defaults.serverKey;
        }

        @CustomType.Setter
        public Builder serverKey(String serverKey) {
            if (serverKey == null) {
              throw new MissingRequiredPropertyException("GuardianPushDirectFcm", "serverKey");
            }
            this.serverKey = serverKey;
            return this;
        }
        public GuardianPushDirectFcm build() {
            final var _resultValue = new GuardianPushDirectFcm();
            _resultValue.serverKey = serverKey;
            return _resultValue;
        }
    }
}
