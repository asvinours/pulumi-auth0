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
    public sealed class GetBrandingThemeFontBodyTextResult
    {
        /// <summary>
        /// Body text bold. Defaults to `false`.
        /// </summary>
        public readonly bool Bold;
        /// <summary>
        /// Body text size. Value needs to be between `0` and `150`. Defaults to `87.5`.
        /// </summary>
        public readonly double Size;

        [OutputConstructor]
        private GetBrandingThemeFontBodyTextResult(
            bool bold,

            double size)
        {
            Bold = bold;
            Size = size;
        }
    }
}
