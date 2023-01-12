// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GuardianWebauthnPlatformArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether WebAuthn with FIDO Device Biometrics MFA is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The Relying Party is the domain for which the WebAuthn keys will be issued, set to `true` if you are customizing the identifier.
        /// </summary>
        [Input("overrideRelyingParty")]
        public Input<bool>? OverrideRelyingParty { get; set; }

        /// <summary>
        /// The Relying Party should be a suffix of the custom domain.
        /// </summary>
        [Input("relyingPartyIdentifier")]
        public Input<string>? RelyingPartyIdentifier { get; set; }

        public GuardianWebauthnPlatformArgs()
        {
        }
        public static new GuardianWebauthnPlatformArgs Empty => new GuardianWebauthnPlatformArgs();
    }
}
