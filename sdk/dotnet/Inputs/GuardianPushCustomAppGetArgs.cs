// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GuardianPushCustomAppGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("appName")]
        public Input<string>? AppName { get; set; }

        [Input("appleAppLink")]
        public Input<string>? AppleAppLink { get; set; }

        [Input("googleAppLink")]
        public Input<string>? GoogleAppLink { get; set; }

        public GuardianPushCustomAppGetArgs()
        {
        }
        public static new GuardianPushCustomAppGetArgs Empty => new GuardianPushCustomAppGetArgs();
    }
}
