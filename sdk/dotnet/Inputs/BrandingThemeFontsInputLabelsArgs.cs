// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class BrandingThemeFontsInputLabelsArgs : global::Pulumi.ResourceArgs
    {
        [Input("bold", required: true)]
        public Input<bool> Bold { get; set; } = null!;

        [Input("size", required: true)]
        public Input<double> Size { get; set; } = null!;

        public BrandingThemeFontsInputLabelsArgs()
        {
        }
        public static new BrandingThemeFontsInputLabelsArgs Empty => new BrandingThemeFontsInputLabelsArgs();
    }
}
