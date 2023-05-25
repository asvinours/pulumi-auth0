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
    /// With this resource, you can manage scopes (permissions) associated with a resource server (API).
    /// 
    /// !&gt; To prevent issues, avoid using this resource together with the `auth0.ResourceServerScopes` resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var resourceServer = new Auth0.ResourceServer("resourceServer", new()
    ///     {
    ///         Identifier = "https://api.example.com",
    ///     });
    /// 
    ///     var readPosts = new Auth0.ResourceServerScope("readPosts", new()
    ///     {
    ///         ResourceServerIdentifier = resourceServer.Identifier,
    ///         Scope = "read:posts",
    ///     });
    /// 
    ///     var writePosts = new Auth0.ResourceServerScope("writePosts", new()
    ///     {
    ///         ResourceServerIdentifier = resourceServer.Identifier,
    ///         Scope = "write:posts",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the resource identifier and scope name separated by "::" (note the double colon) &lt;resourceServerIdentifier&gt;::&lt;scope&gt; # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/resourceServerScope:ResourceServerScope scope "https://api.travel0.com/v1::read:posts"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/resourceServerScope:ResourceServerScope")]
    public partial class ResourceServerScope : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the scope (permission).
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Identifier of the resource server that the scope (permission) is associated with.
        /// </summary>
        [Output("resourceServerIdentifier")]
        public Output<string> ResourceServerIdentifier { get; private set; } = null!;

        /// <summary>
        /// Name of the scope (permission).
        /// </summary>
        [Output("scope")]
        public Output<string> Scope { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceServerScope resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceServerScope(string name, ResourceServerScopeArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/resourceServerScope:ResourceServerScope", name, args ?? new ResourceServerScopeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourceServerScope(string name, Input<string> id, ResourceServerScopeState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/resourceServerScope:ResourceServerScope", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourceServerScope resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceServerScope Get(string name, Input<string> id, ResourceServerScopeState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourceServerScope(name, id, state, options);
        }
    }

    public sealed class ResourceServerScopeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the scope (permission).
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Identifier of the resource server that the scope (permission) is associated with.
        /// </summary>
        [Input("resourceServerIdentifier", required: true)]
        public Input<string> ResourceServerIdentifier { get; set; } = null!;

        /// <summary>
        /// Name of the scope (permission).
        /// </summary>
        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        public ResourceServerScopeArgs()
        {
        }
        public static new ResourceServerScopeArgs Empty => new ResourceServerScopeArgs();
    }

    public sealed class ResourceServerScopeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the scope (permission).
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Identifier of the resource server that the scope (permission) is associated with.
        /// </summary>
        [Input("resourceServerIdentifier")]
        public Input<string>? ResourceServerIdentifier { get; set; }

        /// <summary>
        /// Name of the scope (permission).
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public ResourceServerScopeState()
        {
        }
        public static new ResourceServerScopeState Empty => new ResourceServerScopeState();
    }
}
