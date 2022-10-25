// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GuardianDuoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Duo API Hostname, see the Duo documentation for more details on Duo setup.
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        /// <summary>
        /// Duo client ID, see the Duo documentation for more details on Duo setup.
        /// </summary>
        [Input("integrationKey", required: true)]
        public Input<string> IntegrationKey { get; set; } = null!;

        /// <summary>
        /// Duo client secret, see the Duo documentation for more details on Duo setup.
        /// </summary>
        [Input("secretKey", required: true)]
        public Input<string> SecretKey { get; set; } = null!;

        public GuardianDuoArgs()
        {
        }
        public static new GuardianDuoArgs Empty => new GuardianDuoArgs();
    }
}
