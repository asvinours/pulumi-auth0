// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsTotpArgs : global::Pulumi.ResourceArgs
    {
        [Input("length")]
        public Input<int>? Length { get; set; }

        [Input("timeStep")]
        public Input<int>? TimeStep { get; set; }

        public ConnectionOptionsTotpArgs()
        {
        }
        public static new ConnectionOptionsTotpArgs Empty => new ConnectionOptionsTotpArgs();
    }
}
