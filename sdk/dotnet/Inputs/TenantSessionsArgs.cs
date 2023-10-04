// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class TenantSessionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When active, users will be presented with a consent prompt to confirm the logout request if the request is not trustworthy. Turn off the consent prompt to bypass user confirmation.
        /// </summary>
        [Input("oidcLogoutPromptEnabled", required: true)]
        public Input<bool> OidcLogoutPromptEnabled { get; set; } = null!;

        public TenantSessionsArgs()
        {
        }
        public static new TenantSessionsArgs Empty => new TenantSessionsArgs();
    }
}
