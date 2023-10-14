// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsValidationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the `min` and `max` values of username length.
        /// </summary>
        [Input("username")]
        public Input<Inputs.ConnectionOptionsValidationUsernameGetArgs>? Username { get; set; }

        public ConnectionOptionsValidationGetArgs()
        {
        }
        public static new ConnectionOptionsValidationGetArgs Empty => new ConnectionOptionsValidationGetArgs();
    }
}
