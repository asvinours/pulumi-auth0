// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetClient
    {
        /// <summary>
        /// Data source to retrieve a specific Auth0 application client by `client_id` or `name`.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Auth0 = Pulumi.Auth0;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var some_client_by_name = Auth0.GetClient.Invoke(new()
        ///     {
        ///         Name = "Name of my Application",
        ///     });
        /// 
        ///     var some_client_by_id = Auth0.GetClient.Invoke(new()
        ///     {
        ///         ClientId = "abcdefghkijklmnopqrstuvwxyz0123456789",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetClientResult> InvokeAsync(GetClientArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClientResult>("auth0:index/getClient:getClient", args ?? new GetClientArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a specific Auth0 application client by `client_id` or `name`.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Auth0 = Pulumi.Auth0;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var some_client_by_name = Auth0.GetClient.Invoke(new()
        ///     {
        ///         Name = "Name of my Application",
        ///     });
        /// 
        ///     var some_client_by_id = Auth0.GetClient.Invoke(new()
        ///     {
        ///         ClientId = "abcdefghkijklmnopqrstuvwxyz0123456789",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetClientResult> Invoke(GetClientInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClientResult>("auth0:index/getClient:getClient", args ?? new GetClientInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClientArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the client. If not provided, `name` must be set.
        /// </summary>
        [Input("clientId")]
        public string? ClientId { get; set; }

        /// <summary>
        /// The name of the client. If not provided, `client_id` must be set.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetClientArgs()
        {
        }
        public static new GetClientArgs Empty => new GetClientArgs();
    }

    public sealed class GetClientInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the client. If not provided, `name` must be set.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The name of the client. If not provided, `client_id` must be set.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetClientInvokeArgs()
        {
        }
        public static new GetClientInvokeArgs Empty => new GetClientInvokeArgs();
    }


    [OutputType]
    public sealed class GetClientResult
    {
        /// <summary>
        /// Addons enabled for this client and their associated configurations.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientAddonResult> Addons;
        /// <summary>
        /// List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
        /// </summary>
        public readonly ImmutableArray<string> AllowedClients;
        /// <summary>
        /// URLs that Auth0 may redirect to after logout.
        /// </summary>
        public readonly ImmutableArray<string> AllowedLogoutUrls;
        /// <summary>
        /// URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
        /// </summary>
        public readonly ImmutableArray<string> AllowedOrigins;
        /// <summary>
        /// Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
        /// </summary>
        public readonly string AppType;
        /// <summary>
        /// URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
        /// </summary>
        public readonly ImmutableArray<string> Callbacks;
        /// <summary>
        /// List of audiences/realms for SAML protocol. Used by the wsfed addon.
        /// </summary>
        public readonly ImmutableArray<string> ClientAliases;
        /// <summary>
        /// The ID of the client. If not provided, `name` must be set.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()&lt;&gt;@ [Tab] [Space]`.
        /// </summary>
        public readonly ImmutableDictionary<string, object> ClientMetadata;
        public readonly string ClientSecret;
        /// <summary>
        /// Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`). Requires the `coa_toggle_enabled` feature flag to be enabled on the tenant by the support team.
        /// </summary>
        public readonly bool CrossOriginAuth;
        /// <summary>
        /// URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
        /// </summary>
        public readonly string CrossOriginLoc;
        /// <summary>
        /// The content (HTML, CSS, JS) of the custom login page.
        /// </summary>
        public readonly string CustomLoginPage;
        /// <summary>
        /// Indicates whether a custom login page is to be used.
        /// </summary>
        public readonly bool CustomLoginPageOn;
        /// <summary>
        /// Description of the purpose of the client.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Encryption used for WS-Fed responses with this client.
        /// </summary>
        public readonly ImmutableDictionary<string, string> EncryptionKey;
        /// <summary>
        /// HTML form template to be used for WS-Federation.
        /// </summary>
        public readonly string FormTemplate;
        /// <summary>
        /// Types of grants that this client is authorized to use.
        /// </summary>
        public readonly ImmutableArray<string> GrantTypes;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Initiate login URI. Must be HTTPS or an empty string.
        /// </summary>
        public readonly string InitiateLoginUri;
        /// <summary>
        /// Indicates whether this client is a first-party client.
        /// </summary>
        public readonly bool IsFirstParty;
        /// <summary>
        /// Indicates whether the token endpoint IP header is trusted.
        /// </summary>
        public readonly bool IsTokenEndpointIpHeaderTrusted;
        /// <summary>
        /// Configuration settings for the JWTs issued for this client.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientJwtConfigurationResult> JwtConfigurations;
        /// <summary>
        /// URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
        /// </summary>
        public readonly string LogoUri;
        /// <summary>
        /// Additional configuration for native mobile apps.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientMobileResult> Mobiles;
        /// <summary>
        /// The name of the client. If not provided, `client_id` must be set.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `app_type`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientNativeSocialLoginResult> NativeSocialLogins;
        /// <summary>
        /// Indicates whether this client will conform to strict OIDC specifications.
        /// </summary>
        public readonly bool OidcConformant;
        /// <summary>
        /// Defines how to proceed during an authentication transaction when `organization_usage = "require"`. Can be `no_prompt` (default) or `pre_login_prompt`.
        /// </summary>
        public readonly string OrganizationRequireBehavior;
        /// <summary>
        /// Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
        /// </summary>
        public readonly string OrganizationUsage;
        /// <summary>
        /// Configuration settings for the refresh tokens issued for this client.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientRefreshTokenResult> RefreshTokens;
        /// <summary>
        /// List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
        /// </summary>
        public readonly ImmutableArray<ImmutableDictionary<string, object>> SigningKeys;
        /// <summary>
        /// Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
        /// </summary>
        public readonly bool Sso;
        /// <summary>
        /// Indicates whether or not SSO is disabled.
        /// </summary>
        public readonly bool SsoDisabled;
        /// <summary>
        /// Defines the requested authentication method for the token endpoint. Options include `none` (public client without a client secret), `client_secret_post` (client uses HTTP POST parameters), `client_secret_basic` (client uses HTTP Basic).
        /// </summary>
        public readonly string TokenEndpointAuthMethod;
        /// <summary>
        /// URLs that represent valid web origins for use with web message response mode.
        /// </summary>
        public readonly ImmutableArray<string> WebOrigins;

        [OutputConstructor]
        private GetClientResult(
            ImmutableArray<Outputs.GetClientAddonResult> addons,

            ImmutableArray<string> allowedClients,

            ImmutableArray<string> allowedLogoutUrls,

            ImmutableArray<string> allowedOrigins,

            string appType,

            ImmutableArray<string> callbacks,

            ImmutableArray<string> clientAliases,

            string? clientId,

            ImmutableDictionary<string, object> clientMetadata,

            string clientSecret,

            bool crossOriginAuth,

            string crossOriginLoc,

            string customLoginPage,

            bool customLoginPageOn,

            string description,

            ImmutableDictionary<string, string> encryptionKey,

            string formTemplate,

            ImmutableArray<string> grantTypes,

            string id,

            string initiateLoginUri,

            bool isFirstParty,

            bool isTokenEndpointIpHeaderTrusted,

            ImmutableArray<Outputs.GetClientJwtConfigurationResult> jwtConfigurations,

            string logoUri,

            ImmutableArray<Outputs.GetClientMobileResult> mobiles,

            string? name,

            ImmutableArray<Outputs.GetClientNativeSocialLoginResult> nativeSocialLogins,

            bool oidcConformant,

            string organizationRequireBehavior,

            string organizationUsage,

            ImmutableArray<Outputs.GetClientRefreshTokenResult> refreshTokens,

            ImmutableArray<ImmutableDictionary<string, object>> signingKeys,

            bool sso,

            bool ssoDisabled,

            string tokenEndpointAuthMethod,

            ImmutableArray<string> webOrigins)
        {
            Addons = addons;
            AllowedClients = allowedClients;
            AllowedLogoutUrls = allowedLogoutUrls;
            AllowedOrigins = allowedOrigins;
            AppType = appType;
            Callbacks = callbacks;
            ClientAliases = clientAliases;
            ClientId = clientId;
            ClientMetadata = clientMetadata;
            ClientSecret = clientSecret;
            CrossOriginAuth = crossOriginAuth;
            CrossOriginLoc = crossOriginLoc;
            CustomLoginPage = customLoginPage;
            CustomLoginPageOn = customLoginPageOn;
            Description = description;
            EncryptionKey = encryptionKey;
            FormTemplate = formTemplate;
            GrantTypes = grantTypes;
            Id = id;
            InitiateLoginUri = initiateLoginUri;
            IsFirstParty = isFirstParty;
            IsTokenEndpointIpHeaderTrusted = isTokenEndpointIpHeaderTrusted;
            JwtConfigurations = jwtConfigurations;
            LogoUri = logoUri;
            Mobiles = mobiles;
            Name = name;
            NativeSocialLogins = nativeSocialLogins;
            OidcConformant = oidcConformant;
            OrganizationRequireBehavior = organizationRequireBehavior;
            OrganizationUsage = organizationUsage;
            RefreshTokens = refreshTokens;
            SigningKeys = signingKeys;
            Sso = sso;
            SsoDisabled = ssoDisabled;
            TokenEndpointAuthMethod = tokenEndpointAuthMethod;
            WebOrigins = webOrigins;
        }
    }
}
