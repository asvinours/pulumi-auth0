// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class TenantFlagsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the legacy delegation endpoint will be enabled for your account (true) or not available (false).
        /// </summary>
        [Input("allowLegacyDelegationGrantTypes")]
        public Input<bool>? AllowLegacyDelegationGrantTypes { get; set; }

        /// <summary>
        /// Whether the legacy `auth/ro` endpoint (used with resource owner password and passwordless features) will be enabled for your account (true) or not available (false).
        /// </summary>
        [Input("allowLegacyRoGrantTypes")]
        public Input<bool>? AllowLegacyRoGrantTypes { get; set; }

        /// <summary>
        /// If enabled, customers can use Tokeninfo Endpoint, otherwise they can not use it.
        /// </summary>
        [Input("allowLegacyTokeninfoEndpoint")]
        public Input<bool>? AllowLegacyTokeninfoEndpoint { get; set; }

        /// <summary>
        /// Enables new insights activity page view.
        /// </summary>
        [Input("dashboardInsightsView")]
        public Input<bool>? DashboardInsightsView { get; set; }

        /// <summary>
        /// Enables beta access to log streaming changes.
        /// </summary>
        [Input("dashboardLogStreamsNext")]
        public Input<bool>? DashboardLogStreamsNext { get; set; }

        /// <summary>
        /// Indicates whether classic Universal Login prompts include additional security headers to prevent clickjacking.
        /// </summary>
        [Input("disableClickjackProtectionHeaders")]
        public Input<bool>? DisableClickjackProtectionHeaders { get; set; }

        /// <summary>
        /// Disables SAML fields map fix for bad mappings with repeated attributes.
        /// </summary>
        [Input("disableFieldsMapFix")]
        public Input<bool>? DisableFieldsMapFix { get; set; }

        /// <summary>
        /// If true, SMS phone numbers will not be obfuscated in Management API GET calls.
        /// </summary>
        [Input("disableManagementApiSmsObfuscation")]
        public Input<bool>? DisableManagementApiSmsObfuscation { get; set; }

        /// <summary>
        /// If enabled, users will be presented with an email verification prompt during their first login when using Azure AD or ADFS connections.
        /// </summary>
        [Input("enableAdfsWaadEmailVerification")]
        public Input<bool>? EnableAdfsWaadEmailVerification { get; set; }

        /// <summary>
        /// Indicates whether the APIs section is enabled for the tenant.
        /// </summary>
        [Input("enableApisSection")]
        public Input<bool>? EnableApisSection { get; set; }

        /// <summary>
        /// Indicates whether all current connections should be enabled when a new client is created.
        /// </summary>
        [Input("enableClientConnections")]
        public Input<bool>? EnableClientConnections { get; set; }

        /// <summary>
        /// Indicates whether the tenant allows custom domains in emails.
        /// </summary>
        [Input("enableCustomDomainInEmails")]
        public Input<bool>? EnableCustomDomainInEmails { get; set; }

        /// <summary>
        /// Indicates whether the tenant allows dynamic client registration.
        /// </summary>
        [Input("enableDynamicClientRegistration")]
        public Input<bool>? EnableDynamicClientRegistration { get; set; }

        /// <summary>
        /// Whether ID tokens can be used to authorize some types of requests to API v2 (true) or not (false).
        /// </summary>
        [Input("enableIdtokenApi2")]
        public Input<bool>? EnableIdtokenApi2 { get; set; }

        /// <summary>
        /// Indicates whether to use the older v2 legacy logs search.
        /// </summary>
        [Input("enableLegacyLogsSearchV2")]
        public Input<bool>? EnableLegacyLogsSearchV2 { get; set; }

        /// <summary>
        /// Whether ID tokens and the userinfo endpoint includes a complete user profile (true) or only OpenID Connect claims (false).
        /// </summary>
        [Input("enableLegacyProfile")]
        public Input<bool>? EnableLegacyProfile { get; set; }

        /// <summary>
        /// Indicates whether advanced API Authorization scenarios are enabled.
        /// </summary>
        [Input("enablePipeline2")]
        public Input<bool>? EnablePipeline2 { get; set; }

        /// <summary>
        /// Indicates whether the public sign up process shows a `user_exists` error if the user already exists.
        /// </summary>
        [Input("enablePublicSignupUserExistsError")]
        public Input<bool>? EnablePublicSignupUserExistsError { get; set; }

        /// <summary>
        /// Do not Publish Enterprise Connections Information with IdP domains on the lock configuration file.
        /// </summary>
        [Input("noDiscloseEnterpriseConnections")]
        public Input<bool>? NoDiscloseEnterpriseConnections { get; set; }

        /// <summary>
        /// Delete underlying grant when a refresh token is revoked via the Authentication API.
        /// </summary>
        [Input("revokeRefreshTokenGrant")]
        public Input<bool>? RevokeRefreshTokenGrant { get; set; }

        /// <summary>
        /// Indicates whether the tenant uses Universal Login.
        /// </summary>
        [Input("universalLogin")]
        public Input<bool>? UniversalLogin { get; set; }

        /// <summary>
        /// Indicates whether to use scope descriptions for consent.
        /// </summary>
        [Input("useScopeDescriptionsForConsent")]
        public Input<bool>? UseScopeDescriptionsForConsent { get; set; }

        public TenantFlagsArgs()
        {
        }
        public static new TenantFlagsArgs Empty => new TenantFlagsArgs();
    }
}
