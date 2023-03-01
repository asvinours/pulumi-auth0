// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TenantFlags {
    /**
     * @return Whether the legacy delegation endpoint will be enabled for your account (true) or not available (false).
     * 
     */
    private @Nullable Boolean allowLegacyDelegationGrantTypes;
    /**
     * @return Whether the legacy `auth/ro` endpoint (used with resource owner password and passwordless features) will be enabled for your account (true) or not available (false).
     * 
     */
    private @Nullable Boolean allowLegacyRoGrantTypes;
    /**
     * @return If enabled, customers can use Tokeninfo Endpoint, otherwise they can not use it.
     * 
     */
    private @Nullable Boolean allowLegacyTokeninfoEndpoint;
    /**
     * @return Enables new insights activity page view.
     * 
     */
    private @Nullable Boolean dashboardInsightsView;
    /**
     * @return Enables beta access to log streaming changes.
     * 
     */
    private @Nullable Boolean dashboardLogStreamsNext;
    /**
     * @return Indicates whether classic Universal Login prompts include additional security headers to prevent clickjacking.
     * 
     */
    private @Nullable Boolean disableClickjackProtectionHeaders;
    /**
     * @return Disables SAML fields map fix for bad mappings with repeated attributes.
     * 
     */
    private @Nullable Boolean disableFieldsMapFix;
    /**
     * @return If true, SMS phone numbers will not be obfuscated in Management API GET calls.
     * 
     */
    private @Nullable Boolean disableManagementApiSmsObfuscation;
    /**
     * @return If enabled, users will be presented with an email verification prompt during their first login when using Azure AD or ADFS connections.
     * 
     */
    private @Nullable Boolean enableAdfsWaadEmailVerification;
    /**
     * @return Indicates whether the APIs section is enabled for the tenant.
     * 
     */
    private @Nullable Boolean enableApisSection;
    /**
     * @return Indicates whether all current connections should be enabled when a new client is created.
     * 
     */
    private @Nullable Boolean enableClientConnections;
    /**
     * @return Indicates whether the tenant allows custom domains in emails.
     * 
     */
    private @Nullable Boolean enableCustomDomainInEmails;
    /**
     * @return Indicates whether the tenant allows dynamic client registration.
     * 
     */
    private @Nullable Boolean enableDynamicClientRegistration;
    /**
     * @return Whether ID tokens can be used to authorize some types of requests to API v2 (true) or not (false).
     * 
     */
    private @Nullable Boolean enableIdtokenApi2;
    /**
     * @return Indicates whether to use the older v2 legacy logs search.
     * 
     */
    private @Nullable Boolean enableLegacyLogsSearchV2;
    /**
     * @return Whether ID tokens and the userinfo endpoint includes a complete user profile (true) or only OpenID Connect claims (false).
     * 
     */
    private @Nullable Boolean enableLegacyProfile;
    /**
     * @return Indicates whether advanced API Authorization scenarios are enabled.
     * 
     */
    private @Nullable Boolean enablePipeline2;
    /**
     * @return Indicates whether the public sign up process shows a `user_exists` error if the user already exists.
     * 
     */
    private @Nullable Boolean enablePublicSignupUserExistsError;
    /**
     * @return Do not Publish Enterprise Connections Information with IdP domains on the lock configuration file.
     * 
     */
    private @Nullable Boolean noDiscloseEnterpriseConnections;
    /**
     * @return Delete underlying grant when a refresh token is revoked via the Authentication API.
     * 
     */
    private @Nullable Boolean revokeRefreshTokenGrant;
    /**
     * @return Indicates whether the New Universal Login Experience is enabled.
     * 
     * @deprecated
     * This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead.
     * 
     */
    @Deprecated /* This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead. */
    private @Nullable Boolean universalLogin;
    /**
     * @return Indicates whether to use scope descriptions for consent.
     * 
     */
    private @Nullable Boolean useScopeDescriptionsForConsent;

    private TenantFlags() {}
    /**
     * @return Whether the legacy delegation endpoint will be enabled for your account (true) or not available (false).
     * 
     */
    public Optional<Boolean> allowLegacyDelegationGrantTypes() {
        return Optional.ofNullable(this.allowLegacyDelegationGrantTypes);
    }
    /**
     * @return Whether the legacy `auth/ro` endpoint (used with resource owner password and passwordless features) will be enabled for your account (true) or not available (false).
     * 
     */
    public Optional<Boolean> allowLegacyRoGrantTypes() {
        return Optional.ofNullable(this.allowLegacyRoGrantTypes);
    }
    /**
     * @return If enabled, customers can use Tokeninfo Endpoint, otherwise they can not use it.
     * 
     */
    public Optional<Boolean> allowLegacyTokeninfoEndpoint() {
        return Optional.ofNullable(this.allowLegacyTokeninfoEndpoint);
    }
    /**
     * @return Enables new insights activity page view.
     * 
     */
    public Optional<Boolean> dashboardInsightsView() {
        return Optional.ofNullable(this.dashboardInsightsView);
    }
    /**
     * @return Enables beta access to log streaming changes.
     * 
     */
    public Optional<Boolean> dashboardLogStreamsNext() {
        return Optional.ofNullable(this.dashboardLogStreamsNext);
    }
    /**
     * @return Indicates whether classic Universal Login prompts include additional security headers to prevent clickjacking.
     * 
     */
    public Optional<Boolean> disableClickjackProtectionHeaders() {
        return Optional.ofNullable(this.disableClickjackProtectionHeaders);
    }
    /**
     * @return Disables SAML fields map fix for bad mappings with repeated attributes.
     * 
     */
    public Optional<Boolean> disableFieldsMapFix() {
        return Optional.ofNullable(this.disableFieldsMapFix);
    }
    /**
     * @return If true, SMS phone numbers will not be obfuscated in Management API GET calls.
     * 
     */
    public Optional<Boolean> disableManagementApiSmsObfuscation() {
        return Optional.ofNullable(this.disableManagementApiSmsObfuscation);
    }
    /**
     * @return If enabled, users will be presented with an email verification prompt during their first login when using Azure AD or ADFS connections.
     * 
     */
    public Optional<Boolean> enableAdfsWaadEmailVerification() {
        return Optional.ofNullable(this.enableAdfsWaadEmailVerification);
    }
    /**
     * @return Indicates whether the APIs section is enabled for the tenant.
     * 
     */
    public Optional<Boolean> enableApisSection() {
        return Optional.ofNullable(this.enableApisSection);
    }
    /**
     * @return Indicates whether all current connections should be enabled when a new client is created.
     * 
     */
    public Optional<Boolean> enableClientConnections() {
        return Optional.ofNullable(this.enableClientConnections);
    }
    /**
     * @return Indicates whether the tenant allows custom domains in emails.
     * 
     */
    public Optional<Boolean> enableCustomDomainInEmails() {
        return Optional.ofNullable(this.enableCustomDomainInEmails);
    }
    /**
     * @return Indicates whether the tenant allows dynamic client registration.
     * 
     */
    public Optional<Boolean> enableDynamicClientRegistration() {
        return Optional.ofNullable(this.enableDynamicClientRegistration);
    }
    /**
     * @return Whether ID tokens can be used to authorize some types of requests to API v2 (true) or not (false).
     * 
     */
    public Optional<Boolean> enableIdtokenApi2() {
        return Optional.ofNullable(this.enableIdtokenApi2);
    }
    /**
     * @return Indicates whether to use the older v2 legacy logs search.
     * 
     */
    public Optional<Boolean> enableLegacyLogsSearchV2() {
        return Optional.ofNullable(this.enableLegacyLogsSearchV2);
    }
    /**
     * @return Whether ID tokens and the userinfo endpoint includes a complete user profile (true) or only OpenID Connect claims (false).
     * 
     */
    public Optional<Boolean> enableLegacyProfile() {
        return Optional.ofNullable(this.enableLegacyProfile);
    }
    /**
     * @return Indicates whether advanced API Authorization scenarios are enabled.
     * 
     */
    public Optional<Boolean> enablePipeline2() {
        return Optional.ofNullable(this.enablePipeline2);
    }
    /**
     * @return Indicates whether the public sign up process shows a `user_exists` error if the user already exists.
     * 
     */
    public Optional<Boolean> enablePublicSignupUserExistsError() {
        return Optional.ofNullable(this.enablePublicSignupUserExistsError);
    }
    /**
     * @return Do not Publish Enterprise Connections Information with IdP domains on the lock configuration file.
     * 
     */
    public Optional<Boolean> noDiscloseEnterpriseConnections() {
        return Optional.ofNullable(this.noDiscloseEnterpriseConnections);
    }
    /**
     * @return Delete underlying grant when a refresh token is revoked via the Authentication API.
     * 
     */
    public Optional<Boolean> revokeRefreshTokenGrant() {
        return Optional.ofNullable(this.revokeRefreshTokenGrant);
    }
    /**
     * @return Indicates whether the New Universal Login Experience is enabled.
     * 
     * @deprecated
     * This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead.
     * 
     */
    @Deprecated /* This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead. */
    public Optional<Boolean> universalLogin() {
        return Optional.ofNullable(this.universalLogin);
    }
    /**
     * @return Indicates whether to use scope descriptions for consent.
     * 
     */
    public Optional<Boolean> useScopeDescriptionsForConsent() {
        return Optional.ofNullable(this.useScopeDescriptionsForConsent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantFlags defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowLegacyDelegationGrantTypes;
        private @Nullable Boolean allowLegacyRoGrantTypes;
        private @Nullable Boolean allowLegacyTokeninfoEndpoint;
        private @Nullable Boolean dashboardInsightsView;
        private @Nullable Boolean dashboardLogStreamsNext;
        private @Nullable Boolean disableClickjackProtectionHeaders;
        private @Nullable Boolean disableFieldsMapFix;
        private @Nullable Boolean disableManagementApiSmsObfuscation;
        private @Nullable Boolean enableAdfsWaadEmailVerification;
        private @Nullable Boolean enableApisSection;
        private @Nullable Boolean enableClientConnections;
        private @Nullable Boolean enableCustomDomainInEmails;
        private @Nullable Boolean enableDynamicClientRegistration;
        private @Nullable Boolean enableIdtokenApi2;
        private @Nullable Boolean enableLegacyLogsSearchV2;
        private @Nullable Boolean enableLegacyProfile;
        private @Nullable Boolean enablePipeline2;
        private @Nullable Boolean enablePublicSignupUserExistsError;
        private @Nullable Boolean noDiscloseEnterpriseConnections;
        private @Nullable Boolean revokeRefreshTokenGrant;
        private @Nullable Boolean universalLogin;
        private @Nullable Boolean useScopeDescriptionsForConsent;
        public Builder() {}
        public Builder(TenantFlags defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLegacyDelegationGrantTypes = defaults.allowLegacyDelegationGrantTypes;
    	      this.allowLegacyRoGrantTypes = defaults.allowLegacyRoGrantTypes;
    	      this.allowLegacyTokeninfoEndpoint = defaults.allowLegacyTokeninfoEndpoint;
    	      this.dashboardInsightsView = defaults.dashboardInsightsView;
    	      this.dashboardLogStreamsNext = defaults.dashboardLogStreamsNext;
    	      this.disableClickjackProtectionHeaders = defaults.disableClickjackProtectionHeaders;
    	      this.disableFieldsMapFix = defaults.disableFieldsMapFix;
    	      this.disableManagementApiSmsObfuscation = defaults.disableManagementApiSmsObfuscation;
    	      this.enableAdfsWaadEmailVerification = defaults.enableAdfsWaadEmailVerification;
    	      this.enableApisSection = defaults.enableApisSection;
    	      this.enableClientConnections = defaults.enableClientConnections;
    	      this.enableCustomDomainInEmails = defaults.enableCustomDomainInEmails;
    	      this.enableDynamicClientRegistration = defaults.enableDynamicClientRegistration;
    	      this.enableIdtokenApi2 = defaults.enableIdtokenApi2;
    	      this.enableLegacyLogsSearchV2 = defaults.enableLegacyLogsSearchV2;
    	      this.enableLegacyProfile = defaults.enableLegacyProfile;
    	      this.enablePipeline2 = defaults.enablePipeline2;
    	      this.enablePublicSignupUserExistsError = defaults.enablePublicSignupUserExistsError;
    	      this.noDiscloseEnterpriseConnections = defaults.noDiscloseEnterpriseConnections;
    	      this.revokeRefreshTokenGrant = defaults.revokeRefreshTokenGrant;
    	      this.universalLogin = defaults.universalLogin;
    	      this.useScopeDescriptionsForConsent = defaults.useScopeDescriptionsForConsent;
        }

        @CustomType.Setter
        public Builder allowLegacyDelegationGrantTypes(@Nullable Boolean allowLegacyDelegationGrantTypes) {
            this.allowLegacyDelegationGrantTypes = allowLegacyDelegationGrantTypes;
            return this;
        }
        @CustomType.Setter
        public Builder allowLegacyRoGrantTypes(@Nullable Boolean allowLegacyRoGrantTypes) {
            this.allowLegacyRoGrantTypes = allowLegacyRoGrantTypes;
            return this;
        }
        @CustomType.Setter
        public Builder allowLegacyTokeninfoEndpoint(@Nullable Boolean allowLegacyTokeninfoEndpoint) {
            this.allowLegacyTokeninfoEndpoint = allowLegacyTokeninfoEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder dashboardInsightsView(@Nullable Boolean dashboardInsightsView) {
            this.dashboardInsightsView = dashboardInsightsView;
            return this;
        }
        @CustomType.Setter
        public Builder dashboardLogStreamsNext(@Nullable Boolean dashboardLogStreamsNext) {
            this.dashboardLogStreamsNext = dashboardLogStreamsNext;
            return this;
        }
        @CustomType.Setter
        public Builder disableClickjackProtectionHeaders(@Nullable Boolean disableClickjackProtectionHeaders) {
            this.disableClickjackProtectionHeaders = disableClickjackProtectionHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder disableFieldsMapFix(@Nullable Boolean disableFieldsMapFix) {
            this.disableFieldsMapFix = disableFieldsMapFix;
            return this;
        }
        @CustomType.Setter
        public Builder disableManagementApiSmsObfuscation(@Nullable Boolean disableManagementApiSmsObfuscation) {
            this.disableManagementApiSmsObfuscation = disableManagementApiSmsObfuscation;
            return this;
        }
        @CustomType.Setter
        public Builder enableAdfsWaadEmailVerification(@Nullable Boolean enableAdfsWaadEmailVerification) {
            this.enableAdfsWaadEmailVerification = enableAdfsWaadEmailVerification;
            return this;
        }
        @CustomType.Setter
        public Builder enableApisSection(@Nullable Boolean enableApisSection) {
            this.enableApisSection = enableApisSection;
            return this;
        }
        @CustomType.Setter
        public Builder enableClientConnections(@Nullable Boolean enableClientConnections) {
            this.enableClientConnections = enableClientConnections;
            return this;
        }
        @CustomType.Setter
        public Builder enableCustomDomainInEmails(@Nullable Boolean enableCustomDomainInEmails) {
            this.enableCustomDomainInEmails = enableCustomDomainInEmails;
            return this;
        }
        @CustomType.Setter
        public Builder enableDynamicClientRegistration(@Nullable Boolean enableDynamicClientRegistration) {
            this.enableDynamicClientRegistration = enableDynamicClientRegistration;
            return this;
        }
        @CustomType.Setter
        public Builder enableIdtokenApi2(@Nullable Boolean enableIdtokenApi2) {
            this.enableIdtokenApi2 = enableIdtokenApi2;
            return this;
        }
        @CustomType.Setter
        public Builder enableLegacyLogsSearchV2(@Nullable Boolean enableLegacyLogsSearchV2) {
            this.enableLegacyLogsSearchV2 = enableLegacyLogsSearchV2;
            return this;
        }
        @CustomType.Setter
        public Builder enableLegacyProfile(@Nullable Boolean enableLegacyProfile) {
            this.enableLegacyProfile = enableLegacyProfile;
            return this;
        }
        @CustomType.Setter
        public Builder enablePipeline2(@Nullable Boolean enablePipeline2) {
            this.enablePipeline2 = enablePipeline2;
            return this;
        }
        @CustomType.Setter
        public Builder enablePublicSignupUserExistsError(@Nullable Boolean enablePublicSignupUserExistsError) {
            this.enablePublicSignupUserExistsError = enablePublicSignupUserExistsError;
            return this;
        }
        @CustomType.Setter
        public Builder noDiscloseEnterpriseConnections(@Nullable Boolean noDiscloseEnterpriseConnections) {
            this.noDiscloseEnterpriseConnections = noDiscloseEnterpriseConnections;
            return this;
        }
        @CustomType.Setter
        public Builder revokeRefreshTokenGrant(@Nullable Boolean revokeRefreshTokenGrant) {
            this.revokeRefreshTokenGrant = revokeRefreshTokenGrant;
            return this;
        }
        @CustomType.Setter
        public Builder universalLogin(@Nullable Boolean universalLogin) {
            this.universalLogin = universalLogin;
            return this;
        }
        @CustomType.Setter
        public Builder useScopeDescriptionsForConsent(@Nullable Boolean useScopeDescriptionsForConsent) {
            this.useScopeDescriptionsForConsent = useScopeDescriptionsForConsent;
            return this;
        }
        public TenantFlags build() {
            final var o = new TenantFlags();
            o.allowLegacyDelegationGrantTypes = allowLegacyDelegationGrantTypes;
            o.allowLegacyRoGrantTypes = allowLegacyRoGrantTypes;
            o.allowLegacyTokeninfoEndpoint = allowLegacyTokeninfoEndpoint;
            o.dashboardInsightsView = dashboardInsightsView;
            o.dashboardLogStreamsNext = dashboardLogStreamsNext;
            o.disableClickjackProtectionHeaders = disableClickjackProtectionHeaders;
            o.disableFieldsMapFix = disableFieldsMapFix;
            o.disableManagementApiSmsObfuscation = disableManagementApiSmsObfuscation;
            o.enableAdfsWaadEmailVerification = enableAdfsWaadEmailVerification;
            o.enableApisSection = enableApisSection;
            o.enableClientConnections = enableClientConnections;
            o.enableCustomDomainInEmails = enableCustomDomainInEmails;
            o.enableDynamicClientRegistration = enableDynamicClientRegistration;
            o.enableIdtokenApi2 = enableIdtokenApi2;
            o.enableLegacyLogsSearchV2 = enableLegacyLogsSearchV2;
            o.enableLegacyProfile = enableLegacyProfile;
            o.enablePipeline2 = enablePipeline2;
            o.enablePublicSignupUserExistsError = enablePublicSignupUserExistsError;
            o.noDiscloseEnterpriseConnections = noDiscloseEnterpriseConnections;
            o.revokeRefreshTokenGrant = revokeRefreshTokenGrant;
            o.universalLogin = universalLogin;
            o.useScopeDescriptionsForConsent = useScopeDescriptionsForConsent;
            return o;
        }
    }
}
