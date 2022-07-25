// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class GuardianPush
    {
        public readonly Outputs.GuardianPushAmazonSns? AmazonSns;
        public readonly Outputs.GuardianPushCustomApp? CustomApp;

        [OutputConstructor]
        private GuardianPush(
            Outputs.GuardianPushAmazonSns? amazonSns,

            Outputs.GuardianPushCustomApp? customApp)
        {
            AmazonSns = amazonSns;
            CustomApp = customApp;
        }
    }
}
