// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CustomDomainVerificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainVerificationArgs Empty = new CustomDomainVerificationArgs();

    /**
     * ID of the custom domain resource.
     * 
     */
    @Import(name="customDomainId", required=true)
    private Output<String> customDomainId;

    /**
     * @return ID of the custom domain resource.
     * 
     */
    public Output<String> customDomainId() {
        return this.customDomainId;
    }

    private CustomDomainVerificationArgs() {}

    private CustomDomainVerificationArgs(CustomDomainVerificationArgs $) {
        this.customDomainId = $.customDomainId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainVerificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainVerificationArgs $;

        public Builder() {
            $ = new CustomDomainVerificationArgs();
        }

        public Builder(CustomDomainVerificationArgs defaults) {
            $ = new CustomDomainVerificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customDomainId ID of the custom domain resource.
         * 
         * @return builder
         * 
         */
        public Builder customDomainId(Output<String> customDomainId) {
            $.customDomainId = customDomainId;
            return this;
        }

        /**
         * @param customDomainId ID of the custom domain resource.
         * 
         * @return builder
         * 
         */
        public Builder customDomainId(String customDomainId) {
            return customDomainId(Output.of(customDomainId));
        }

        public CustomDomainVerificationArgs build() {
            $.customDomainId = Objects.requireNonNull($.customDomainId, "expected parameter 'customDomainId' to be non-null");
            return $;
        }
    }

}
