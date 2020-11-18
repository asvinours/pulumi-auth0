// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public partial class LogStream : Pulumi.CustomResource
    {
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("sink")]
        public Output<Outputs.LogStreamSink> Sink { get; private set; } = null!;

        /// <summary>
        /// Status of the LogStream
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Type of the log stream, which indicates the sink provider
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a LogStream resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogStream(string name, LogStreamArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/logStream:LogStream", name, args ?? new LogStreamArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogStream(string name, Input<string> id, LogStreamState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/logStream:LogStream", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogStream resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogStream Get(string name, Input<string> id, LogStreamState? state = null, CustomResourceOptions? options = null)
        {
            return new LogStream(name, id, state, options);
        }
    }

    public sealed class LogStreamArgs : Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sink", required: true)]
        public Input<Inputs.LogStreamSinkArgs> Sink { get; set; } = null!;

        /// <summary>
        /// Status of the LogStream
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Type of the log stream, which indicates the sink provider
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public LogStreamArgs()
        {
        }
    }

    public sealed class LogStreamState : Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sink")]
        public Input<Inputs.LogStreamSinkGetArgs>? Sink { get; set; }

        /// <summary>
        /// Status of the LogStream
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Type of the log stream, which indicates the sink provider
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public LogStreamState()
        {
        }
    }
}
