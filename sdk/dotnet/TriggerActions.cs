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
    /// With this resource, you can bind actions to a trigger. Once actions are created and deployed, they can be attached (i.e. bound) to a trigger so that it will be executed as part of a flow. The list of actions reflects the order in which they will be executed during the appropriate flow.
    /// 
    /// !&gt; This resource manages all the action bindings to a trigger. In contrast, the `auth0.TriggerAction` resource only
    /// appends an action to the trigger binding. To avoid potential issues, it is recommended not to use this resource in
    /// conjunction with the `auth0.TriggerAction` resource when binding actions to the same trigger.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using the bindings trigger ID. # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/triggerActions:TriggerActions example "post-login"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/triggerActions:TriggerActions")]
    public partial class TriggerActions : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of actions bound to this trigger.
        /// </summary>
        [Output("actions")]
        public Output<ImmutableArray<Outputs.TriggerActionsAction>> Actions { get; private set; } = null!;

        /// <summary>
        /// The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval` , `iga-certification` , `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        /// </summary>
        [Output("trigger")]
        public Output<string> Trigger { get; private set; } = null!;


        /// <summary>
        /// Create a TriggerActions resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TriggerActions(string name, TriggerActionsArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/triggerActions:TriggerActions", name, args ?? new TriggerActionsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TriggerActions(string name, Input<string> id, TriggerActionsState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/triggerActions:TriggerActions", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TriggerActions resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TriggerActions Get(string name, Input<string> id, TriggerActionsState? state = null, CustomResourceOptions? options = null)
        {
            return new TriggerActions(name, id, state, options);
        }
    }

    public sealed class TriggerActionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions", required: true)]
        private InputList<Inputs.TriggerActionsActionArgs>? _actions;

        /// <summary>
        /// The list of actions bound to this trigger.
        /// </summary>
        public InputList<Inputs.TriggerActionsActionArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.TriggerActionsActionArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval` , `iga-certification` , `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        /// </summary>
        [Input("trigger", required: true)]
        public Input<string> Trigger { get; set; } = null!;

        public TriggerActionsArgs()
        {
        }
        public static new TriggerActionsArgs Empty => new TriggerActionsArgs();
    }

    public sealed class TriggerActionsState : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.TriggerActionsActionGetArgs>? _actions;

        /// <summary>
        /// The list of actions bound to this trigger.
        /// </summary>
        public InputList<Inputs.TriggerActionsActionGetArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.TriggerActionsActionGetArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval` , `iga-certification` , `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        /// </summary>
        [Input("trigger")]
        public Input<string>? Trigger { get; set; }

        public TriggerActionsState()
        {
        }
        public static new TriggerActionsState Empty => new TriggerActionsState();
    }
}
