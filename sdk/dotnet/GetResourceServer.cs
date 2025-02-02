// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetResourceServer
    {
        /// <summary>
        /// Data source to retrieve a specific Auth0 resource server by `resource_server_id` or `identifier`.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Auth0 = Pulumi.Auth0;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var some_resource_server_by_identifier = Auth0.GetResourceServer.Invoke(new()
        ///     {
        ///         Identifier = "https://my-api.com/v1",
        ///     });
        /// 
        ///     var some_resource_server_by_id = Auth0.GetResourceServer.Invoke(new()
        ///     {
        ///         ResourceServerId = "abcdefghkijklmnopqrstuvwxyz0123456789",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetResourceServerResult> InvokeAsync(GetResourceServerArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetResourceServerResult>("auth0:index/getResourceServer:getResourceServer", args ?? new GetResourceServerArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a specific Auth0 resource server by `resource_server_id` or `identifier`.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Auth0 = Pulumi.Auth0;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var some_resource_server_by_identifier = Auth0.GetResourceServer.Invoke(new()
        ///     {
        ///         Identifier = "https://my-api.com/v1",
        ///     });
        /// 
        ///     var some_resource_server_by_id = Auth0.GetResourceServer.Invoke(new()
        ///     {
        ///         ResourceServerId = "abcdefghkijklmnopqrstuvwxyz0123456789",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetResourceServerResult> Invoke(GetResourceServerInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetResourceServerResult>("auth0:index/getResourceServer:getResourceServer", args ?? new GetResourceServerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetResourceServerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
        /// </summary>
        [Input("identifier")]
        public string? Identifier { get; set; }

        /// <summary>
        /// The ID of the resource server. If not provided, `identifier` must be set.
        /// </summary>
        [Input("resourceServerId")]
        public string? ResourceServerId { get; set; }

        public GetResourceServerArgs()
        {
        }
        public static new GetResourceServerArgs Empty => new GetResourceServerArgs();
    }

    public sealed class GetResourceServerInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// The ID of the resource server. If not provided, `identifier` must be set.
        /// </summary>
        [Input("resourceServerId")]
        public Input<string>? ResourceServerId { get; set; }

        public GetResourceServerInvokeArgs()
        {
        }
        public static new GetResourceServerInvokeArgs Empty => new GetResourceServerInvokeArgs();
    }


    [OutputType]
    public sealed class GetResourceServerResult
    {
        /// <summary>
        /// Indicates whether refresh tokens can be issued for this resource server.
        /// </summary>
        public readonly bool AllowOfflineAccess;
        /// <summary>
        /// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
        /// </summary>
        public readonly bool EnforcePolicies;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
        /// </summary>
        public readonly string? Identifier;
        /// <summary>
        /// Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ID of the resource server. If not provided, `identifier` must be set.
        /// </summary>
        public readonly string? ResourceServerId;
        /// <summary>
        /// List of permissions (scopes) used by this resource server.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetResourceServerScopeResult> Scopes;
        /// <summary>
        /// Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        /// </summary>
        public readonly string SigningAlg;
        /// <summary>
        /// Secret used to sign tokens when using symmetric algorithms (HS256).
        /// </summary>
        public readonly string SigningSecret;
        /// <summary>
        /// Indicates whether to skip user consent for applications flagged as first party.
        /// </summary>
        public readonly bool SkipConsentForVerifiableFirstPartyClients;
        /// <summary>
        /// Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz`. If this setting is set to `access_token_authz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforce_policies`) is enabled for this API.
        /// </summary>
        public readonly string TokenDialect;
        /// <summary>
        /// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        /// </summary>
        public readonly int TokenLifetime;
        /// <summary>
        /// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        /// </summary>
        public readonly int TokenLifetimeForWeb;
        /// <summary>
        /// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
        /// </summary>
        public readonly string VerificationLocation;

        [OutputConstructor]
        private GetResourceServerResult(
            bool allowOfflineAccess,

            bool enforcePolicies,

            string id,

            string? identifier,

            string name,

            string? resourceServerId,

            ImmutableArray<Outputs.GetResourceServerScopeResult> scopes,

            string signingAlg,

            string signingSecret,

            bool skipConsentForVerifiableFirstPartyClients,

            string tokenDialect,

            int tokenLifetime,

            int tokenLifetimeForWeb,

            string verificationLocation)
        {
            AllowOfflineAccess = allowOfflineAccess;
            EnforcePolicies = enforcePolicies;
            Id = id;
            Identifier = identifier;
            Name = name;
            ResourceServerId = resourceServerId;
            Scopes = scopes;
            SigningAlg = signingAlg;
            SigningSecret = signingSecret;
            SkipConsentForVerifiableFirstPartyClients = skipConsentForVerifiableFirstPartyClients;
            TokenDialect = tokenDialect;
            TokenLifetime = tokenLifetime;
            TokenLifetimeForWeb = tokenLifetimeForWeb;
            VerificationLocation = verificationLocation;
        }
    }
}
