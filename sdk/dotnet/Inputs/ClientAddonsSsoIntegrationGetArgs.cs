// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsSsoIntegrationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// SSO integration name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// SSO integration version installed.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ClientAddonsSsoIntegrationGetArgs()
        {
        }
        public static new ClientAddonsSsoIntegrationGetArgs Empty => new ClientAddonsSsoIntegrationGetArgs();
    }
}
