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
    public sealed class GetBrandingThemeColorResult
    {
        public readonly string BaseFocusColor;
        public readonly string BaseHoverColor;
        public readonly string BodyText;
        public readonly string Error;
        public readonly string Header;
        public readonly string Icons;
        public readonly string InputBackground;
        public readonly string InputBorder;
        public readonly string InputFilledText;
        public readonly string InputLabelsPlaceholders;
        public readonly string LinksFocusedComponents;
        public readonly string PrimaryButton;
        public readonly string PrimaryButtonLabel;
        public readonly string SecondaryButtonBorder;
        public readonly string SecondaryButtonLabel;
        public readonly string Success;
        public readonly string WidgetBackground;
        public readonly string WidgetBorder;

        [OutputConstructor]
        private GetBrandingThemeColorResult(
            string baseFocusColor,

            string baseHoverColor,

            string bodyText,

            string error,

            string header,

            string icons,

            string inputBackground,

            string inputBorder,

            string inputFilledText,

            string inputLabelsPlaceholders,

            string linksFocusedComponents,

            string primaryButton,

            string primaryButtonLabel,

            string secondaryButtonBorder,

            string secondaryButtonLabel,

            string success,

            string widgetBackground,

            string widgetBorder)
        {
            BaseFocusColor = baseFocusColor;
            BaseHoverColor = baseHoverColor;
            BodyText = bodyText;
            Error = error;
            Header = header;
            Icons = icons;
            InputBackground = inputBackground;
            InputBorder = inputBorder;
            InputFilledText = inputFilledText;
            InputLabelsPlaceholders = inputLabelsPlaceholders;
            LinksFocusedComponents = linksFocusedComponents;
            PrimaryButton = primaryButton;
            PrimaryButtonLabel = primaryButtonLabel;
            SecondaryButtonBorder = secondaryButtonBorder;
            SecondaryButtonLabel = secondaryButtonLabel;
            Success = success;
            WidgetBackground = widgetBackground;
            WidgetBorder = widgetBorder;
        }
    }
}
