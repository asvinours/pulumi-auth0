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
    /// Hooks are secure, self-contained functions that allow you to customize the behavior of Auth0 when executed for selected extensibility points of the Auth0 platform. Auth0 invokes Hooks during runtime to execute your custom Node.js code. Depending on the extensibility point, you can use Hooks with Database Connections and/or Passwordless Connections.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myHook = new Auth0.Hook("myHook", new()
    ///     {
    ///         Dependencies = 
    ///         {
    ///             { "auth0", "2.30.0" },
    ///         },
    ///         Enabled = true,
    ///         Script = @"    function (user, context, callback) {
    ///       callback(null, { user });
    ///     }
    ///   
    /// ",
    ///         Secrets = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///         TriggerId = "pre-user-registration",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// # A hook can be imported using the hook's ID. # # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/hook:Hook my_hook 00001
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/hook:Hook")]
    public partial class Hook : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Dependencies of this hook used by the WebTask server.
        /// </summary>
        [Output("dependencies")]
        public Output<ImmutableDictionary<string, object>?> Dependencies { get; private set; } = null!;

        /// <summary>
        /// Whether the hook is enabled, or disabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Name of this hook.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Code to be executed when this hook runs.
        /// </summary>
        [Output("script")]
        public Output<string> Script { get; private set; } = null!;

        /// <summary>
        /// The secrets associated with the hook.
        /// </summary>
        [Output("secrets")]
        public Output<ImmutableDictionary<string, object>?> Secrets { get; private set; } = null!;

        /// <summary>
        /// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
        /// </summary>
        [Output("triggerId")]
        public Output<string> TriggerId { get; private set; } = null!;


        /// <summary>
        /// Create a Hook resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Hook(string name, HookArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/hook:Hook", name, args ?? new HookArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Hook(string name, Input<string> id, HookState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/hook:Hook", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Hook resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Hook Get(string name, Input<string> id, HookState? state = null, CustomResourceOptions? options = null)
        {
            return new Hook(name, id, state, options);
        }
    }

    public sealed class HookArgs : global::Pulumi.ResourceArgs
    {
        [Input("dependencies")]
        private InputMap<object>? _dependencies;

        /// <summary>
        /// Dependencies of this hook used by the WebTask server.
        /// </summary>
        public InputMap<object> Dependencies
        {
            get => _dependencies ?? (_dependencies = new InputMap<object>());
            set => _dependencies = value;
        }

        /// <summary>
        /// Whether the hook is enabled, or disabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Name of this hook.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Code to be executed when this hook runs.
        /// </summary>
        [Input("script", required: true)]
        public Input<string> Script { get; set; } = null!;

        [Input("secrets")]
        private InputMap<object>? _secrets;

        /// <summary>
        /// The secrets associated with the hook.
        /// </summary>
        public InputMap<object> Secrets
        {
            get => _secrets ?? (_secrets = new InputMap<object>());
            set => _secrets = value;
        }

        /// <summary>
        /// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
        /// </summary>
        [Input("triggerId", required: true)]
        public Input<string> TriggerId { get; set; } = null!;

        public HookArgs()
        {
        }
        public static new HookArgs Empty => new HookArgs();
    }

    public sealed class HookState : global::Pulumi.ResourceArgs
    {
        [Input("dependencies")]
        private InputMap<object>? _dependencies;

        /// <summary>
        /// Dependencies of this hook used by the WebTask server.
        /// </summary>
        public InputMap<object> Dependencies
        {
            get => _dependencies ?? (_dependencies = new InputMap<object>());
            set => _dependencies = value;
        }

        /// <summary>
        /// Whether the hook is enabled, or disabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Name of this hook.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Code to be executed when this hook runs.
        /// </summary>
        [Input("script")]
        public Input<string>? Script { get; set; }

        [Input("secrets")]
        private InputMap<object>? _secrets;

        /// <summary>
        /// The secrets associated with the hook.
        /// </summary>
        public InputMap<object> Secrets
        {
            get => _secrets ?? (_secrets = new InputMap<object>());
            set => _secrets = value;
        }

        /// <summary>
        /// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
        /// </summary>
        [Input("triggerId")]
        public Input<string>? TriggerId { get; set; }

        public HookState()
        {
        }
        public static new HookState Empty => new HookState();
    }
}
