// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class BrandingThemeWidgetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Header text alignment. Available options: `center`, `left`, `right`.
        /// </summary>
        [Input("headerTextAlignment", required: true)]
        public Input<string> HeaderTextAlignment { get; set; } = null!;

        /// <summary>
        /// Logo height. Value needs to be between `1` and `100`.
        /// </summary>
        [Input("logoHeight", required: true)]
        public Input<double> LogoHeight { get; set; } = null!;

        /// <summary>
        /// Logo position. Available options: `center`, `left`, `right`, `none`.
        /// </summary>
        [Input("logoPosition", required: true)]
        public Input<string> LogoPosition { get; set; } = null!;

        /// <summary>
        /// Logo url.
        /// </summary>
        [Input("logoUrl", required: true)]
        public Input<string> LogoUrl { get; set; } = null!;

        /// <summary>
        /// Social buttons layout.  Available options: `bottom`, `top`.
        /// </summary>
        [Input("socialButtonsLayout", required: true)]
        public Input<string> SocialButtonsLayout { get; set; } = null!;

        public BrandingThemeWidgetArgs()
        {
        }
        public static new BrandingThemeWidgetArgs Empty => new BrandingThemeWidgetArgs();
    }
}
