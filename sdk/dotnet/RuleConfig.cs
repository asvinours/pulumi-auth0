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
    /// With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage variables that are available to all rules via Auth0's global configuration object. Used in conjunction with configured rules.
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
    ///     var myRule = new Auth0.Rule("myRule", new()
    ///     {
    ///         Enabled = true,
    ///         Script = @"    function (user, context, callback) {
    ///       callback(null, user, context);
    ///     }
    ///   
    /// ",
    ///     });
    /// 
    ///     var myRuleConfig = new Auth0.RuleConfig("myRuleConfig", new()
    ///     {
    ///         Key = "foo",
    ///         Value = "bar",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Existing rule configs can be imported using their key name. # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/ruleConfig:RuleConfig my_rule_config foo
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/ruleConfig:RuleConfig")]
    public partial class RuleConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Key for a rules configuration variable.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// Value for a rules configuration variable.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a RuleConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RuleConfig(string name, RuleConfigArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/ruleConfig:RuleConfig", name, args ?? new RuleConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RuleConfig(string name, Input<string> id, RuleConfigState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/ruleConfig:RuleConfig", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "value",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RuleConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RuleConfig Get(string name, Input<string> id, RuleConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new RuleConfig(name, id, state, options);
        }
    }

    public sealed class RuleConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Key for a rules configuration variable.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value", required: true)]
        private Input<string>? _value;

        /// <summary>
        /// Value for a rules configuration variable.
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public RuleConfigArgs()
        {
        }
        public static new RuleConfigArgs Empty => new RuleConfigArgs();
    }

    public sealed class RuleConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Key for a rules configuration variable.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("value")]
        private Input<string>? _value;

        /// <summary>
        /// Value for a rules configuration variable.
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public RuleConfigState()
        {
        }
        public static new RuleConfigState Empty => new RuleConfigState();
    }
}
