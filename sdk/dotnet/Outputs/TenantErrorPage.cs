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
    public sealed class TenantErrorPage
    {
        /// <summary>
        /// HTML format with supported Liquid syntax. Customized content of the error page.
        /// </summary>
        public readonly string Html;
        /// <summary>
        /// Indicates whether to show the link to logs as part of the default error page.
        /// </summary>
        public readonly bool ShowLogLink;
        /// <summary>
        /// URL to redirect to when an error occurs rather than showing the default error page.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private TenantErrorPage(
            string html,

            bool showLogLink,

            string url)
        {
            Html = html;
            ShowLogLink = showLogLink;
            Url = url;
        }
    }
}
