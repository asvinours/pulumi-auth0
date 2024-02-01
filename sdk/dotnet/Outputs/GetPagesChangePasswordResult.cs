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
    public sealed class GetPagesChangePasswordResult
    {
        /// <summary>
        /// Indicates whether to use the custom Reset Password HTML (`true`) or the default Auth0 page (`false`).
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Customized content for the Reset Password page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
        /// </summary>
        public readonly string Html;

        [OutputConstructor]
        private GetPagesChangePasswordResult(
            bool enabled,

            string html)
        {
            Enabled = enabled;
            Html = html;
        }
    }
}
