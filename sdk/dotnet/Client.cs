// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// With this resource, you can set up applications that use Auth0 for authentication and configure allowed callback URLs and secrets for these applications.
    /// 
    /// ## Import
    /// 
    /// A client can be imported using the client's ID. # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/client:Client my_client AaiyAPdpYdesoKnqjj8HJqRn4T5titww
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/client:Client")]
    public partial class Client : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Addons enabled for this client and their associated configurations.
        /// </summary>
        [Output("addons")]
        public Output<Outputs.ClientAddons> Addons { get; private set; } = null!;

        /// <summary>
        /// List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
        /// </summary>
        [Output("allowedClients")]
        public Output<ImmutableArray<string>> AllowedClients { get; private set; } = null!;

        /// <summary>
        /// URLs that Auth0 may redirect to after logout.
        /// </summary>
        [Output("allowedLogoutUrls")]
        public Output<ImmutableArray<string>> AllowedLogoutUrls { get; private set; } = null!;

        /// <summary>
        /// URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
        /// </summary>
        [Output("allowedOrigins")]
        public Output<ImmutableArray<string>> AllowedOrigins { get; private set; } = null!;

        /// <summary>
        /// Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
        /// </summary>
        [Output("appType")]
        public Output<string?> AppType { get; private set; } = null!;

        /// <summary>
        /// URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
        /// </summary>
        [Output("callbacks")]
        public Output<ImmutableArray<string>> Callbacks { get; private set; } = null!;

        /// <summary>
        /// List of audiences/realms for SAML protocol. Used by the wsfed addon.
        /// </summary>
        [Output("clientAliases")]
        public Output<ImmutableArray<string>> ClientAliases { get; private set; } = null!;

        /// <summary>
        /// The ID of the client.
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()&lt;&gt;@ [Tab] [Space]`.
        /// </summary>
        [Output("clientMetadata")]
        public Output<ImmutableDictionary<string, object>?> ClientMetadata { get; private set; } = null!;

        /// <summary>
        /// Secret for the client. Keep this private. To access this attribute you need to add the `read:client_keys` scope to the
        /// Terraform client. Otherwise, the attribute will contain an empty string.
        /// </summary>
        [Output("clientSecret")]
        public Output<string> ClientSecret { get; private set; } = null!;

        /// <summary>
        /// Custom metadata for the rotation. The contents of this map are arbitrary and are hashed by the provider. When the hash changes, a rotation is triggered. For example, the map could contain the user making the change, the date of the change, and a text reason for the change. For more info: [rotate-client-secret](https://auth0.com/docs/get-started/applications/rotate-client-secret).
        /// </summary>
        [Output("clientSecretRotationTrigger")]
        public Output<ImmutableDictionary<string, object>?> ClientSecretRotationTrigger { get; private set; } = null!;

        /// <summary>
        /// Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`). Requires the `coa_toggle_enabled` feature flag to be enabled on the tenant by the support team.
        /// </summary>
        [Output("crossOriginAuth")]
        public Output<bool?> CrossOriginAuth { get; private set; } = null!;

        /// <summary>
        /// URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
        /// </summary>
        [Output("crossOriginLoc")]
        public Output<string?> CrossOriginLoc { get; private set; } = null!;

        /// <summary>
        /// The content (HTML, CSS, JS) of the custom login page.
        /// </summary>
        [Output("customLoginPage")]
        public Output<string?> CustomLoginPage { get; private set; } = null!;

        /// <summary>
        /// Indicates whether a custom login page is to be used.
        /// </summary>
        [Output("customLoginPageOn")]
        public Output<bool> CustomLoginPageOn { get; private set; } = null!;

        /// <summary>
        /// Description of the purpose of the client.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Encryption used for WS-Fed responses with this client.
        /// </summary>
        [Output("encryptionKey")]
        public Output<ImmutableDictionary<string, string>?> EncryptionKey { get; private set; } = null!;

        /// <summary>
        /// HTML form template to be used for WS-Federation.
        /// </summary>
        [Output("formTemplate")]
        public Output<string?> FormTemplate { get; private set; } = null!;

        /// <summary>
        /// Types of grants that this client is authorized to use.
        /// </summary>
        [Output("grantTypes")]
        public Output<ImmutableArray<string>> GrantTypes { get; private set; } = null!;

        /// <summary>
        /// Initiate login URI. Must be HTTPS or an empty string.
        /// </summary>
        [Output("initiateLoginUri")]
        public Output<string?> InitiateLoginUri { get; private set; } = null!;

        /// <summary>
        /// Indicates whether this client is a first-party client.
        /// </summary>
        [Output("isFirstParty")]
        public Output<bool> IsFirstParty { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the token endpoint IP header is trusted.
        /// </summary>
        [Output("isTokenEndpointIpHeaderTrusted")]
        public Output<bool> IsTokenEndpointIpHeaderTrusted { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for the JWTs issued for this client.
        /// </summary>
        [Output("jwtConfiguration")]
        public Output<Outputs.ClientJwtConfiguration> JwtConfiguration { get; private set; } = null!;

        /// <summary>
        /// URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
        /// </summary>
        [Output("logoUri")]
        public Output<string?> LogoUri { get; private set; } = null!;

        /// <summary>
        /// Additional configuration for native mobile apps.
        /// </summary>
        [Output("mobile")]
        public Output<Outputs.ClientMobile> Mobile { get; private set; } = null!;

        /// <summary>
        /// Name of the client.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `app_type`.
        /// </summary>
        [Output("nativeSocialLogin")]
        public Output<Outputs.ClientNativeSocialLogin> NativeSocialLogin { get; private set; } = null!;

        /// <summary>
        /// Indicates whether this client will conform to strict OIDC specifications.
        /// </summary>
        [Output("oidcConformant")]
        public Output<bool> OidcConformant { get; private set; } = null!;

        /// <summary>
        /// Defines how to proceed during an authentication transaction when `organization_usage = "require"`. Can be `no_prompt` (default) or `pre_login_prompt`.
        /// </summary>
        [Output("organizationRequireBehavior")]
        public Output<string?> OrganizationRequireBehavior { get; private set; } = null!;

        /// <summary>
        /// Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
        /// </summary>
        [Output("organizationUsage")]
        public Output<string?> OrganizationUsage { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for the refresh tokens issued for this client.
        /// </summary>
        [Output("refreshToken")]
        public Output<Outputs.ClientRefreshToken> RefreshToken { get; private set; } = null!;

        /// <summary>
        /// List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
        /// </summary>
        [Output("signingKeys")]
        public Output<ImmutableArray<ImmutableDictionary<string, object>>> SigningKeys { get; private set; } = null!;

        /// <summary>
        /// Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
        /// </summary>
        [Output("sso")]
        public Output<bool?> Sso { get; private set; } = null!;

        /// <summary>
        /// Indicates whether or not SSO is disabled.
        /// </summary>
        [Output("ssoDisabled")]
        public Output<bool?> SsoDisabled { get; private set; } = null!;

        /// <summary>
        /// Defines the requested authentication method for the token endpoint. Options include `none` (public client without a client secret), `client_secret_post` (client uses HTTP POST parameters), `client_secret_basic` (client uses HTTP Basic).
        /// </summary>
        [Output("tokenEndpointAuthMethod")]
        public Output<string> TokenEndpointAuthMethod { get; private set; } = null!;

        /// <summary>
        /// URLs that represent valid web origins for use with web message response mode.
        /// </summary>
        [Output("webOrigins")]
        public Output<ImmutableArray<string>> WebOrigins { get; private set; } = null!;


        /// <summary>
        /// Create a Client resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Client(string name, ClientArgs? args = null, CustomResourceOptions? options = null)
            : base("auth0:index/client:Client", name, args ?? new ClientArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Client(string name, Input<string> id, ClientState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/client:Client", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "clientSecret",
                    "signingKeys",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Client resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Client Get(string name, Input<string> id, ClientState? state = null, CustomResourceOptions? options = null)
        {
            return new Client(name, id, state, options);
        }
    }

    public sealed class ClientArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Addons enabled for this client and their associated configurations.
        /// </summary>
        [Input("addons")]
        public Input<Inputs.ClientAddonsArgs>? Addons { get; set; }

        [Input("allowedClients")]
        private InputList<string>? _allowedClients;

        /// <summary>
        /// List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
        /// </summary>
        public InputList<string> AllowedClients
        {
            get => _allowedClients ?? (_allowedClients = new InputList<string>());
            set => _allowedClients = value;
        }

        [Input("allowedLogoutUrls")]
        private InputList<string>? _allowedLogoutUrls;

        /// <summary>
        /// URLs that Auth0 may redirect to after logout.
        /// </summary>
        public InputList<string> AllowedLogoutUrls
        {
            get => _allowedLogoutUrls ?? (_allowedLogoutUrls = new InputList<string>());
            set => _allowedLogoutUrls = value;
        }

        [Input("allowedOrigins")]
        private InputList<string>? _allowedOrigins;

        /// <summary>
        /// URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
        /// </summary>
        public InputList<string> AllowedOrigins
        {
            get => _allowedOrigins ?? (_allowedOrigins = new InputList<string>());
            set => _allowedOrigins = value;
        }

        /// <summary>
        /// Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
        /// </summary>
        [Input("appType")]
        public Input<string>? AppType { get; set; }

        [Input("callbacks")]
        private InputList<string>? _callbacks;

        /// <summary>
        /// URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
        /// </summary>
        public InputList<string> Callbacks
        {
            get => _callbacks ?? (_callbacks = new InputList<string>());
            set => _callbacks = value;
        }

        [Input("clientAliases")]
        private InputList<string>? _clientAliases;

        /// <summary>
        /// List of audiences/realms for SAML protocol. Used by the wsfed addon.
        /// </summary>
        public InputList<string> ClientAliases
        {
            get => _clientAliases ?? (_clientAliases = new InputList<string>());
            set => _clientAliases = value;
        }

        [Input("clientMetadata")]
        private InputMap<object>? _clientMetadata;

        /// <summary>
        /// Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()&lt;&gt;@ [Tab] [Space]`.
        /// </summary>
        public InputMap<object> ClientMetadata
        {
            get => _clientMetadata ?? (_clientMetadata = new InputMap<object>());
            set => _clientMetadata = value;
        }

        [Input("clientSecretRotationTrigger")]
        private InputMap<object>? _clientSecretRotationTrigger;

        /// <summary>
        /// Custom metadata for the rotation. The contents of this map are arbitrary and are hashed by the provider. When the hash changes, a rotation is triggered. For example, the map could contain the user making the change, the date of the change, and a text reason for the change. For more info: [rotate-client-secret](https://auth0.com/docs/get-started/applications/rotate-client-secret).
        /// </summary>
        public InputMap<object> ClientSecretRotationTrigger
        {
            get => _clientSecretRotationTrigger ?? (_clientSecretRotationTrigger = new InputMap<object>());
            set => _clientSecretRotationTrigger = value;
        }

        /// <summary>
        /// Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`). Requires the `coa_toggle_enabled` feature flag to be enabled on the tenant by the support team.
        /// </summary>
        [Input("crossOriginAuth")]
        public Input<bool>? CrossOriginAuth { get; set; }

        /// <summary>
        /// URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
        /// </summary>
        [Input("crossOriginLoc")]
        public Input<string>? CrossOriginLoc { get; set; }

        /// <summary>
        /// The content (HTML, CSS, JS) of the custom login page.
        /// </summary>
        [Input("customLoginPage")]
        public Input<string>? CustomLoginPage { get; set; }

        /// <summary>
        /// Indicates whether a custom login page is to be used.
        /// </summary>
        [Input("customLoginPageOn")]
        public Input<bool>? CustomLoginPageOn { get; set; }

        /// <summary>
        /// Description of the purpose of the client.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("encryptionKey")]
        private InputMap<string>? _encryptionKey;

        /// <summary>
        /// Encryption used for WS-Fed responses with this client.
        /// </summary>
        public InputMap<string> EncryptionKey
        {
            get => _encryptionKey ?? (_encryptionKey = new InputMap<string>());
            set => _encryptionKey = value;
        }

        /// <summary>
        /// HTML form template to be used for WS-Federation.
        /// </summary>
        [Input("formTemplate")]
        public Input<string>? FormTemplate { get; set; }

        [Input("grantTypes")]
        private InputList<string>? _grantTypes;

        /// <summary>
        /// Types of grants that this client is authorized to use.
        /// </summary>
        public InputList<string> GrantTypes
        {
            get => _grantTypes ?? (_grantTypes = new InputList<string>());
            set => _grantTypes = value;
        }

        /// <summary>
        /// Initiate login URI. Must be HTTPS or an empty string.
        /// </summary>
        [Input("initiateLoginUri")]
        public Input<string>? InitiateLoginUri { get; set; }

        /// <summary>
        /// Indicates whether this client is a first-party client.
        /// </summary>
        [Input("isFirstParty")]
        public Input<bool>? IsFirstParty { get; set; }

        /// <summary>
        /// Indicates whether the token endpoint IP header is trusted.
        /// </summary>
        [Input("isTokenEndpointIpHeaderTrusted")]
        public Input<bool>? IsTokenEndpointIpHeaderTrusted { get; set; }

        /// <summary>
        /// Configuration settings for the JWTs issued for this client.
        /// </summary>
        [Input("jwtConfiguration")]
        public Input<Inputs.ClientJwtConfigurationArgs>? JwtConfiguration { get; set; }

        /// <summary>
        /// URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
        /// </summary>
        [Input("logoUri")]
        public Input<string>? LogoUri { get; set; }

        /// <summary>
        /// Additional configuration for native mobile apps.
        /// </summary>
        [Input("mobile")]
        public Input<Inputs.ClientMobileArgs>? Mobile { get; set; }

        /// <summary>
        /// Name of the client.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `app_type`.
        /// </summary>
        [Input("nativeSocialLogin")]
        public Input<Inputs.ClientNativeSocialLoginArgs>? NativeSocialLogin { get; set; }

        /// <summary>
        /// Indicates whether this client will conform to strict OIDC specifications.
        /// </summary>
        [Input("oidcConformant")]
        public Input<bool>? OidcConformant { get; set; }

        /// <summary>
        /// Defines how to proceed during an authentication transaction when `organization_usage = "require"`. Can be `no_prompt` (default) or `pre_login_prompt`.
        /// </summary>
        [Input("organizationRequireBehavior")]
        public Input<string>? OrganizationRequireBehavior { get; set; }

        /// <summary>
        /// Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
        /// </summary>
        [Input("organizationUsage")]
        public Input<string>? OrganizationUsage { get; set; }

        /// <summary>
        /// Configuration settings for the refresh tokens issued for this client.
        /// </summary>
        [Input("refreshToken")]
        public Input<Inputs.ClientRefreshTokenArgs>? RefreshToken { get; set; }

        /// <summary>
        /// Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
        /// </summary>
        [Input("sso")]
        public Input<bool>? Sso { get; set; }

        /// <summary>
        /// Indicates whether or not SSO is disabled.
        /// </summary>
        [Input("ssoDisabled")]
        public Input<bool>? SsoDisabled { get; set; }

        /// <summary>
        /// Defines the requested authentication method for the token endpoint. Options include `none` (public client without a client secret), `client_secret_post` (client uses HTTP POST parameters), `client_secret_basic` (client uses HTTP Basic).
        /// </summary>
        [Input("tokenEndpointAuthMethod")]
        public Input<string>? TokenEndpointAuthMethod { get; set; }

        [Input("webOrigins")]
        private InputList<string>? _webOrigins;

        /// <summary>
        /// URLs that represent valid web origins for use with web message response mode.
        /// </summary>
        public InputList<string> WebOrigins
        {
            get => _webOrigins ?? (_webOrigins = new InputList<string>());
            set => _webOrigins = value;
        }

        public ClientArgs()
        {
            Description = "Managed by Pulumi";
        }
        public static new ClientArgs Empty => new ClientArgs();
    }

    public sealed class ClientState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Addons enabled for this client and their associated configurations.
        /// </summary>
        [Input("addons")]
        public Input<Inputs.ClientAddonsGetArgs>? Addons { get; set; }

        [Input("allowedClients")]
        private InputList<string>? _allowedClients;

        /// <summary>
        /// List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
        /// </summary>
        public InputList<string> AllowedClients
        {
            get => _allowedClients ?? (_allowedClients = new InputList<string>());
            set => _allowedClients = value;
        }

        [Input("allowedLogoutUrls")]
        private InputList<string>? _allowedLogoutUrls;

        /// <summary>
        /// URLs that Auth0 may redirect to after logout.
        /// </summary>
        public InputList<string> AllowedLogoutUrls
        {
            get => _allowedLogoutUrls ?? (_allowedLogoutUrls = new InputList<string>());
            set => _allowedLogoutUrls = value;
        }

        [Input("allowedOrigins")]
        private InputList<string>? _allowedOrigins;

        /// <summary>
        /// URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
        /// </summary>
        public InputList<string> AllowedOrigins
        {
            get => _allowedOrigins ?? (_allowedOrigins = new InputList<string>());
            set => _allowedOrigins = value;
        }

        /// <summary>
        /// Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
        /// </summary>
        [Input("appType")]
        public Input<string>? AppType { get; set; }

        [Input("callbacks")]
        private InputList<string>? _callbacks;

        /// <summary>
        /// URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
        /// </summary>
        public InputList<string> Callbacks
        {
            get => _callbacks ?? (_callbacks = new InputList<string>());
            set => _callbacks = value;
        }

        [Input("clientAliases")]
        private InputList<string>? _clientAliases;

        /// <summary>
        /// List of audiences/realms for SAML protocol. Used by the wsfed addon.
        /// </summary>
        public InputList<string> ClientAliases
        {
            get => _clientAliases ?? (_clientAliases = new InputList<string>());
            set => _clientAliases = value;
        }

        /// <summary>
        /// The ID of the client.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientMetadata")]
        private InputMap<object>? _clientMetadata;

        /// <summary>
        /// Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()&lt;&gt;@ [Tab] [Space]`.
        /// </summary>
        public InputMap<object> ClientMetadata
        {
            get => _clientMetadata ?? (_clientMetadata = new InputMap<object>());
            set => _clientMetadata = value;
        }

        [Input("clientSecret")]
        private Input<string>? _clientSecret;

        /// <summary>
        /// Secret for the client. Keep this private. To access this attribute you need to add the `read:client_keys` scope to the
        /// Terraform client. Otherwise, the attribute will contain an empty string.
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("clientSecretRotationTrigger")]
        private InputMap<object>? _clientSecretRotationTrigger;

        /// <summary>
        /// Custom metadata for the rotation. The contents of this map are arbitrary and are hashed by the provider. When the hash changes, a rotation is triggered. For example, the map could contain the user making the change, the date of the change, and a text reason for the change. For more info: [rotate-client-secret](https://auth0.com/docs/get-started/applications/rotate-client-secret).
        /// </summary>
        public InputMap<object> ClientSecretRotationTrigger
        {
            get => _clientSecretRotationTrigger ?? (_clientSecretRotationTrigger = new InputMap<object>());
            set => _clientSecretRotationTrigger = value;
        }

        /// <summary>
        /// Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`). Requires the `coa_toggle_enabled` feature flag to be enabled on the tenant by the support team.
        /// </summary>
        [Input("crossOriginAuth")]
        public Input<bool>? CrossOriginAuth { get; set; }

        /// <summary>
        /// URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
        /// </summary>
        [Input("crossOriginLoc")]
        public Input<string>? CrossOriginLoc { get; set; }

        /// <summary>
        /// The content (HTML, CSS, JS) of the custom login page.
        /// </summary>
        [Input("customLoginPage")]
        public Input<string>? CustomLoginPage { get; set; }

        /// <summary>
        /// Indicates whether a custom login page is to be used.
        /// </summary>
        [Input("customLoginPageOn")]
        public Input<bool>? CustomLoginPageOn { get; set; }

        /// <summary>
        /// Description of the purpose of the client.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("encryptionKey")]
        private InputMap<string>? _encryptionKey;

        /// <summary>
        /// Encryption used for WS-Fed responses with this client.
        /// </summary>
        public InputMap<string> EncryptionKey
        {
            get => _encryptionKey ?? (_encryptionKey = new InputMap<string>());
            set => _encryptionKey = value;
        }

        /// <summary>
        /// HTML form template to be used for WS-Federation.
        /// </summary>
        [Input("formTemplate")]
        public Input<string>? FormTemplate { get; set; }

        [Input("grantTypes")]
        private InputList<string>? _grantTypes;

        /// <summary>
        /// Types of grants that this client is authorized to use.
        /// </summary>
        public InputList<string> GrantTypes
        {
            get => _grantTypes ?? (_grantTypes = new InputList<string>());
            set => _grantTypes = value;
        }

        /// <summary>
        /// Initiate login URI. Must be HTTPS or an empty string.
        /// </summary>
        [Input("initiateLoginUri")]
        public Input<string>? InitiateLoginUri { get; set; }

        /// <summary>
        /// Indicates whether this client is a first-party client.
        /// </summary>
        [Input("isFirstParty")]
        public Input<bool>? IsFirstParty { get; set; }

        /// <summary>
        /// Indicates whether the token endpoint IP header is trusted.
        /// </summary>
        [Input("isTokenEndpointIpHeaderTrusted")]
        public Input<bool>? IsTokenEndpointIpHeaderTrusted { get; set; }

        /// <summary>
        /// Configuration settings for the JWTs issued for this client.
        /// </summary>
        [Input("jwtConfiguration")]
        public Input<Inputs.ClientJwtConfigurationGetArgs>? JwtConfiguration { get; set; }

        /// <summary>
        /// URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
        /// </summary>
        [Input("logoUri")]
        public Input<string>? LogoUri { get; set; }

        /// <summary>
        /// Additional configuration for native mobile apps.
        /// </summary>
        [Input("mobile")]
        public Input<Inputs.ClientMobileGetArgs>? Mobile { get; set; }

        /// <summary>
        /// Name of the client.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `app_type`.
        /// </summary>
        [Input("nativeSocialLogin")]
        public Input<Inputs.ClientNativeSocialLoginGetArgs>? NativeSocialLogin { get; set; }

        /// <summary>
        /// Indicates whether this client will conform to strict OIDC specifications.
        /// </summary>
        [Input("oidcConformant")]
        public Input<bool>? OidcConformant { get; set; }

        /// <summary>
        /// Defines how to proceed during an authentication transaction when `organization_usage = "require"`. Can be `no_prompt` (default) or `pre_login_prompt`.
        /// </summary>
        [Input("organizationRequireBehavior")]
        public Input<string>? OrganizationRequireBehavior { get; set; }

        /// <summary>
        /// Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
        /// </summary>
        [Input("organizationUsage")]
        public Input<string>? OrganizationUsage { get; set; }

        /// <summary>
        /// Configuration settings for the refresh tokens issued for this client.
        /// </summary>
        [Input("refreshToken")]
        public Input<Inputs.ClientRefreshTokenGetArgs>? RefreshToken { get; set; }

        [Input("signingKeys")]
        private InputList<ImmutableDictionary<string, object>>? _signingKeys;

        /// <summary>
        /// List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
        /// </summary>
        public InputList<ImmutableDictionary<string, object>> SigningKeys
        {
            get => _signingKeys ?? (_signingKeys = new InputList<ImmutableDictionary<string, object>>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableArray.Create<ImmutableDictionary<string, object>>());
                _signingKeys = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
        /// </summary>
        [Input("sso")]
        public Input<bool>? Sso { get; set; }

        /// <summary>
        /// Indicates whether or not SSO is disabled.
        /// </summary>
        [Input("ssoDisabled")]
        public Input<bool>? SsoDisabled { get; set; }

        /// <summary>
        /// Defines the requested authentication method for the token endpoint. Options include `none` (public client without a client secret), `client_secret_post` (client uses HTTP POST parameters), `client_secret_basic` (client uses HTTP Basic).
        /// </summary>
        [Input("tokenEndpointAuthMethod")]
        public Input<string>? TokenEndpointAuthMethod { get; set; }

        [Input("webOrigins")]
        private InputList<string>? _webOrigins;

        /// <summary>
        /// URLs that represent valid web origins for use with web message response mode.
        /// </summary>
        public InputList<string> WebOrigins
        {
            get => _webOrigins ?? (_webOrigins = new InputList<string>());
            set => _webOrigins = value;
        }

        public ClientState()
        {
            Description = "Managed by Pulumi";
        }
        public static new ClientState Empty => new ClientState();
    }
}
