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
    /// Use a tenant's global Auth0 Application client.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var @global = new Auth0.GlobalClient("global", new Auth0.GlobalClientArgs
    ///         {
    ///             Callbacks = 
    ///             {
    ///                 "http://somehostname.com/a/callback",
    ///             },
    ///             CustomLoginPage = @"&lt;html&gt;
    ///     &lt;head&gt;&lt;title&gt;My Custom Login Page&lt;/title&gt;&lt;/head&gt;
    ///     &lt;body&gt;
    ///         I should probably have a login form here
    ///     &lt;/body&gt;
    /// &lt;/html&gt;
    /// 
    /// ",
    ///             CustomLoginPageOn = true,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// The auth0_global_client can be imported using the client's ID. You can find the ID of the global client by going to the [API Explorer](https://auth0.com/docs/api/management/v2#!/Clients/get_clients) and fetching the clients that have `"global"true`.
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/globalClient:GlobalClient global XaiyAXXXYdXXXXnqjj8HXXXXXT5titww
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/globalClient:GlobalClient")]
    public partial class GlobalClient : Pulumi.CustomResource
    {
        [Output("addons")]
        public Output<Outputs.GlobalClientAddons> Addons { get; private set; } = null!;

        [Output("allowedClients")]
        public Output<ImmutableArray<string>> AllowedClients { get; private set; } = null!;

        [Output("allowedLogoutUrls")]
        public Output<ImmutableArray<string>> AllowedLogoutUrls { get; private set; } = null!;

        [Output("allowedOrigins")]
        public Output<ImmutableArray<string>> AllowedOrigins { get; private set; } = null!;

        [Output("appType")]
        public Output<string> AppType { get; private set; } = null!;

        [Output("callbacks")]
        public Output<ImmutableArray<string>> Callbacks { get; private set; } = null!;

        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        [Output("clientMetadata")]
        public Output<ImmutableDictionary<string, object>> ClientMetadata { get; private set; } = null!;

        [Output("clientSecret")]
        public Output<string> ClientSecret { get; private set; } = null!;

        [Output("clientSecretRotationTrigger")]
        public Output<ImmutableDictionary<string, object>?> ClientSecretRotationTrigger { get; private set; } = null!;

        [Output("crossOriginAuth")]
        public Output<bool> CrossOriginAuth { get; private set; } = null!;

        [Output("crossOriginLoc")]
        public Output<string> CrossOriginLoc { get; private set; } = null!;

        [Output("customLoginPage")]
        public Output<string> CustomLoginPage { get; private set; } = null!;

        [Output("customLoginPageOn")]
        public Output<bool> CustomLoginPageOn { get; private set; } = null!;

        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        [Output("encryptionKey")]
        public Output<ImmutableDictionary<string, string>> EncryptionKey { get; private set; } = null!;

        [Output("formTemplate")]
        public Output<string> FormTemplate { get; private set; } = null!;

        [Output("grantTypes")]
        public Output<ImmutableArray<string>> GrantTypes { get; private set; } = null!;

        [Output("initiateLoginUri")]
        public Output<string> InitiateLoginUri { get; private set; } = null!;

        [Output("isFirstParty")]
        public Output<bool> IsFirstParty { get; private set; } = null!;

        [Output("isTokenEndpointIpHeaderTrusted")]
        public Output<bool> IsTokenEndpointIpHeaderTrusted { get; private set; } = null!;

        [Output("jwtConfiguration")]
        public Output<Outputs.GlobalClientJwtConfiguration> JwtConfiguration { get; private set; } = null!;

        [Output("logoUri")]
        public Output<string> LogoUri { get; private set; } = null!;

        [Output("mobile")]
        public Output<Outputs.GlobalClientMobile> Mobile { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("nativeSocialLogin")]
        public Output<Outputs.GlobalClientNativeSocialLogin> NativeSocialLogin { get; private set; } = null!;

        [Output("oidcConformant")]
        public Output<bool> OidcConformant { get; private set; } = null!;

        [Output("organizationRequireBehavior")]
        public Output<string> OrganizationRequireBehavior { get; private set; } = null!;

        [Output("organizationUsage")]
        public Output<string> OrganizationUsage { get; private set; } = null!;

        [Output("refreshToken")]
        public Output<Outputs.GlobalClientRefreshToken> RefreshToken { get; private set; } = null!;

        [Output("signingKeys")]
        public Output<ImmutableArray<ImmutableDictionary<string, object>>> SigningKeys { get; private set; } = null!;

        [Output("sso")]
        public Output<bool> Sso { get; private set; } = null!;

        [Output("ssoDisabled")]
        public Output<bool> SsoDisabled { get; private set; } = null!;

        [Output("tokenEndpointAuthMethod")]
        public Output<string> TokenEndpointAuthMethod { get; private set; } = null!;

        [Output("webOrigins")]
        public Output<ImmutableArray<string>> WebOrigins { get; private set; } = null!;


        /// <summary>
        /// Create a GlobalClient resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GlobalClient(string name, GlobalClientArgs? args = null, CustomResourceOptions? options = null)
            : base("auth0:index/globalClient:GlobalClient", name, args ?? new GlobalClientArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GlobalClient(string name, Input<string> id, GlobalClientState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/globalClient:GlobalClient", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GlobalClient resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GlobalClient Get(string name, Input<string> id, GlobalClientState? state = null, CustomResourceOptions? options = null)
        {
            return new GlobalClient(name, id, state, options);
        }
    }

    public sealed class GlobalClientArgs : Pulumi.ResourceArgs
    {
        [Input("addons")]
        public Input<Inputs.GlobalClientAddonsArgs>? Addons { get; set; }

        [Input("allowedClients")]
        private InputList<string>? _allowedClients;
        public InputList<string> AllowedClients
        {
            get => _allowedClients ?? (_allowedClients = new InputList<string>());
            set => _allowedClients = value;
        }

        [Input("allowedLogoutUrls")]
        private InputList<string>? _allowedLogoutUrls;
        public InputList<string> AllowedLogoutUrls
        {
            get => _allowedLogoutUrls ?? (_allowedLogoutUrls = new InputList<string>());
            set => _allowedLogoutUrls = value;
        }

        [Input("allowedOrigins")]
        private InputList<string>? _allowedOrigins;
        public InputList<string> AllowedOrigins
        {
            get => _allowedOrigins ?? (_allowedOrigins = new InputList<string>());
            set => _allowedOrigins = value;
        }

        [Input("appType")]
        public Input<string>? AppType { get; set; }

        [Input("callbacks")]
        private InputList<string>? _callbacks;
        public InputList<string> Callbacks
        {
            get => _callbacks ?? (_callbacks = new InputList<string>());
            set => _callbacks = value;
        }

        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientMetadata")]
        private InputMap<object>? _clientMetadata;
        public InputMap<object> ClientMetadata
        {
            get => _clientMetadata ?? (_clientMetadata = new InputMap<object>());
            set => _clientMetadata = value;
        }

        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        [Input("clientSecretRotationTrigger")]
        private InputMap<object>? _clientSecretRotationTrigger;
        public InputMap<object> ClientSecretRotationTrigger
        {
            get => _clientSecretRotationTrigger ?? (_clientSecretRotationTrigger = new InputMap<object>());
            set => _clientSecretRotationTrigger = value;
        }

        [Input("crossOriginAuth")]
        public Input<bool>? CrossOriginAuth { get; set; }

        [Input("crossOriginLoc")]
        public Input<string>? CrossOriginLoc { get; set; }

        [Input("customLoginPage")]
        public Input<string>? CustomLoginPage { get; set; }

        [Input("customLoginPageOn")]
        public Input<bool>? CustomLoginPageOn { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("encryptionKey")]
        private InputMap<string>? _encryptionKey;
        public InputMap<string> EncryptionKey
        {
            get => _encryptionKey ?? (_encryptionKey = new InputMap<string>());
            set => _encryptionKey = value;
        }

        [Input("formTemplate")]
        public Input<string>? FormTemplate { get; set; }

        [Input("grantTypes")]
        private InputList<string>? _grantTypes;
        public InputList<string> GrantTypes
        {
            get => _grantTypes ?? (_grantTypes = new InputList<string>());
            set => _grantTypes = value;
        }

        [Input("initiateLoginUri")]
        public Input<string>? InitiateLoginUri { get; set; }

        [Input("isFirstParty")]
        public Input<bool>? IsFirstParty { get; set; }

        [Input("isTokenEndpointIpHeaderTrusted")]
        public Input<bool>? IsTokenEndpointIpHeaderTrusted { get; set; }

        [Input("jwtConfiguration")]
        public Input<Inputs.GlobalClientJwtConfigurationArgs>? JwtConfiguration { get; set; }

        [Input("logoUri")]
        public Input<string>? LogoUri { get; set; }

        [Input("mobile")]
        public Input<Inputs.GlobalClientMobileArgs>? Mobile { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nativeSocialLogin")]
        public Input<Inputs.GlobalClientNativeSocialLoginArgs>? NativeSocialLogin { get; set; }

        [Input("oidcConformant")]
        public Input<bool>? OidcConformant { get; set; }

        [Input("organizationRequireBehavior")]
        public Input<string>? OrganizationRequireBehavior { get; set; }

        [Input("organizationUsage")]
        public Input<string>? OrganizationUsage { get; set; }

        [Input("refreshToken")]
        public Input<Inputs.GlobalClientRefreshTokenArgs>? RefreshToken { get; set; }

        [Input("signingKeys")]
        private InputList<ImmutableDictionary<string, object>>? _signingKeys;
        public InputList<ImmutableDictionary<string, object>> SigningKeys
        {
            get => _signingKeys ?? (_signingKeys = new InputList<ImmutableDictionary<string, object>>());
            set => _signingKeys = value;
        }

        [Input("sso")]
        public Input<bool>? Sso { get; set; }

        [Input("ssoDisabled")]
        public Input<bool>? SsoDisabled { get; set; }

        [Input("tokenEndpointAuthMethod")]
        public Input<string>? TokenEndpointAuthMethod { get; set; }

        [Input("webOrigins")]
        private InputList<string>? _webOrigins;
        public InputList<string> WebOrigins
        {
            get => _webOrigins ?? (_webOrigins = new InputList<string>());
            set => _webOrigins = value;
        }

        public GlobalClientArgs()
        {
        }
    }

    public sealed class GlobalClientState : Pulumi.ResourceArgs
    {
        [Input("addons")]
        public Input<Inputs.GlobalClientAddonsGetArgs>? Addons { get; set; }

        [Input("allowedClients")]
        private InputList<string>? _allowedClients;
        public InputList<string> AllowedClients
        {
            get => _allowedClients ?? (_allowedClients = new InputList<string>());
            set => _allowedClients = value;
        }

        [Input("allowedLogoutUrls")]
        private InputList<string>? _allowedLogoutUrls;
        public InputList<string> AllowedLogoutUrls
        {
            get => _allowedLogoutUrls ?? (_allowedLogoutUrls = new InputList<string>());
            set => _allowedLogoutUrls = value;
        }

        [Input("allowedOrigins")]
        private InputList<string>? _allowedOrigins;
        public InputList<string> AllowedOrigins
        {
            get => _allowedOrigins ?? (_allowedOrigins = new InputList<string>());
            set => _allowedOrigins = value;
        }

        [Input("appType")]
        public Input<string>? AppType { get; set; }

        [Input("callbacks")]
        private InputList<string>? _callbacks;
        public InputList<string> Callbacks
        {
            get => _callbacks ?? (_callbacks = new InputList<string>());
            set => _callbacks = value;
        }

        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientMetadata")]
        private InputMap<object>? _clientMetadata;
        public InputMap<object> ClientMetadata
        {
            get => _clientMetadata ?? (_clientMetadata = new InputMap<object>());
            set => _clientMetadata = value;
        }

        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        [Input("clientSecretRotationTrigger")]
        private InputMap<object>? _clientSecretRotationTrigger;
        public InputMap<object> ClientSecretRotationTrigger
        {
            get => _clientSecretRotationTrigger ?? (_clientSecretRotationTrigger = new InputMap<object>());
            set => _clientSecretRotationTrigger = value;
        }

        [Input("crossOriginAuth")]
        public Input<bool>? CrossOriginAuth { get; set; }

        [Input("crossOriginLoc")]
        public Input<string>? CrossOriginLoc { get; set; }

        [Input("customLoginPage")]
        public Input<string>? CustomLoginPage { get; set; }

        [Input("customLoginPageOn")]
        public Input<bool>? CustomLoginPageOn { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("encryptionKey")]
        private InputMap<string>? _encryptionKey;
        public InputMap<string> EncryptionKey
        {
            get => _encryptionKey ?? (_encryptionKey = new InputMap<string>());
            set => _encryptionKey = value;
        }

        [Input("formTemplate")]
        public Input<string>? FormTemplate { get; set; }

        [Input("grantTypes")]
        private InputList<string>? _grantTypes;
        public InputList<string> GrantTypes
        {
            get => _grantTypes ?? (_grantTypes = new InputList<string>());
            set => _grantTypes = value;
        }

        [Input("initiateLoginUri")]
        public Input<string>? InitiateLoginUri { get; set; }

        [Input("isFirstParty")]
        public Input<bool>? IsFirstParty { get; set; }

        [Input("isTokenEndpointIpHeaderTrusted")]
        public Input<bool>? IsTokenEndpointIpHeaderTrusted { get; set; }

        [Input("jwtConfiguration")]
        public Input<Inputs.GlobalClientJwtConfigurationGetArgs>? JwtConfiguration { get; set; }

        [Input("logoUri")]
        public Input<string>? LogoUri { get; set; }

        [Input("mobile")]
        public Input<Inputs.GlobalClientMobileGetArgs>? Mobile { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nativeSocialLogin")]
        public Input<Inputs.GlobalClientNativeSocialLoginGetArgs>? NativeSocialLogin { get; set; }

        [Input("oidcConformant")]
        public Input<bool>? OidcConformant { get; set; }

        [Input("organizationRequireBehavior")]
        public Input<string>? OrganizationRequireBehavior { get; set; }

        [Input("organizationUsage")]
        public Input<string>? OrganizationUsage { get; set; }

        [Input("refreshToken")]
        public Input<Inputs.GlobalClientRefreshTokenGetArgs>? RefreshToken { get; set; }

        [Input("signingKeys")]
        private InputList<ImmutableDictionary<string, object>>? _signingKeys;
        public InputList<ImmutableDictionary<string, object>> SigningKeys
        {
            get => _signingKeys ?? (_signingKeys = new InputList<ImmutableDictionary<string, object>>());
            set => _signingKeys = value;
        }

        [Input("sso")]
        public Input<bool>? Sso { get; set; }

        [Input("ssoDisabled")]
        public Input<bool>? SsoDisabled { get; set; }

        [Input("tokenEndpointAuthMethod")]
        public Input<string>? TokenEndpointAuthMethod { get; set; }

        [Input("webOrigins")]
        private InputList<string>? _webOrigins;
        public InputList<string> WebOrigins
        {
            get => _webOrigins ?? (_webOrigins = new InputList<string>());
            set => _webOrigins = value;
        }

        public GlobalClientState()
        {
        }
    }
}
