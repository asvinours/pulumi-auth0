// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.CustomDomainVerificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainState extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainState Empty = new CustomDomainState();

    /**
     * The HTTP header to fetch the client&#39;s IP address. Cannot be set on auth0_managed domains.
     * 
     */
    @Import(name="customClientIpHeader")
    private @Nullable Output<String> customClientIpHeader;

    /**
     * @return The HTTP header to fetch the client&#39;s IP address. Cannot be set on auth0_managed domains.
     * 
     */
    public Optional<Output<String>> customClientIpHeader() {
        return Optional.ofNullable(this.customClientIpHeader);
    }

    /**
     * Name of the custom domain.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return Name of the custom domain.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
     * 
     */
    @Import(name="originDomainName")
    private @Nullable Output<String> originDomainName;

    /**
     * @return Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
     * 
     */
    public Optional<Output<String>> originDomainName() {
        return Optional.ofNullable(this.originDomainName);
    }

    /**
     * Indicates whether this is a primary domain.
     * 
     */
    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    /**
     * @return Indicates whether this is a primary domain.
     * 
     */
    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    /**
     * Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on self_managed domains.
     * 
     */
    @Import(name="tlsPolicy")
    private @Nullable Output<String> tlsPolicy;

    /**
     * @return TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on self_managed domains.
     * 
     */
    public Optional<Output<String>> tlsPolicy() {
        return Optional.ofNullable(this.tlsPolicy);
    }

    /**
     * Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Configuration settings for verification.
     * 
     */
    @Import(name="verifications")
    private @Nullable Output<List<CustomDomainVerificationArgs>> verifications;

    /**
     * @return Configuration settings for verification.
     * 
     */
    public Optional<Output<List<CustomDomainVerificationArgs>>> verifications() {
        return Optional.ofNullable(this.verifications);
    }

    private CustomDomainState() {}

    private CustomDomainState(CustomDomainState $) {
        this.customClientIpHeader = $.customClientIpHeader;
        this.domain = $.domain;
        this.originDomainName = $.originDomainName;
        this.primary = $.primary;
        this.status = $.status;
        this.tlsPolicy = $.tlsPolicy;
        this.type = $.type;
        this.verifications = $.verifications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainState $;

        public Builder() {
            $ = new CustomDomainState();
        }

        public Builder(CustomDomainState defaults) {
            $ = new CustomDomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param customClientIpHeader The HTTP header to fetch the client&#39;s IP address. Cannot be set on auth0_managed domains.
         * 
         * @return builder
         * 
         */
        public Builder customClientIpHeader(@Nullable Output<String> customClientIpHeader) {
            $.customClientIpHeader = customClientIpHeader;
            return this;
        }

        /**
         * @param customClientIpHeader The HTTP header to fetch the client&#39;s IP address. Cannot be set on auth0_managed domains.
         * 
         * @return builder
         * 
         */
        public Builder customClientIpHeader(String customClientIpHeader) {
            return customClientIpHeader(Output.of(customClientIpHeader));
        }

        /**
         * @param domain Name of the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Name of the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param originDomainName Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder originDomainName(@Nullable Output<String> originDomainName) {
            $.originDomainName = originDomainName;
            return this;
        }

        /**
         * @param originDomainName Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder originDomainName(String originDomainName) {
            return originDomainName(Output.of(originDomainName));
        }

        /**
         * @param primary Indicates whether this is a primary domain.
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Indicates whether this is a primary domain.
         * 
         * @return builder
         * 
         */
        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param status Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tlsPolicy TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on self_managed domains.
         * 
         * @return builder
         * 
         */
        public Builder tlsPolicy(@Nullable Output<String> tlsPolicy) {
            $.tlsPolicy = tlsPolicy;
            return this;
        }

        /**
         * @param tlsPolicy TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on self_managed domains.
         * 
         * @return builder
         * 
         */
        public Builder tlsPolicy(String tlsPolicy) {
            return tlsPolicy(Output.of(tlsPolicy));
        }

        /**
         * @param type Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param verifications Configuration settings for verification.
         * 
         * @return builder
         * 
         */
        public Builder verifications(@Nullable Output<List<CustomDomainVerificationArgs>> verifications) {
            $.verifications = verifications;
            return this;
        }

        /**
         * @param verifications Configuration settings for verification.
         * 
         * @return builder
         * 
         */
        public Builder verifications(List<CustomDomainVerificationArgs> verifications) {
            return verifications(Output.of(verifications));
        }

        /**
         * @param verifications Configuration settings for verification.
         * 
         * @return builder
         * 
         */
        public Builder verifications(CustomDomainVerificationArgs... verifications) {
            return verifications(List.of(verifications));
        }

        public CustomDomainState build() {
            return $;
        }
    }

}
