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
        public readonly string AdfsServer;
        public readonly ImmutableArray<string> AllowedAudiences;
        public readonly bool ApiEnableUsers;
        public readonly string AppId;
        public readonly ImmutableArray<Outputs.GetConnectionOptionAttributeMapResult> AttributeMaps;
        public readonly ImmutableDictionary<string, string> AuthParams;
        public readonly string AuthorizationEndpoint;
        public readonly bool BruteForceProtection;
        public readonly string ClientId;
        public readonly string ClientSecret;
        public readonly string CommunityBaseUrl;
        public readonly ImmutableDictionary<string, object> Configuration;
        public readonly ImmutableArray<Outputs.GetConnectionOptionConnectionSettingResult> ConnectionSettings;
        public readonly ImmutableDictionary<string, string> CustomScripts;
        public readonly bool Debug;
        public readonly ImmutableArray<Outputs.GetConnectionOptionDecryptionKeyResult> DecryptionKeys;
        public readonly string DigestAlgorithm;
        public readonly bool DisableCache;
        public readonly bool DisableSelfServiceChangePassword;
        public readonly bool DisableSignOut;
        public readonly bool DisableSignup;
        public readonly string DiscoveryUrl;
        public readonly string Domain;
        public readonly ImmutableArray<string> DomainAliases;
        public readonly bool EnableScriptContext;
        public readonly bool EnabledDatabaseCustomization;
        public readonly string EntityId;
        public readonly string FedMetadataXml;
        public readonly string FieldsMap;
        public readonly bool ForwardRequestInfo;
        public readonly string From;
        public readonly ImmutableArray<Outputs.GetConnectionOptionGatewayAuthenticationResult> GatewayAuthentications;
        public readonly string GatewayUrl;
        public readonly string IconUrl;
        public readonly string IdentityApi;
        public readonly ImmutableArray<Outputs.GetConnectionOptionIdpInitiatedResult> IdpInitiateds;
        public readonly bool ImportMode;
        public readonly ImmutableArray<string> Ips;
        public readonly string Issuer;
        public readonly string JwksUri;
        public readonly string KeyId;
        public readonly bool MapUserIdToId;
        public readonly string MaxGroupsToRetrieve;
        public readonly string MessagingServiceSid;
        public readonly string MetadataUrl;
        public readonly string MetadataXml;
        public readonly ImmutableArray<Outputs.GetConnectionOptionMfaResult> Mfas;
        /// <summary>
        /// The name of the connection. If not provided, `connection_id` must be set.
        /// </summary>
        public readonly string Name;
        public readonly ImmutableArray<string> NonPersistentAttrs;
        public readonly ImmutableArray<Outputs.GetConnectionOptionPasswordComplexityOptionResult> PasswordComplexityOptions;
        public readonly ImmutableArray<Outputs.GetConnectionOptionPasswordDictionaryResult> PasswordDictionaries;
        public readonly ImmutableArray<Outputs.GetConnectionOptionPasswordHistoryResult> PasswordHistories;
        public readonly ImmutableArray<Outputs.GetConnectionOptionPasswordNoPersonalInfoResult> PasswordNoPersonalInfos;
        public readonly string PasswordPolicy;
        public readonly string PingFederateBaseUrl;
        public readonly bool PkceEnabled;
        public readonly string ProtocolBinding;
        public readonly string Provider;
        public readonly string RequestTemplate;
        public readonly bool RequiresUsername;
        public readonly ImmutableArray<string> Scopes;
        public readonly ImmutableDictionary<string, string> Scripts;
        public readonly string SetUserRootAttributes;
        public readonly string ShouldTrustEmailVerifiedConnection;
        public readonly string SignInEndpoint;
        public readonly string SignOutEndpoint;
        public readonly bool SignSamlRequest;
        public readonly string SignatureAlgorithm;
        public readonly string SigningCert;
        public readonly ImmutableArray<Outputs.GetConnectionOptionSigningKeyResult> SigningKeys;
        public readonly int StrategyVersion;
        public readonly string Subject;
        public readonly string Syntax;
        public readonly string TeamId;
        public readonly string Template;
        public readonly string TenantDomain;
        public readonly string TokenEndpoint;
        public readonly ImmutableArray<Outputs.GetConnectionOptionTotpResult> Totps;
        public readonly string TwilioSid;
        public readonly string TwilioToken;
        public readonly string Type;
        public readonly string UpstreamParams;
        public readonly bool UseCertAuth;
        public readonly bool UseKerberos;
        public readonly bool UseWsfed;
        public readonly string UserIdAttribute;
        public readonly string UserinfoEndpoint;
        public readonly ImmutableArray<Outputs.GetConnectionOptionValidationResult> Validations;
        public readonly bool WaadCommonEndpoint;
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
