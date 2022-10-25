// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class AttackProtectionBruteForceProtectionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowlists")]
        private InputList<string>? _allowlists;

        /// <summary>
        /// List of trusted IP addresses that will not have attack protection enforced against them.
        /// </summary>
        public InputList<string> Allowlists
        {
            get => _allowlists ?? (_allowlists = new InputList<string>());
            set => _allowlists = value;
        }

        /// <summary>
        /// Whether brute force attack protections are active.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Maximum number of unsuccessful attempts. Only available on public tenants.
        /// </summary>
        [Input("maxAttempts")]
        public Input<int>? MaxAttempts { get; set; }

        /// <summary>
        /// Determines whether the IP address is used when counting failed attempts. Possible values: `count_per_identifier_and_ip` or `count_per_identifier`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        [Input("shields")]
        private InputList<string>? _shields;

        /// <summary>
        /// Action to take when a brute force protection threshold is violated. Possible values: `block`, `user_notification`
        /// </summary>
        public InputList<string> Shields
        {
            get => _shields ?? (_shields = new InputList<string>());
            set => _shields = value;
        }

        public AttackProtectionBruteForceProtectionGetArgs()
        {
        }
        public static new AttackProtectionBruteForceProtectionGetArgs Empty => new AttackProtectionBruteForceProtectionGetArgs();
    }
}
