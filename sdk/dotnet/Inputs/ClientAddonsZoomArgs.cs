// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsZoomArgs : global::Pulumi.ResourceArgs
    {
        [Input("account")]
        public Input<string>? Account { get; set; }

        public ClientAddonsZoomArgs()
        {
        }
        public static new ClientAddonsZoomArgs Empty => new ClientAddonsZoomArgs();
    }
}
