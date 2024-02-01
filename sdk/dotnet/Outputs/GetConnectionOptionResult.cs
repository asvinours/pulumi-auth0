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
    public sealed class GetConnectionOptionResult
    {
        /// <summary>
        /// ADFS URL where to fetch the metadata source.
        /// </summary>
        public readonly string AdfsServer;
        /// <summary>
        /// List of allowed audiences.
        /// </summary>
        public readonly ImmutableArray<string> AllowedAudiences;
        /// <summary>
        /// Enable API Access to users.
        /// </summary>
        public readonly bool ApiEnableUsers;
        /// <summary>
        /// App ID.
        /// </summary>
        public readonly string AppId;
        /// <summary>
        /// OpenID Connect and Okta Workforce connections can automatically map claims received from the identity provider (IdP). You can configure this mapping through a library template provided by Auth0 or by entering your own template directly. Click [here](https://auth0.com/docs/authenticate/identity-providers/enterprise-identity-providers/configure-pkce-claim-mapping-for-oidc#map-claims-for-oidc-connections) for more info.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionAttributeMapResult> AttributeMaps;
        /// <summary>
        /// Query string parameters to be included as part of the generated passwordless email link.
        /// </summary>
        public readonly ImmutableDictionary<string, string> AuthParams;
        /// <summary>
        /// Authorization endpoint.
        /// </summary>
        public readonly string AuthorizationEndpoint;
        /// <summary>
        /// Indicates whether to enable brute force protection, which will limit the number of signups and failed logins from a suspicious IP address.
        /// </summary>
        public readonly bool BruteForceProtection;
        /// <summary>
        /// The strategy's client ID.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The strategy's client secret.
        /// </summary>
        public readonly string ClientSecret;
        /// <summary>
        /// Salesforce community base URL.
        /// </summary>
        public readonly string CommunityBaseUrl;
        /// <summary>
        /// A case-sensitive map of key value pairs used as configuration variables for the `custom_script`.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Configuration;
        /// <summary>
        /// Proof Key for Code Exchange (PKCE) configuration settings for an OIDC or Okta Workforce connection.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionConnectionSettingResult> ConnectionSettings;
        /// <summary>
        /// A map of scripts used to integrate with a custom database.
        /// </summary>
        public readonly ImmutableDictionary<string, string> CustomScripts;
        /// <summary>
        /// When enabled, additional debug information will be generated.
        /// </summary>
        public readonly bool Debug;
        /// <summary>
        /// The key used to decrypt encrypted responses from the connection. Uses the `key` and `cert` properties to provide the private key and certificate respectively.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionDecryptionKeyResult> DecryptionKeys;
        /// <summary>
        /// Sign Request Algorithm Digest.
        /// </summary>
        public readonly string DigestAlgorithm;
        /// <summary>
        /// Indicates whether to disable the cache or not.
        /// </summary>
        public readonly bool DisableCache;
        /// <summary>
        /// Indicates whether to remove the forgot password link within the New Universal Login.
        /// </summary>
        public readonly bool DisableSelfServiceChangePassword;
        /// <summary>
        /// When enabled, will disable sign out.
        /// </summary>
        public readonly bool DisableSignOut;
        /// <summary>
        /// Indicates whether to allow user sign-ups to your application.
        /// </summary>
        public readonly bool DisableSignup;
        /// <summary>
        /// OpenID discovery URL, e.g. `https://auth.example.com/.well-known/openid-configuration`.
        /// </summary>
        public readonly string DiscoveryUrl;
        /// <summary>
        /// Domain name.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// List of the domains that can be authenticated using the identity provider. Only needed for Identifier First authentication flows.
        /// </summary>
        public readonly ImmutableArray<string> DomainAliases;
        /// <summary>
        /// Set to `true` to inject context into custom DB scripts (warning: cannot be disabled once enabled).
        /// </summary>
        public readonly bool EnableScriptContext;
        /// <summary>
        /// Set to `true` to use a legacy user store.
        /// </summary>
        public readonly bool EnabledDatabaseCustomization;
        /// <summary>
        /// Custom Entity ID for the connection.
        /// </summary>
        public readonly string EntityId;
        /// <summary>
        /// Federation Metadata for the ADFS connection.
        /// </summary>
        public readonly string FedMetadataXml;
        /// <summary>
        /// If you're configuring a SAML enterprise connection for a non-standard PingFederate Server, you must update the attribute mappings.
        /// </summary>
        public readonly string FieldsMap;
        /// <summary>
        /// Specifies whether or not request info should be forwarded to sms gateway.
        /// </summary>
        public readonly bool ForwardRequestInfo;
        /// <summary>
        /// Address to use as the sender.
        /// </summary>
        public readonly string From;
        /// <summary>
        /// Defines the parameters used to generate the auth token for the custom gateway.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionGatewayAuthenticationResult> GatewayAuthentications;
        /// <summary>
        /// Defines a custom sms gateway to use instead of Twilio.
        /// </summary>
        public readonly string GatewayUrl;
        /// <summary>
        /// Icon URL.
        /// </summary>
        public readonly string IconUrl;
        /// <summary>
        /// Azure AD Identity API. Available options are: `microsoft-identity-platform-v2.0` or `azure-active-directory-v1.0`.
        /// </summary>
        public readonly string IdentityApi;
        /// <summary>
        /// Configuration options for IDP Initiated Authentication. This is an object with the properties: `client_id`, `client_protocol`, and `client_authorize_query`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionIdpInitiatedResult> IdpInitiateds;
        /// <summary>
        /// Indicates whether you have a legacy user store and want to gradually migrate those users to the Auth0 user store.
        /// </summary>
        public readonly bool ImportMode;
        /// <summary>
        /// A list of IPs.
        /// </summary>
        public readonly ImmutableArray<string> Ips;
        /// <summary>
        /// Issuer URL, e.g. `https://auth.example.com`.
        /// </summary>
        public readonly string Issuer;
        /// <summary>
        /// JWKS URI.
        /// </summary>
        public readonly string JwksUri;
        /// <summary>
        /// Apple Key ID.
        /// </summary>
        public readonly string KeyId;
        /// <summary>
        /// By default Auth0 maps `user_id` to `email`. Enabling this setting changes the behavior to map `user_id` to 'id' instead. This can only be defined on a new Google Workspace connection and can not be changed once set.
        /// </summary>
        public readonly bool MapUserIdToId;
        /// <summary>
        /// Maximum number of groups to retrieve.
        /// </summary>
        public readonly string MaxGroupsToRetrieve;
        /// <summary>
        /// SID for Copilot. Used when SMS Source is Copilot.
        /// </summary>
        public readonly string MessagingServiceSid;
        /// <summary>
        /// The URL of the SAML metadata document.
        /// </summary>
        public readonly string MetadataUrl;
        /// <summary>
        /// The XML content for the SAML metadata document. Values within the xml will take precedence over other attributes set on the options block.
        /// </summary>
        public readonly string MetadataXml;
        /// <summary>
        /// Configuration options for multifactor authentication.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionMfaResult> Mfas;
        /// <summary>
        /// The public name of the email or SMS Connection. In most cases this is the same name as the connection name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// If there are user fields that should not be stored in Auth0 databases due to privacy reasons, you can add them to the DenyList here.
        /// </summary>
        public readonly ImmutableArray<string> NonPersistentAttrs;
        /// <summary>
        /// Configuration settings for password complexity.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionPasswordComplexityOptionResult> PasswordComplexityOptions;
        /// <summary>
        /// Configuration settings for the password dictionary check, which does not allow passwords that are part of the password dictionary.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionPasswordDictionaryResult> PasswordDictionaries;
        /// <summary>
        /// Configuration settings for the password history that is maintained for each user to prevent the reuse of passwords.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionPasswordHistoryResult> PasswordHistories;
        /// <summary>
        /// Configuration settings for the password personal info check, which does not allow passwords that contain any part of the user's personal data, including user's `name`, `username`, `nickname`, `user_metadata.name`, `user_metadata.first`, `user_metadata.last`, user's `email`, or first part of the user's `email`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionPasswordNoPersonalInfoResult> PasswordNoPersonalInfos;
        /// <summary>
        /// Indicates level of password strength to enforce during authentication. A strong password policy will make it difficult, if not improbable, for someone to guess a password through either manual or automated means. Options include `none`, `low`, `fair`, `good`, `excellent`.
        /// </summary>
        public readonly string PasswordPolicy;
        /// <summary>
        /// Ping Federate Server URL.
        /// </summary>
        public readonly string PingFederateBaseUrl;
        /// <summary>
        /// Enables Proof Key for Code Exchange (PKCE) functionality for OAuth2 connections.
        /// </summary>
        public readonly bool PkceEnabled;
        /// <summary>
        /// The SAML Response Binding: how the SAML token is received by Auth0 from the IdP.
        /// </summary>
        public readonly string ProtocolBinding;
        /// <summary>
        /// Defines the custom `sms_gateway` provider.
        /// </summary>
        public readonly string Provider;
        /// <summary>
        /// Template that formats the SAML request.
        /// </summary>
        public readonly string RequestTemplate;
        /// <summary>
        /// Indicates whether the user is required to provide a username in addition to an email address.
        /// </summary>
        public readonly bool RequiresUsername;
        /// <summary>
        /// Permissions to grant to the connection. Within the Auth0 dashboard these appear under the "Attributes" and "Extended Attributes" sections. Some examples: `basic_profile`, `ext_profile`, `ext_nested_groups`, etc.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        /// <summary>
        /// A map of scripts used for an OAuth connection. Only accepts a `fetchUserProfile` script.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Scripts;
        /// <summary>
        /// Determines whether to sync user profile attributes (`name`, `given_name`, `family_name`, `nickname`, `picture`) at each login or only on the first login. Options include: `on_each_login`, `on_first_login`. Default value: `on_each_login`.
        /// </summary>
        public readonly string SetUserRootAttributes;
        /// <summary>
        /// Choose how Auth0 sets the email_verified field in the user profile.
        /// </summary>
        public readonly string ShouldTrustEmailVerifiedConnection;
        /// <summary>
        /// SAML single login URL for the connection.
        /// </summary>
        public readonly string SignInEndpoint;
        /// <summary>
        /// SAML single logout URL for the connection.
        /// </summary>
        public readonly string SignOutEndpoint;
        /// <summary>
        /// When enabled, the SAML authentication request will be signed.
        /// </summary>
        public readonly bool SignSamlRequest;
        /// <summary>
        /// Sign Request Algorithm.
        /// </summary>
        public readonly string SignatureAlgorithm;
        /// <summary>
        /// X.509 signing certificate (encoded in PEM or CER) you retrieved from the IdP, Base64-encoded.
        /// </summary>
        public readonly string SigningCert;
        /// <summary>
        /// The key used to sign requests in the connection. Uses the `key` and `cert` properties to provide the private key and certificate respectively.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionSigningKeyResult> SigningKeys;
        /// <summary>
        /// Version 1 is deprecated, use version 2.
        /// </summary>
        public readonly int StrategyVersion;
        /// <summary>
        /// Subject line of the email.
        /// </summary>
        public readonly string Subject;
        /// <summary>
        /// Syntax of the template body.
        /// </summary>
        public readonly string Syntax;
        /// <summary>
        /// Apple Team ID.
        /// </summary>
        public readonly string TeamId;
        /// <summary>
        /// Body of the template.
        /// </summary>
        public readonly string Template;
        /// <summary>
        /// Tenant domain name.
        /// </summary>
        public readonly string TenantDomain;
        /// <summary>
        /// Token endpoint.
        /// </summary>
        public readonly string TokenEndpoint;
        /// <summary>
        /// Configuration options for one-time passwords.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionTotpResult> Totps;
        /// <summary>
        /// SID for your Twilio account.
        /// </summary>
        public readonly string TwilioSid;
        /// <summary>
        /// AuthToken for your Twilio account.
        /// </summary>
        public readonly string TwilioToken;
        /// <summary>
        /// Value can be `back_channel` or `front_channel`. Front Channel will use OIDC protocol with `response_mode=form_post` and `response_type=id_token`. Back Channel will use `response_type=code`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// You can pass provider-specific parameters to an identity provider during authentication. The values can either be static per connection or dynamic per user.
        /// </summary>
        public readonly string UpstreamParams;
        /// <summary>
        /// Indicates whether to use cert auth or not.
        /// </summary>
        public readonly bool UseCertAuth;
        /// <summary>
        /// Indicates whether to use Kerberos or not.
        /// </summary>
        public readonly bool UseKerberos;
        /// <summary>
        /// Whether to use WS-Fed.
        /// </summary>
        public readonly bool UseWsfed;
        /// <summary>
        /// Attribute in the SAML token that will be mapped to the user_id property in Auth0.
        /// </summary>
        public readonly string UserIdAttribute;
        /// <summary>
        /// User info endpoint.
        /// </summary>
        public readonly string UserinfoEndpoint;
        /// <summary>
        /// Validation of the minimum and maximum values allowed for a user to have as username.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionValidationResult> Validations;
        /// <summary>
        /// Indicates whether to use the common endpoint rather than the default endpoint. Typically enabled if you're using this for a multi-tenant application in Azure AD.
        /// </summary>
        public readonly bool WaadCommonEndpoint;
        /// <summary>
        /// Protocol to use.
        /// </summary>
        public readonly string WaadProtocol;

        [OutputConstructor]
        private GetConnectionOptionResult(
            string adfsServer,

            ImmutableArray<string> allowedAudiences,

            bool apiEnableUsers,

            string appId,

            ImmutableArray<Outputs.GetConnectionOptionAttributeMapResult> attributeMaps,

            ImmutableDictionary<string, string> authParams,

            string authorizationEndpoint,

            bool bruteForceProtection,

            string clientId,

            string clientSecret,

            string communityBaseUrl,

            ImmutableDictionary<string, object> configuration,

            ImmutableArray<Outputs.GetConnectionOptionConnectionSettingResult> connectionSettings,

            ImmutableDictionary<string, string> customScripts,

            bool debug,

            ImmutableArray<Outputs.GetConnectionOptionDecryptionKeyResult> decryptionKeys,

            string digestAlgorithm,

            bool disableCache,

            bool disableSelfServiceChangePassword,

            bool disableSignOut,

            bool disableSignup,

            string discoveryUrl,

            string domain,

            ImmutableArray<string> domainAliases,

            bool enableScriptContext,

            bool enabledDatabaseCustomization,

            string entityId,

            string fedMetadataXml,

            string fieldsMap,

            bool forwardRequestInfo,

            string from,

            ImmutableArray<Outputs.GetConnectionOptionGatewayAuthenticationResult> gatewayAuthentications,

            string gatewayUrl,

            string iconUrl,

            string identityApi,

            ImmutableArray<Outputs.GetConnectionOptionIdpInitiatedResult> idpInitiateds,

            bool importMode,

            ImmutableArray<string> ips,

            string issuer,

            string jwksUri,

            string keyId,

            bool mapUserIdToId,

            string maxGroupsToRetrieve,

            string messagingServiceSid,

            string metadataUrl,

            string metadataXml,

            ImmutableArray<Outputs.GetConnectionOptionMfaResult> mfas,

            string name,

            ImmutableArray<string> nonPersistentAttrs,

            ImmutableArray<Outputs.GetConnectionOptionPasswordComplexityOptionResult> passwordComplexityOptions,

            ImmutableArray<Outputs.GetConnectionOptionPasswordDictionaryResult> passwordDictionaries,

            ImmutableArray<Outputs.GetConnectionOptionPasswordHistoryResult> passwordHistories,

            ImmutableArray<Outputs.GetConnectionOptionPasswordNoPersonalInfoResult> passwordNoPersonalInfos,

            string passwordPolicy,

            string pingFederateBaseUrl,

            bool pkceEnabled,

            string protocolBinding,

            string provider,

            string requestTemplate,

            bool requiresUsername,

            ImmutableArray<string> scopes,

            ImmutableDictionary<string, string> scripts,

            string setUserRootAttributes,

            string shouldTrustEmailVerifiedConnection,

            string signInEndpoint,

            string signOutEndpoint,

            bool signSamlRequest,

            string signatureAlgorithm,

            string signingCert,

            ImmutableArray<Outputs.GetConnectionOptionSigningKeyResult> signingKeys,

            int strategyVersion,

            string subject,

            string syntax,

            string teamId,

            string template,

            string tenantDomain,

            string tokenEndpoint,

            ImmutableArray<Outputs.GetConnectionOptionTotpResult> totps,

            string twilioSid,

            string twilioToken,

            string type,

            string upstreamParams,

            bool useCertAuth,

            bool useKerberos,

            bool useWsfed,

            string userIdAttribute,

            string userinfoEndpoint,

            ImmutableArray<Outputs.GetConnectionOptionValidationResult> validations,

            bool waadCommonEndpoint,

            string waadProtocol)
        {
            AdfsServer = adfsServer;
            AllowedAudiences = allowedAudiences;
            ApiEnableUsers = apiEnableUsers;
            AppId = appId;
            AttributeMaps = attributeMaps;
            AuthParams = authParams;
            AuthorizationEndpoint = authorizationEndpoint;
            BruteForceProtection = bruteForceProtection;
            ClientId = clientId;
            ClientSecret = clientSecret;
            CommunityBaseUrl = communityBaseUrl;
            Configuration = configuration;
            ConnectionSettings = connectionSettings;
            CustomScripts = customScripts;
            Debug = debug;
            DecryptionKeys = decryptionKeys;
            DigestAlgorithm = digestAlgorithm;
            DisableCache = disableCache;
            DisableSelfServiceChangePassword = disableSelfServiceChangePassword;
            DisableSignOut = disableSignOut;
            DisableSignup = disableSignup;
            DiscoveryUrl = discoveryUrl;
            Domain = domain;
            DomainAliases = domainAliases;
            EnableScriptContext = enableScriptContext;
            EnabledDatabaseCustomization = enabledDatabaseCustomization;
            EntityId = entityId;
            FedMetadataXml = fedMetadataXml;
            FieldsMap = fieldsMap;
            ForwardRequestInfo = forwardRequestInfo;
            From = from;
            GatewayAuthentications = gatewayAuthentications;
            GatewayUrl = gatewayUrl;
            IconUrl = iconUrl;
            IdentityApi = identityApi;
            IdpInitiateds = idpInitiateds;
            ImportMode = importMode;
            Ips = ips;
            Issuer = issuer;
            JwksUri = jwksUri;
            KeyId = keyId;
            MapUserIdToId = mapUserIdToId;
            MaxGroupsToRetrieve = maxGroupsToRetrieve;
            MessagingServiceSid = messagingServiceSid;
            MetadataUrl = metadataUrl;
            MetadataXml = metadataXml;
            Mfas = mfas;
            Name = name;
            NonPersistentAttrs = nonPersistentAttrs;
            PasswordComplexityOptions = passwordComplexityOptions;
            PasswordDictionaries = passwordDictionaries;
            PasswordHistories = passwordHistories;
            PasswordNoPersonalInfos = passwordNoPersonalInfos;
            PasswordPolicy = passwordPolicy;
            PingFederateBaseUrl = pingFederateBaseUrl;
            PkceEnabled = pkceEnabled;
            ProtocolBinding = protocolBinding;
            Provider = provider;
            RequestTemplate = requestTemplate;
            RequiresUsername = requiresUsername;
            Scopes = scopes;
            Scripts = scripts;
            SetUserRootAttributes = setUserRootAttributes;
            ShouldTrustEmailVerifiedConnection = shouldTrustEmailVerifiedConnection;
            SignInEndpoint = signInEndpoint;
            SignOutEndpoint = signOutEndpoint;
            SignSamlRequest = signSamlRequest;
            SignatureAlgorithm = signatureAlgorithm;
            SigningCert = signingCert;
            SigningKeys = signingKeys;
            StrategyVersion = strategyVersion;
            Subject = subject;
            Syntax = syntax;
            TeamId = teamId;
            Template = template;
            TenantDomain = tenantDomain;
            TokenEndpoint = tokenEndpoint;
            Totps = totps;
            TwilioSid = twilioSid;
            TwilioToken = twilioToken;
            Type = type;
            UpstreamParams = upstreamParams;
            UseCertAuth = useCertAuth;
            UseKerberos = useKerberos;
            UseWsfed = useWsfed;
            UserIdAttribute = userIdAttribute;
            UserinfoEndpoint = userinfoEndpoint;
            Validations = validations;
            WaadCommonEndpoint = waadCommonEndpoint;
            WaadProtocol = waadProtocol;
        }
    }
}
