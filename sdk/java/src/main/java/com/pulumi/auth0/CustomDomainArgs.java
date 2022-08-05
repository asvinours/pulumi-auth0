// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainArgs Empty = new CustomDomainArgs();

    /**
     * String. Name of the custom domain.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return String. Name of the custom domain.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CustomDomainArgs() {}

    private CustomDomainArgs(CustomDomainArgs $) {
        this.domain = $.domain;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainArgs $;

        public Builder() {
            $ = new CustomDomainArgs();
        }

        public Builder(CustomDomainArgs defaults) {
            $ = new CustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain String. Name of the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain String. Name of the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param type String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CustomDomainArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
