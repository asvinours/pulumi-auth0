// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsMscrmGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Microsoft Dynamics CRM application URL.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public ClientAddonsMscrmGetArgs()
        {
        }
        public static new ClientAddonsMscrmGetArgs Empty => new ClientAddonsMscrmGetArgs();
    }
}
