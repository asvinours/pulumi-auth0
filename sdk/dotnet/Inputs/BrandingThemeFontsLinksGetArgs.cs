// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class BrandingThemeFontsLinksGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("bold")]
        public Input<bool>? Bold { get; set; }

        [Input("size")]
        public Input<double>? Size { get; set; }

        public BrandingThemeFontsLinksGetArgs()
        {
        }
        public static new BrandingThemeFontsLinksGetArgs Empty => new BrandingThemeFontsLinksGetArgs();
    }
}
