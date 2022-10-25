// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class TenantChangePasswordArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether to use the custom change password page.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// HTML format with supported Liquid syntax. Customized content of the change password page.
        /// </summary>
        [Input("html", required: true)]
        public Input<string> Html { get; set; } = null!;

        public TenantChangePasswordArgs()
        {
        }
        public static new TenantChangePasswordArgs Empty => new TenantChangePasswordArgs();
    }
}
