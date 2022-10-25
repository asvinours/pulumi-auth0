// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class TenantFlags
    {
        /// <summary>
        /// Whether the legacy delegation endpoint will be enabled for your account (true) or not available (false).
        /// </summary>
        public readonly bool? AllowLegacyDelegationGrantTypes;
        /// <summary>
        /// Whether the legacy `auth/ro` endpoint (used with resource owner password and passwordless features) will be enabled for your account (true) or not available (false).
        /// </summary>
        public readonly bool? AllowLegacyRoGrantTypes;
        /// <summary>
        /// If enabled, customers can use Tokeninfo Endpoint, otherwise they can not use it.
        /// </summary>
        public readonly bool? AllowLegacyTokeninfoEndpoint;
        /// <summary>
        /// Enables new insights activity page view.
        /// </summary>
        public readonly bool? DashboardInsightsView;
        /// <summary>
        /// Enables beta access to log streaming changes.
        /// </summary>
        public readonly bool? DashboardLogStreamsNext;
        /// <summary>
        /// Indicates whether classic Universal Login prompts include additional security headers to prevent clickjacking.
        /// </summary>
        public readonly bool? DisableClickjackProtectionHeaders;
        /// <summary>
        /// Disables SAML fields map fix for bad mappings with repeated attributes.
        /// </summary>
        public readonly bool? DisableFieldsMapFix;
        /// <summary>
        /// If true, SMS phone numbers will not be obfuscated in Management API GET calls.
        /// </summary>
        public readonly bool? DisableManagementApiSmsObfuscation;
        /// <summary>
        /// If enabled, users will be presented with an email verification prompt during their first login when using Azure AD or ADFS connections.
        /// </summary>
        public readonly bool? EnableAdfsWaadEmailVerification;
        /// <summary>
        /// Indicates whether the APIs section is enabled for the tenant.
        /// </summary>
        public readonly bool? EnableApisSection;
        /// <summary>
        /// Indicates whether all current connections should be enabled when a new client is created.
        /// </summary>
        public readonly bool? EnableClientConnections;
        /// <summary>
        /// Indicates whether the tenant allows custom domains in emails.
        /// </summary>
        public readonly bool? EnableCustomDomainInEmails;
        /// <summary>
        /// Indicates whether the tenant allows dynamic client registration.
        /// </summary>
        public readonly bool? EnableDynamicClientRegistration;
        /// <summary>
        /// Whether ID tokens can be used to authorize some types of requests to API v2 (true) or not (false).
        /// </summary>
        public readonly bool? EnableIdtokenApi2;
        /// <summary>
        /// Indicates whether to use the older v2 legacy logs search.
        /// </summary>
        public readonly bool? EnableLegacyLogsSearchV2;
        /// <summary>
        /// Whether ID tokens and the userinfo endpoint includes a complete user profile (true) or only OpenID Connect claims (false).
        /// </summary>
        public readonly bool? EnableLegacyProfile;
        /// <summary>
        /// Indicates whether advanced API Authorization scenarios are enabled.
        /// </summary>
        public readonly bool? EnablePipeline2;
        /// <summary>
        /// Indicates whether the public sign up process shows a `user_exists` error if the user already exists.
        /// </summary>
        public readonly bool? EnablePublicSignupUserExistsError;
        /// <summary>
        /// Do not Publish Enterprise Connections Information with IdP domains on the lock configuration file.
        /// </summary>
        public readonly bool? NoDiscloseEnterpriseConnections;
        /// <summary>
        /// Delete underlying grant when a refresh token is revoked via the Authentication API.
        /// </summary>
        public readonly bool? RevokeRefreshTokenGrant;
        /// <summary>
        /// Indicates whether the tenant uses Universal Login.
        /// </summary>
        public readonly bool? UniversalLogin;
        /// <summary>
        /// Indicates whether to use scope descriptions for consent.
        /// </summary>
        public readonly bool? UseScopeDescriptionsForConsent;

        [OutputConstructor]
        private TenantFlags(
            bool? allowLegacyDelegationGrantTypes,

            bool? allowLegacyRoGrantTypes,

            bool? allowLegacyTokeninfoEndpoint,

            bool? dashboardInsightsView,

            bool? dashboardLogStreamsNext,

            bool? disableClickjackProtectionHeaders,

            bool? disableFieldsMapFix,

            bool? disableManagementApiSmsObfuscation,

            bool? enableAdfsWaadEmailVerification,

            bool? enableApisSection,

            bool? enableClientConnections,

            bool? enableCustomDomainInEmails,

            bool? enableDynamicClientRegistration,

            bool? enableIdtokenApi2,

            bool? enableLegacyLogsSearchV2,

            bool? enableLegacyProfile,

            bool? enablePipeline2,

            bool? enablePublicSignupUserExistsError,

            bool? noDiscloseEnterpriseConnections,

            bool? revokeRefreshTokenGrant,

            bool? universalLogin,

            bool? useScopeDescriptionsForConsent)
        {
            AllowLegacyDelegationGrantTypes = allowLegacyDelegationGrantTypes;
            AllowLegacyRoGrantTypes = allowLegacyRoGrantTypes;
            AllowLegacyTokeninfoEndpoint = allowLegacyTokeninfoEndpoint;
            DashboardInsightsView = dashboardInsightsView;
            DashboardLogStreamsNext = dashboardLogStreamsNext;
            DisableClickjackProtectionHeaders = disableClickjackProtectionHeaders;
            DisableFieldsMapFix = disableFieldsMapFix;
            DisableManagementApiSmsObfuscation = disableManagementApiSmsObfuscation;
            EnableAdfsWaadEmailVerification = enableAdfsWaadEmailVerification;
            EnableApisSection = enableApisSection;
            EnableClientConnections = enableClientConnections;
            EnableCustomDomainInEmails = enableCustomDomainInEmails;
            EnableDynamicClientRegistration = enableDynamicClientRegistration;
            EnableIdtokenApi2 = enableIdtokenApi2;
            EnableLegacyLogsSearchV2 = enableLegacyLogsSearchV2;
            EnableLegacyProfile = enableLegacyProfile;
            EnablePipeline2 = enablePipeline2;
            EnablePublicSignupUserExistsError = enablePublicSignupUserExistsError;
            NoDiscloseEnterpriseConnections = noDiscloseEnterpriseConnections;
            RevokeRefreshTokenGrant = revokeRefreshTokenGrant;
            UniversalLogin = universalLogin;
            UseScopeDescriptionsForConsent = useScopeDescriptionsForConsent;
        }
    }
}
