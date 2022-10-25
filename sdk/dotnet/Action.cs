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
    /// Actions are secure, tenant-specific, versioned functions written in Node.js that execute at certain points during the Auth0 runtime. Actions are used to customize and extend Auth0's capabilities with custom logic.
    /// 
    /// ## Import
    /// 
    /// An action can be imported using the action's ID. # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/action:Action my_action 12f4f21b-017a-319d-92e7-2291c1ca36c4
    /// ```
    /// 
    ///  ~&gt; For security reasons importing `secrets` is not allowed. Therefore, it is advised to import the action without secrets and adding them back after the action has been imported.
    /// </summary>
    [Auth0ResourceType("auth0:index/action:Action")]
    public partial class Action : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The source code of the action.
        /// </summary>
        [Output("code")]
        public Output<string> Code { get; private set; } = null!;

        /// <summary>
        /// List of third party npm modules, and their versions, that this action depends on.
        /// </summary>
        [Output("dependencies")]
        public Output<ImmutableArray<Outputs.ActionDependency>> Dependencies { get; private set; } = null!;

        /// <summary>
        /// Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
        /// </summary>
        [Output("deploy")]
        public Output<bool?> Deploy { get; private set; } = null!;

        /// <summary>
        /// The name of the action.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Node runtime, e.g. `node16`. Defaults to `node12`.
        /// </summary>
        [Output("runtime")]
        public Output<string> Runtime { get; private set; } = null!;

        /// <summary>
        /// List of secrets that are included in an action or a version of an action.
        /// </summary>
        [Output("secrets")]
        public Output<ImmutableArray<Outputs.ActionSecret>> Secrets { get; private set; } = null!;

        /// <summary>
        /// List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read
        /// [Retrieving the set of triggers available within
        /// actions](https://registry.terraform.io/providers/auth0/auth0/latest/docs/guides/action_triggers) to retrieve the latest
        /// trigger versions supported.
        /// </summary>
        [Output("supportedTriggers")]
        public Output<Outputs.ActionSupportedTriggers> SupportedTriggers { get; private set; } = null!;

        /// <summary>
        /// Version ID of the action. This value is available if `deploy` is set to true.
        /// </summary>
        [Output("versionId")]
        public Output<string> VersionId { get; private set; } = null!;


        /// <summary>
        /// Create a Action resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Action(string name, ActionArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/action:Action", name, args ?? new ActionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Action(string name, Input<string> id, ActionState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/action:Action", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Action resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Action Get(string name, Input<string> id, ActionState? state = null, CustomResourceOptions? options = null)
        {
            return new Action(name, id, state, options);
        }
    }

    public sealed class ActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The source code of the action.
        /// </summary>
        [Input("code", required: true)]
        public Input<string> Code { get; set; } = null!;

        [Input("dependencies")]
        private InputList<Inputs.ActionDependencyArgs>? _dependencies;

        /// <summary>
        /// List of third party npm modules, and their versions, that this action depends on.
        /// </summary>
        public InputList<Inputs.ActionDependencyArgs> Dependencies
        {
            get => _dependencies ?? (_dependencies = new InputList<Inputs.ActionDependencyArgs>());
            set => _dependencies = value;
        }

        /// <summary>
        /// Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
        /// </summary>
        [Input("deploy")]
        public Input<bool>? Deploy { get; set; }

        /// <summary>
        /// The name of the action.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Node runtime, e.g. `node16`. Defaults to `node12`.
        /// </summary>
        [Input("runtime")]
        public Input<string>? Runtime { get; set; }

        [Input("secrets")]
        private InputList<Inputs.ActionSecretArgs>? _secrets;

        /// <summary>
        /// List of secrets that are included in an action or a version of an action.
        /// </summary>
        public InputList<Inputs.ActionSecretArgs> Secrets
        {
            get => _secrets ?? (_secrets = new InputList<Inputs.ActionSecretArgs>());
            set => _secrets = value;
        }

        /// <summary>
        /// List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read
        /// [Retrieving the set of triggers available within
        /// actions](https://registry.terraform.io/providers/auth0/auth0/latest/docs/guides/action_triggers) to retrieve the latest
        /// trigger versions supported.
        /// </summary>
        [Input("supportedTriggers", required: true)]
        public Input<Inputs.ActionSupportedTriggersArgs> SupportedTriggers { get; set; } = null!;

        public ActionArgs()
        {
        }
        public static new ActionArgs Empty => new ActionArgs();
    }

    public sealed class ActionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The source code of the action.
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        [Input("dependencies")]
        private InputList<Inputs.ActionDependencyGetArgs>? _dependencies;

        /// <summary>
        /// List of third party npm modules, and their versions, that this action depends on.
        /// </summary>
        public InputList<Inputs.ActionDependencyGetArgs> Dependencies
        {
            get => _dependencies ?? (_dependencies = new InputList<Inputs.ActionDependencyGetArgs>());
            set => _dependencies = value;
        }

        /// <summary>
        /// Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
        /// </summary>
        [Input("deploy")]
        public Input<bool>? Deploy { get; set; }

        /// <summary>
        /// The name of the action.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Node runtime, e.g. `node16`. Defaults to `node12`.
        /// </summary>
        [Input("runtime")]
        public Input<string>? Runtime { get; set; }

        [Input("secrets")]
        private InputList<Inputs.ActionSecretGetArgs>? _secrets;

        /// <summary>
        /// List of secrets that are included in an action or a version of an action.
        /// </summary>
        public InputList<Inputs.ActionSecretGetArgs> Secrets
        {
            get => _secrets ?? (_secrets = new InputList<Inputs.ActionSecretGetArgs>());
            set => _secrets = value;
        }

        /// <summary>
        /// List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read
        /// [Retrieving the set of triggers available within
        /// actions](https://registry.terraform.io/providers/auth0/auth0/latest/docs/guides/action_triggers) to retrieve the latest
        /// trigger versions supported.
        /// </summary>
        [Input("supportedTriggers")]
        public Input<Inputs.ActionSupportedTriggersGetArgs>? SupportedTriggers { get; set; }

        /// <summary>
        /// Version ID of the action. This value is available if `deploy` is set to true.
        /// </summary>
        [Input("versionId")]
        public Input<string>? VersionId { get; set; }

        public ActionState()
        {
        }
        public static new ActionState Empty => new ActionState();
    }
}
