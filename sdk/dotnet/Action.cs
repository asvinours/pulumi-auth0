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
    /// Actions are secure, tenant-specific, versioned functions written in Node.js that
    /// execute at certain points during the Auth0 runtime. Actions are used to
    /// customize and extend Auth0's capabilities with custom logic.
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
    ///         var myAction = new Auth0.Action("myAction", new Auth0.ActionArgs
    ///         {
    ///             Code = @"/**
    ///  * Handler that will be called during the execution of a PostLogin flow.
    ///  *
    ///  * @param {Event} event - Details about the user and the context in which they are logging in.
    ///  * @param {PostLoginAPI} api - Interface whose methods can be used to change the behavior of the login.
    ///  */
    ///  exports.onExecutePostLogin = async (event, api) =&gt; {
    /// 	 console.log(event)
    ///  };
    /// 
    /// ",
    ///             Dependencies = 
    ///             {
    ///                 new Auth0.Inputs.ActionDependencyArgs
    ///                 {
    ///                     Name = "lodash",
    ///                     Version = "latest",
    ///                 },
    ///                 new Auth0.Inputs.ActionDependencyArgs
    ///                 {
    ///                     Name = "request",
    ///                     Version = "latest",
    ///                 },
    ///             },
    ///             Deploy = true,
    ///             Runtime = "node16",
    ///             Secrets = 
    ///             {
    ///                 new Auth0.Inputs.ActionSecretArgs
    ///                 {
    ///                     Name = "FOO",
    ///                     Value = "Foo",
    ///                 },
    ///                 new Auth0.Inputs.ActionSecretArgs
    ///                 {
    ///                     Name = "BAR",
    ///                     Value = "Bar",
    ///                 },
    ///             },
    ///             SupportedTriggers = new Auth0.Inputs.ActionSupportedTriggersArgs
    ///             {
    ///                 Id = "post-login",
    ///                 Version = "v3",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// An action can be imported using the action's ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/action:Action my_action 12f4f21b-017a-319d-92e7-2291c1ca36c4
    /// ```
    /// 
    ///  ~&gt; For security reasons importing `secrets` is not allowed. Therefore, it is advised to import the action without secrets and adding them back after the action has been imported.
    /// </summary>
    [Auth0ResourceType("auth0:index/action:Action")]
    public partial class Action : Pulumi.CustomResource
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
        /// Deploying an action will create a new immutable version of the action.
        /// If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the
        /// action immediately. Default is `false`.
        /// </summary>
        [Output("deploy")]
        public Output<bool?> Deploy { get; private set; } = null!;

        /// <summary>
        /// Secret name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Node runtime. For example `node16`, defaults to `node12`.
        /// </summary>
        [Output("runtime")]
        public Output<string> Runtime { get; private set; } = null!;

        /// <summary>
        /// List of secrets that are included in an action or a version of an action.
        /// </summary>
        [Output("secrets")]
        public Output<ImmutableArray<Outputs.ActionSecret>> Secrets { get; private set; } = null!;

        /// <summary>
        /// List of triggers that this action supports. At this time, an action can only target
        /// a single trigger at a time.
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

    public sealed class ActionArgs : Pulumi.ResourceArgs
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
        /// Deploying an action will create a new immutable version of the action.
        /// If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the
        /// action immediately. Default is `false`.
        /// </summary>
        [Input("deploy")]
        public Input<bool>? Deploy { get; set; }

        /// <summary>
        /// Secret name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Node runtime. For example `node16`, defaults to `node12`.
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
        /// List of triggers that this action supports. At this time, an action can only target
        /// a single trigger at a time.
        /// </summary>
        [Input("supportedTriggers", required: true)]
        public Input<Inputs.ActionSupportedTriggersArgs> SupportedTriggers { get; set; } = null!;

        public ActionArgs()
        {
        }
    }

    public sealed class ActionState : Pulumi.ResourceArgs
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
        /// Deploying an action will create a new immutable version of the action.
        /// If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the
        /// action immediately. Default is `false`.
        /// </summary>
        [Input("deploy")]
        public Input<bool>? Deploy { get; set; }

        /// <summary>
        /// Secret name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Node runtime. For example `node16`, defaults to `node12`.
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
        /// List of triggers that this action supports. At this time, an action can only target
        /// a single trigger at a time.
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
    }
}
